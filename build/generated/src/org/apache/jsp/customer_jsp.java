package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
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
      out.write("                            \n");
      out.write("                           \n");
      out.write("                            <li><a href=\"customer.jsp\">HOME</a></li>\n");
      out.write("                             <li><a href=\"notification.jsp\" >NOTIFICATIONS</a></li>\n");
      out.write("                             <li><a href=\"wishlist.jsp\">WISHLIST</a></li>\n");
      out.write("                            <li><a href=\"history.jsp\">HISTORY</a></li>\n");
      out.write("                            <li><a href=\"index.jsp\">SIGN OUT</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("     <!-- MENU SECTION END-->\n");
      out.write("    \n");
      out.write("    <div class=\"below-slideshow\">\n");
      out.write("         <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            \n");
      out.write("             \n");
      out.write("            <!--content-->\n");
      out.write("              \n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- BELOW SLIDESHOW SECTION END-->\n");
      out.write("  \n");
      out.write("     \n");
      out.write("            <div class=\"container\">\n");
      out.write("             \n");
      out.write("        <div class=\"row pad-set\">\n");
      out.write("            <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                <div class=\"just-txt-div\">\n");
      out.write("                    <h2>REVIEW OF THE DAY</h2>\n");
      out.write("                    <br />\n");
      out.write("                <p>\n");
      out.write("                     <strong>LENOVO YOGA 910 </strong>. \n");
      out.write("                    Sleek and sharp. This one is for the people on the go. If you're looking for the perfect blend of power, style and adaptability, you'll find it hard not to love the Yoga 910. Lenovo's latest 2-in-1 (starting at $1,200) still wows with its elegant watchband hinge, but it now offers a nearly-bezel-free 13.9-inch display that gives you more to look at without taking up extra space. Even its battery life has seen a pretty big increase and will now last 10.5 hours on a charge.\n");
      out.write("                </p>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("             <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                  <div class=\"just-txt-div\">\n");
      out.write("                      <br/>\n");
      out.write("                <iframe class=\"vedio-style\" src=\"https://www.youtube.com/embed/Y4ROJlEN-Kg\"></iframe>\n");
      out.write("                      </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("          </div>      \n");
      out.write(" \n");
      out.write("   <!--VEDIO SECTION END-->\n");
      out.write("   \n");
      out.write("    <div class=\"just-sec\">\n");
      out.write("        \n");
      out.write(" <h2 align=\"center\">HOT DEALS</h2>\n");
      out.write("                    <br />\n");
      out.write("        <div class=\"container\">\n");
      out.write("             \n");
      out.write("        <div class=\"row\">\n");
      out.write("           \n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                <div class=\"just-txt-div\">\t\t\t\t\t\t\n");
      out.write("\t\t  <img src=\"assets/img/11.png\" />\t\t\t\t\t\t\t\n");
      out.write("          \n");
      out.write("                      </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                <div class=\"just-txt-div\">\t\t\t\t\t\t\n");
      out.write("\t\t  <img src=\"assets/img/22.png\" />\t\t\t\t\t\t\t\n");
      out.write("          \n");
      out.write("                      </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                <div class=\"just-txt-div\">\t\t\t\t\t\t\n");
      out.write("\t\t  <img src=\"assets/img/00.png\" />\t\t\t\t\t\t\t\n");
      out.write("          \n");
      out.write("                      </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("             \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    </div>         \n");
      out.write("     <!--JUST SECTION END-->\n");
      out.write("   \n");
      out.write("    <div class=\"just-sec\">\n");
      out.write("        \n");
      out.write("\n");
      out.write("    \n");
      out.write("    </div>         \n");
      out.write("     <!--JUST SECTION END-->\n");
      out.write("     \n");
      out.write("  \n");
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
