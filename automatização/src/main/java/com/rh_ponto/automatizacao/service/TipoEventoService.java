package com.rh_ponto.automatizacao.service;

import com.rh_ponto.automatizacao.model.TipoEvento;
import com.rh_ponto.automatizacao.repository.TipoEventoRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoEventoService {

    private final TipoEventoRepository repository;

    public TipoEventoService(TipoEventoRepository repository) {
        this.repository = repository;
    }

    public TipoEvento criar(TipoEvento tipoEvento) {
        try {
            return repository.save(tipoEvento);

        } catch (DataIntegrityViolationException e) {
            throw new RuntimeException("Erro da trigger/constraint: descrição já existe.");
        }
    }

    public List<TipoEvento> listar() {
        return repository.findAll();
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }

    public TipoEvento atualizar(Integer id, TipoEvento novo) {
        TipoEvento atual = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("TipoEvento não encontrado"));

        atual.setDescricao_evento(novo.getDescricao_evento());

        return criar(atual); // reaproveita a validação
    }
}
