package com.rh_ponto.automatizacao.repository;

import com.rh_ponto.automatizacao.model.TipoEvento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEventoRepository extends JpaRepository<TipoEvento, Integer> {
}
