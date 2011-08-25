/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fiap.beans;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author eluquini
 */

//backbean -> bean associado com a interface
@ManagedBean(name="quizz")
@SessionScoped
public class QuizzSimples {

    private ArrayList<Problema> problemas = new ArrayList<Problema>();
    private int score = 0;
    private int cont = -1;

    public int getScore() {
        return score;
    }
    public QuizzSimples(){
        problemas.add(new Problema("{3,1,4,1}",5));
        problemas.add(new Problema("{0,1,0,1}",0));
        problemas.add(new Problema("(0,1,1,2,)", 3));

    }

    public String getSequencia(){
        cont++;
        if(problemas.size() <= cont)
            cont=0;

        return problemas.get(cont).getSequencia();
    }

    public String getResposta(){  //getResposta é nescessário para o JSF poi quando carrega a pagina ele tenta setar o campo de texto com a propriedade
        return "";
    }

    

    public void setResposta(String resposta){
        if(!resposta.equals(""))
            if(problemas.get(cont).getSolução() == Integer.parseInt(resposta))
                score++;
    }
}
