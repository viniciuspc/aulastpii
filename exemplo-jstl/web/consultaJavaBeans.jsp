<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="br.com.fiap.bean.*" %>
<jsp:useBean id="aluno" class="br.com.fiap.bean.BeanAlunos"/>
<h2>Lista de Alunos - JavaBenas</h2>
<table border="1">
    <c:forEach var="linha" items="${aluno.listaAllunos}">
        <tr>
            <td><c:out value="${linha.rm}"/></td>
            <td><c:out value="${linha.nome}"/></td>
            <td><c:out value="${linha.curso}"/></td>
        </tr>
    </c:forEach>
</table>