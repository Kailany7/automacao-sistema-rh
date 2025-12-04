package com.rh_ponto.automatizacao.controller;

import com.rh_ponto.automatizacao.model.AuditoriaPonto;
import com.rh_ponto.automatizacao.service.AuditoriaPontoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auditoria")
public class AuditoriaPontoController {

    private final AuditoriaPontoService service;

    public AuditoriaPontoController(AuditoriaPontoService service) {
        this.service = service;
    }

    @GetMapping
    public List<AuditoriaPonto> listar() {
        return service.listar();
    }

    @PostMapping
    public AuditoriaPonto criar(@RequestBody AuditoriaPonto auditoria) {
        return service.criar(auditoria);
    }
}
