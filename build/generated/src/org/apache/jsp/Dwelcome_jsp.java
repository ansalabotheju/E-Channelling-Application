package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class Dwelcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
String uname = request.getParameter("uname");
      out.write(" \n");
      out.write("\n");
      out.write("        ");

        Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");

        Statement statement = connection.createStatement();

        String id = request.getParameter("id");

        ResultSet resultset
                = statement.executeQuery("select * from DOCTOR_REG where D_USER_ID ='" + uname + "'");

        if (!resultset.next()) {
            out.println("Sorry, could not find that publisher. ");
        } else {
    
      out.write("\n");
      out.write("    <h1 class=\"h1\"> <center>   Hi, Welcome Dr:\n");
      out.write("            ");
      out.print( resultset.getString("D_NAME"));
      out.write(" \n");
      out.write("        </center></h1>  \n");
      out.write("     </head>\n");
      out.write("<body class=\"body\">\n");
      out.write("<center>\n");
      out.write("    <form method=\"post\" action=\"Add_shedule.jsp\"> \n");
      out.write("        <input type=\"submit\" value=\"ADD Schedule\" class=\"button\"/> \n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    </br>\n");
      out.write("    <form method=\"post\" action=\"Edit_Doc_prof.jsp\"> \n");
      out.write("        <input type=\"submit\" value=\"EDIT PROFILE\" class=\"button\"/> \n");
      out.write("    </form>\n");
      out.write("    \n");
      out.write("      </br>\n");
      out.write("    <form method=\"post\" action=\"show_doc_sch.jsp\"> \n");
      out.write("        <input type=\"submit\" value=\"Show schedules\" class=\"button\"/> \n");
      out.write("        <input type=\"hidden\" name =\"uname\" value=\"");
      out.print(uname);
      out.write("\" class=\"button\"/> \n");
      out.write("    </form>\n");
      out.write("</center>\n");
      out.write("<h4 class=\"h1\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    Name : ");
      out.print( resultset.getString("D_NAME"));
      out.write(" </br> </br>\n");
      out.write("    User_ID :        ");
      out.print( resultset.getString("D_USER_ID"));
      out.write("</br> </br>\n");
      out.write("    Phone :     ");
      out.print( resultset.getString("D_PHONE"));
      out.write(" </br> </br>\n");
      out.write("    Specialization :   ");
      out.print( resultset.getString("D_SPECIALIZATION"));
      out.write(" </br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("</h4>\n");
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
