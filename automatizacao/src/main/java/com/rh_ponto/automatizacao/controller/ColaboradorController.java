package com.rh_ponto.automatizacao.controller;

import com.rh_ponto.automatizacao.dto.ColaboradorDTO;
import com.rh_ponto.automatizacao.service.ColaboradorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/colaboradores")
public class ColaboradorController {

    private final ColaboradorService service;

    public ColaboradorController(ColaboradorService service) {
        this.service = service;
    }

    @PostMapping
    public ColaboradorDTO criar(@RequestBody ColaboradorDTO dto) {
        return service.salvar(dto);
    }

    @GetMapping
    public List<ColaboradorDTO> listar() {
        return service.listarDTO();
    }
}
