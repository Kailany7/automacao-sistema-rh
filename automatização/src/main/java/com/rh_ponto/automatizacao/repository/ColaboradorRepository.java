package com.rh_ponto.automatizacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rh_ponto.automatizacao.model.Colaborador;

public interface ColaboradorRepository extends JpaRepository<Colaborador, Integer> {
}
