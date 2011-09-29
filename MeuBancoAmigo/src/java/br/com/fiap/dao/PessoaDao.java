/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fiap.dao;

import br.com.fiap.beans.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rm61828
 */
public class PessoaDao {
    public void inserir(Pessoa pessoa){
        GerenciarConexoes gerenciador = GerenciarConexoes.obterGerenciador();
        Connection conexao = null;
        try {
            conexao = gerenciador.obterConexao();
            String sql = "insert into(id,nome) values(?,?)";
            PreparedStatement executorComandosSql = conexao.prepareStatement(sql);
            executorComandosSql.setInt(1, pessoa);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally{
            if(conexao != null){
                try{
                    conexao.close();
                } catch(SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }
}
