<%-- 
    Document   : login
    Created on : Nov 3, 2020, 10:02:47 AM
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

<div class="inputform" style="float: left;">
    <h2 class="design">Login Form</h2>
    <form action="loginservlet" method="POST">
        <table>
            <tr><td>Email:</td><td><input type="email" name="email" required/></td></tr>
            <tr><td>Password:</td><td><input type="password" name="password" required/></td></tr>
            <tr><td><label for="remember">Remember:</label></td><td><input id="remember" type="checkbox" name="remember"/></td></tr>
            <tr>
                <td colspan="2"><input id="login" type="submit" value="login"/></td>
            </tr>
        </table>
    </form>
</div>