package org.apache.jsp.WEB_002dINF.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- Navigation -->\r\n");
      out.write("      <nav class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\" style=\"margin-bottom: 0\">\r\n");
      out.write("          <div class=\"navbar-header\">\r\n");
      out.write("              <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("                  <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                  <span class=\"icon-bar\"></span>\r\n");
      out.write("                  <span class=\"icon-bar\"></span>\r\n");
      out.write("                  <span class=\"icon-bar\"></span>\r\n");
      out.write("              </button>\r\n");
      out.write("              <a class=\"navbar-brand\" href=\"\"><small><i class=\"glyphicon glyphicon-tree-deciduous\"></i>ACE后台管理系统</small></a>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- /.navbar-header -->\r\n");
      out.write("\r\n");
      out.write("          <ul class=\"nav navbar-top-links navbar-right\">\r\n");
      out.write("          \t\t<li class=\"dropdown\">\r\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\r\n");
      out.write("                        <i class=\"fa fa-envelope fa-fw\"></i>  <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-messages\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <strong>张三</strong>\r\n");
      out.write("                                    <span class=\"pull-right text-muted\">\r\n");
      out.write("                                        <em>昨天</em>\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a class=\"text-center\" href=\"#\">\r\n");
      out.write("                                <strong>读取所有信息</strong>\r\n");
      out.write("                                <i class=\"fa fa-angle-right\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <!-- /.dropdown-messages -->\r\n");
      out.write("                </li>\r\n");
      out.write("                <!-- /.dropdown -->\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\r\n");
      out.write("                        <i class=\"fa fa-tasks fa-fw\"></i>  <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-tasks\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <p>\r\n");
      out.write("                                        <strong>任务 1</strong>\r\n");
      out.write("                                        <span class=\"pull-right text-muted\">完成 40%</span>\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                    <div class=\"progress progress-striped active\">\r\n");
      out.write("                                        <div class=\"progress-bar progress-bar-success\" role=\"progressbar\" aria-valuenow=\"40\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 40%\">\r\n");
      out.write("                                            <span class=\"sr-only\">40% Complete (success)</span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <p>\r\n");
      out.write("                                        <strong>任务\t2</strong>\r\n");
      out.write("                                        <span class=\"pull-right text-muted\">完成 20%</span>\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                    <div class=\"progress progress-striped active\">\r\n");
      out.write("                                        <div class=\"progress-bar progress-bar-info\" role=\"progressbar\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 20%\">\r\n");
      out.write("                                            <span class=\"sr-only\">20% Complete</span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a class=\"text-center\" href=\"#\">\r\n");
      out.write("                                <strong>查看所有任务</strong>\r\n");
      out.write("                                <i class=\"fa fa-angle-right\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <!-- /.dropdown-tasks -->\r\n");
      out.write("                </li>\r\n");
      out.write("                <!-- /.dropdown -->\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\r\n");
      out.write("                        <i class=\"fa fa-bell fa-fw\"></i>  <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-alerts\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <i class=\"fa fa-comment fa-fw\"></i> 新标注\r\n");
      out.write("                                    <span class=\"pull-right text-muted small\">4 分钟之前</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <i class=\"fa fa-upload fa-fw\"></i> 服务重启\r\n");
      out.write("                                    <span class=\"pull-right text-muted small\">4 分钟之后</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a class=\"text-center\" href=\"#\">\r\n");
      out.write("                                <strong>查看所有提醒</strong>\r\n");
      out.write("                                <i class=\"fa fa-angle-right\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <!-- /.dropdown-alerts -->\r\n");
      out.write("                </li>\r\n");
      out.write("              <!-- /.dropdown -->\r\n");
      out.write("              <li class=\"dropdown\">\r\n");
      out.write("                  <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\r\n");
      out.write("                      <i class=\"fa fa-user fa-fw\"></i>  <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("                  </a>\r\n");
      out.write("                  <ul class=\"dropdown-menu dropdown-user\">\r\n");
      out.write("\t                  <li><a href=\"#Message\" data-toggle=\"modal\"><i class=\"fa fa-gear fa-fw\"></i> 我的信息</a>\r\n");
      out.write("\t                  </li>\r\n");
      out.write("                      <li class=\"divider\"></li>\r\n");
      out.write("                      <li><a href=\"#myModal\" data-toggle=\"modal\"><i class=\"fa fa-gear fa-fw\"></i> 修改密码</a>\r\n");
      out.write("                      </li>\r\n");
      out.write("                      <li class=\"divider\"></li>\r\n");
      out.write("                      <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/logout.action\"><i class=\"fa fa-sign-out fa-fw\"></i> 退出登录</a>\r\n");
      out.write("                      </li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("                  <!-- /.dropdown-user -->\r\n");
      out.write("              </li>\r\n");
      out.write("              <!-- /.dropdown -->\r\n");
      out.write("          </ul>\r\n");
      out.write("          <!-- /.navbar-top-links -->\r\n");
      out.write("\t\t  <div id=\"menuList\" class=\"navbar-default sidebar\" role=\"navigation\">\r\n");
      out.write("\t\t    <div class=\"sidebar-nav navbar-collapse\">\r\n");
      out.write("\t\t        <ul class=\"nav\" id=\"side-menu\">\r\n");
      out.write("\t\t            <li class=\"sidebar-search\">\r\n");
      out.write("\t\t                <div class=\"input-group custom-search-form\">\r\n");
      out.write("\t\t                    <input type=\"text\" class=\"form-control\" placeholder=\"Search...\">\r\n");
      out.write("\t\t                    <span class=\"input-group-btn\">\r\n");
      out.write("\t\t                    <button class=\"btn btn-default\" type=\"button\">\r\n");
      out.write("\t\t                        <i class=\"fa fa-search\"></i>\r\n");
      out.write("\t\t                    </button>\r\n");
      out.write("\t\t                </span>\r\n");
      out.write("\t\t                </div>\r\n");
      out.write("\t\t                <!-- /input-group -->\r\n");
      out.write("\t\t            </li>\r\n");
      out.write("\t\t            <li>\r\n");
      out.write("\t\t                <a class=\"active\" href=\"");
      out.print(request.getContextPath());
      out.write("/index.action\"><i class=\"fa fa-home\"></i> 主页</a>\r\n");
      out.write("\t\t            </li>\r\n");
      out.write("\t\t            <li>\r\n");
      out.write("\t\t\t\t\t     <a href=\"#\"><i class=\"fa fa-folder-o\"></i> 系统管理<span class=\"fa arrow\"></span></a>\r\n");
      out.write("\t\t\t\t\t     <ul class=\"nav nav-second-level\">\r\n");
      out.write("\t\t\t\t\t         <li>\r\n");
      out.write("\t\t\t\t\t             <a href=\"");
      out.print(request.getContextPath());
      out.write("/system/user.action\">用户管理</a>\r\n");
      out.write("\t\t\t\t\t         </li>\r\n");
      out.write("\t\t\t\t\t         <li>\r\n");
      out.write("\t\t\t\t\t             <a href=\"");
      out.print(request.getContextPath());
      out.write("/system/role.action\">角色管理</a>\r\n");
      out.write("\t\t\t\t\t         </li>\r\n");
      out.write("\t\t\t\t\t     </ul>\r\n");
      out.write("\t\t\t\t\t     <!-- /.nav-second-level -->\r\n");
      out.write("\t\t\t\t\t </li>\r\n");
      out.write("\t\t\t\t\t <li>\r\n");
      out.write("\t\t\t\t\t     <a href=\"tables.html\"><i class=\"fa fa-folder-o\"></i> 表格</a>\r\n");
      out.write("\t\t\t\t\t </li>\r\n");
      out.write("\t\t\t\t\t <li>\r\n");
      out.write("\t\t\t\t\t     <a href=\"forms.html\"><i class=\"fa fa-folder-o\"></i> 框架</a>\r\n");
      out.write("\t\t\t\t\t </li>\r\n");
      out.write("\t\t\t\t\t <li>\r\n");
      out.write("\t\t\t\t\t     <a href=\"#\"><i class=\"fa fa-folder-o\"></i> 多级下拉<span class=\"fa arrow\"></span></a>\r\n");
      out.write("\t\t\t\t\t     <ul class=\"nav nav-second-level\">\r\n");
      out.write("\t\t\t\t\t         <li>\r\n");
      out.write("\t\t\t\t\t             <a href=\"#\">二级菜单</a>\r\n");
      out.write("\t\t\t\t\t         </li>\r\n");
      out.write("\t\t\t\t\t         <li>\r\n");
      out.write("\t\t\t\t\t             <a href=\"#\">二级菜单</a>\r\n");
      out.write("\t\t\t\t\t         </li>\r\n");
      out.write("\t\t\t\t\t         <li>\r\n");
      out.write("\t\t\t\t\t             <a href=\"#\">二级菜单 <span class=\"fa arrow\"></span></a>\r\n");
      out.write("\t\t\t\t\t             <ul class=\"nav nav-third-level\">\r\n");
      out.write("\t\t\t\t\t                 <li>\r\n");
      out.write("\t\t\t\t\t                     <a href=\"#\">三级菜单</a>\r\n");
      out.write("\t\t\t\t\t                 </li>\r\n");
      out.write("\t\t\t\t\t                 <li>\r\n");
      out.write("\t\t\t\t\t                     <a href=\"#\">三级菜单</a>\r\n");
      out.write("\t\t\t\t\t                 </li>\r\n");
      out.write("\t\t\t\t\t                 <li>\r\n");
      out.write("\t\t\t\t\t                     <a href=\"#\">三级菜单</a>\r\n");
      out.write("\t\t\t\t\t                 </li>\r\n");
      out.write("\t\t\t\t\t             </ul>\r\n");
      out.write("\t\t\t\t\t             <!-- /.nav-third-level -->\r\n");
      out.write("\t\t\t\t\t         </li>\r\n");
      out.write("\t\t\t\t\t     </ul>\r\n");
      out.write("\t\t\t\t\t     <!-- /.nav-second-level -->\r\n");
      out.write("\t\t\t\t\t </li>\r\n");
      out.write("\t\t        </ul>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t    <!-- /.sidebar-collapse -->\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("    \t  <!-- /.navbar-static-side -->\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Modal -->\r\n");
      out.write("\t<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("\t  <div class=\"modal-dialog\">\r\n");
      out.write("\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t  <div class=\"modal-header\">\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"><span aria-hidden=\"true\">&times;</span><span class=\"sr-only\">Close</span></button>\r\n");
      out.write("\t\t\t<h4 class=\"modal-title\" id=\"myModalLabel\">修改密码</h4>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  <div class=\"modal-body\">\r\n");
      out.write("\t\t\t<form role=\"form\">\r\n");
      out.write("\t          <div class=\"form-group\">\r\n");
      out.write("\t            <label for=\"recipient-name\" class=\"control-label\">原密码:</label>\r\n");
      out.write("\t            <input type=\"text\" class=\"form-control\" id=\"recipient-name\">\r\n");
      out.write("\t          </div>\r\n");
      out.write("\t          <div class=\"form-group\">\r\n");
      out.write("\t            <label for=\"recipient-name\" class=\"control-label\">新密码:</label>\r\n");
      out.write("\t            <input type=\"text\" class=\"form-control\" id=\"recipient-name\">\r\n");
      out.write("\t          </div>\r\n");
      out.write("\t          <div class=\"form-group\">\r\n");
      out.write("\t            <label for=\"recipient-name\" class=\"control-label\">确认新密码:</label>\r\n");
      out.write("\t            <input type=\"text\" class=\"form-control\" id=\"recipient-name\">\r\n");
      out.write("\t          </div>\r\n");
      out.write("\t        </form>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  <div class=\"modal-footer\">\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-primary\">保存</button>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">关闭</button>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Message -->\r\n");
      out.write("\t<div class=\"modal fade\" id=\"Message\" tabindex=\"-2\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("\t  <div class=\"modal-dialog\">\r\n");
      out.write("\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t  <div class=\"modal-header\">\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"><span aria-hidden=\"true\">&times;</span><span class=\"sr-only\">Close</span></button>\r\n");
      out.write("\t\t\t<h4 class=\"modal-title\" id=\"myModalLabel\"><i class=\"fa icon-search\"></i>信息</h4>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  <div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t<div id=\"showMessage\">\r\n");
      out.write("\t\t\t\t\tTest\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  <div class=\"modal-footer\">\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">关闭</button>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t</div>\t\t\t\t \r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("\t\t    \t\r\n");
      out.write("    </script>\r\n");
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
