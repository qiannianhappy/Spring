package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   \r\n");
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
      out.write("\r\n");
      out.write("    <!-- MetisMenu CSS -->\r\n");
      out.write("    <link href=\"css/plugins/metisMenu/metisMenu.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom CSS -->\r\n");
      out.write("    <link href=\"css/sb-admin-2.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom Fonts -->\r\n");
      out.write("    <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    \r\n");
      out.write("    <style>\r\n");
      out.write("    \r\n");
      out.write("    body{\r\n");
      out.write("\t    background:#255cc4 url(images/background.jpg) fixed no-repeat;\r\n");
      out.write("\t    /*filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(src='images/login.jpg',sizingMethod=scale);*/\r\n");
      out.write("\t\t-moz-background-size: 100% 100%;\r\n");
      out.write("\t\tbackground-size: 100% 100%;\r\n");
      out.write("\t}\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-4 col-md-offset-4\">\r\n");
      out.write("                <div class=\"login-panel panel panel-default\">\r\n");
      out.write("                    <div class=\"panel-heading\">\r\n");
      out.write("                        <h3 class=\"panel-title\">请输入用户信息</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"panel-body\">\r\n");
      out.write("                        <form role=\"form\" action=\"doLogin.action\" method=\"post\">\r\n");
      out.write("                            <fieldset>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"用户名\" name=\"username\" autofocus/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" placeholder=\"密码\" name=\"password\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\" stlye=\"display:inline;\">\r\n");
      out.write("                                    <input type=\"text\"  class=\"form-control\" placeholder=\"验证码\" style=\"display:inline;width:100px;\" name=\"checkcode\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"authImg\" name=\"authImg\" onClick=\"this.src=this.name+'?t='+Math.random();\" alt=\"点击刷新\" style=\"cursor:pointer;position:relative;left:10%;\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                ");
if(null!=request.getAttribute("errorMsg")){ 
      out.write("\r\n");
      out.write("\t                                <div class=\"alert alert-warning\" role=\"alert\">\r\n");
      out.write("\t                                    \t");
      out.print(request.getAttribute("errorMsg") );
      out.write("\r\n");
      out.write("\t                                </div>\r\n");
      out.write("                                ");
} 
      out.write("\r\n");
      out.write("                                <!-- Change this to a button or input when using this as a form -->\r\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary\">登\t录</button>\r\n");
      out.write("                            </fieldset>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
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
