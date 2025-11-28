package com.rh_ponto.automatizacao.repository;

import com.rh_ponto.automatizacao.model.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColaboradorRepository extends JpaRepository<Colaborador, Integer> {
}
