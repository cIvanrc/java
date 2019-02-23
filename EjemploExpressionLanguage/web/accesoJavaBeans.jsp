<%-- 
    Document   : accesoJavaBeans
    Created on : Feb 23, 2019, 12:49:25 AM
    Author     : civan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Acceso a JavaBeans</h1>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" />
        
        <jsp:setProperty name="rectangulo" property="*" />
        <br>
        Valor base: ${rectangulo.base}
        <br>
        Valor altura: ${rectangulo.altura}
        <br>
        Valor Area: ${rectangulo.area}
        <br>
        Calculo del Area con EL: ${rectangulo.base * rectangulo.altura}
        <br>
        <br>
        <a href="index.jsp">Regresar</a>
    </body>
</html>
