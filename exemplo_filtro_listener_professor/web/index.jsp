<%-- 
    Document   : index
    Created on : 24/03/2011, 08:27:25
    Author     : pf0037
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Código de Acesso:</h1>
        <form action="verifica" method="post">
            Insira seu código de acesso:
            <input type="text" name="codacesso" size="10">
            <input type="submit" value="Verificar">
        </form>

    </body>
</html>
