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
		
		<jsp:include  page="../common/menu.jsp"/>

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
                            	用户信息添加
                            	<div class="pull-right">
                               
                            </div>
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                       	 	<form role="form">
                        		<div class="col-lg-6">
                                      <div class="form-group">
                                          <label>用户名</label>
                                          <input type="text" class="form-control" placeholder="用户名">
                                      </div>
                                      <div class="form-group">
                                          <label>密&nbsp;&nbsp;码</label>
                                          <input type="text" class="form-control" placeholder="密码">
                                      </div>
                                      <div class="form-group">
                                          <label>真实姓名</label>
                                          <input type="text" class="form-control" placeholder="真实姓名">
                                      </div>
                                      <div class="form-group">
                                          <label>性 别&nbsp;&nbsp;</label>
                                          <label class="radio-inline">
                                              <input type="radio" name="optionsRadiosInline" id="optionsRadiosInline1" value="option1" checked>男
                                          </label>
                                          <label class="radio-inline">
                                              <input type="radio" name="optionsRadiosInline" id="optionsRadiosInline2" value="option2">女
                                          </label>
                                      </div>
                                      <button type="submit" class="btn btn-outline btn-primary">提 交</button>
                                 </div>
                                 <div class="col-lg-6">
                                      <div class="form-group">
                                          <label>电 话</label>
                                          <input type="text" class="form-control" placeholder="电话">
                                      </div>
                                      <div class="form-group">
                                          <label>邮 箱</label>
                                          <input type="text" class="form-control" placeholder="邮箱">
                                      </div>
                                      <div class="form-group">
                                          <label>账户状态</label>
                                          <label class="radio-inline">
                                              <input type="radio" name="optionsRadiosInline" id="optionsRadiosInline1" value="option1" checked>正常
                                          </label>
                                          <label class="radio-inline">
                                              <input type="radio" name="optionsRadiosInline" id="optionsRadiosInline2" value="option2">注销
                                          </label>
                                      </div>
                                 </div>
                              </form>
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
	  	
    </script>

</body>

</html>
