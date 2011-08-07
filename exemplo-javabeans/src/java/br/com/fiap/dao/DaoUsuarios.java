package br.com.fiap.dao;

import com.mysql.jdbc.PreparedStatement;

public class DaoUsuarios extends Dao{
    private Usuarios usuario;

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public String efetuarCadastro(){
        String s="";
        if(abreConexao()){
            try{
                stmt = conn.prepareStatement("insert into usuario (nome,senha,nivel) values(?,?,?)");
                stmt.setString(1,usuario.getNome());
                stmt.setString(2, usuario.getSenha());
                stmt.setInt(3, usuario.getNivel());
                stmt.executeUpdate();
                
            }
            catch(Exception ex){
                s="Erro ao cadastrar usuário: " + ex;
            }
            finally{
                s="Usuário Cadastrado com sucesso";
                fechaConexao();
            }
        }
        return s;
    }
}
