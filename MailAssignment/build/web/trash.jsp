<%-- 
    Document   : trash
    Created on : Nov 8, 2020, 10:19:43 PM
    Author     : tuann
--%>

<%@page import="Model.Message"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <% 
            List<Message> listOfTrashMessage = (List<Message>) request.getAttribute("listtrash");
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
                    <th>FROM</th>
                    <th>TO</th>
                    <th>Subject</th>
                    <th></th>
                </tr>
                <% for (Message m : listOfTrashMessage) {%>
                <tr>
                    <td><%=m.getSender()%></td>
                    <td><%=m.getReceiver()%></td>
                    <td><a href="detail?id=<%=m.getId()%>"><%=m.getSubject()%></a></td>
                    <td><a href="recovermessage?id=<%=m.getId()%>">Recovery</a>
                        <a href="deletemessage?id=<%=m.getId()%>">Delete</a></td>
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
