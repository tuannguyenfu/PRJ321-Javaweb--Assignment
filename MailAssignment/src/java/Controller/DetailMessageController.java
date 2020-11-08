/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAL.MessageDAO;
import Model.Message;
import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
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
public class DetailMessageController extends HttpServlet {



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
         HttpSession session = request.getSession();
        //Use session to get User login
        User u = (User) session.getAttribute("user");
        if (u != null) {
            
            int id = Integer.parseInt(request.getParameter("id"));
            //Get list of inbox of user
            Message mess = new MessageDAO().getMessageById(id);
            request.setAttribute("message", mess);
            //Forward to inbox.jsp
            request.getRequestDispatcher("detailmessage.jsp").forward(request, response);
        } else {
            response.sendRedirect("index.jsp");
        }
    }

   
}
