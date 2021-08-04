
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head><link rel="stylesheet" href="a.css">
    
        <h1 class="h1"><center>
            Hi, Welcome :
            <%= request.getParameter("uname")%> 
            </center>
        </h1> </head>
< <body class="body">
    <center>
        <form method="post" action="Select_appointment.jsp"> 
            <input type="submit" value="Make an appointment" class="button"/> 
        </form>

        </br>
        <form method="post" action="Edit_patient_prof.jsp"> 
            <input type="submit" value="EDIT PROFILE" class="button"/> 
        </form>
    </center>
</body>
</html>
