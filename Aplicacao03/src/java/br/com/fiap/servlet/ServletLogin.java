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
import javax.servlet.http.HttpSession;
import org.apache.catalina.Session;
import br.com.fiap.dados.usuarios;

/**
 *
 * @author rm61828
 */
public class ServletLogin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
       
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        HttpSession session = request.getSession();
        usuarios user = new usuarios();
        PrintWriter out = response.getWriter();
        user.setNome(request.getParameter("nome"));
        user.setSenha(request.getParameter("senha"));

        session.setAttribute("jUser", user);

        out.print("<a href='cadUsuario.jsp'>Cadastrar Usuario</a><br>");

    }


}
