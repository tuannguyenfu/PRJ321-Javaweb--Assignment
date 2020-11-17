<%-- 
    Document   : admin.jsp
    Created on : Nov 17, 2020, 8:56:14 AM
    Author     : tuann
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        List<User> listUser = (List<User>) request.getAttribute("listUser");
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
            <tr>
                <th>STT</th>
                <th>EMAIL</th>
                <th>NAME</th>
                <th>Gender</th>
                <th>DOB</th>
                <th>Address</th>
                <th>CITY</th>
                <th>STATE</th>
                <th>COUNTRY</th>
                <th>PHONE</th>
                <th>REGISTEREDDATE</th>
                <th></th>
            </tr>
            <% for(int i = 0; i < listUser.size(); i++) { %>
            <tr>
                <% User us = listUser.get(i); %>
                <td><%=i+1%></td>
                <td><%=us.getEmail()%></td>
                <td><%=us.getName()%></td>
                <td><%=us.getGender()%></td>
                <td><%=us.getDob()%></td>
                <td><%=us.getAddressLine()%></td>
                <td><%=us.getCity()%></td>
                <td><%=us.getState()%></td>
                <td><%=us.getCountry()%></td>
                <td><%=us.getContact()%></td>
                <td><%=us.getRegisterDate()%></td>
                <td><a href="admin?option=reset&id=<%=us.getId()%>">RESET-PASS</a>
                <a href="admin?option=delete&id=<%=us.getId()%>">DELETE</a></td>
            </tr>
            <% }%>
        </table>
        
        <!-- Footer -->
        <div class="footer">
            <%@include file="footer.jsp" %>
        </div>
    </body>
</html>
