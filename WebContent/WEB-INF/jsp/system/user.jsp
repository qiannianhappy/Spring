<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/include/include.jsp" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>后台管理系统</title>

    <!-- Bootstrap Core CSS -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <!-- MetisMenu CSS -->
    <link href="../css/plugins/metisMenu/metisMenu.min.css" rel="stylesheet">
    <!-- Timeline CSS -->
    <link href="../css/plugins/timeline.css" rel="stylesheet">
    <!-- Custom CSS -->
    <link href="../css/sb-admin-2.css" rel="stylesheet">
    <!-- Morris Charts CSS -->
    <link href="../css/plugins/morris.css" rel="stylesheet">
    <!-- Custom Fonts -->
    <link href="../css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="../js/html5shiv.min.js"></script>
        <script src="../js/respond.min.js"></script>
    <![endif]-->
    
    <!-- DataTables CSS -->
    <link href="../css/plugins/dataTables.bootstrap.css" rel="stylesheet">
    
    <!-- jQuery -->
    <script src="../js/jquery-1.11.1.min.js"></script>
    <!-- Bootstrap Core JavaScript -->
    <script src="../js/bootstrap.min.js"></script>
    <!-- Metis Menu Plugin JavaScript -->
    <script src="../js/plugins/metisMenu/metisMenu.min.js"></script>
    <!-- Custom Theme JavaScript -->
    <script src="../js/sb-admin-2.js"></script>

</head>

<body>

    <div id="wrapper" class="container-fluid">
		
		<jsp:include  page="../common/menu.jsp"><jsp:param name="menuNo" value="M009"/></jsp:include>

        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">用户列表</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            	用户信息列表
                            	<div class="pull-right">
                                <div class="btn-group">
                                    <button type="button" class="btn btn-success btn-xs" onclick="javascript:location.href='userAdd.action'">添加</button>
                                </div>
                            </div>
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                   <thead>
                                       <tr>
                                           <th>用户名</th>
                                           <th>姓名</th>
                                           <th>部门</th>
                                           <th>角色</th>
                                           <th>账户状态</th>
                                           <th>操作</th>
                                       </tr>
                                   </thead>
                                   <tbody id="userList">
                                      
                                   </tbody>
                               </table>
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->
	 <!-- DataTables JavaScript -->
    <script src="../js/plugins/dataTables/jquery.dataTables.js"></script>
    <script src="../js/plugins/dataTables/dataTables.bootstrap.js"></script>
    <script>
	  	// 默认禁用搜索和排序
	     $.extend( $.fn.dataTable.defaults, {
	         searching: false,
	         ordering:  false
	     } );
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

</body>

</html>
