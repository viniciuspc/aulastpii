/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fiap.beans;

/**
 *
 * @author eluquini
 */
public class Problema {

    public String getPergunta() {
        return pergunta;
    }

    public int getSolução() {
        return solução;
    }

    private String pergunta;
    private int solução;

    public Problema(String pergunta, int solução){
        this.pergunta = pergunta;
        this.solução = solução;
    }
}
