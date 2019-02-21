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
import javax.servlet.http.HttpSession;

/**
 *
 * @author civan
 */
@WebServlet(name = "SesionesServlet", urlPatterns = {"/SesionesServlet"})
public class SesionesServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession sesion = request.getSession();
        
        String titulo = null;
        
        Integer contadorVisitas = (Integer) sesion.getAttribute("contadorVisitas");
        
        if(contadorVisitas == null){
            contadorVisitas = 1;
            titulo = "Bienvenido por primera vez";
        }else{
            titulo = "Bienvenido nuevamente";
            contadorVisitas++;
        }
        
        sesion.setAttribute("contadorVisitas", contadorVisitas);
        
        PrintWriter out = response.getWriter();
        out.println("Titulo: "+titulo);
        out.println("<br>");
        out.println("No. Accesos al recurso: "+contadorVisitas);
        out.println("<br>");
        out.println("ID de la sesion: "+sesion.getId());
        
    }
}
