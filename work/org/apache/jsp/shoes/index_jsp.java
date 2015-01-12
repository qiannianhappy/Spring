package org.apache.jsp.shoes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Shoes Store, free template</title>\r\n");
      out.write("<meta name=\"keywords\" content=\"shoes store, free template, ecommerce, online shop, website templates, CSS, HTML\" />\r\n");
      out.write("<meta name=\"description\" content=\"Shoes Store is a free ecommerce template provided by templatemo.com\" />\r\n");
      out.write("<link href=\"templatemo_style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"nivo-slider.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/ddsmoothmenu.css\" />\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/ddsmoothmenu.js\">\r\n");
      out.write("\r\n");
      out.write("/***********************************************\r\n");
      out.write("* Smooth Navigational Menu- (c) Dynamic Drive DHTML code library (www.dynamicdrive.com)\r\n");
      out.write("* This notice MUST stay intact for legal use\r\n");
      out.write("* Visit Dynamic Drive at http://www.dynamicdrive.com/ for full source code\r\n");
      out.write("***********************************************/\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("ddsmoothmenu.init({\r\n");
      out.write("\tmainmenuid: \"top_nav\", //menu DIV id\r\n");
      out.write("\torientation: 'h', //Horizontal or vertical menu: Set to \"h\" or \"v\"\r\n");
      out.write("\tclassname: 'ddsmoothmenu', //class added to menu's outer DIV\r\n");
      out.write("\t//customtheme: [\"#1c5a80\", \"#18374a\"],\r\n");
      out.write("\tcontentsource: \"markup\" //\"markup\" or [\"container_id\", \"path_to_menu_file\"]\r\n");
      out.write("})\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div id=\"templatemo_body_wrapper\">\r\n");
      out.write("<div id=\"templatemo_wrapper\">\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"templatemo_header\">\r\n");
      out.write("    \t<div id=\"site_title\"><h1><a href=\"http://www.templatemo.com\" rel=\"nofollow\">Online Shoes Store</a></h1></div>\r\n");
      out.write("        <div id=\"header_right\">\r\n");
      out.write("        \t<p>\r\n");
      out.write("\t        <a href=\"#\">My Account</a> | <a href=\"#\">My Wishlist</a> | <a href=\"#\">My Cart</a> | <a href=\"#\">Checkout</a> | <a href=\"#\">Log In</a></p>\r\n");
      out.write("            <p>\r\n");
      out.write("            \tShopping Cart: <strong>3 items</strong> ( <a href=\"shoppingcart.html\">Show Cart</a> )\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("        <div class=\"cleaner\"></div>\r\n");
      out.write("    </div> <!-- END of templatemo_header -->\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"templatemo_menubar\">\r\n");
      out.write("    \t<div id=\"top_nav\" class=\"ddsmoothmenu\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"index.html\" class=\"selected\">Home</a></li>\r\n");
      out.write("                <li><a href=\"products.html\">Products</a>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a rel=\"nofollow\" href=\"http://www.templatemo.com/page/1\">Sub menu 1</a></li>\r\n");
      out.write("                        <li><a rel=\"nofollow\" href=\"http://www.templatemo.com/page/2\">Sub menu 2</a></li>\r\n");
      out.write("                        <li><a rel=\"nofollow\" href=\"http://www.templatemo.com/page/3\">Sub menu 3</a></li>\r\n");
      out.write("                        <li><a rel=\"nofollow\" href=\"http://www.templatemo.com/page/4\">Sub menu 4</a></li>\r\n");
      out.write("                        <li><a rel=\"nofollow\" href=\"http://www.templatemo.com/page/5\">Sub menu 5</a></li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li><a href=\"about.html\">About</a>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a rel=\"nofollow\" href=\"http://www.templatemo.com/page/1\">Sub menu 1</a></li>\r\n");
      out.write("                        <li><a rel=\"nofollow\" href=\"http://www.templatemo.com/page/2\">Sub menu 2</a></li>\r\n");
      out.write("                        <li><a rel=\"nofollow\" href=\"http://www.templatemo.com/page/3\">Sub menu 3</a></li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li><a href=\"faqs.html\">FAQs</a></li>\r\n");
      out.write("                <li><a href=\"checkout.html\">Checkout</a></li>\r\n");
      out.write("                <li><a href=\"contact.html\">Contact Us</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <br style=\"clear: left\" />\r\n");
      out.write("        </div> <!-- end of ddsmoothmenu -->\r\n");
      out.write("        <div id=\"templatemo_search\">\r\n");
      out.write("            <form action=\"#\" method=\"get\">\r\n");
      out.write("              <input type=\"text\" value=\" \" name=\"keyword\" id=\"keyword\" title=\"keyword\" onfocus=\"clearText(this)\" onblur=\"clearText(this)\" class=\"txt_field\" />\r\n");
      out.write("              <input type=\"submit\" name=\"Search\" value=\" \" alt=\"Search\" id=\"searchbutton\" title=\"Search\" class=\"sub_btn\"  />\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div> <!-- END of templatemo_menubar -->\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"templatemo_main\">\r\n");
      out.write("    \t<div id=\"sidebar\" class=\"float_l\">\r\n");
      out.write("        \t<div class=\"sidebar_box\"><span class=\"bottom\"></span>\r\n");
      out.write("            \t<h3>Categories</h3>   \r\n");
      out.write("                <div class=\"content\"> \r\n");
      out.write("                \t<ul class=\"sidebar_list\">\r\n");
      out.write("                    \t<li class=\"first\"><a href=\"#\">Sed eget purus</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Vestibulum eleifend</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Nulla odio ipsum</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Suspendisse posuere</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Nunc a dui sed</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Curabitur ac mauris</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Mauris nulla tortor</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Nullam ultrices</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Nulla odio ipsum</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Suspendisse posuere</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Nunc a dui sed</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Curabitur ac mauris</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Mauris nulla tortor</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Nullam ultrices</a></li>\r\n");
      out.write("                        <li class=\"last\"><a href=\"#\">Sed eget purus</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"sidebar_box\"><span class=\"bottom\"></span>\r\n");
      out.write("            \t<h3><a class=\"sidebar_box_icon\" href=\"http://cn.forwallpaper.com/search/facebook.html\" title=\"Facebook 壁纸\"  target=\"_blank\"><img src=\"images/templatemo_sidebar_header.png\" alt=\"Facebook 壁纸\" title=\"Facebook 壁纸\" /></a>Bestsellers </h3>   \r\n");
      out.write("                <div class=\"content\"> \r\n");
      out.write("                \t<div class=\"bs_box\">\r\n");
      out.write("                    \t<a href=\"#\"><img src=\"images/templatemo_image_01.jpg\" alt=\"image\" /></a>\r\n");
      out.write("                        <h4><a href=\"#\">Donec nunc nisl</a></h4>\r\n");
      out.write("                        <p class=\"price\">$10</p>\r\n");
      out.write("                        <div class=\"cleaner\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"bs_box\">\r\n");
      out.write("                    \t<a href=\"#\"><img src=\"images/templatemo_image_01.jpg\" alt=\"image\" /></a>\r\n");
      out.write("                        <h4><a href=\"#\">Lorem ipsum dolor sit</a></h4>\r\n");
      out.write("                        <p class=\"price\">$12</p>\r\n");
      out.write("                        <div class=\"cleaner\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"bs_box\">\r\n");
      out.write("                    \t<a href=\"#\"><img src=\"images/templatemo_image_01.jpg\" alt=\"image\" /></a>\r\n");
      out.write("                        <h4><a href=\"#\">Phasellus ut dui</a></h4>\r\n");
      out.write("                        <p class=\"price\">$20</p>\r\n");
      out.write("                        <div class=\"cleaner\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"bs_box\">\r\n");
      out.write("                    \t<a href=\"#\"><img src=\"images/templatemo_image_01.jpg\" alt=\"image\" /></a>\r\n");
      out.write("                        <h4><a href=\"#\">Vestibulum ante</a></h4>\r\n");
      out.write("                        <p class=\"price\">$8</p>\r\n");
      out.write("                        <div class=\"cleaner\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"content\" class=\"float_r\">\r\n");
      out.write("        \t<div id=\"slider-wrapper\">\r\n");
      out.write("                <div id=\"slider\" class=\"nivoSlider\">\r\n");
      out.write("                    <img src=\"images/slider/02.jpg\" alt=\"\" />\r\n");
      out.write("                    <a href=\"#\"><img src=\"images/slider/01.jpg\" alt=\"\" title=\"This is an example of a caption\" /></a>\r\n");
      out.write("                    <img src=\"images/slider/03.jpg\" alt=\"\" />\r\n");
      out.write("                    <img src=\"images/slider/04.jpg\" alt=\"\" title=\"#htmlcaption\" />\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"htmlcaption\" class=\"nivo-html-caption\">\r\n");
      out.write("                    <strong>This</strong> is an example of a <em>HTML</em> caption with <a href=\"#\">a link</a>.\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <script type=\"text/javascript\" src=\"js/jquery-1.4.3.min.js\"></script>\r\n");
      out.write("            <script type=\"text/javascript\" src=\"js/jquery.nivo.slider.pack.js\"></script>\r\n");
      out.write("            <script type=\"text/javascript\">\r\n");
      out.write("            $(window).load(function() {\r\n");
      out.write("                $('#slider').nivoSlider();\r\n");
      out.write("            });\r\n");
      out.write("            </script>\r\n");
      out.write("        \t<h1>New Products</h1>\r\n");
      out.write("            <div class=\"product_box\">\r\n");
      out.write("\t            <h3>Ut eu feugiat</h3>\r\n");
      out.write("            \t<a href=\"productdetail.html\"><img src=\"images/product/01.jpg\" alt=\"Shoes 1\" /></a>\r\n");
      out.write("                <p>Nulla rutrum neque vitae erat condimentum eget malesuada.</p>\r\n");
      out.write("                <p class=\"product_price\">$ 100</p>\r\n");
      out.write("                <a href=\"shoppingcart.html\" class=\"addtocart\"></a>\r\n");
      out.write("                <a href=\"productdetail.html\" class=\"detail\"></a>\r\n");
      out.write("            </div>        \t\r\n");
      out.write("            <div class=\"product_box\">\r\n");
      out.write("            \t<h3>Curabitur et turpis</h3>\r\n");
      out.write("            \t<a href=\"productdetail.html\"><img src=\"images/product/02.jpg\" alt=\"Shoes 2\" /></a>\r\n");
      out.write("                <p>Sed congue, erat id congue vehicula. Validate <a href=\"http://validator.w3.org/check?uri=referer\" rel=\"nofollow\">XHTML</a> &amp; <a href=\"http://jigsaw.w3.org/css-validator/check/referer\" rel=\"nofollow\">CSS</a>.</p>\r\n");
      out.write("              <p class=\"product_price\">$ 80</p>\r\n");
      out.write("                <a href=\"shoppingcart.html\" class=\"addtocart\"></a>\r\n");
      out.write("                <a href=\"productdetail.html\" class=\"detail\"></a>\r\n");
      out.write("            </div>        \t\r\n");
      out.write("            <div class=\"product_box no_margin_right\">\r\n");
      out.write("            \t<h3>Mauris consectetur</h3>\r\n");
      out.write("            \t<a href=\"productdetail.html\"><img src=\"images/product/03.jpg\" alt=\"Shoes 3\" /></a>\r\n");
      out.write("                <p>Morbi non risus vitae est vestibulum tincidunt ac eget metus.</p>\r\n");
      out.write("              <p class=\"product_price\">$ 60</p>\r\n");
      out.write("                <a href=\"shoppingcart.html\" class=\"addtocart\"></a>\r\n");
      out.write("                <a href=\"productdetail.html\" class=\"detail\"></a>\r\n");
      out.write("            </div>   \r\n");
      out.write("            \r\n");
      out.write("            <div class=\"cleaner\"></div>\r\n");
      out.write("                 \t\r\n");
      out.write("<div class=\"product_box\">\r\n");
      out.write("            \t<h3>Proin volutpat</h3>\r\n");
      out.write("           \t<a href=\"productdetail.html\"><img src=\"images/product/04.jpg\" alt=\"Shoes 4\" /></a>\r\n");
      out.write("            <p>Sed semper euismod dolor sit amet interdum. Phasellus in mi eros.</p>\r\n");
      out.write("      <p class=\"product_price\">$ 220</p>\r\n");
      out.write("                <a href=\"shoppingcart.html\" class=\"addtocart\"></a>\r\n");
      out.write("                <a href=\"productdetail.html\" class=\"detail\"></a>\r\n");
      out.write("            </div>        \t\r\n");
      out.write("            <div class=\"product_box\">\r\n");
      out.write("\t            <h3>Aenean tempus</h3>\r\n");
      out.write("            \t<a href=\"productdetail.html\"><img src=\"images/product/05.jpg\" alt=\"Shoes 5\" /></a>\r\n");
      out.write("                <p>Maecenas porttitor erat quis leo pellentesque molestie.</p>\r\n");
      out.write("              <p class=\"product_price\">$ 180</p>\r\n");
      out.write("                <a href=\"shoppingcart.html\" class=\"addtocart\"></a>\r\n");
      out.write("                <a href=\"productdetail.html\" class=\"detail\"></a>\r\n");
      out.write("            </div>        \t\r\n");
      out.write("            <div class=\"product_box no_margin_right\">\r\n");
      out.write("            \t<h3>Nulla luctus urna</h3>\r\n");
      out.write("            \t<a href=\"productdetail.html\"><img src=\"images/product/06.jpg\" alt=\"Shoes 6\" /></a>\r\n");
      out.write("                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\r\n");
      out.write("                <p class=\"product_price\">$ 160</p>\r\n");
      out.write("                <a href=\"shoppingcart.html\" class=\"addtocart\"></a>\r\n");
      out.write("                <a href=\"productdetail.html\" class=\"detail\"></a>\r\n");
      out.write("            </div>        \t\r\n");
      out.write("        </div> \r\n");
      out.write("        <div class=\"cleaner\"></div>\r\n");
      out.write("    </div> <!-- END of templatemo_main -->\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"templatemo_footer\">\r\n");
      out.write("    \t<p><a href=\"#\">Home</a> | <a href=\"#\">Products</a> | <a href=\"#\">About</a> | <a href=\"#\">FAQs</a> | <a href=\"#\">Checkout</a> | <a href=\"#\">Contact Us</a>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\r\n");
      out.write("    \tCopyright © 2072 <a href=\"#\">Your Company Name</a> | <a rel=\"nofollow\" href=\"http://www.templatemo.com/preview/templatemo_367_shoes\">Shoes Theme</a> by <a href=\"http://www.templatemo.com\" rel=\"nofollow\" target=\"_parent\" title=\"free css templates\">templatemo</a>\r\n");
      out.write("    </div> <!-- END of templatemo_footer -->\r\n");
      out.write("    \r\n");
      out.write("</div> <!-- END of templatemo_wrapper -->\r\n");
      out.write("</div> <!-- END of templatemo_body_wrapper -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type='text/javascript' src='js/logging.js'></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
