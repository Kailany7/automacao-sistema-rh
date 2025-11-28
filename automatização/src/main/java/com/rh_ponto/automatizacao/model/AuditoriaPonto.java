package com.rh_ponto.automatizacao.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "auditoria_ponto")

public class AuditoriaPonto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_auditoria_ponto;

    @Column(name = "observacao_inconsistencia", nullable = false)
    private String observacao_inconsistencia;

    @Column(name = "id_ponto", nullable = false)
    private Integer id_ponto;

    public Integer getId_auditoria_ponto() {
        return id_auditoria_ponto;
    }

    public void setId_auditoria_ponto(Integer id_auditoria_ponto) {
        this.id_auditoria_ponto = id_auditoria_ponto;
    }

    public Integer getId_ponto() {
        return id_ponto;
    }

    public void setId_ponto(Integer id_ponto) {
        this.id_ponto = id_ponto;
    }

    public String getObservacao_inconsistencia() {
        return observacao_inconsistencia;
    }

    public void setObservacao_inconsistencia(String observacao_inconsistencia) {
        this.observacao_inconsistencia = observacao_inconsistencia;
    }
}
