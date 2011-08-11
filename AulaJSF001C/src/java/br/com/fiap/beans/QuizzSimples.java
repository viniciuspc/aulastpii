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
@ManagedBean(name="quizz")
@SessionScoped
public class QuizzSimples {

    private ArrayList<Problema> problemas = new ArrayList<Problema>();
    private int score = 0;

    public int getScore() {
        return score;
    }
    public QuizzSimples(){
        problemas.add(new Problema("{3,1,4,1}",5));
        problemas.add(new Problema("{0,1,0,1}",0));

    }

    public String getPergunta(){
        return problemas.get(0).getPergunta();
    }
    private String resposta="";
    public void setResposta(String resposta){
        this.resposta = resposta;
    }
    public String getResposta(){
        return this.resposta;
    }
    public String avaliarResposta(){
        if (resposta.equals("")){
            return "respostaIncorreta";
        } else{
            return "respostaCorreta";
        }
    }
   
}
