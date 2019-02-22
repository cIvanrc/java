<%-- 
    Document   : setterAllParamJsp
    Created on : Feb 22, 2019, 5:20:46 PM
    Author     : civan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP que modifica a un JavaBean por parametros</title>
    </head>
    <body>
        <h1>JSP que modifica a un JavaBean por parametros</h1>
        
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session" />
        
        <jsp:setProperty name="rectangulo" property="*" />
        
        Se modificaron todos los atributos:
        
        <br>
        <br>
        
        Nuevo valor base: <%= request.getParameter("base") %>
        <br>
        Nuevo valor altura: <%= request.getParameter("altura") %>
        <br>
        
        <a href="index.jsp">Regresar</a>
    </body>
</html>
