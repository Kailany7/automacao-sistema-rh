package com.rh_ponto.automatizacao.service;

import com.rh_ponto.automatizacao.model.AuditoriaPonto;
import com.rh_ponto.automatizacao.repository.AuditoriaPontoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditoriaPontoService {

    private final AuditoriaPontoRepository repository;

    public AuditoriaPontoService(AuditoriaPontoRepository repository) {
        this.repository = repository;
    }

    public List<AuditoriaPonto> listar() {
        return repository.findAll();
    }
}
