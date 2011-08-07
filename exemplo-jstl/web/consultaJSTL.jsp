<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<sql:setDataSource
    var="cn"
    driver="com.mysql.jdbc.Driver"
    url="jdbc:mysql://localhost:3306/dbjstl?user=root&password=fiap"/>

<sql:query var="rs" dataSource="${cn}">
    select * from alunos
</sql:query>

    <table border="1">
        <c:forEach var="linha" items="${rs.rows}">
            <tr>
                <td><c:out value="${linha.rm}"/></td>
                <td><c:out value="${linha.nome}"/></td>
                <td><c:out value="${linha.curso}"/></td>
                
            </tr>
        </c:forEach>
    </table>