<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- Navigation -->
      <nav class="navbar navbar-default navbar-fixed-top" role="navigation" style="margin-bottom: 0">
          <div class="navbar-header">
              <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                  <span class="sr-only">Toggle navigation</span>
                  <span class="icon-bar"></span>
                  <span class="icon-bar"></span>
                  <span class="icon-bar"></span>
              </button>
              <a class="navbar-brand" href=""><small><i class="glyphicon glyphicon-tree-deciduous"></i>ACE后台管理系统</small></a>
          </div>
          <!-- /.navbar-header -->

          <ul class="nav navbar-top-links navbar-right">
          		<li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-envelope fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-messages">
                        <li>
                            <a href="#">
                                <div>
                                    <strong>张三</strong>
                                    <span class="pull-right text-muted">
                                        <em>昨天</em>
                                    </span>
                                </div>
                                <div>测试</div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a class="text-center" href="#">
                                <strong>读取所有信息</strong>
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </li>
                    </ul>
                    <!-- /.dropdown-messages -->
                </li>
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-tasks fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-tasks">
                        <li>
                            <a href="#">
                                <div>
                                    <p>
                                        <strong>任务 1</strong>
                                        <span class="pull-right text-muted">完成 40%</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                            <span class="sr-only">40% Complete (success)</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <p>
                                        <strong>任务	2</strong>
                                        <span class="pull-right text-muted">完成 20%</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 20%">
                                            <span class="sr-only">20% Complete</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a class="text-center" href="#">
                                <strong>查看所有任务</strong>
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </li>
                    </ul>
                    <!-- /.dropdown-tasks -->
                </li>
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-bell fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-alerts">
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-comment fa-fw"></i> 新标注
                                    <span class="pull-right text-muted small">4 分钟之前</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-upload fa-fw"></i> 服务重启
                                    <span class="pull-right text-muted small">4 分钟之后</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a class="text-center" href="#">
                                <strong>查看所有提醒</strong>
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </li>
                    </ul>
                    <!-- /.dropdown-alerts -->
                </li>
              <!-- /.dropdown -->
              <li class="dropdown">
                  <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                      <i class="fa fa-user fa-fw"></i>  <i class="fa fa-caret-down"></i>
                  </a>
                  <ul class="dropdown-menu dropdown-user">
	                  <li><a href="#Message" data-toggle="modal"><i class="fa fa-gear fa-fw"></i> 我的信息</a>
	                  </li>
                      <li class="divider"></li>
                      <li><a href="#myModal" data-toggle="modal"><i class="fa fa-gear fa-fw"></i> 修改密码</a>
                      </li>
                      <li class="divider"></li>
                      <li><a href="<%=request.getContextPath()%>/logout.action"><i class="fa fa-sign-out fa-fw"></i> 退出登录</a>
                      </li>
                  </ul>
                  <!-- /.dropdown-user -->
              </li>
              <!-- /.dropdown -->
          </ul>
          <!-- /.navbar-top-links -->
		  <div id="menuList" class="navbar-default sidebar" role="navigation">
		    <div class="sidebar-nav navbar-collapse">
		        <ul class="nav" id="side-menu">
		            <li class="sidebar-search">
		                <div class="input-group custom-search-form">
		                    <input type="text" class="form-control" placeholder="Search...">
		                    <span class="input-group-btn">
		                    <button class="btn btn-default" type="button">
		                        <i class="fa fa-search"></i>
		                    </button>
		                </span>
		                </div>
		                <!-- /input-group -->
		            </li>
		            <li>
		                <a class="active" href="<%=request.getContextPath()%>/index.action"><i class="fa fa-home"></i> 主页</a>
		            </li>
		            <li>
					     <a href="#"><i class="fa fa-folder-o"></i> 系统管理<span class="fa arrow"></span></a>
					     <ul class="nav nav-second-level">
					         <li>
					             <a href="<%=request.getContextPath()%>/system/user.action">用户管理</a>
					         </li>
					         <li>
					             <a href="<%=request.getContextPath()%>/system/role.action">角色管理</a>
					         </li>
					     </ul>
					     <!-- /.nav-second-level -->
					 </li>
					 <li>
					     <a href="tables.html"><i class="fa fa-folder-o"></i> 表格</a>
					 </li>
					 <li>
					     <a href="forms.html"><i class="fa fa-folder-o"></i> 框架</a>
					 </li>
					 <li>
					     <a href="#"><i class="fa fa-folder-o"></i> 多级下拉<span class="fa arrow"></span></a>
					     <ul class="nav nav-second-level">
					         <li>
					             <a href="#">二级菜单</a>
					         </li>
					         <li>
					             <a href="#">二级菜单</a>
					         </li>
					         <li>
					             <a href="#">二级菜单 <span class="fa arrow"></span></a>
					             <ul class="nav nav-third-level">
					                 <li>
					                     <a href="#">三级菜单</a>
					                 </li>
					                 <li>
					                     <a href="#">三级菜单</a>
					                 </li>
					                 <li>
					                     <a href="#">三级菜单</a>
					                 </li>
					             </ul>
					             <!-- /.nav-third-level -->
					         </li>
					     </ul>
					     <!-- /.nav-second-level -->
					 </li>
		        </ul>
		    </div>
		    <!-- /.sidebar-collapse -->
		  </div>
    	  <!-- /.navbar-static-side -->
	</nav>
	
	<!-- Modal -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	  <div class="modal-dialog">
		<div class="modal-content">
		  <div class="modal-header">
			<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
			<h4 class="modal-title" id="myModalLabel">修改密码</h4>
		  </div>
		  <div class="modal-body">
			<form role="form">
	          <div class="form-group">
	            <label for="recipient-name" class="control-label">原密码:</label>
	            <input type="text" class="form-control" id="recipient-name">
	          </div>
	          <div class="form-group">
	            <label for="recipient-name" class="control-label">新密码:</label>
	            <input type="text" class="form-control" id="recipient-name">
	          </div>
	          <div class="form-group">
	            <label for="recipient-name" class="control-label">确认新密码:</label>
	            <input type="text" class="form-control" id="recipient-name">
	          </div>
	        </form>
		  </div>
		  <div class="modal-footer">
			<button type="button" class="btn btn-primary">保存</button>
			<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
		  </div>
		</div>
	  </div>
	</div>
	
	<!-- Message -->
	<div class="modal fade" id="Message" tabindex="-2" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	  <div class="modal-dialog">
		<div class="modal-content">
		  <div class="modal-header">
			<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
			<h4 class="modal-title" id="myModalLabel"><i class="fa icon-search"></i>信息</h4>
		  </div>
		  <div class="modal-body">
				<div id="showMessage">
					Test
				</div>
		  </div>
		  <div class="modal-footer">
			<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
		  </div>
		</div>
	  </div>
	</div>				 
    
    <script>
	    $(document).ready(function() {
	    	getUserList();
	        
	    });
	    
	    function getUserList(){
	    	jQuery.ajax( {  
    	        type : 'GET',  
    	        contentType : 'application/json',  
    	        url : '../system/userList.action',  
    	        dataType : 'json',  
    	        success : function(data) {
    	        	if (data.statusCode == 200) {
		   	            $.each(data.message, function(i, item) {
		   	              var editbutton="<button type='button' class='btn btn-info btn-xs'>修改</button>&nbsp;&nbsp;<button type='button' class='btn btn-warning btn-xs'>删除</button>";
		   	              var str="<tr><td>"+item.USERNAME+"</td><td>"+item.FULLNAME+"</td><td></td><td></td><td></td><td>"+editbutton+"</td></tr>"
		   	              $('#userList').append(str);  
	   	            });
	   	            $('#dataTables-example').dataTable();
    	          }  
    	        },  
    	        error : function() {  
    	          alert("error");
    	        }  
    	      });
	    }
    </script>
