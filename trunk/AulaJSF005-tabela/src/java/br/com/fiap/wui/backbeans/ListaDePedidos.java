/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fiap.wui.backbeans;

import br.com.fiap.beans.Pedido;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="listaPedidos")
@SessionScoped
public class ListaDePedidos {

    private Pedido p = new Pedido();
    
    private ArrayList<Pedido> pedidos;

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public Pedido getP() {
        return p;
    }

    public void setP(Pedido p) {
        this.p = p;
    }

    /**
     *
     *
     * @return A String que ira indicar para que página será redirecionado isso é configurado no faces.config
     */
    public String adicionar(){
        pedidos.add(p);
        p=new Pedido();
        return null;
    }

    public ListaDePedidos(){
        pedidos = new ArrayList<Pedido>();
        Pedido p1 = new Pedido();
        p1.setCliente("maria");
        p1.setNumero("125");
        p1.setTotal(125);

        Pedido p2 = new Pedido();
        p2.setCliente("Jose");
        p2.setNumero("126");
        p2.setTotal(521);
        
        pedidos.add(p2);
        pedidos.add(p1);
    }
}
