package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;

public final class compose_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/link.jsp");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    ");

        List<String> listUserToSend = (List<String>) request.getAttribute("listsendemail");
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!-- header -->\n");
      out.write("        <div class=\"header\"> \n");
      out.write("            ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <style>\r\n");
      out.write("        h2 {\r\n");
      out.write("            background-color: blue;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("        h3 {\r\n");
      out.write("            background-color: orange;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Header</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h2>FPTU Mail Manager</h2>\r\n");
      out.write("        <h3>Main Page</h3>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <a href=\"index.jsp\">Home</a> |\n");
      out.write("        <a href=\"inbox\">inbox</a> |\n");
      out.write("        <a href=\"compose\">Compose Mail</a> |\n");
      out.write("        <a href=\"sent\">Sent Mail</a> |\n");
      out.write("        <a href=\"trashservlet\">Trash</a> |\n");
      out.write("        <a href=\"logout\">Logout</a>\n");
      out.write("        <hr/>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- body -->\n");
      out.write("        <div class=\"composeform\">\n");
      out.write("            <form action=\"compose\" method=\"POST\">\n");
      out.write("                <table>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr> <td>To: </td>\n");
      out.write("                            <td><input type=\"text\" nane=\"to\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr> <td>Subject: </td>\n");
      out.write("                            <td><input type=\"text\" nane=\"subject\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"2\">Message:</td>\n");
      out.write("                            <td></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"2\">\n");
      out.write("                                <textarea name=\"message\" rows=\"5\" cols=\"30\"></textarea>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"2\">\n");
      out.write("                                <input type=\"submit\" value=\"Send Mail\"/>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Footer -->\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>footer</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <p style=\"margin-top: 500px;background-color: green; color:white; text-align: center;\">PRJ321 - TuanNTSE04733</p>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
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
