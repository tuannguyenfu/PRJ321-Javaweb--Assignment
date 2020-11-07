<%-- 
    Document   : inbox
    Created on : Nov 7, 2020, 1:38:43 PM
    Author     : tuann
--%>

<%@page import="Model.Message"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<style>
    th {
        width: 400px;
    }
    td {
        width: 400px;
    }
</style>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <% 
            List<Message> listOfInbox = (List<Message>) request.getAttribute("listofinbox");
        %>
    </head>
    <body>
        <!-- header -->
        <div class="header"> 
            <%@include file="header.jsp" %>
        </div>
        <div>
            <%@include file="link.jsp" %>
        </div>
        
        <!-- Body -->
        <div class="inbox">
            <table border="1">
                <tr>
                    <th>Subject</th>
                    <th>Message</th>
                </tr>
                <% for (Message m : listOfInbox) {%>
                <tr>
                    <td><%=m.getSender()%></td>
                    <td><%=m.getMessage()%></td>
                </tr>
                <% } %>
            </table>
        </div>
        
        <!-- Footer -->
        <div class="footer">
            <%@include file="footer.jsp" %>
        </div>
    </body>
</html>
