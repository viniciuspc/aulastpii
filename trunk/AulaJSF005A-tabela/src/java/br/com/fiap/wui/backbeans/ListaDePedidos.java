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

    private Pedido pedido = new Pedido();

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

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

    public String adicionar(){
        pedidos.add(pedido);
        pedido = new Pedido();
        return null;
    }
    private Pedido pedidoEdicao = new Pedido();
    public boolean ativarEdicao(Pedido avaliado){
        return avaliado != null && avaliado.getNumero().equals(pedidoEdicao.getNumero());
    }

    public String editar(Pedido selecao){
        pedidoEdicao = selecao;
        return null;
    }
    public String salvar(){
        pedidoEdicao = new Pedido();
        return null;
    }
}
