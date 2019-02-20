/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author civan
 */
@WebServlet(name = "FormularioServlet", urlPatterns = {"/FormularioServlet"})
public class FormularioServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter(); 
            
        
        String usuarioCorrecto = "testo";
        String passCorrecto = "123";
        
        String pUsuario = request.getParameter("usuario");
        String pPassword = request.getParameter("password");
        
        if(usuarioCorrecto.equals(pUsuario) && passCorrecto.equals(pPassword)){
            out.println("<h1>");
            out.println("Datos correctos");
            out.println("<br>Usuario: "+pUsuario);
            out.println("<br>Password: "+pPassword);
            out.println("</h1>");
        }else{
            response.sendError(response.SC_UNAUTHORIZED, "Las credenciales son incorrectas");
        }
        
        out.close();
    }

}
