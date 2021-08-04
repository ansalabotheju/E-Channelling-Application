<%-- 
    Document   : PLogin
    Created on : May 29, 2021, 8:37:17 PM
    Author     : sandakelum
--%>

<%@page import="com.Util.DValidate"%>
<%@page import="com.Util.PValidate"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <body>
 <%
 String DD_UserID = request.getParameter("D_UserID");
 String DD_password = request.getParameter("D_password");
 
 boolean IsValid = DValidate.ValidateUser(DD_UserID, DD_password);
 
 if(IsValid)
 { 
 %>
 <jsp:forward page="Dwelcome.jsp">
 <jsp:param name="uname" value="<%=DD_UserID%>" />
 </jsp:forward>
 <%} else{
 %>
 <%="User Name or Password Incorrect. Please Try Again!"%> 
<br/>
 <jsp:include page="DHome.jsp"/>
 <% 
 }
 %>
 </body>
</html>