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
import org.apache.catalina.connector.Response;
import org.omg.PortableServer.REQUEST_PROCESSING_POLICY_ID;

/**
 *
 * @author rm61828
 */
public class ServletLogin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        request.getRequestDispatcher("formulario.jsp").include(request, response);
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String usuario = request.getParameter("nome");
        String senha = request.getParameter("senha");

        String s = getServletConfig().getInitParameter("user");
        String e = getServletContext().getInitParameter("email");

        if(getServletConfig().getInitParameter("user").equals(usuario) && getServletConfig().getInitParameter("pass").equals(usuario))
        {
            request.setAttribute("jusuario", usuario);
            request.setAttribute("jsenha",senha);


            request.getRequestDispatcher("Consulta.jsp").forward(request, response);


        }
        else
            doGet(request,response);


    }

}
