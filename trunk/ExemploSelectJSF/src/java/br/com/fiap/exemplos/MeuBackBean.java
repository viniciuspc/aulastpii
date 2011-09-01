/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fiap.exemplos;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author rm61828
 */
@ManagedBean(name="bean")
@SessionScoped
public class MeuBackBean {

    public MeuBackBean(){
        opcoes = new ArrayList<String>();
        opcoes.add("viagem");
        opcoes.add("futebol");
        opcoes.add("videogame");
        opcoes.add("namorar");
        opcoes.add("cerveja");
    }

    private String escolha;
    private ArrayList<String> opcoes;

    public String getEscolha() {
        return escolha;
    }

    public void setEscolha(String escolha) {
        this.escolha = escolha;
    }

    public ArrayList<String> getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(ArrayList<String> opcoes) {
        this.opcoes = opcoes;
    }

    
}
