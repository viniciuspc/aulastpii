/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fiap;



import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 *
 * @author rm61828
 */

@ManagedBean
@SessionScoped
public class MeuBackingBean {
    private int qtd;
    private String cartao;
    private Date validade;

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }


    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }


}
