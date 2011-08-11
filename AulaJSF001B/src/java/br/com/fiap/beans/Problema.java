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

    public String getSequencia() {
        return sequencia;
    }

    public int getSolução() {
        return solução;
    }

    private String sequencia;
    private int solução;

    public Problema(String sequencia, int solução){
        this.sequencia = sequencia;
        this.solução = solução;
    }
}
