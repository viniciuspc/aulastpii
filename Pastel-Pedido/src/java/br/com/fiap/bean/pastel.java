/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fiap.bean;

/**
 *
 * @author rm61828
 */
public class pastel {
    private String nome;
    private double preco;

    public pastel(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


}
