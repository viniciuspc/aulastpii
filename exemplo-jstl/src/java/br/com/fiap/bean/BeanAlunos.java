package br.com.fiap.bean;
import br.com.fiap.dao.*;
import java.util.*;
public class BeanAlunos {
private Alunos aluno = new Alunos();

    public String getCurso() {
        return aluno.getCurso();
    }

    public void setCurso(String curso) {
        this.aluno.setCurso(curso);
    }

    public String getNome() {
        return aluno.getNome();
    }

    public void setNome(String nome) {
        this.aluno.setNome(nome);
    }

    public int getRm() {
        return aluno.getRm();
    }

    public void setRm(int rm) {
        this.aluno.setRm(rm);
    }

    public List<Alunos> getListaAllunos(){
        DaoAlunos dao = new DaoAlunos();
        //dao.setAluno(aluno);//util para salvar um aluno; ela não é utilizada lista-los
        return dao.listarAlunos();
    }

}
