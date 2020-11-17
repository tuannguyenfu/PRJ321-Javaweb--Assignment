<%-- 
    Document   : index
    Created on : Nov 2, 2020, 10:16:20 PM
    Author     : tuann
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mail Manager</title>
    </head>
    <body>

        <!-- header -->
        <div class="header"> 
            <%@include file="header.jsp" %>
        </div>

        <!-- body div -->
        <div class="register">
            <%@include file="register.jsp" %>
        </div>

        <div class="login" style="float: right;">
            <%@include file="login.jsp" %>
        </div>

        <!-- Footer -->
        <div class="footer">
            <%@include file="footer.jsp" %>
        </div>
    </body>
</html>
