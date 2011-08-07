package br.com.fiap.dao;
import br.com.fiap.dados.usuarios;
import java.sql.SQLException;
public class DaoUsuario extends Dao {
    private usuarios usuario;

    public usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(usuarios usuario) {
        this.usuario = usuario;
    }

    public boolean validarUsuario(){
        boolean b = false;
        if(abrirConexao()){
            try{
               stmt = cn.prepareStatement("select * from usuarios where nome=? and senha=?");
               stmt.setString(1, usuario.getNome());
               stmt.setString(2, usuario.getSenha());
               rs = stmt.executeQuery();
               if(rs.next()){
                   usuario.setAdm(rs.getInt("ADM"));
                   b = true;
               }
               else
                info = "Usuário ou senha incorretos";

            }
            catch(Exception ex){
                info = ex.getMessage();

            }
            finally{
                fecharConexao();
            }

        }
        return b;
    }

    public void cadastrarUsuario () throws Exception, SQLException{
        if(abrirConexao())
        {
            try{
               stmt = cn.prepareStatement("insert into usuarios (nome,senha,adm) values(?,?,?)");
               stmt.setString(1, usuario.getNome());
               stmt.setString(2, usuario.getSenha());
               stmt.setInt(3, usuario.getAdm());
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


}
