/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fiap.eventos;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ComponentSystemEvent;

/**
 *
 * @author rm61828
 */

@ManagedBean(name="bb")
@SessionScoped
public class PhaseListnerBackBean {
    private String dia;
    private String mes;
    private String ano;

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }



    public void validateDate(ComponentSystemEvent event){
        //Codigo no google docs - Aula JSF 007.odp
    }
}
