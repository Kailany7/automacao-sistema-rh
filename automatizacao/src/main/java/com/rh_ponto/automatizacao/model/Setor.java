package com.rh_ponto.automatizacao.model;

import jakarta.persistence.*;

@Entity
@Table(name = "setor")
public class Setor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_setor;

    @Column(nullable = false)
    private String nome_setor;

    // Getters e Setters
    public Integer getId_setor() { return id_setor; }
    public void setId_setor(Integer id_setor) { this.id_setor = id_setor; }
    public String getNome_setor() { return nome_setor; }
    public void setNome_setor(String nome_setor) { this.nome_setor = nome_setor; }
}
