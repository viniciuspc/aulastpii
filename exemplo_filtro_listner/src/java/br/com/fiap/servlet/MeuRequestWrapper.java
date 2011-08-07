package br.com.fiap.servlet;

import javax.servlet.http.*;

public class MeuRequestWrapper extends HttpServletRequestWrapper {
    public MeuRequestWrapper(HttpServletRequest request){
        super(request);
    }

}
