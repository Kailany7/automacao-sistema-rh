package com.rh_ponto.automatizacao.controller;

import com.rh_ponto.automatizacao.dto.SetorDTO;
import com.rh_ponto.automatizacao.model.Setor;
import com.rh_ponto.automatizacao.service.SetorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/setores")
public class SetorController {

    private final SetorService service;

    public SetorController(SetorService service) {
        this.service = service;
    }

    @PostMapping
    public SetorDTO criar(@RequestBody SetorDTO dto) {
        return service.salvar(dto);
    }

    @GetMapping
    public List<Setor> listar() {
        return service.listar();
    }
}
