<%@page import="br.com.fiap.dao.DaoLivros" %>
<%@page import="br.com.fiap.dados.Livros" %>
<%@page import="br.com.fiap.dados.usuarios" %>

<%@page import="java.util.*" %>

<%
    String codigo = request.getParameter("codigo");
    DaoLivros dl = new DaoLivros();
    Livros l = dl.detalhesLivros(Integer.parseInt(codigo));
%>
<html>
    <head>
        <title>Compra</title>
    </head>
    <body>
        <h1>Compra</h1>
        <table border="1">
    <tr>
        <td>CÓDIGO</td>
        <td>TÍTULO</td>
        <TD>PRECO</TD>
        <td>QUANTIDADE</td>
        <td>PAGAMENTO</td>
    </tr>
    <%
        out.print("<form action='CadSacola.jsp?codigo='"+codigo+"method='post'>");
    %>
    
    <tr>
        
        <td><%=l.getCodigo()%></td>
        <td><%=l.getTitulo()%></td>
        <td><%=l.getPreco()%></td>
        <td><input type="text" name="qtd" size="5"></td>
        <td>
            <select name="forma">
                <option value="Cartão">Cartão</option>
                <option value="Dinheiro">Dinheiro</option>
            </select>
        </td>
        <td><input type="submit" value="Comprar"></td>
        
    </tr>
        </form>
    
    
    </table>
    </body>
</html>
