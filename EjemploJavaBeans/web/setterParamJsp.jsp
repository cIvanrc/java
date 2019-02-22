<%-- 
    Document   : setterParamJsp
    Created on : Feb 22, 2019, 5:20:26 PM
    Author     : civan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>JSP que modifica a un JavaBean por parametros</h1>
        
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session" />
        
        Modificacion de los atributos:
        
        <br>
        <br>
        
        <jsp:setProperty name="rectangulo" property="base" param="baseParam" />
        
        Nuevo valor base: <%= request.getParameter("baseParam") %>
        <br>
        
        <jsp:setProperty name="rectangulo" property="altura" param="alturaParam" />
        
        Nuevo valor altura: <%= request.getParameter("alturaParam") %>
        
        <br>
        <br>
        <a href="index.jsp">Regresar</a>
    </body>
</html>
