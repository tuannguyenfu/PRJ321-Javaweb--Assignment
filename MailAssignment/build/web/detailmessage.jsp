<%-- 
    Document   : detailmessage
    Created on : Nov 8, 2020, 4:23:41 PM
    Author     : Tuan Nguyen
--%>

<%@page import="Model.Message"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<style>
    table {
        width: 1000px;
        height: 200px;
    } 
    th{
        width: 100px;
    }

    #content {
        height: 300px;
        vertical-align: top;
        text-align: left;
    }

</style>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <%
        Message mess = (Message) request.getAttribute("message");
    %>
    <body>
        <!-- header -->
        <div class="header"> 
            <%@include file="header.jsp" %>
        </div>
        <div>
            <%@include file="link.jsp" %>
        </div>

        <!-- body -->
        <table border="1">
            <tr><th>FROM</td><td><%=mess.getSender()%></td></tr>
            <tr><th>SUBJECT</b </td><td><%=mess.getSubject()%></td></tr>
            <tr><td id="content" colspan="2"><%=mess.getMessage()%></td></tr>
        </table>

        <!-- Footer -->
        <div class="footer">
            <%@include file="footer.jsp" %>
        </div>
    </body>
</html>
