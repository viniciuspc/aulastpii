

package br.com.fiap.dao;

import br.com.fiap.dados.Sacola;
import java.sql.SQLException;
import java.util.*;

public class DaoSacola extends Dao {
    private Sacola sacola;

    public Sacola getSacola() {
        return sacola;
    }

    public void setsacola(Sacola sacola) {
        this.sacola = sacola;
    }

    public void cadastro() throws Exception,SQLException {
        if(abrirConexao()){
            try{
                String s="INSERT INTO sacola (CODIGO,TITULO,AUTOR,PRECO,qtd) VALUES(?,?,?,?,?)";
                stmt = cn.prepareStatement(s);
                stmt.setInt(1, sacola.getCodigo());
                stmt.setString(2, sacola.getTitulo());
                stmt.setString(3, sacola.getAutor());
                stmt.setDouble(4, sacola.getPreco());
                stmt.setInt(5, sacola.getQtd());

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

    public List<Sacola> listarsacolas() throws Exception{
        List<Sacola> lista = new ArrayList<Sacola>();

        if(abrirConexao()){
            try{
                stmt = cn.prepareStatement("select * from sacolas where titulo");
                rs = stmt.executeQuery();

                while(rs.next()){
                    Sacola sac = new Sacola();
                    sac.setCodigo(rs.getInt("CODIGO"));
                    sac.setTitulo(rs.getString("TITULO"));
                    sac.setAutor(rs.getString("AUTOR"));
                    sac.setPreco(rs.getDouble("PRECO"));

                    lista.add(sac);
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



}
