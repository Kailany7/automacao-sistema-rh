package com.rh_ponto.automatizacao.controller;

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
    public Jornada criar(@RequestBody Jornada jornada) {
        return service.salvar(jornada);
    }

    @GetMapping
    public List<Jornada> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Jornada buscarPorId(@PathVariable Integer id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Jornada atualizar(@PathVariable Integer id, @RequestBody Jornada jornada) {
        return service.atualizar(id, jornada);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        service.deletar(id);
    }
}
