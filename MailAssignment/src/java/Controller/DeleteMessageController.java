/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAL.MessageDAO;
import Model.User;
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
 * @author tuann
 */
@WebServlet(name = "DeleteMessageController", urlPatterns = {"/deletemessage"})
public class DeleteMessageController extends HttpServlet {

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
        //Use session to get User login
        User u = (User) session.getAttribute("user");
        if (u != null) {

            //Get message's id
            int id = Integer.parseInt(request.getParameter("id"));

            new MessageDAO().deleteMessage(id);
            response.sendRedirect("trash");
        } else {
            response.sendRedirect("login");
        }
    }

}
