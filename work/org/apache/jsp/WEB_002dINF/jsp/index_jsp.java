package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/jsp/include/include.jsp");
  }

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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <title>后台管理系统</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap Core CSS -->\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- MetisMenu CSS -->\r\n");
      out.write("    <link href=\"css/plugins/metisMenu/metisMenu.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Timeline CSS -->\r\n");
      out.write("    <link href=\"css/plugins/timeline.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Custom CSS -->\r\n");
      out.write("    <link href=\"css/sb-admin-2.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Morris Charts CSS -->\r\n");
      out.write("    <link href=\"css/plugins/morris.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Custom Fonts -->\r\n");
      out.write("    <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("        <script src=\"js/html5shiv.min.js\"></script>\r\n");
      out.write("        <script src=\"js/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    <!-- jQuery -->\r\n");
      out.write("    <script src=\"js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- Metis Menu Plugin JavaScript -->\r\n");
      out.write("    <script src=\"js/plugins/metisMenu/metisMenu.min.js\"></script>\r\n");
      out.write("\t<!-- Custom Theme JavaScript -->\r\n");
      out.write("    <script src=\"js/sb-admin-2.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"wrapper\" class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/menu.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div id=\"page-wrapper\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                    <h1 class=\"page-header\">主页</h1>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.col-lg-12 -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.row -->\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-8\">\r\n");
      out.write("                    <!-- /.panel -->\r\n");
      out.write("                    <div class=\"panel panel-default\">\r\n");
      out.write("                        <div class=\"panel-heading\">\r\n");
      out.write("                            <i class=\"fa fa-clock-o fa-fw\"></i> Responsive Timeline\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- /.panel-heading -->\r\n");
      out.write("                        <div class=\"panel-body\">\r\n");
      out.write("                            <ul class=\"timeline\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"timeline-badge\"><i class=\"fa fa-check\"></i>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"timeline-panel\">\r\n");
      out.write("                                        <div class=\"timeline-heading\">\r\n");
      out.write("                                            <h4 class=\"timeline-title\">Lorem ipsum dolor</h4>\r\n");
      out.write("                                            <p><small class=\"text-muted\"><i class=\"fa fa-clock-o\"></i> 11 hours ago via Twitter</small>\r\n");
      out.write("                                            </p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"timeline-body\">\r\n");
      out.write("                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Libero laboriosam dolor perspiciatis omnis exercitationem. Beatae, officia pariatur? Est cum veniam excepturi. Maiores praesentium, porro voluptas suscipit facere rem dicta, debitis.</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"timeline-inverted\">\r\n");
      out.write("                                    <div class=\"timeline-badge warning\"><i class=\"fa fa-credit-card\"></i>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"timeline-panel\">\r\n");
      out.write("                                        <div class=\"timeline-heading\">\r\n");
      out.write("                                            <h4 class=\"timeline-title\">Lorem ipsum dolor</h4>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"timeline-body\">\r\n");
      out.write("                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Autem dolorem quibusdam, tenetur commodi provident cumque magni voluptatem libero, quis rerum. Fugiat esse debitis optio, tempore. Animi officiis alias, officia repellendus.</p>\r\n");
      out.write("                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Laudantium maiores odit qui est tempora eos, nostrum provident explicabo dignissimos debitis vel! Adipisci eius voluptates, ad aut recusandae minus eaque facere.</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"timeline-badge danger\"><i class=\"fa fa-bomb\"></i>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"timeline-panel\">\r\n");
      out.write("                                        <div class=\"timeline-heading\">\r\n");
      out.write("                                            <h4 class=\"timeline-title\">Lorem ipsum dolor</h4>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"timeline-body\">\r\n");
      out.write("                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Repellendus numquam facilis enim eaque, tenetur nam id qui vel velit similique nihil iure molestias aliquam, voluptatem totam quaerat, magni commodi quisquam.</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"timeline-inverted\">\r\n");
      out.write("                                    <div class=\"timeline-panel\">\r\n");
      out.write("                                        <div class=\"timeline-heading\">\r\n");
      out.write("                                            <h4 class=\"timeline-title\">Lorem ipsum dolor</h4>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"timeline-body\">\r\n");
      out.write("                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptates est quaerat asperiores sapiente, eligendi, nihil. Itaque quos, alias sapiente rerum quas odit! Aperiam officiis quidem delectus libero, omnis ut debitis!</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"timeline-badge info\"><i class=\"fa fa-save\"></i>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"timeline-panel\">\r\n");
      out.write("                                        <div class=\"timeline-heading\">\r\n");
      out.write("                                            <h4 class=\"timeline-title\">Lorem ipsum dolor</h4>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"timeline-body\">\r\n");
      out.write("                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Nobis minus modi quam ipsum alias at est molestiae excepturi delectus nesciunt, quibusdam debitis amet, beatae consequuntur impedit nulla qui! Laborum, atque.</p>\r\n");
      out.write("                                            <hr>\r\n");
      out.write("                                            <div class=\"btn-group\">\r\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-primary btn-sm dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                                                    <i class=\"fa fa-gear\"></i>  <span class=\"caret\"></span>\r\n");
      out.write("                                                </button>\r\n");
      out.write("                                                <ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("                                                    <li><a href=\"#\">Action</a>\r\n");
      out.write("                                                    </li>\r\n");
      out.write("                                                    <li><a href=\"#\">Another action</a>\r\n");
      out.write("                                                    </li>\r\n");
      out.write("                                                    <li><a href=\"#\">Something else here</a>\r\n");
      out.write("                                                    </li>\r\n");
      out.write("                                                    <li class=\"divider\"></li>\r\n");
      out.write("                                                    <li><a href=\"#\">Separated link</a>\r\n");
      out.write("                                                    </li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"timeline-inverted\">\r\n");
      out.write("                                    <div class=\"timeline-badge success\"><i class=\"fa fa-graduation-cap\"></i>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"timeline-panel\">\r\n");
      out.write("                                        <div class=\"timeline-heading\">\r\n");
      out.write("                                            <h4 class=\"timeline-title\">Lorem ipsum dolor</h4>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"timeline-body\">\r\n");
      out.write("                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Deserunt obcaecati, quaerat tempore officia voluptas debitis consectetur culpa amet, accusamus dolorum fugiat, animi dicta aperiam, enim incidunt quisquam maxime neque eaque.</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- /.panel-body -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /.panel -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.col-lg-8 -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.row -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /#page-wrapper -->\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /#wrapper -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
