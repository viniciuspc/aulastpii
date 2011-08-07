<%@page import="br.com.fiap.bean.BeanUsuarios" %>
<jsp:useBean id="usuario" class="br.com.fiap.bean.BeanUsuarios"/>

<jsp:setProperty name="usuario" property="nome" value="${param.usuario}"/>
<jsp:setProperty name="usuario" property="senha" value="${param.senha}"/>
<jsp:setProperty name="usuario" property="nivel" value="${param.nivel}"/>

Nome: <jsp:getProperty name="usuario" property="nome" /><br>
Nivel: <jsp:getProperty name="usuario" property="descricao"/><br>
<jsp:getProperty name="usuario" property="cadastro"/>