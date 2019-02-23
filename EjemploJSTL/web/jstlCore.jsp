<%-- 
    Document   : jstrlCore
    Created on : Feb 23, 2019, 1:49:02 AM
    Author     : civan
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>JSTL Core</h1>
        <c:set var="nombre" value="ivan" />
        Variable nombre: <c:out value="${nombre}" />
        
        <br>
        <br>
        Variable codigo html:
        <c:out value="<h1>Holi</h1>" escapeXml="true" />
        <br>
        <br>
        
        <c:set var="bandera" value="true" />
        
        <c:if test="${bandera}" >
            La bandera es verdadera
        </c:if>
        <br>
        <c:if test="${param.option != null}" >
            <c:choose>
                <c:when test="${param.option == 1}">
                    <br>
                    Option 1 seleccionada
                    <br>
                </c:when>
                <c:when test="${param.option == 2}">
                    <br>
                    Option 2 seleccionada
                    <br>
                </c:when>
                <c:otherwise>
                    <br>
                    Option seleccionada desconocida: ${param.option}
                    <br>
                </c:otherwise>
            </c:choose>
        </c:if>
                    
        <% 
            String[] nombres = {"nombre1", "nombre2", "nombre3"};
            request.setAttribute("nombres",nombres);
        %>            
        
        <br>
        Lista de Nombres en el arreglo:
        <br>
        <ul>
            <c:forEach varStatus="status" var="persona" items="${nombres}">
                <li>${status.count}.- Nombre: ${persona}</li>                
            </c:forEach>
        </ul>
        <br>
        <a href="index.jsp">Regresar</a>
    </body>
</html>
