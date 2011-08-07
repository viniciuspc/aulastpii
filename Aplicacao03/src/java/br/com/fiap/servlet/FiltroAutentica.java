/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fiap.servlet;
import java.io.IOException;
import javax.servlet.*;
import br.com.fiap.dao.DaoUsuario;
import br.com.fiap.dados.usuarios;
import javax.servlet.http.HttpServletRequest;
/**
 *
 * @author rm61828
 */
public class FiltroAutentica implements Filter {

    private FilterConfig filterconfig = null;

    public void init (FilterConfig filterConfig)
        throws ServletException{
        this.filterconfig = filterConfig;
    }

    public void destroy(){
        this.filterconfig = null;
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        DaoUsuario dao = new DaoUsuario();
        usuarios user = new usuarios();
        String nome = request.getParameter("nome");
        String senha = request.getParameter("senha");
        MeuRequestWrapper mreq =
        new MeuRequestWrapper((HttpServletRequest) request);

        user.setNome(nome);
        user.setSenha(senha);

        mreq.setAttribute("user", user);

        dao.setUsuario(user);
        if(dao.validarUsuario(user))
            chain.doFilter(mreq, response);
        else{
            request.getRequestDispatcher("/erro.jsp").forward(request, response);
        }
    }


}
