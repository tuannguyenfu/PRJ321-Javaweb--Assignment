<%-- 
    Document   : index
    Created on : Nov 2, 2020, 10:16:20 PM
    Author     : tuann
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<style>
    .inputform {
        float: left;
        width: 400px;
        border: 1px solid black;
        border-radius: 10px;
        padding: 10px;
    }

    #submit{
        margin-left:97px;
        margin-right: 15px;
        width: 80px;
    }

    #reset {
        width: 80px;
    }

    #login {
        width: 80px;
    }

    .design {
        padding-left: 10px;
    }

    h2 {
        background-color: blue;
        color: white;
    }
    h3 {
        background-color: orange;
        color: white;
    }
</style>
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
