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
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author civan
 */
@WebServlet(name = "CookiesServlet", urlPatterns = {"/CookiesServlet"})
public class CookiesServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        
        boolean nuevoUsuario = true;
        
        Cookie[] cookies = request.getCookies();
        
        if(cookies != null){
            for (Cookie c : cookies) {
                String cookieName = c.getName();
                String cookieValue = c.getValue();
                if(cookieName.equals("visitanteRecurrente") && cookieValue.equals("si")){
                    nuevoUsuario = false;
                    break;
                }                
            }
        }
        String mensaje = null;
        if(nuevoUsuario){
            Cookie visitanteCookie = new Cookie("visitanteRecurrente", "si");
            response.addCookie(visitanteCookie);
            mensaje = "primera visita";
        }else{
            mensaje = "visita recurrente";
        }
        
        PrintWriter out = response.getWriter();
        
        out.println("Mensaje: "+mensaje);
    }
}
