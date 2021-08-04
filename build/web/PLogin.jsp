<%-- 
    Document   : PLogin
    Created on : May 29, 2021, 8:37:17 PM
    Author     : sandakelum
--%>

<%@page import="com.Util.PValidate"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <body>
 <%
 String PP_NIC = request.getParameter("P_NIC");
 String PP_password = request.getParameter("P_password");
 
 boolean IsValid = PValidate.ValidateUser(PP_NIC, PP_password);
 
 if(IsValid)
 { 
 %>
 <jsp:forward page="Pwelcome.jsp">
 <jsp:param name="uname" value="<%=PP_NIC%>" />
 </jsp:forward>
 <%} else{
 %>
 <%="User Name or Password Incorrect. Please Try Again!"%> 
<br/>
 <jsp:include page="PHome.jsp"/>
 <% 
 }
 %>
 </body>
</html>