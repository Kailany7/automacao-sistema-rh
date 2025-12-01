package com.rh_ponto.automatizacao.service;

import com.rh_ponto.automatizacao.dto.JornadaDTO;
import com.rh_ponto.automatizacao.model.Jornada;
import com.rh_ponto.automatizacao.repository.JornadaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JornadaService {

    private final JornadaRepository jornadaRepo;

    public JornadaService(JornadaRepository jornadaRepo) {
        this.jornadaRepo = jornadaRepo;
    }

    // ============================
    // SALVAR
    // ============================
    public JornadaDTO salvar(JornadaDTO dto) {

        Jornada j = new Jornada();

        j.setDescricao_jornada(dto.getDescricao());
        j.setCarga_horaria(dto.getCargaHoraria());
        j.setHora_inicio(dto.getHoraInicio());
        j.setHora_fim(dto.getHoraFim());

        j = jornadaRepo.save(j);

        dto.setIdJornada(j.getId_jornada());
        return dto;
    }

    // ============================
    // LISTAR DTO
    // ============================
    public List<JornadaDTO> listarDTO() {
        return jornadaRepo.findAll()
                .stream()
                .map(j -> {
                    JornadaDTO dto = new JornadaDTO();
                    dto.setIdJornada(j.getId_jornada());
                    dto.setDescricao(j.getDescricao_jornada());
                    dto.setCargaHoraria(j.getCarga_horaria());
                    dto.setHoraInicio(j.getHora_inicio());
                    dto.setHoraFim(j.getHora_fim());
                    return dto;
                })
                .toList();
    }

    // ============================
    // BUSCAR POR ID (ENTITY)
    // ============================
    public Jornada buscarPorId(Integer id) {
        return jornadaRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Jornada não encontrada"));
    }

    // ============================
    // DELETAR
    // ============================
    public void deletar(Integer id) {
        Jornada j = buscarPorId(id);
        jornadaRepo.delete(j);
    }

    // ============================
    // ATUALIZAR
    // ============================
    public JornadaDTO atualizar(Integer id, JornadaDTO dto) {

        Jornada j = buscarPorId(id);

        j.setDescricao_jornada(dto.getDescricao());
        j.setCarga_horaria(dto.getCargaHoraria());
        j.setHora_inicio(dto.getHoraInicio());
        j.setHora_fim(dto.getHoraFim());

        jornadaRepo.save(j);

        dto.setIdJornada(j.getId_jornada());
        return dto;
    }
}
