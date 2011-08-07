<%@page import="br.com.fiap.dao.DaoSacola" %>
<%@page import="br.com.fiap.dados.Sacola" %>
<%@page import="java.util.*" %>

<%
    DaoSacola dao = new DaoSacola();
    List<Sacola> lista = dao.listarsacolas();
%>
<table border="1">
    <tr>
        <td>CÓDIGO</td>
        <td>TÍTULO</td>
        <td>AUTOR</td>
        <TD>PRECO</TD>
        <td>QUANTIDADE</td>
    </tr>
<%
    for(Sacola sacola:lista){
%>
    <tr>
        <td><%=sacola.getCodigo()%></td>
        <td><%=sacola.getTitulo()%></td>
        <td><%=sacola.getAutor()%></td>
        <td><%=sacola.getPreco()%></td>
        <td><%=sacola.getQtd()%></td>
    </tr>
<%
    }
%>
</table>