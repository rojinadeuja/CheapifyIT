package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class final_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <style type=\"text/css\">\n");
      out.write(".float_right { float: right; }</style>\n");
      out.write("<script>  \n");
      out.write("function showmessage(){  \n");
      out.write("var a=1;    \n");
      out.write("  alert(\"Your order has been placed\");  \n");
      out.write("  return false;  \n");
      out.write("}  \n");
      out.write("</script>  \n");
      out.write("</head>\n");
      out.write("    \n");
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
      out.write("                           <li><a href=\"customer.jsp\">HOME</a></li>\n");
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
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- BELOW SLIDESHOW SECTION END-->\n");
      out.write("  \n");
      out.write("   <div class=\"just-sec\">\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("             \n");
      out.write("        <div class=\"row\">\n");
      out.write("           <!-- <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                <div class=\"just-txt-div\">\n");
      out.write("\n");
      out.write("              <img src=\"assets/img/laptops/1.jpg\" alt=\"\" class=\"img-circle set-about-img\"  />\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2><strong>Dell Inspiron 3536</strong>  </h2>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("              \n");
      out.write("                      </div>\n");
      out.write("            </div> -->\n");
      out.write("             <div class=\"col-lg-6 col-md-6 col-sm-46 col-xs-12\">\n");
      out.write("                <div class=\"just-txt-div\">\n");
      out.write("                     <strong style=\"color:green\"> YOUR PRICE: 50,000</strong><br/>\n");
      out.write("                    <strong style=\"color:red; font-stretch: expanded\"> OUR PRICE: 35,000 only *</strong>\n");
      out.write("                    <p>\n");
      out.write("\t\t    <strong> TECHGIRLS REVIEW</strong>\n");
      out.write("                       <img src=\"assets/img/stars.jpg\" />\n");
      out.write("                    </p>\n");
      out.write("                    <p>\n");
      out.write("\t\t    <strong> BUILD AND DESIGN </strong>\n");
      out.write("                    Dell received some much needed attention in 2007 with the introduction of the sleek, high performance XPS M1330 and XPS M1530 notebooks. Although these more expensive notebooks in the Dell lineup were praised for their looks and low weight, the Dell Inspiron 1520 was criticized for being yet another bulky and unattractive laptop. Dell listened closely to this criticism when they designed the new Inspiron 1525. The Inspiron 1525 is in fact 25% smaller, 30% slimmer and almost half a pound lighter than the Inspiron 1520.\n");
      out.write("                    </p>\n");
      out.write("                     <p>\n");
      out.write("\t\t    <strong> PERFORMANCE </strong>\n");
      out.write("                    One thing to notice is that the dedicated graphics card option available on the Inspiron 1520 is missing from the Inspiron 1525. The reasoning behind this is that Dell is pushing the XPS M1530 as the 15.4\" notebook for those demanding higher-end graphics performance. The Inspiron 1525 is meant for a more mainstream buyer looking for good multimedia and productivity features from a notebook, and not cutting edge 3D performance.\n");
      out.write("                    Regardless, I would have liked for Dell to offer at least an entry-level nVidia 8400 GS 128MB dedicated graphics card option on the 1525. Sure, it might compete with a base configuration XPS M1530, but consumers like to have choices.\n");
      out.write("                     </p>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("\t\t\t<form name=\"invisible\">\n");
      out.write("                             <a class=\"btn btn-info btn-lg\" href=\"shop.jsp\">Shop Detail</a>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-success btn-lg\" onclick=\"return showmessage()\">Order Now</button>\n");
      out.write("\n");
      out.write("                    </form>\t\t\t\t\t\t\n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                    <!--<form name=\"myform\" method=\"post\" action=\"abc.jsp\" onsubmit=\"return validateform()\" >  \n");
      out.write("                    \n");
      out.write("                    --> \n");
      out.write("                      </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("            <div class=\"col-lg-6 col-md-6 col-sm-46 col-xs-12\">\n");
      out.write("                 <div class=\"just-txt-div\">\n");
      out.write("                     <img src=\"assets/img/laptops/1.jpg\" class=\"img-responsive\" />\n");
      out.write("                \n");
      out.write("                     </div>\n");
      out.write("            </div>\n");
      out.write("         \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("    </div>\n");
      out.write("    </div>         \n");
      out.write("     <!--JUST SECTION END-->\n");
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
