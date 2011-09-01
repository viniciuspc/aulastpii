/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fiap.bean;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author rm61828
 */

@ManagedBean(name="formulario")
@SessionScoped
public class formulario {

    public formulario(){
        opcoesTipo = new ArrayList<String>();
        opcoesSabor = new ArrayList<String>();
        opcoesFonte = new ArrayList<String>();

        opcoesTipo.add("Professor");
        opcoesTipo.add("Aluno");

        opcoesFonte.add("Amigos");
        opcoesFonte.add("Inimigos");
        opcoesFonte.add("Propaganda");

        opcoesSabor.add("Queijo");
        opcoesSabor.add("Carne");
        opcoesSabor.add("Pizza");
        opcoesSabor.add("Especial");
        opcoesSabor.add("4 Queijos");
        opcoesSabor.add("Frango");
        opcoesSabor.add("Frango com Catupiry");
    }

    private String nome;
    private String tipo;
    private ArrayList<String> opcoesTipo;
    private ArrayList<String> fonte;
    private ArrayList<String> opcoesFonte;
    private ArrayList<String> sabor;
    private ArrayList<String> opcoesSabor;

    public ArrayList<String> getFonte() {
        return fonte;
    }

    public void setFonte(ArrayList<String> fonte) {
        this.fonte = fonte;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getOpcoesFonte() {
        return opcoesFonte;
    }

    public void setOpcoesFonte(ArrayList<String> opcoesFonte) {
        this.opcoesFonte = opcoesFonte;
    }

    public ArrayList<String> getOpcoesSabor() {
        return opcoesSabor;
    }

    public void setOpcoesSabor(ArrayList<String> opcoesSabor) {
        this.opcoesSabor = opcoesSabor;
    }

    public ArrayList<String> getOpcoesTipo() {
        return opcoesTipo;
    }

    public void setOpcoesTipo(ArrayList<String> opcoesTipo) {
        this.opcoesTipo = opcoesTipo;
    }

    public ArrayList<String> getSabor() {
        return sabor;
    }

    public void setSabor(ArrayList<String> sabor) {
        this.sabor = sabor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void Limpar(){
        nome = "";
        tipo = "";
        fonte.clear();
        sabor.clear();
    }
    
}
