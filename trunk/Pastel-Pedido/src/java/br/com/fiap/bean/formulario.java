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
        opcoesPastel = new ArrayList<pastel>();
        opcoesFonte = new ArrayList<String>();

        opcoesTipo.add("Professor");
        opcoesTipo.add("Aluno");

        opcoesFonte.add("Amigos");
        opcoesFonte.add("Inimigos");
        opcoesFonte.add("Propaganda");

        opcoesPastel.add(new pastel("Queijo",2.00));
        opcoesPastel.add(new pastel("Carne",2.00));
        opcoesPastel.add(new pastel("Pizza",2.00));
        opcoesPastel.add(new pastel("Especial",3.00));
        opcoesPastel.add(new pastel("4 Queijos",3.00));
        opcoesPastel.add(new pastel("Frango",2.00));
        opcoesPastel.add(new pastel("Frango com Catupiry",2.00));
    }

    private String nome;
    private String tipo;
    private ArrayList<String> opcoesTipo;
    private ArrayList<String> fonte;
    private ArrayList<String> opcoesFonte;
    private ArrayList<String> sabor;
    private ArrayList<pastel> opcoesPastel;


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

    public ArrayList<pastel> getOpcoesPastel() {
        return opcoesPastel;
    }

    public void setOpcoesPastel(ArrayList<pastel> opcoesSabor) {
        this.opcoesPastel = opcoesSabor;
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
