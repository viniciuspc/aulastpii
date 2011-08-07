<%@page import="br.com.fiap.dados.usuarios" %>
<%
    usuarios usuario = (usuarios)session.getAttribute("jUsuario");
    if(usuario == null)
        response.sendRedirect("login.jsp");
    else
        out.print("<b>Bemvindo(a), "+usuario.getNome()+"</b><br>");
%>
