
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head><link rel="stylesheet" href="a.css">
        </head>
         <body class="body">    <center>
    <h1 class="h1">
            Select your Doctor
    </h1> 
        <form method="post" action="show_app.jsp"> 

            <select id="dname" name="dname" class="dte">
                <%
                    try {
                        Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
                        Statement statement = connection.createStatement();
                        String sql = "select D_NAME from DOCTOR_REG";
                        ResultSet resultSet = statement.executeQuery(sql);

                        while (resultSet.next()) {%>
                <option value="<%=resultSet.getString("D_NAME")%>" class="dte"><%=resultSet.getString("D_NAME")%></option>
                <%}
                        connection.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                        }%>
            </select></br> </br>
            <input type="submit" value="Show schedules" class="button"/> 
        </form>
    </center>




</body>
</html>
