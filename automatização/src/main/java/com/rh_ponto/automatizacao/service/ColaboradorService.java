package com.rh_ponto.automatizacao.service;

import com.rh_ponto.automatizacao.dto.ColaboradorDTO;
import com.rh_ponto.automatizacao.model.Colaborador;
import com.rh_ponto.automatizacao.model.Setor;
import com.rh_ponto.automatizacao.repository.ColaboradorRepository;
import com.rh_ponto.automatizacao.repository.SetorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColaboradorService {

    private final ColaboradorRepository colaboradorRepo;
    private final SetorRepository setorRepo;

    public ColaboradorService(ColaboradorRepository colaboradorRepo, SetorRepository setorRepo) {
        this.colaboradorRepo = colaboradorRepo;
        this.setorRepo = setorRepo;
    }

    public ColaboradorDTO salvar(ColaboradorDTO dto) {
        Colaborador c = new Colaborador();
        c.setNome(dto.getNome());
        c.setCpf(dto.getCpf());

        Setor setor = setorRepo.findById(dto.getSetorId())
                .orElseThrow(() -> new RuntimeException("Setor não encontrado"));
        c.setSetor(setor);

        c = colaboradorRepo.save(c);

        dto.setIdColaborador(c.getIdColaborador());
        return dto;
    }

    public List<Colaborador> listar() {
        return colaboradorRepo.findAll();
    }
}
