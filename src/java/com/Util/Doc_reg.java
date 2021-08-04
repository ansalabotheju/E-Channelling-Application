package com.Util;

import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 
import java.sql.*; 
public class Doc_reg extends HttpServlet { 
 protected void doPost(HttpServletRequest request, HttpServletResponse response) 
 throws ServletException, IOException { 
 response.setContentType("text/html;charset=UTF-8"); 
 PrintWriter out = response.getWriter(); 
 
 String D_name = request.getParameter("D_name");
 String D_user_ID = request.getParameter("D_user_ID"); 
 String D_phone = request.getParameter("D_phone");
 String D_password = request.getParameter("D_password");
 String D_specialization = request.getParameter("D_specialization"); 
 
 try{ 
 Class.forName("org.apache.derby.jdbc.EmbeddedDriver"); 

 Connection con=DriverManager.getConnection ("jdbc:derby://localhost:1527/sample", "app", "app"); 
 PreparedStatement ps=con.prepareStatement 
 ("insert into DOCTOR_REG values(?,?,?,?,?)");
 ps.setString(1, D_name); 
 ps.setString(2, D_user_ID);
  ps.setString(3, D_password); 
 ps.setString(4, D_phone); 
 ps.setString(5, D_specialization); 
 int i = ps.executeUpdate(); 
 if(i > 0) 
 { 
 out.println("You are sucessfully register");
 } 
 }catch(Exception se) 
 { 
 se.printStackTrace(); 
 } 
 } 
 }