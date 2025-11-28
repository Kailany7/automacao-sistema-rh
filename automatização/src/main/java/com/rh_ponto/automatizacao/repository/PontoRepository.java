package com.rh_ponto.automatizacao.repository;

import com.rh_ponto.automatizacao.model.Ponto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PontoRepository extends JpaRepository<Ponto, Integer> {
}
