<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
          <link rel="stylesheet" href="a.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body class="body"><center>
        <h1 class="h1">Doctor Sing in</h1></br> 
        <form method="post" action="AddSch"> 
            <h2 class="h2">
 User_ID:<input type="text" name="Sch_userID"></br> </br>
 DATE:<input type="date" name="Sch_date" ></br> </br>
 Starting Time:<input type="time" name="Sch_ST" ></br> </br>
 End Time:<input type="time" name="Sch_ET" ></br> </br> </h2>
 <input type="submit" value="Add+" class="button"/> 
 </form> 
    </center></body>
</html>



