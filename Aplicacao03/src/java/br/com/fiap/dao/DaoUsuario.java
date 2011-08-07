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

    public boolean validarUsuario(usuarios user){
        boolean b = false;
        if(abrirConexao()){
            try{
               stmt = cn.prepareStatement("SELECT * FROM usuario where nome=? and senha=?");
               stmt.setString(1, user.getNome());
               stmt.setString(2, user.getSenha());
               rs = stmt.executeQuery();
               if(rs.next()){
                   b = true;
               }

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
               stmt = cn.prepareStatement("insert into usuario (nome,senha) values(?,?)");
               stmt.setString(1, usuario.getNome());
               stmt.setString(2, usuario.getSenha());
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
