/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fiap.ajax;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author rm61828
 */
@ManagedBean(name="usuario")
@SessionScoped
public class BackBean {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public void validarNome(FacesContext fc, UIComponent c, Object value){
        String nome = (String)value;

        if(nome.contains("_"))
            throw new ValidatorException(new FacesMessage("O nome não pode ter underline "+nome));

    }


}
