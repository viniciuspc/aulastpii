<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@page import="br.com.fiap.dados.usuarios" %>
<%@page import="br.com.fiap.dao.DaoUsuario" %>
<%
    String nome = request.getParameter("nome");
    String senha = request.getParameter("senha");
    String senha2 = request.getParameter("senha2");
    String adm = request.getParameter("adm");

    if(nome != null && nome.length()>0 && senha != null && senha.length()>0&& senha2 != null && senha2.length()>0){
        if(senha.equals(senha2)){
            try{
                usuarios user = new usuarios();
                user.setNome(nome);
                user.setSenha(senha);
                user.setAdm(Integer.parseInt(adm));

                DaoUsuario dao = new DaoUsuario();
                dao.setUsuario(user);
                dao.cadastrarUsuario();
                out.print("Dados inseridos com sucesso!");

            }
            catch(Exception ex){
                out.print(ex.getMessage());
            }


        }
        else{
            out.print("A senha está incorreta!");
        }


    }
    else{
        out.print("Preencha todos os campos");
    }
%>

<html>
    <head>
        
        <title>Cadastrar Usuário</title>
    </head>
    <body>
        <h1>Cadastrar Usuário</h1>
        <form action="" method="post">
            Nome: <input type="text" name="nome" size="10"><br>
            Senha: <input type="password" name="senha" size="10"><br>
            Digite a senha novamente: <input type="password" name="senha2" size="10"><br>
            <select name="adm">
                <option value="1">Administrador</option>
                <option value="2">Usuário</option>
            </select><br><br>
            <input type="submit" value="Salvar">

        </form>
    </body>
</html>
