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

    private ArrayList<Pedido> pedidos;

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
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
