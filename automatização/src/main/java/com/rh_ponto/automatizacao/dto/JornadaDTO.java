package com.rh_ponto.automatizacao.dto;

import lombok.Data;

@Data
public class JornadaDTO {
    private Integer idJornada;
    private String descricao;
    private Integer cargaHoraria;
    private String horaInicio;
    private String horaFim;
    private Integer colaboradorId;
}
