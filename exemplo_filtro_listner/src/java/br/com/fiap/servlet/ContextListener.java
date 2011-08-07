package br.com.fiap.servlet;

import javax.servlet.*;
import java.util.Date;

public class ContextListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent evento){
        ServletContext contexto = evento.getServletContext();
        contexto.setAttribute("ctx", "Contexto criado em: "+new Date());
    }
    public void contextDestroyed(ServletContextEvent evento){

    }

}
