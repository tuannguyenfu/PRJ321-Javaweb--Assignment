<%-- 
    Document   : compose
    Created on : Nov 7, 2020, 1:53:15 PM
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
        List<String> listUserToSend = (List<String>) request.getAttribute("listsendemail");
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
        <div class="composeform">
            <form action="compose" method="POST">
                <table>
                    <tbody>
                        <tr> <td>To: </td>
                            <td><select style="width: 180px;" name="to" required >
                                    <% for (String email : listUserToSend) {%>
                                    <option><%=email%></option>
                                    <% }%>
                                </select>
                            </td>
                        </tr>
                        <tr> <td>Subject: </td>
                            <td><input type="text" nane="subject"/></td>
                        </tr>
                        <tr>
                            <td colspan="2">Message:</td>
                            <td></td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <textarea name="message" rows="5" cols="50"></textarea>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <input type="submit" value="Send Mail"/>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </form>
        </div>

        <!-- Footer -->
        <div class="footer">
            <%@include file="footer.jsp" %>
        </div>

    </body>
</html>
