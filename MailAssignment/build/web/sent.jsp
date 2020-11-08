<%-- 
    Document   : sent
    Created on : Nov 8, 2020, 3:57:35 PM
    Author     : Tuan Nguyen
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
    </head>
    <%
        List<Message> listOfSentMessage = (List<Message>) request.getAttribute("listofsent");
    %>

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
                    <th>To</th>
                    <th>Subject</th>
                </tr>
                <% for (Message m : listOfSentMessage) {%>
                <tr>
                    <td><%=m.getReceiver()%></td>
                    <td><%=m.getSubject()%></td>
                </tr>
                <% }%>
            </table>
        </div>

        <!-- Footer -->
        <div class="footer">
            <%@include file="footer.jsp" %>
        </div>
    </body>
</html>
