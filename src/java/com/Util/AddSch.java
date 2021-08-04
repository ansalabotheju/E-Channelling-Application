package com.Util;

import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 
import java.sql.*; 
public class AddSch extends HttpServlet { 
 protected void doPost(HttpServletRequest request, HttpServletResponse response) 
 throws ServletException, IOException { 
 response.setContentType("text/html;charset=UTF-8"); 
 PrintWriter out = response.getWriter(); 
 
 String Sch_userID = request.getParameter("Sch_userID");
 String Sch_date = request.getParameter("Sch_date"); 
 String Sch_ST = request.getParameter("Sch_ST");
 String Sch_ET = request.getParameter("Sch_ET");
 
 
 try{ 
 Class.forName("org.apache.derby.jdbc.EmbeddedDriver"); 

 Connection con=DriverManager.getConnection ("jdbc:derby://localhost:1527/sample", "app", "app"); 
 PreparedStatement ps=con.prepareStatement 
 ("insert into DOC_SCHEDULE values(?,?,?,?)");
 ps.setString(1, Sch_userID); 
 ps.setString(2, Sch_date);
 ps.setString(3, Sch_ST); 
 ps.setString(4, Sch_ET); 
 int i = ps.executeUpdate(); 
 if(i > 0) 
 { 
 out.println("You are sucessfully added");
 } 
 }catch(Exception se) 
 { 
 se.printStackTrace(); 
 } 
 } 
 }


