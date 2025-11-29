package com.rh_ponto.automatizacao.controller;

import com.rh_ponto.automatizacao.model.Ponto;
import com.rh_ponto.automatizacao.service.PontoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ponto")
public class PontoController {

    private final PontoService service;

    public PontoController(PontoService service) {
        this.service = service;
    }

    @PostMapping
    public Ponto criar(@RequestBody Ponto ponto) {
        return service.criar(ponto);
    }

    @GetMapping
    public List<Ponto> listar() {
        return service.listar();
    }

    @PutMapping("/{id}")
    public Ponto atualizar(@PathVariable Integer id, @RequestBody Ponto ponto) {
        return service.atualizar(id, ponto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        service.deletar(id);
    }
}
