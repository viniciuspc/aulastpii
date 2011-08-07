<html>
    <head>
        <title>Pagina de Consulta</title>
    </head>
    <body>
        <h1>Pagina de Consulta</h1>
        <%
            String usuario = (String)request.getAttribute("jusuario");
            out.print(usuario);
        %>
    </body>
</html>
