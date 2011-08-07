package br.com.fiap.bean;
import br.com.fiap.dao.*;
public class BeanUsuarios {
    private String nome, senha;
    private int nivel;

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    //prorpiedade descricao: somente leitura
    public String getDescricao(){
        if(this.nivel == 1)
            return "Administrador";
        else if(this.nivel == 2)
            return "Cliente";
        else return "Não informado";

    }

    public String getCadastro(){
        DaoUsuarios dao = new DaoUsuarios();

        Usuarios user = new Usuarios();

        user.setNivel(this.nivel);
        user.setNome(this.nome);
        user.setSenha(this.senha);

        dao.setUsuario(user);
        return dao.efetuarCadastro();
    }

    
}
