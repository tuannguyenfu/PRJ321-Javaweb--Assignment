<%-- 
    Document   : register
    Created on : Nov 3, 2020, 1:09:54 PM
    Author     : tuann
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="inputform">
            <h2 class="design">Registration Form</h2>
            <form action="registerservlet" method="POST">
                <table>
                    <tr><td>Name:</td><td><input type="text" name="name"/></td></tr>
                    <tr><td>Email:</td><td><input type="text" name="email"/></td></tr>
                    <tr><td>Password:</td><td><input type="password" name="password"/></td></tr>
                    <tr><td>Gender:</td><td><input id="gender1" type="radio" name="name" value="male"/>Male
                            <input id="gender2" type="radio"  name="gender" value="female">Female</td></tr>
                    <tr><td>Date Of Birth:</td><td><input type="date" name="dob"/></td></tr>
                    <tr><td>AddressLine:</td><td><textarea name="addressLine" rows="5" cols="15"></textarea></td></tr>
                    <tr><td>City:</td><td><input type="text" name="city"/></td></tr>
                    <tr><td>State:</td><td><input type="text" name="state"/></td></tr>
                    <tr><td>Country:</td><td><select name="country">
                                <option>Vietnam</option>
                                <option>Singapore</option>
                            </select></td></tr>
                    <tr><td>Contract:</td><td><input type="text" name="contact"/></td></tr>
                    <tr><td colspan="2"><input id="submit" type="submit" value="register"/><input id="reset" type="reset" value="clear"/></td></tr>
                </table>
            </form>
        </div>
    </body>
</html>
