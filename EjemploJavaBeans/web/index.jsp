<%-- 
    Document   : index
    Created on : Feb 22, 2019, 5:19:34 PM
    Author     : civan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo de JavaBeans</title>
    </head>
    <body>
        <h1>Ejemplo de JavaBeans</h1>
        <a href="setterJsp.jsp">Modificar valores del JavaBean</a>
        <br>
        <a href="getterJsp.jsp">Leer valor del JavaBean</a>
        <br>
        <br>
        
        Formulario 1:
        <br>
        <form name="form1" action="setterParamJsp.jsp">
            Base: <input type="text" name="baseParam"/>
            <br>
            Altura: <input type="text" name="alturaParam"/>
            <input type="submit" value="Enviar"/>
        </form>
        <br>
        Formulario 2:
        <br>
        <form name="form2" action="setterAllParamJsp.jsp">
            Base: <input type="text" name="base"/>
            <br>
            Altura: <input type="text" name="altura"/>
            <input type="submit" value="Enviar"/>            
        </form>
    </body>
</html>
