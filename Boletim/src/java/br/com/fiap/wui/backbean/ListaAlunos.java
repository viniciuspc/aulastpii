/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fiap.wui.backbean;

import br.com.fiap.bean.Aluno;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author rm61828
 */
@ManagedBean(name="listaAlunos")
@SessionScoped
public class ListaAlunos {

    private Aluno a = new Aluno();
    private ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();

    public Aluno getA() {
        return a;
    }

    public void setA(Aluno a) {
        this.a = a;
    }

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(ArrayList<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public String adicionaAluno(){
        listaAlunos.add(a);
        a = new Aluno();
        return null;
    }

    public String aumentaNota(Aluno aluno){
        double nota = aluno.getNota();
        if(nota<10){
            nota += 1;
            aluno.setNota(nota);
        }
        return null;
    }

    public String excluir(Aluno aluno){
        listaAlunos.remove(aluno);
        return null;
    }



}
