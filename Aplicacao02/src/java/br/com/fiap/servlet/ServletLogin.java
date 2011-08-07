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
import br.com.fiap.dao.DaoUsuario;
import javax.servlet.http.HttpSession;

/**
 *
 * @author rm61828
 */
public class ServletLogin extends HttpServlet {
   
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
        out.print("<form action='/ServletLogin' method='post'>");
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

        HttpSession session = request.getSession();

        String usuario = request.getParameter("nome");
        String senha = request.getParameter("password");

        if(usuario != null && usuario.length()>0 && senha != null && senha.length()>0)
        {
            usuarios user = new usuarios();
            user.setNome(usuario);
            user.setSenha(senha);

            DaoUsuario dao = new DaoUsuario();
            dao.setUsuario(user);

            if(dao.validarUsuario())
            {
                session.setAttribute("jUsuario", user);
                response.sendRedirect("/ServletMenu");
            }
            else
            saida.print(dao.getInfo());

        }

    }
}
