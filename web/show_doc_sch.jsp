
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head><link rel="stylesheet" href="a.css">
    </head>
    <body class="body">
        <%String dname = request.getParameter("uname");%> 

        <%
            Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");

            Statement statement = connection.createStatement();

            String id = request.getParameter("id");

            ResultSet resultset
                    = statement.executeQuery("select * from DOC_SCHEDULE where USER_ID= '" + dname + "'");

            while (resultset.next()) {%>
        <h3 class="h1">




            Date : <%= resultset.getString("SCHEDULE_DATE")%> </br> </br>
            Start Time :     <%= resultset.getString("START_TIME")%> </br> </br>
            End Time :   <%= resultset.getString("END_TIME")%> </br> </br>


        </h3>
        <form method="post" action="delete.jsp"> 
            <input type="submit" value="DELETE" class="button"/> 
            <input type="hidden" name ="doctor_id" value="<%=dname%>" class="button"/> 
            <input type="hidden" name ="date" value="<%= resultset.getString("SCHEDULE_DATE")%>" class="button"/> 
        </form>
        <%
            }
        %>

    </body>
</html>

