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
@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter(); 
            /* TODO output your page here. You may use following sample code. */
            out.println("<html>");
            out.println("<body>");
            out.println("<h1>Metodo doGet no soportado en el Servlet</h1>");
            out.println("</body>");
            out.println("</html>");
            out.close();
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        System.out.println("usuario::"+usuario);
        System.out.println("password::"+password);
        
        
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("El parametro usuario es: "+usuario);
        out.println("<br>");
        out.println("El parametro password es: "+password);
        out.println("</body>");
        out.println("</html>");
        out.close();
                
    }


}
