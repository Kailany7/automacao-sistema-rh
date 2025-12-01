package com.rh_ponto.automatizacao.Service;

import com.rh_ponto.automatizacao.model.Setor;
import com.rh_ponto.automatizacao.repository.SetorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SetorService {

    private final SetorRepository repository;

    public SetorService(SetorRepository repository) {
        this.repository = repository;
    }

    public Setor salvar(Setor setor) {
        return repository.save(setor);
    }

    public List<Setor> listar() {
        return repository.findAll();
    }

    public Setor buscarPorId(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Setor não encontrado"));
    }

    public Setor atualizar(Integer id, Setor setor) {
        Setor s = buscarPorId(id);
        s.setNome_setor(setor.getNome_setor());
        return repository.save(s);
    }

    public void deletar(Integer id) {
        Setor s = buscarPorId(id);
        repository.delete(s);
    }
}
