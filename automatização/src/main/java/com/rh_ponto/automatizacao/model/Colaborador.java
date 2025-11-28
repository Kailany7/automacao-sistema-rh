package com.rh_ponto.automatizacao.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "colaborador")
public class Colaborador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_colaborador;

    @Column(name = "nome_colaborador", nullable = false)
    private String nome_colaborador;

    @Column(name = "cpf", nullable = false, unique = true)
    private String cpf;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "id_setor", nullable = false)
    private Integer id_setor;

    @Column(name = "id_jornada", nullable = false)
    private Integer id_jornada;

    // Getters e Setters
    public Integer getId_colaborador() { return id_colaborador; }
    public void setId_colaborador(Integer id_colaborador) { this.id_colaborador = id_colaborador; }

    public String getNome_colaborador() { return nome_colaborador; }
    public void setNome_colaborador(String nome_colaborador) { this.nome_colaborador = nome_colaborador; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Integer getId_setor() { return id_setor; }
    public void setId_setor(Integer id_setor) { this.id_setor = id_setor; }

    public Integer getId_jornada() { return id_jornada; }
    public void setId_jornada(Integer id_jornada) { this.id_jornada = id_jornada; }
    
}
