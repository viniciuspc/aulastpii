/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fiap.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.fiap.dados.usuarios;
import javax.servlet.http.HttpSession;
import org.apache.jasper.tagplugins.jstl.core.Redirect;


/**
 *
 * @author rm61828
 */
public class ServletMenu extends HttpServlet {
   


 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        HttpSession session = request.getSession();

        usuarios user = (usuarios)(session.getAttribute("jUsuario"));
        PrintWriter out = response.getWriter();

        if(user.getAdm() == 1){
            out.print("<a href='cadLivros.jsp'>Cadastrar Livros</a><br>");
            out.print("<a href='cadUsuario.jsp'>Cadastrar Usuários</a><br>");
        }
        else{
            out.print("<a href='sacola.jsp'>Sacola de Compras</a><br>");
        }
        out.print("<a href='Consulta.jsp'>Consultar Livros</a><br>");
        
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
    }

}
