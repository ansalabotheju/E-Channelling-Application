/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author sandakelum
 */
public class PValidate {
 
 public static boolean ValidateUser (String PP_NIC, String PP_password) {
 
 boolean bstate = false;
 
 try {
 //loading driver
 Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
 
 //creating connection string
 Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
 
 PreparedStatement ps =  con.prepareStatement("select * from PATIENT_REG where P_NIC=? and P_PASSWORD = ?");
 
 ps.setString(1, PP_NIC);
 ps.setString(2,PP_password);
 
 ResultSet rs = ps.executeQuery();
 bstate = rs.next();
 } catch (Exception e) {
 e.printStackTrace();
 }
 
 return bstate;
 }
}
