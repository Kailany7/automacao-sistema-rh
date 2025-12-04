package com.rh_ponto.automatizacao.controller;

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

    // Criar setor
    @PostMapping
    public Setor criar(@RequestBody Setor setor) {
        return service.salvar(setor);
    }

    // Listar setores
    @GetMapping
    public List<Setor> listar() {
        return service.listar();
    }

    // Buscar setor por ID
    @GetMapping("/{id}")
    public Setor buscar(@PathVariable Integer id) {
        return service.buscarPorId(id);
    }

    // Atualizar setor
    @PutMapping("/{id}")
    public Setor atualizar(@PathVariable Integer id, @RequestBody Setor setor) {
        return service.atualizar(id, setor);
    }

    // Deletar setor
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        service.deletar(id);
    }
}
