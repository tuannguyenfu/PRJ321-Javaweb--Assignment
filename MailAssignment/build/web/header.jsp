<%-- 
    Document   : header
    Created on : Nov 3, 2020, 1:06:57 PM
    Author     : tuann
--%>

<%@page import="Model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <style>
        h2 {
            background-color: blue;
            color: white;
        }
        h3 {
            background-color: orange;
            color: white;
        }
    </style>
    <head>
        <title>Header</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <% 
            String welcome = "";
            session = request.getSession();
            User u = (User) session.getAttribute("user");
            if (u != null) {
                welcome = u.getName();
            }
        %>
    </head>
    <body>
        <h2>FPTU Mail Manager</h2>
        <h3>Main Page <%=welcome%></h3>
    </body>
</html>
