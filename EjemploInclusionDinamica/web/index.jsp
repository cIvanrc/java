<%-- 
    Document   : index
    Created on : Feb 22, 2019, 4:19:17 PM
    Author     : civan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Inclusion dinamica</title>
    </head>
    <body>
        <br>
        <jsp:include page="WEB-INF/recursoPrivado.jsp"> 
            <jsp:param name="colorFondo" value="yellow" />
        </jsp:include>
        <br>
        <jsp:include page="recursoPublico.jsp"/>
    </body>
</html>
