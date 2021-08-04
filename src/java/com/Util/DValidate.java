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
public class DValidate {
 
 public static boolean ValidateUser (String DD_UserID, String DD_password) {
 
 boolean bstate = false;
 
 try {
 //loading driver
 Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
 
 //creating connection string
 Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
 
 PreparedStatement ps =  con.prepareStatement("select * from DOCTOR_REG where D_USER_ID=? and D_PASSWORD = ?");
 
 ps.setString(1, DD_UserID);
 ps.setString(2,DD_password);
 
 ResultSet rs = ps.executeQuery();
 bstate = rs.next();
 } catch (Exception e) {
 e.printStackTrace();
 }
 
 return bstate;
 }
}
