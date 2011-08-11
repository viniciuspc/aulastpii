/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.fiap.sample;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author eluquini
 */

@ManagedBean(name="user")
@SessionScoped
public class UserBean implements Serializable{
    private String name;
    private String password;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
