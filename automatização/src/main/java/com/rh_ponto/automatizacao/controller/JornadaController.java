package com.rh_ponto.automatizacao.controller;

import com.rh_ponto.automatizacao.dto.JornadaDTO;
import com.rh_ponto.automatizacao.model.Jornada;
import com.rh_ponto.automatizacao.service.JornadaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornadas")
public class JornadaController {

    private final JornadaService service;

    public JornadaController(JornadaService service) {
        this.service = service;
    }

    @PostMapping
    public JornadaDTO criar(@RequestBody JornadaDTO dto) {
        return service.salvar(dto);
    }

    @GetMapping
    public List<JornadaDTO> listar() {
        return service.listarDTO();
    }
}

