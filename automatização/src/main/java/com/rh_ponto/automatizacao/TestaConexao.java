package com.rh_ponto.automatizacao;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestaConexao {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://db.rugvgtpbgupejtugznyz.supabase.co:5432/postgres";
        String user = "postgres";
        String pass = "kaylaralet2025";

        try (Connection connection = DriverManager.getConnection(url, user, pass)) {
            System.out.println("Conectou ao Supabase com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
