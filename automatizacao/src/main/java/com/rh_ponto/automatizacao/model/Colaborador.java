package com.rh_ponto.automatizacao.model

import jakarta.persistence.*;

@Entity
@Table(name = "colaborador")
public class Colaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_colaborador;

    @Column(nullable = false)
    private String nome_colaborador;

    private String cpf;
    private String status;

    @ManyToOne
    @JoinColumn(name = "id_setor")
    private Setor setor;

    @ManyToOne
    @JoinColumn(name = "id_jornada")
    private Jornada jornada;

    // Getters e Setters
    public Integer getId_colaborador() { return id_colaborador; }
    public void setId_colaborador(Integer id_colaborador) { this.id_colaborador = id_colaborador; }
    public String getNome_colaborador() { return nome_colaborador; }
    public void setNome_colaborador(String nome_colaborador) { this.nome_colaborador = nome_colaborador; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public Setor getSetor() { return setor; }
    public void setSetor(Setor setor) { this.setor = setor; }
    public Jornada getJornada() { return jornada; }
    public void setJornada(Jornada jornada) { this.jornada = jornada; }
}
