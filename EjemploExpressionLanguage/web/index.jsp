<%-- 
    Document   : index
    Created on : Feb 23, 2019, 12:49:06 AM
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
        <h1>Ejemplo de Expression Language</h1>
        <br>
        <a href="variablesImplicitas.jsp?usuario=ivan">Objetos impicitos en EL</a>
        <br>
        <br>
        Formulario HTML:
        <br>
        <form name="form1" action="accesoJavaBeans.jsp">
            Base: <input type="text" name="base"/>
            <br>
            Altura: <input type="text" name="altura"/>
            <input type="submit" value="Enviar"/>
        </form>
    </body>
</html>
