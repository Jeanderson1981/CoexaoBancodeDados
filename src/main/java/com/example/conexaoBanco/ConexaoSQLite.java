/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.conexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lenovo
 */
public class ConexaoSQLite {
   
    public Connection conectar(){
        Connection conexao = null;
        String url = "jdbc:sqlite:usuariosNovo.db";
                
        try {
            conexao= DriverManager.getConnection(url);
            System.out.println ("Conexao com o banco estabelecida");
        }catch (SQLException e){
            System.out.println (" erro ao conectar ao banco" + e.getMessage());
    }
    return conexao;

}

}
        