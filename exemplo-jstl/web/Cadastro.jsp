<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<sql:setDataSource
    dataSource="cn"
    driver="com.mysql.jdbc.Driver"
    url="jdbc:mysql://localhost:3306/dbjstl?user=root&password=fiap"/>

<c:catch var="erro">
    <sql:update dataSource="${cn}">
        insert into (rm,nome,curso) values(?,?,?)
        <sql:param value="${param.rm}"/>
        <sql:param value="${param.nome}"/>
        <sql:param value="${param.curso}"/>
    </sql:update>
</c:catch>

<c:out value="${erro}">
    Dados inseridos com sucesso!
</c:out>

