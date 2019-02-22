<%-- 
    Document   : setterJsp
    Created on : Feb 22, 2019, 5:20:08 PM
    Author     : civan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>JSP que modifica a un JavaBean</h1>
        
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session" />
        
        Modificamos los atributos:
        <br>
        <br>
        <% 
            int baseValor = 5;
            int alturaValor = 10;
        %>
        
        <jsp:setProperty name="rectangulo" property="base" value="<%= baseValor %>" />
        
        Nuevo valor base: <%= baseValor %>
        <br>
        
        <jsp:setProperty name="rectangulo" property="altura" value="<%= alturaValor %>" />
        
        Nuevo valor altura: <%= alturaValor %>
        
        <br>
        <br>
        <a href="index.jsp">Regresar</a>
    </body>
</html>
