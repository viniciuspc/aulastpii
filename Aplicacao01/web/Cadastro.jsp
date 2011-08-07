<%@page import="br.com.fiap.dados.*" %>
<%@page import="br.com.fiap.dao.DaoLivros" %>
<%@include file="valida.jsp" %>
<%
    String codigo = request.getParameter("codigo");
    String titulo = request.getParameter("titulo");
    String autor = request.getParameter("autor");
    String preco = request.getParameter("preco");

    if(codigo != null && codigo.length()>0 && titulo != null && titulo.length()>0 
       && autor != null && autor.length()>0 && preco != null && preco.length()>0){
        try{
            Livros livro = new Livros();
            livro.setCodigo(Integer.parseInt(codigo));
            livro.setTitulo(titulo);
            livro.setAutor(autor);
            livro.setPreco(Double.parseDouble(preco));

            DaoLivros dao = new DaoLivros();
            dao.setLivro(livro);
            dao.cadastro();
            out.print("Dados inseridos com sucesso!");
       }
       catch(Exception ex) {
           out.print(ex.getMessage());
       }
    }



%>
<html>
    <head>
        <title>Cadastro de Livros</title>
    </head>
    <body>
        <h1>Cadastro de Livros</h1>
        <form action="" method="post">
            Código: <input type="text" name="codigo" size="10"><br>
            Titulo: <input type="text" name="titulo" size="50"><br>
            Autor: <input type="text" name="autor" size="50"><br>
            Preço: <input type="text" name="preco" size="10"><br>
            <input type="submit" value="Salvar">
        </form>
    </body>
</html>
