/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAL.DBContext;
import DAL.UserDAO;
import Model.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author tuann
 */
public class LoginController extends HttpServlet {

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
        User u = (User) session.getAttribute("user");
        //If session is valid
        if (u != null) {
            if (u.getIsAdmin() == 0) {
                response.sendRedirect("inbox");
            }
            if (u.getIsAdmin() == 1) {
                response.sendRedirect("admin");
            }
        } else { //Check cookie
            String email = "";
            String password = "";
            Cookie[] cookie = request.getCookies();
            if (cookie != null) {
                for (Cookie c : cookie) {
                    if (c.getName().equalsIgnoreCase("email")) {
                        email = c.getValue();
                    }
                    if (c.getName().equalsIgnoreCase("password")) {
                        password = c.getValue();
                    }
                }
                request.setAttribute("email", email);
                request.setAttribute("password", password);
                request.setAttribute("remember", "checked");
            }
            request.getRequestDispatcher("index.jsp").forward(request, response);
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
        //Get data from login form
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String remember = request.getParameter("remember");

        //Check user form input is match with database
        User u = new UserDAO().getOne(email, password);
        //If user is correct
        if (u != null) {
            //Create a session for user input
            HttpSession session = request.getSession();
            session.setAttribute("user", u);

            //Check if user click remember
            if (remember != null) {
                Cookie c_user = new Cookie("email", email);
                Cookie c_pass = new Cookie("password", password);
                c_user.setMaxAge(1000);
                c_pass.setMaxAge(1000);
                response.addCookie(c_user);
                response.addCookie(c_pass);
            }
        }
        response.sendRedirect("login");
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
