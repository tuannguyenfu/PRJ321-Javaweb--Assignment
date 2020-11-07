/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAL.MessageDAO;
import DAL.UserDAO;
import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author tuann
 */
public class ComposeController extends HttpServlet {

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
        HttpSession session = request.getSession();
        if (session != null) {
            User u = (User) session.getAttribute("user");
            List<String> listOfUserToSend = new UserDAO().listEmailSend(u.getEmail());

            request.setAttribute("listsendemail", listOfUserToSend);
            request.getRequestDispatcher("compose.jsp").forward(request, response);
        } else {
            response.sendRedirect("index.jsp");
        }

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

        //Get user login from session
        HttpSession session = request.getSession();
        if (session != null) {
            User u = (User) session.getAttribute("user");
            //Get data from compose form
            String sender = u.getEmail();
            String receiver = request.getParameter("to");
            String subject = request.getParameter("subject");
            String message = request.getParameter("message");
            Date messageDate = getDateSqlNow();
            
            //Insert into DB
            int save = new MessageDAO().addOne(sender, receiver, subject, message, messageDate);
            if (save == 1) {
                response.sendRedirect("sent");
            }
        }
        else {
            response.sendRedirect("index.jsp");
        }
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

    public Date getDateSqlNow() {
        return new Date(new java.util.Date().getTime());
    }
    
}
