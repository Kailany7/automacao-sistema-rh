package com.rh_ponto.automatizacao.dto;

import lombok.Data;

@Data
public class ColaboradorDTO {
    private Integer idColaborador;
    private String nome;
    private String cpf;
    private Integer setorId;
}
