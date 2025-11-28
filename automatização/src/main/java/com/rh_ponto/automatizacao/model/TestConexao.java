package com.rh_ponto.automatizacao.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class TestConexao implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception {
        try {
            Integer total = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM colaborador", Integer.class);
            System.out.println("Conexão OK! Total de colaboradores: " + total);
        } catch (Exception e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
    }
}