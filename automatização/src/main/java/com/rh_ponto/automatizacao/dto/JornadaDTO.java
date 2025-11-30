package com.rh_ponto.automatizacao.dto;

import lombok.Data;

@Data
public class JornadaDTO {
    private Long idJornada;
    private String descricaoJornada;
    private String horaInicio;
    private String horaFim;
    private Integer cargaHoraria;
}
