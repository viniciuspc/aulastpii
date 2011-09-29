/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 1) Carrega o driver
 * 2) Retornar uma Connection
 *
 * Obs: Em um sistema real o nome do driver, a url, o usuário e a senha
 * do banco devem estar em um arquivo de configuração.
 * 
 * @author rm61828
 */
public class GerenciarConexoes {

   private static GerenciarConexoes sigletonConexao = new GerenciarConexoes();
   private GerenciarConexoes(){
       try{
           Class.forName("org.apache.derby.jdbc.ClientDriver");
       }catch (ClassNotFoundException ex){
           throw new RuntimeException(ex);
       }
       
   }

   public static  GerenciarConexoes obterGerenciador(){
       return sigletonConexao;
   }


   public Connection obterConexao() throws SQLException{
       return DriverManager.getConnection("jdbc:derby://localhost:1527/teste","fiap","fiap");
   }

}
