package com.rh_ponto.automatizacao.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "tipo_evento")
public class TipoEvento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_tipo_evento;

    @Column(name = "descricao_evento", nullable = false)
    private String descricao_evento;

    public String getDescricao_evento() {
        return descricao_evento;
    }

    public void setDescricao_evento(String descricao_evento) {
        this.descricao_evento = descricao_evento;
    }

    public Integer getId_tipo_evento() {
        return id_tipo_evento;
    }

    public void setId_tipo_evento(Integer id_tipo_evento) {
        this.id_tipo_evento = id_tipo_evento;
    }
}
