<%@page import="br.com.fiap.dao.DaoLivros" %>
<%@page import="br.com.fiap.dados.Livros" %>
<%@page import="br.com.fiap.dados.usuarios" %>

<%@page import="java.util.*" %>
<%
    String codigo = request.getParameter("codigo");
    DaoLivros dl = new DaoLivros();
    Livros l = dl.detalhesLivros(Integer.parseInt(codigo));
    usuarios user = (usuarios)(session.getAttribute("jUsuario"));
    
%>
<html>
    <head>
        
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
        <%
            if(user.getAdm()==2){
                out.print("<td><a href='Compra.jsp?codigo="+l.getCodigo()+"'>Comprar</a></td>");
            }
        %>
        
    </tr>
    </table>
    </body>
</html>
