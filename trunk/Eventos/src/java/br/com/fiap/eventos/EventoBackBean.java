/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fiap.eventos;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author rm61828
 */
@ManagedBean(name="evento")
@SessionScoped
public class EventoBackBean {
    private String palavra;
    private String selecionado;
    private ArrayList<String> lista = new ArrayList<String>();
    //Solução do professor
    private ArrayList<String> listaToda = new ArrayList<String>();

    //Solução do professor na minha solução não tinha o construtor
    public EventoBackBean() {
        listaToda.add("aaa");
        listaToda.add("abb");
        listaToda.add("abc");
        listaToda.add("baa");
        listaToda.add("bbb");
        listaToda.add("bac");
        listaToda.add("caa");
        listaToda.add("cba");
        listaToda.add("ccc");
    }




    public ArrayList<String> getLista() {
        return lista;
    }

    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public String getSelecionado() {
        return selecionado;
    }

    public void setSelecionado(String selecionado) {
        this.selecionado = selecionado;
    }

    public ArrayList<String> getListaToda() {
        return listaToda;
    }

    public void setListaToda(ArrayList<String> listaToda) {
        this.listaToda = listaToda;
    }



    public void listnerEvento(ValueChangeEvent event){
        //Solução do professor
        String digitado = event.getNewValue().toString();
        this.lista.clear();
        this.selecionado="";

        for(String tmp:listaToda){
            if(tmp.startsWith(digitado))
                lista.add(tmp);
        }

        //Minha solução
        /*if(event.getNewValue().toString().startsWith("a", 0)){
            lista.add("aaa");
            lista.add("abb");
            lista.add("abc");
        } else{
            lista.clear();
        }*/

    }
}
