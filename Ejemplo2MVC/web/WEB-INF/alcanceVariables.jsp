<%-- 
    Document   : alcanceVariables
    Created on : Feb 23, 2019, 2:18:05 PM
    Author     : civan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Alcance de Variables</h1>
        <br>
        Variable request:
        Base: ${rectanguloRequest.base}
        Altura: ${rectanguloRequest.altura}
        Area: ${rectanguloRequest.area}
        <br>
        <br>
        Variable session:
        Base: ${rectanguloSession.base}
        Altura: ${rectanguloSession.altura}
        Area: ${rectanguloSession.area}
        <br>
        <br>
        Variable application:
        Base: ${rectanguloApplication.base}
        Altura: ${rectanguloApplication.altura}
        Area: ${rectanguloApplication.area}
        <br>
        <br>
        <a href="${pageContext.request.contextPath}/index.jsp">Regresar</a>
    </body>
</html>
