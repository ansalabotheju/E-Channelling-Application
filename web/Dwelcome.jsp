
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head><link rel="stylesheet" href="a.css">

        <%String uname = request.getParameter("uname");%> 

        <%
        Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");

        Statement statement = connection.createStatement();

        String id = request.getParameter("id");

        ResultSet resultset
                = statement.executeQuery("select * from DOCTOR_REG where D_USER_ID ='" + uname + "'");

        if (!resultset.next()) {
            out.println("Sorry, could not find that publisher. ");
        } else {
    %>
    <h1 class="h1"> <center>   Hi, Welcome Dr:
            <%= resultset.getString("D_NAME")%> 
        </center></h1>  
     </head>
<body class="body">
<center>
    <form method="post" action="Add_shedule.jsp"> 
        <input type="submit" value="ADD Schedule" class="button"/> 
    </form>

    </br>
    <form method="post" action="Edit_Doc_prof.jsp"> 
        <input type="submit" value="EDIT PROFILE" class="button"/> 
    </form>
    
      </br>
    <form method="post" action="show_doc_sch.jsp"> 
        <input type="submit" value="Show schedules" class="button"/> 
        <input type="hidden" name ="uname" value="<%=uname%>" class="button"/> 
    </form>
</center>
<h4 class="h1">




    Name : <%= resultset.getString("D_NAME")%> </br> </br>
    User_ID :        <%= resultset.getString("D_USER_ID")%></br> </br>
    Phone :     <%= resultset.getString("D_PHONE")%> </br> </br>
    Specialization :   <%= resultset.getString("D_SPECIALIZATION")%> </br>



    <%
        }
    %>
</h4>
</body>
</html>

