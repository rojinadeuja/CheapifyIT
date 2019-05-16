package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class details_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\" />\n");
      out.write("    <meta name=\"description\" content=\"\" />\n");
      out.write("    <meta name=\"author\" content=\"\" />\n");
      out.write("    <!--[if IE]>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("        <![endif]-->\n");
      out.write("    <title>CheapifyIT</title>\n");
      out.write("\n");
      out.write("    <!-- BOOTSTRAP CORE STYLE  -->\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("    <!-- FONT AWESOME STYLE  -->\n");
      out.write("    <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\" />\n");
      out.write("    <!-- ANIMATE STYLE  -->\n");
      out.write("    <link href=\"assets/css/animate.css\" rel=\"stylesheet\" />\n");
      out.write("    <!-- FLEXSLIDER STYLE  -->\n");
      out.write("    <link href=\"assets/css/flexslider.css\" rel=\"stylesheet\" />\n");
      out.write("    <!-- CUSTOM STYLE  -->\n");
      out.write("    <link href=\"assets/css/style.css\" rel=\"stylesheet\" />\n");
      out.write("    <!-- GOOGLE FONTS  -->\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300' rel='stylesheet' type='text/css' />\n");
      out.write("     <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Lobster' rel='stylesheet' type='text/css' />\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <section class=\"menu-section\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row \">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div class=\"navbar-collapse collapse \">\n");
      out.write("                        <a class=\"navbar-brand\" href=\"index.jsp\">\n");
      out.write("\n");
      out.write("                    <img src=\"assets/img/logo.png\" />\n");
      out.write("                </a>\n");
      out.write("                        <ul id=\"menu-top\" class=\"nav navbar-nav navbar-right\">\n");
      out.write("                            <li><a href=\"index.jsp\" class=\"menu-top-active\" >HOME</a></li>\n");
      out.write("                           \n");
      out.write("                            <li><a href=\"signin.jsp\">SIGN IN</a></li>\n");
      out.write("                             <li><a href=\"signup.jsp\" >SIGN UP</a></li>\n");
      out.write("                             <li><a href=\"services.jsp\">SERVICES</a></li>\n");
      out.write("                            <li><a href=\"privacy.jsp\">PRIVACY</a></li>\n");
      out.write("                            <li><a href=\"contact.jsp\">CONTACT</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("     <!-- MENU SECTION END-->\n");
      out.write("     <br/><br/>\n");
      out.write("    \n");
      out.write("             \n");
      out.write("     <!--JUST SECTION END-->\n");
      out.write("   <div class=\"container \" >\n");
      out.write("             <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-10 col-md-10 col-sm-10 col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-12 set-div\">\n");
      out.write("                <div class=\"just-txt-div text-center\">\n");
      out.write("              \n");
      out.write("                     <div class=\"just-sec\">\n");
      out.write("            <!--<div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12\">-->\n");
      out.write("               <!-- <div class=\"just-txt-div\">-->\n");
      out.write("       <div class=\"form-group\">\n");
      out.write("                                <h1 style=\"text-align: center\"><strong>Do you want to specify more details? </strong> </h1>\n");
      out.write("                                  \n");
      out.write("       </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                                            <label>Color:</label>\n");
      out.write("                                            <input class=\"form-control\" type=\"text\" />\n");
      out.write("                                        </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                            <label>RAM:</label>\n");
      out.write("                                            <input class=\"form-control\" type=\"text\" />\n");
      out.write("                                        </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                                            <label>Size (In inches):</label>\n");
      out.write("                                            <input class=\"form-control\" type=\"number\" />\n");
      out.write("                                        </div>\n");
      out.write("               \n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                            <label>Others:</label>\n");
      out.write("                                             <textarea name=\"content\" class=\"form-control\"></textarea>\n");
      out.write("                                            <!--<input class=\"form-control\" type=\"text\" />-->\n");
      out.write("                                        </div>\n");
      out.write("                             \n");
      out.write("                         \n");
      out.write("                 <button type=\"submit\" class=\"btn btn-success btn-lg\" onclick=\"window.location = 'next.jsp';\">Done</button>\n");
      out.write("                           <!-- </div>-->\n");
      out.write("            \n");
      out.write("     </div> \n");
      out.write("         \n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("     \n");
      out.write("     \n");
      out.write("      \n");
      out.write("     \n");
      out.write("   \n");
      out.write("   <div class=\"footer-sec\">\n");
      out.write("         <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("\n");
      out.write("              \n");
      out.write("\t\t\t\t\t\t\t\t\t<h3> <strong>ABOUT CHEAPIFY IT</strong> </h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p style=\"padding-right:50px;\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t\tCheapify IT is a startup by girls in technology to help people make the right decisions while buying technology and gadgets.\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-12 social-div\">\n");
      out.write("               \n");
      out.write("\n");
      out.write("              \n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3> <strong>SOCIAL PRESENCE</strong> </h3>\n");
      out.write("                We love to be social,Catch Us On\n");
      out.write("                <a href=\"#\" ><h4>FACEBOOK </h4></a>\n");
      out.write("                   <a href=\"#\" ><h4>TWITTER </h4></a>\n");
      out.write("                 <a href=\"#\" ><h4>LINKEDIN </h4></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("                    \n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("            <h3> <strong>ADDRESS</strong> </h3>\n");
      out.write("                Reach Us Below:\n");
      out.write("                <br />\n");
      out.write("                <h4>Shantinagar,Kathmandu</h4>\n");
      out.write("                 <h4>Nepal,</h4>\n");
      out.write("                 <h4>Call: 4455677</h4>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write(" <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                <hr />\n");
      out.write("                <div style=\"text-align:right;padding:5px;\">\n");
      out.write("                    &copy;2017 cheapifyit.com | \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("       </div>\n");
      out.write("     <!--FOOTER SECTION END-->\n");
      out.write("      <!-- WE PUT SCRIPTS AT THE END TO LOAD PAGE FASTER-->\n");
      out.write("     <!--CORE SCRIPTS PLUGIN-->\n");
      out.write("    <script src=\"assets/js/jquery-1.11.1.min.js\"></script>\n");
      out.write("     <!--BOOTSTRAP SCRIPTS PLUGIN-->\n");
      out.write("<script src=\"assets/js/bootstrap.js\"></script>\n");
      out.write("     <!--WOW SCRIPTS PLUGIN-->\n");
      out.write("    <script src=\"assets/js/wow.js\"></script>\n");
      out.write("     <!--FLEXSLIDER SCRIPTS PLUGIN-->\n");
      out.write("    <script src=\"assets/js/jquery.flexslider.js\"></script>\n");
      out.write("     <!--CUSTOM SCRIPTS -->\n");
      out.write("    <script src=\"assets/js/custom.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
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
