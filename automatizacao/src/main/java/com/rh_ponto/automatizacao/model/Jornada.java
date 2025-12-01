package com.rh_ponto.automatizacao.model;

import jakarta.persistence.*;

@Entity
@Table(name = "jornada")
public class Jornada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_jornada;

    @Column(nullable = false)
    private String descricao_jornada;

    private Integer carga_horaria;

    private String hora_inicio;
    private String hora_fim;

    public Integer getId_jornada() {
        return id_jornada;
    }

    public void setId_jornada(Integer id_jornada) {
        this.id_jornada = id_jornada;
    }

    public String getDescricao_jornada() {
        return descricao_jornada;
    }

    public void setDescricao_jornada(String descricao_jornada) {
        this.descricao_jornada = descricao_jornada;
    }

    public Integer getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(Integer carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public String getHora_fim() {
        return hora_fim;
    }

    public void setHora_fim(String hora_fim) {
        this.hora_fim = hora_fim;
    }
}
