<%-- 
    Document   : PHome
    Created on : May 29, 2021, 8:34:37 PM
    Author     : sandakelum
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head>
        <link rel="stylesheet" href="a.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <body class="body"><center>
        <h1 class="h1">Doctor Log in</h1></br>  
        
        <form action="DLogin.jsp">
           <h2 class="h2">
            UserID:<input type="text" name="D_UserID" ></br> </br>  
            Password:<input type="password" name="D_password" ></br>  </br>  </h2>
            <input type="submit" value="Login" class="button"/>
        </form></center>
</body>
</html>

