
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastro de Usu�rios!</h1>
        <form action="Cadastro.jsp" method="post">
            <table>
                <tr>
                    <td>Usu�rio:</td>
                    <td><input type="text" name="usuario" size="10"></td>
                </tr>
                <tr>
                    <td>Senha:</td>
                    <td><input type="password" name="senha" size="10"></td>
                </tr>
                <tr>
                    <td>N�vel:</td>
                    <td>
                        <select name="nivel">
                            <option value="1">Administrador</option>
                            <option value="2">Cliente</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="Enviar"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
