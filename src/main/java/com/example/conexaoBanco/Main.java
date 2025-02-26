/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.conexaoBanco;

import java.sql.Connection;

/**
 *
 * @author Lenovo
 */
public class Main {
  public static void main (String[] args){
  ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
  Connection conexao = conexaoSQLite.conectar();
  CriarTabela.criarTabelaUsuarios(conexao);
  }  
}
