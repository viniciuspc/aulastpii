/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fiap.dao;

import br.com.fiap.dados.Livros;
import java.sql.SQLException;
import java.util.*;

public class DaoLivros extends Dao {
    private Livros livro;

    public Livros getLivro() {
        return livro;
    }

    public void setLivro(Livros livro) {
        this.livro = livro;
    }

    public void cadastro() throws Exception,SQLException {
        if(abrirConexao()){
            try{
                String s="INSERT INTO LIVROS (CODIGO,TITULO,AUTOR,PRECO) VALUES(?,?,?,?)";
                stmt = cn.prepareStatement(s);
                stmt.setInt(1, livro.getCodigo());
                stmt.setString(2, livro.getTitulo());
                stmt.setString(3, livro.getAutor());
                stmt.setDouble(4, livro.getPreco());

                stmt.executeUpdate();
            }
            catch(SQLException ex){
                throw ex;
            }
            catch(Exception ex){
                throw ex;

            }
            finally{
                fecharConexao();

            }
        }
    }

    public List<Livros> listarLivros() throws Exception{
        List<Livros> lista = new ArrayList<Livros>();

        if(abrirConexao()){
            try{
                stmt = cn.prepareStatement("SELECT *  FROM LIVROS");
                rs = stmt.executeQuery();

                while(rs.next()){
                    Livros liv = new Livros();
                    liv.setCodigo(rs.getInt("CODIGO"));
                    liv.setTitulo(rs.getString("TITULO"));
                    liv.setAutor(rs.getString("AUTOR"));
                    liv.setPreco(rs.getDouble("PRECO"));

                    lista.add(liv);
                }
            }
            catch(Exception ex){
                throw ex;
            }
            finally{
                fecharConexao();

            }
        }
        return lista;
    }

    public Livros detalhesLivros(int codigo) throws Exception{
        Livros liv = new Livros();
        if(abrirConexao()){
            
            try{
                stmt = cn.prepareStatement("select * from livros where codigo = ?");
                stmt.setInt(1, codigo);
                rs = stmt.executeQuery();
                rs.next();
                liv.setCodigo(rs.getInt("CODIGO"));
                liv.setTitulo(rs.getString("TITULO"));
                liv.setAutor(rs.getString("AUTOR"));
                liv.setPreco(rs.getDouble("PRECO"));
            }
            catch(Exception ex){
                throw ex;
            }
            finally{
                fecharConexao();

            }
        }
        return liv;
    }

}
