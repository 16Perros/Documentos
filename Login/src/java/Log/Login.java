/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Log;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author 16 Perros
 */
public class Login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            String userName =request.getParameter("user");
            String pass = request.getParameter("contra");
            
            RequestDispatcher res;
            if(request.getParameter("btn")!=null){
                if(userName==null||userName.equals("")||pass==null||pass.equals("")){
                    
                    out.print("Ingrese el usuario/contraseña");
                    
                  //  res=request.getRequestDispatcher("index.html");
                    //res.forward(request, response);
                }else if(userName.equals("root")&&pass.equals("1234")){
                    
                    HttpSession session=request.getSession();
                    session.setAttribute("usuario", userName);
                    session.setAttribute("contraseña", pass);
                    out.println("Contraseña Correcta <br/>");
                    out.println("Presione par ver el usuario y la contraseña <br/>");
                    out.println("<a href=./Bienvenido.jsp>"+"Click");
                    //response.sendRedirect("Bienvenido.jsp");
                    out.close();
                    
                }else{
                    //request.setAttribute("v", "usuario existe"+userName);
                    //request.setAttribute("passw", out);
                    request.setAttribute("consola", userName);
                    request.setAttribute("game", pass);
                    res=request.getRequestDispatcher("error.jsp");
                    res.forward(request, response);
                }
            }
       // res=request.getRequestDispatcher("index.html");
            //res=request.getRequestDispatcher("login.jsp");
        //    res.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
