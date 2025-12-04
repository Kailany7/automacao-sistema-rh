package com.rh_ponto.automatizacao.repository;

import com.rh_ponto.automatizacao.model.AuditoriaPonto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditoriaPontoRepository extends JpaRepository<AuditoriaPonto, Integer> {
}


