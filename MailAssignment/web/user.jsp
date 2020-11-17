<%-- 
    Document   : user
    Created on : Nov 9, 2020, 1:42:27 PM
    Author     : tuann
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        ]
        <%
            User u = (User) request.getAttribute("user");
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

        <img width="120px" height="80px" src="<%=u.getAvatar()%>" alt="your avatar">
        <form action="updateinfo" method="POST" enctype="multipart/form-data">
            <input type="file" accept=".jpg, .png, .jpeg, .gif, .bmp, .tif, .tiff|image/*" name="photo" value="Upload avatar"/>

            <!-- Body -->
            <table border="1">
                <tr>
                    <th>Name: </th>
                    <td><input type="text" value="<%=u.getName()%>" name="name"/></td>
                </tr>
                <tr>
                    <th>Email: </th>
                    <td><input type="email" value="<%=u.getEmail()%>" name="email" readonly/></td>
                </tr>
                <tr>
                    <th>Password: </th>
                    <td><input type="password" value="<%=u.getPassword()%>" name="password"/></td>
                </tr>
                <tr>
                    <th>Gender: </th>
                    <td><input type="text" value="<%=u.getGender()%>" name="gender"/></td>
                </tr>
                <tr>
                    <th>Date of birth: </th>
                    <td><input type="date" value="<%=u.getDob()%>" name="dob"></td>
                </tr>
                <tr>
                    <th>Address: </th>
                    <td><input type="text" value="<%=u.getAddressLine()%>" name="addressline"/></td>
                </tr>
                <tr>
                    <th>City: </th>
                    <td><input type="text" value="<%=u.getCity()%>" name="city"/></td>
                </tr>
                <tr>
                    <th>State: </th>
                    <td><input type="text" value="<%=u.getState()%>" name="state"/></td>
                </tr>
                <tr>
                    <th>Country: </th>
                    <td><input type="text" value="<%=u.getCountry()%>" name="country"/></td>
                </tr>
                <tr>
                    <th>Phone: </th>
                    <td><input type="text" value="<%=u.getContact()%>" name="contact"/></td>
                </tr>
                <tr>
                    <th>RegisteredDate: </th>
                    <td><input type="date" value="<%=u.getRegisterDate()%>" readonly/></td>
                </tr>
            </table>
            <input type="submit" value="Save">
        </form>

        <!-- Footer -->
        <div class="footer">
            <%@include file="footer.jsp" %>
        </div>
    </body>
</html>
