<%@page import="br.com.fiap.dao.DaoLivros" %>
<%@page import="br.com.fiap.dados.Livros" %>
<%@page import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="valida.jsp" %>
<%
    String codigo = request.getParameter("codigo");
    DaoLivros dl = new DaoLivros();
    Livros l = dl.detalhesLivros(Integer.parseInt(codigo));
    
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detalhes</title>
    </head>
    <body>
    <table border="1">
    <tr>
        <td>CÓDIGO</td>
        <td>TÍTULO</td>
        <td>AUTOR</td>
        <TD>PRECO</TD>
    </tr>
    <tr>
        <td><%=l.getCodigo()%></td>
        <td><%=l.getTitulo()%></td>
        <td><%=l.getAutor()%></td>
        <td><%=l.getPreco()%></td>
    </tr>
    </table>
    </body>
</html>
