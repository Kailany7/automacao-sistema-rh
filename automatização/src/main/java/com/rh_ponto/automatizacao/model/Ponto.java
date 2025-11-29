package com.rh_ponto.automatizacao.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "ponto")
public class Ponto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_ponto;

    @Column(name = "data_hora", nullable = false)
    private LocalDateTime data_hora;

    @Column(name = "id_colaborador", nullable = false)
    private Integer id_colaborador;

    @ManyToOne
    @JoinColumn(name = "id_tipo_evento", nullable = false)
    private TipoEvento id_tipo_evento;

    public LocalDateTime getData_hora() {
        return data_hora;
    }

    public void setData_hora(LocalDateTime data_hora) {
        this.data_hora = data_hora;
    }

    public Integer getId_colaborador() {
        return id_colaborador;
    }

    public void setId_colaborador(Integer id_colaborador) {
        this.id_colaborador = id_colaborador;
    }

    public Integer getId_ponto() {
        return id_ponto;
    }

    public void setId_ponto(Integer id_ponto) {
        this.id_ponto = id_ponto;
    }

    public TipoEvento getId_tipo_evento() {
        return id_tipo_evento;
    }

    public void setId_tipo_evento(TipoEvento id_tipo_evento) {
        this.id_tipo_evento = id_tipo_evento;
    }
}
