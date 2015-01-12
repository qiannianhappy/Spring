package org.apache.jsp.WEB_002dINF.jsp.system;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>后台管理系统</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- MetisMenu CSS -->\n");
      out.write("    <link href=\"../css/plugins/metisMenu/metisMenu.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Timeline CSS -->\n");
      out.write("    <link href=\"../css/plugins/timeline.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"../css/sb-admin-2.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Morris Charts CSS -->\n");
      out.write("    <link href=\"../css/plugins/morris.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Custom Fonts -->\n");
      out.write("    <link href=\"../css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("        <script src=\"../js/html5shiv.min.js\"></script>\n");
      out.write("        <script src=\"../js/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("    \n");
      out.write("    <!-- DataTables CSS -->\n");
      out.write("    <link href=\"../css/plugins/dataTables.bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("    \n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"../js/jquery-1.11.1.min.js\"></script>\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\n");
      out.write("    <script src=\"../js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- Metis Menu Plugin JavaScript -->\n");
      out.write("    <script src=\"../js/plugins/metisMenu/metisMenu.min.js\"></script>\n");
      out.write("    <!-- Custom Theme JavaScript -->\n");
      out.write("    <script src=\"../js/sb-admin-2.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div id=\"wrapper\" class=\"container-fluid\">\n");
      out.write("\t\t\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/menu.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"page-wrapper\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h1 class=\"page-header\">用户列表</h1>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.col-lg-12 -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.row -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            \t用户信息列表\n");
      out.write("                            \t<div class=\"pull-right\">\n");
      out.write("                                <div class=\"btn-group\">\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-success btn-xs\">添加</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.panel-heading -->\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\n");
      out.write("                                   <thead>\n");
      out.write("                                       <tr>\n");
      out.write("                                           <th>用户名</th>\n");
      out.write("                                           <th>姓名</th>\n");
      out.write("                                           <th>部门</th>\n");
      out.write("                                           <th>角色</th>\n");
      out.write("                                           <th>账户状态</th>\n");
      out.write("                                           <th>操作</th>\n");
      out.write("                                       </tr>\n");
      out.write("                                   </thead>\n");
      out.write("                                   <tbody id=\"userList\">\n");
      out.write("                                      \n");
      out.write("                                   </tbody>\n");
      out.write("                               </table>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.panel-body -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.panel -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /.col-lg-12 -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.row -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /#page-wrapper -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- /#wrapper -->\n");
      out.write("\t <!-- DataTables JavaScript -->\n");
      out.write("    <script src=\"../js/plugins/dataTables/jquery.dataTables.js\"></script>\n");
      out.write("    <script src=\"../js/plugins/dataTables/dataTables.bootstrap.js\"></script>\n");
      out.write("     <script>\n");
      out.write("\t  \t// 默认禁用搜索和排序\n");
      out.write("\t     $.extend( $.fn.dataTable.defaults, {\n");
      out.write("\t         searching: false,\n");
      out.write("\t         ordering:  false\n");
      out.write("\t     } );\n");
      out.write("\t    $(document).ready(function() {\n");
      out.write("\t    \tgetUserList();\n");
      out.write("\t        \n");
      out.write("\t    });\n");
      out.write("\t    \n");
      out.write("\t    function getUserList(){\n");
      out.write("\t    \tjQuery.ajax( {  \n");
      out.write("    \t        type : 'GET',  \n");
      out.write("    \t        contentType : 'application/json',  \n");
      out.write("    \t        url : '../system/userList.action',  \n");
      out.write("    \t        dataType : 'json',  \n");
      out.write("    \t        success : function(data) {\n");
      out.write("    \t        \tif (data.statusCode == 200) {  \n");
      out.write("\t\t   \t            $.each(data.message, function(i, item) {\n");
      out.write("\t\t   \t              var editbutton=\"<button type='button' class='btn btn-info btn-xs'>修改</button>&nbsp;&nbsp;<button type='button' class='btn btn-warning btn-xs'>删除</button>\";\n");
      out.write("\t\t   \t              var str=\"<tr><td>\"+item.USERNAME+\"</td><td>\"+item.FULLNAME+\"</td><td></td><td></td><td></td><td>\"+editbutton+\"</td></tr>\"\n");
      out.write("\t\t   \t              $('#userList').append(str);  \n");
      out.write("\t   \t            });\n");
      out.write("\t   \t            $('#dataTables-example').dataTable();\n");
      out.write("    \t          }  \n");
      out.write("    \t        },  \n");
      out.write("    \t        error : function() {  \n");
      out.write("    \t          alert(\"error\");\n");
      out.write("    \t        }  \n");
      out.write("    \t      });\n");
      out.write("\t    }\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
