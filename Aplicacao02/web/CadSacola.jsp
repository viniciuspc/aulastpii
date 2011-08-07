<%@page import="br.com.fiap.dados.*" %>
<%@page import="br.com.fiap.dao.*" %>

<%
    String codigo = request.getParameter("codigo");
    String qtd = request.getParameter("qtd");
    String forma = request.getParameter("forma");

    DaoLivros dao = new DaoLivros();
    Livros l = dao.detalhesLivros(Integer.parseInt(codigo));

    String titulo = l.getTitulo();
    String autor = l.getAutor();
    double preco = l.getPreco();



    if(qtd != null && qtd.length()>0){
        try{
            Sacola sacola = new Sacola();
            sacola.setCodigo(Integer.parseInt(codigo));
            sacola.setTitulo(titulo);
            sacola.setAutor(autor);
            sacola.setPreco(preco);
            sacola.setQtd(Integer.parseInt(qtd));
            sacola.setForma(forma);

            DaoSacola dao2 = new DaoSacola();
            dao2.setsacola(sacola);
            dao2.cadastro();
            response.sendRedirect("Sacola.jsp");
       }
       catch(Exception ex) {
           out.print(ex.getMessage());
       }
    }



%>
