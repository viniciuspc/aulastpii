<%@page import="br.com.fiap.dados.*"%>
<%@page import="br.com.fiap.dao.DaoUsuario"%>
<%
    String usuario = request.getParameter("nome");
    String senha = request.getParameter("password");

    if(usuario != null && usuario.length()>0 && senha != null && senha.length()>0)
    {
       usuarios user = new usuarios();
       user.setNome(usuario);
       user.setSenha(senha);

       DaoUsuario dao = new DaoUsuario();
       dao.setUsuario(user);

       if(dao.validarUsuario())
       {
           session.setAttribute("jUsuario", user);
           response.sendRedirect("menu.jsp");
       }
       else
           out.print(dao.getInfo());

    }

%>
<html>
    <body>
        <form action="login.jsp" method="post">
            Usuário: <input type="text" name="nome" size="20"><br>
            Senha: <input type="password" name="password" size="20"><br><br>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>