package com.rh_ponto.automatizacao.service;

import com.rh_ponto.automatizacao.dto.JornadaDTO;
import com.rh_ponto.automatizacao.model.Colaborador;
import com.rh_ponto.automatizacao.model.Jornada;
import com.rh_ponto.automatizacao.repository.ColaboradorRepository;
import com.rh_ponto.automatizacao.repository.JornadaRepository;
import org.springframework.stereotype.Service;  // <---- ESTE É O IMPORT CORRETO



import java.util.List;

@Service
public class JornadaService {

    private final JornadaRepository jornadaRepo;
    private final ColaboradorRepository colaboradorRepo;

    public JornadaService(JornadaRepository jornadaRepo, ColaboradorRepository colaboradorRepo) {
        this.jornadaRepo = jornadaRepo;
        this.colaboradorRepo = colaboradorRepo;
    }

    public JornadaDTO salvar(JornadaDTO dto) {
        Jornada j = new Jornada();
        j.setEntrada(dto.getEntrada());
        j.setSaida(dto.getSaida());

        Colaborador col = colaboradorRepo.findById(dto.getColaboradorId())
                .orElseThrow(() -> new RuntimeException("Colaborador não encontrado"));
        j.setColaborador(col);

        j = jornadaRepo.save(j);

        dto.setIdJornada(j.getIdJornada());
        return dto;
    }

    public List<Jornada> listar() {
        return jornadaRepo.findAll();
    }
}
