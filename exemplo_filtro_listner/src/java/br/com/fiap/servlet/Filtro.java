package br.com.fiap.servlet;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;


public class Filtro implements Filter {
    private FilterConfig filterConfig = null;



    public void init (FilterConfig filterConfig) throws ServletException{

        this.filterConfig = filterConfig;
    }

    public void destroy (){
        this.filterConfig = null;

    }

    public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain)
                         throws ServletException, IOException
    {
        MeuRequestWrapper mreq = new MeuRequestWrapper((HttpServletRequest) request);

        String codigo=request.getParameter("codacesso");
        if(codigo.equals("rm61828")){
            mreq.setAttribute("codigo", codigo);
            chain.doFilter(request, response);
        }
        else
            request.getRequestDispatcher("/falha.jsp").forward(request, response);

    }
}
