package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class show_005fapp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("    <head><link rel=\"stylesheet\" href=\"a.css\">\n");
      out.write("\n");
      out.write("        ");
String dname = request.getParameter("dname");
      out.write(" \n");
      out.write("\n");
      out.write("        ");

        Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");

        Statement statement = connection.createStatement();

        String id = request.getParameter("id");

        ResultSet resultset
                = statement.executeQuery("select * from DOCTOR_REG where D_NAME ='" + dname + "'");

        if (!resultset.next()) {
            out.println("Sorry, could not find that publisher. ");
        } else {
    
      out.write("\n");
      out.write("\n");
      out.write("     </head>\n");
      out.write("<body class=\"body\">\n");
      out.write("\n");
      out.write(" </br><center>\n");
      out.write("<h1 class=\"h1\"> Free schedules</h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form action=\"free_schedules.jsp\">\n");
      out.write("            <input type=\"submit\" value=\"show free schedules\" class=\"button\"/>\n");
      out.write("            <input type=\"hidden\"  name =\"dname\" value=\"");
      out.print(dname);
      out.write("\" class=\"button\"/>\n");
      out.write("        </form></center>\n");
      out.write("</br> </br> </br></br> </br> </br>\n");
      out.write("<h3 class=\"h1\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    Doctor Name : ");
      out.print( resultset.getString("D_NAME"));
      out.write(" </br> </br>\n");
      out.write("    Phone :     ");
      out.print( resultset.getString("D_PHONE"));
      out.write(" </br> </br>\n");
      out.write("    Specialization :   ");
      out.print( resultset.getString("D_SPECIALIZATION"));
      out.write(" </br> </br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("</h3> \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
