package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class Select_005fappointment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head><link rel=\"stylesheet\" href=\"a.css\">\n");
      out.write("        </head>\n");
      out.write("         <body class=\"body\">    <center>\n");
      out.write("    <h1 class=\"h1\">\n");
      out.write("            Select your Doctor\n");
      out.write("    </h1> \n");
      out.write("        <form method=\"post\" action=\"show_app.jsp\"> \n");
      out.write("\n");
      out.write("            <select id=\"dname\" name=\"dname\" class=\"dte\">\n");
      out.write("                ");

                    try {
                        Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
                        Statement statement = connection.createStatement();
                        String sql = "select D_NAME from DOCTOR_REG";
                        ResultSet resultSet = statement.executeQuery(sql);

                        while (resultSet.next()) {
      out.write("\n");
      out.write("                <option value=\"");
      out.print(resultSet.getString("D_NAME"));
      out.write("\" class=\"dte\">");
      out.print(resultSet.getString("D_NAME"));
      out.write("</option>\n");
      out.write("                ");
}
                        connection.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                        }
      out.write("\n");
      out.write("            </select></br> </br>\n");
      out.write("            <input type=\"submit\" value=\"Show schedules\" class=\"button\"/> \n");
      out.write("        </form>\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
