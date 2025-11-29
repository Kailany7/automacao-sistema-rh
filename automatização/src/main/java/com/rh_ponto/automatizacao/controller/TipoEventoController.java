package com.rh_ponto.automatizacao.controller;

import com.rh_ponto.automatizacao.model.TipoEvento;
import com.rh_ponto.automatizacao.service.TipoEventoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipo-evento")
public class TipoEventoController {

    private final TipoEventoService service;

    public TipoEventoController(TipoEventoService service) {
        this.service = service;
    }

    @PostMapping
    public TipoEvento criar(@RequestBody TipoEvento tipo) {
        return service.criar(tipo);
    }

    @GetMapping
    public List<TipoEvento> listar() {
        return service.listar();
    }

    @PutMapping("/{id}")
    public TipoEvento atualizar(@PathVariable Integer id, @RequestBody TipoEvento tipo) {
        return service.atualizar(id, tipo);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        service.deletar(id);
    }
}
