
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head><link rel="stylesheet" href="a.css">

        <%String dname = request.getParameter("dname");%> 

        <%
        Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");

        Statement statement = connection.createStatement();

        String id = request.getParameter("id");

        ResultSet resultset
                = statement.executeQuery("select * from DOCTOR_REG where D_NAME ='" + dname + "'");

        if (!resultset.next()) {
            out.println("Sorry, could not find that publisher. ");
        } else {
    %>

     </head>
<body class="body">

<center>
<h1 class="h1"> Free schedules</h1>

        <form action="free_schedules.jsp">
            <input type="submit" value="show free schedules" class="button"/>
            <input type="hidden"  name ="dname" value="<%=dname%>" class="button"/>
        </form></center>
</br> </br> </br></br> </br> </br></br></br>
<h4 class="h1">




    Doctor Name : <%= resultset.getString("D_NAME")%> </br> </br>
    Phone :     <%= resultset.getString("D_PHONE")%> </br> </br>
    Specialization :   <%= resultset.getString("D_SPECIALIZATION")%> </br> </br>



    <%
        }
    %>
</h4> 
</body>
</html>

