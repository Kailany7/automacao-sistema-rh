package com.rh_ponto.automatizacao.controller;


import com.rh_ponto.automatizacao.model.Colaborador;
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
    public Colaborador criar(@RequestBody Colaborador colaborador) {
        return service.salvar(colaborador);
    }

    @GetMapping
    public List<Colaborador> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Colaborador buscarPorId(@PathVariable Integer id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Colaborador atualizar(@PathVariable Integer id, @RequestBody Colaborador colaborador) {
        return service.atualizar(id, colaborador);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        service.deletar(id);
    }
}
