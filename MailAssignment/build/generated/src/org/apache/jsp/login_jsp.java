package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      out.write("<style>\n");
      out.write("    .inputform {\n");
      out.write("        float: left;\n");
      out.write("        width: 400px;\n");
      out.write("        border: 1px solid black;\n");
      out.write("        border-radius: 10px;\n");
      out.write("        padding: 10px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #submit{\n");
      out.write("        margin-left:97px;\n");
      out.write("        margin-right: 15px;\n");
      out.write("        width: 80px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #reset {\n");
      out.write("        width: 80px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #login {\n");
      out.write("        width: 80px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .design {\n");
      out.write("        padding-left: 10px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    h2 {\n");
      out.write("        background-color: blue;\n");
      out.write("        color: white;\n");
      out.write("    }\n");
      out.write("    h3 {\n");
      out.write("        background-color: orange;\n");
      out.write("        color: white;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <style>\n");
      out.write("        h2 {\n");
      out.write("            background-color: blue;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        h3 {\n");
      out.write("            background-color: orange;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <head>\n");
      out.write("        <title>Header</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2>FPTU Mail Manager</h2>\n");
      out.write("        <h3>Main Page</h3>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<div class=\"inputform\" style=\"float: left;\">\n");
      out.write("    <h2 class=\"design\">Login Form</h2>\n");
      out.write("    <form action=\"loginservlet\" method=\"POST\">\n");
      out.write("        <table>\n");
      out.write("            <tr><td>Email:</td><td><input type=\"email\" name=\"email\" required/></td></tr>\n");
      out.write("            <tr><td>Password:</td><td><input type=\"password\" name=\"password\" required/></td></tr>\n");
      out.write("            <tr><td><label for=\"remember\">Remember:</label></td><td><input id=\"remember\" type=\"checkbox\" name=\"remember\"/></td></tr>\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"2\"><input id=\"login\" type=\"submit\" value=\"login\"/></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>footer</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <p style=\"margin-top: 500px;background-color: green; color:white; text-align: center;\">PRJ321 - TuanNTSE04733</p>\n");
      out.write("    </body>\n");
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
