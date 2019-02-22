<%-- 
    Document   : getterJsp
    Created on : Feb 22, 2019, 5:21:15 PM
    Author     : civan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP que lee valores del JavaBean</title>
    </head>
    <body>
        <h1>JSP que lee valores del JavaBean</h1>
        
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session" />
        
        <br>
        Valor base: <jsp:getProperty name="rectangulo" property="base"/>
        <br>
        Valor altura: <jsp:getProperty name="rectangulo" property="altura"/>
        <br>
        
        Valor area: <jsp:getProperty name="rectangulo" property="area" />
        <br>
        <br>
        <a href="index.jsp">Regresar</a>
    </body>
</html>
