package com.Util;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Patient_reg extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String P_name = request.getParameter("P_name");
        String P_NIC = request.getParameter("P_NIC");
        String P_phone = request.getParameter("P_phone");
        String P_password = request.getParameter("P_password");

        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            PreparedStatement ps = con.prepareStatement("insert into PATIENT_REG values(?,?,?,?)");
            ps.setString(1, P_name);
            ps.setString(2, P_password);
            ps.setString(3, P_phone);
            ps.setString(4, P_NIC);

            int i = ps.executeUpdate();
            if (i > 0) {
                out.println("You are sucessfully register");
            }
        } catch (Exception se) {
            se.printStackTrace();
        }
    }
}
