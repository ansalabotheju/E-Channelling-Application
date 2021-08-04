
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<html>

    <body>
        <%
            String doctor_id = request.getParameter("doctor_id");
            String date = request.getParameter("date");
  
            try{

                Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
                Connection conn = DriverManager.getConnection ("jdbc:derby://localhost:1527/sample","app","app");
                PreparedStatement pst = conn.prepareStatement("delete from DOC_SCHEDULE where USER_ID=? and SCHEDULE_DATE=?");
                pst.setString(1,doctor_id);
                pst.setString(2,date);

                pst.executeUpdate();
                pst.close();
                conn.close();
              }catch(Exception e){
                System.out.print(e.getMessage());
            }finally{
                
            }
        %>

        <jsp:include page="show_doc_sch.jsp">
            <jsp:param name="doctor_id" value="<%=doctor_id%>" />            
        </jsp:include>
    </body>
</html>
