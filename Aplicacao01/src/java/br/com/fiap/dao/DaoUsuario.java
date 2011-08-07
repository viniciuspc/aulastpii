package br.com.fiap.dao;
import br.com.fiap.dados.usuarios;
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
               if(rs.next())
                   b = true;
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


}
