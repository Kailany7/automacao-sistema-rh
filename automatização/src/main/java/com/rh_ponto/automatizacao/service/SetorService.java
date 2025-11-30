package com.rh_ponto.automatizacao.service;

import com.rh_ponto.automatizacao.dto.SetorDTO;
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

    public SetorDTO salvar(SetorDTO dto) {
        Setor setor = new Setor();
        setor.setNomeSetor(dto.getNomeSetor());

        setor = repository.save(setor);

        dto.setIdSetor(setor.getIdSetor());
        return dto;
    }

    public List<Setor> listar() {
        return repository.findAll();
    }
}
