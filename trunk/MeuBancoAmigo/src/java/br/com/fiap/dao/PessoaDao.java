/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fiap.dao;

import br.com.fiap.beans.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


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
            String sql = "insert into pessoa (id,nome) values(?,?)";
            PreparedStatement executorComandosSql = conexao.prepareStatement(sql);
            executorComandosSql.setInt(1, pessoa.getId());
            executorComandosSql.setString(2, pessoa.getNome());
            executorComandosSql.executeUpdate();

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
