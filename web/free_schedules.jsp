
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head><link rel="stylesheet" href="a.css"></head>
    <body class="body">
        <%String dname = request.getParameter("dname");%> 




        <%
            Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");

            Statement statement = connection.createStatement();

            ResultSet resultset
                    = statement.executeQuery("select D_USER_ID from DOCTOR_REG where D_NAME = '" + dname + "'");

            while (resultset.next()) {%>
            
            
                <%
                Connection connection1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");

                Statement statement1= connection1.createStatement();

                ResultSet resultset1
                        = statement1.executeQuery("select * from DOC_SCHEDULE where USER_ID = '" +resultset.getString("D_USER_ID") + "'");
%><%
                while (resultset1.next()){%>
                    <h3 class="h1">

                        Date : <%= resultset1.getString("SCHEDULE_DATE")%> </br> </br>
                        Start Time :     <%= resultset1.getString("START_TIME")%> </br> </br>
                        End Time :   <%= resultset1.getString("END_TIME")%> </br> </br>

                    </h3>
                <%
                    }
                %>
            <%
                }
            %>

    </body>
</html>

