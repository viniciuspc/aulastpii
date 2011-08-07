<%@page import="br.com.fiap.dao.DaoLivros" %>
<%@page import="br.com.fiap.dados.Livros" %>
<%@page import="java.util.*" %>

<%
    DaoLivros dao = new DaoLivros();
    List<Livros> lista = dao.listarLivros("%"+request.getParameter("titulo")+"%");
%>
<table border="1">
    <tr>
        <td>CÓDIGO</td>
        <td>TÍTULO</td>
    </tr>
<%
    for(Livros livro:lista){
%>
    <tr>
        <td><a href='detalhes.jsp?codigo=<%=livro.getCodigo()%>'><%=livro.getCodigo()%></a></td>
        <td><%=livro.getTitulo()%></td>
    </tr>
<%
    }
%>
</table>