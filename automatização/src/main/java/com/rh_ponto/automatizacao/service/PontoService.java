package com.rh_ponto.automatizacao.service;

import com.rh_ponto.automatizacao.model.Ponto;
import com.rh_ponto.automatizacao.repository.PontoRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PontoService {

    private final PontoRepository repository;

    public PontoService(PontoRepository repository) {
        this.repository = repository;
    }

    public Ponto criar(Ponto ponto) {
        try {
            return repository.save(ponto);

        } catch (DataIntegrityViolationException e) {
            throw new RuntimeException("Erro do banco/trigger ao criar ponto: " + e.getMostSpecificCause().getMessage());
        }
    }

    public List<Ponto> listar() {
        return repository.findAll();
    }

    public void deletar(Integer id) {
        try {
            repository.deleteById(id);

        } catch (DataIntegrityViolationException e) {
            throw new RuntimeException("Erro do banco/trigger ao deletar ponto: " + e.getMostSpecificCause().getMessage());
        }
    }

    public Ponto atualizar(Integer id, Ponto novo) {
        Ponto atual = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ponto não encontrado"));

        atual.setData_hora(novo.getData_hora());
        atual.setId_colaborador(novo.getId_colaborador());
        atual.setId_tipo_evento(novo.getId_tipo_evento());

        return criar(atual);
    }
}
