package com.rh_ponto.automatizacao.service;

import com.rh_ponto.automatizacao.model.Jornada;
import com.rh_ponto.automatizacao.repository.JornadaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JornadaService {

    private final JornadaRepository repository;

    public JornadaService(JornadaRepository repository) {
        this.repository = repository;
    }

    public Jornada salvar(Jornada j) {
        return repository.save(j);
    }

    public List<Jornada> listar() {
        return repository.findAll();
    }

    public Jornada buscarPorId(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Jornada não encontrada"));
    }

    public Jornada atualizar(Integer id, Jornada j) {
        Jornada jdb = buscarPorId(id);
        jdb.setDescricao_jornada(j.getDescricao_jornada());
        jdb.setCarga_horaria(j.getCarga_horaria());
        jdb.setHora_inicio(j.getHora_inicio());
        jdb.setHora_fim(j.getHora_fim());
        return repository.save(jdb);
    }

    public void deletar(Integer id) {
        Jornada j = buscarPorId(id);
        repository.delete(j);
    }
}
