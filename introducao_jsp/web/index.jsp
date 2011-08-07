<%@ page import="br.com.fiap.Introducao" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Exemplo JSP</h1>
        <%//Código java
            String nome = request.getParameter("aluno");
            out.print("Bem-Vindo, "+nome);

            Introducao intro = new Introducao();
            out.print("<br><br>"+ intro.menssagem() + "</br>");
        %>
    </body>
</html>
