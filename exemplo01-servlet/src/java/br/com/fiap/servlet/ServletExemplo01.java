// @author RM61828
package br.com.fiap.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
 
public class ServletExemplo01 extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String usuario = getServletConfig().getInitParameter("usuario");
        String senha = getServletConfig().getInitParameter("senha");
        
        /*out.print("Usuário padrão: "+usuario+"<br>");
        out.print("Senha padrão: "+senha);*/

        out.print("<html>");
        out.print("<body>");
        out.print("<form action='/exemplo01' method='post'>");
        out.print("Usuário: <input type='text' name='nome' size='20'><br>");
        out.print("Senha: <input type='password' name='password' size='20'><br><br>");
        out.print("<input type='submit' value='Enviar'>");
        out.print("</form>");
        out.print("</body>");
        out.print("</html>");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        PrintWriter saida = response.getWriter();
        String usuario = getServletConfig().getInitParameter("usuario");
        String senha = getServletConfig().getInitParameter("senha");

        if(usuario.equals(request.getParameter("nome"))&& senha.equals(request.getParameter("password")))
            saida.print("Usuário valido");
        else
            saida.print("Usuário Inválido");

    }

}
