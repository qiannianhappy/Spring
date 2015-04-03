<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
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
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="css/plugins/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css">
    
    <style>
    
    body{
	    background:#255cc4 url(images/background.jpg) fixed no-repeat;
	    /*filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(src='images/login.jpg',sizingMethod=scale);*/
		-moz-background-size: 100% 100%;
		background-size: 100% 100%;
	}
    </style>

    <!--[if lt IE 9]>
        <script src="js/html5shiv.min.js"></script>
        <script src="js/respond.min.js"></script>
    <![endif]-->
    <!-- jQuery -->
    <script src="js/jquery-1.11.1.min.js"></script>
    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>
    <!-- Metis Menu Plugin JavaScript -->
    <script src="js/plugins/metisMenu/metisMenu.min.js"></script>
	<!-- Custom Theme JavaScript -->
    <script src="js/sb-admin-2.js"></script>

</head>

<body>

    <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">请输入用户信息</h3>
                    </div>
                    <div class="panel-body">
                        <form role="form" action="doLogin.action" method="post">
                            <fieldset>
                                <div class="form-group">
                                    <input type="text" class="form-control" placeholder="用户名" name="username" autofocus/>
                                </div>
                                <div class="form-group">
                                    <input type="password" class="form-control" placeholder="密码" name="password"/>
                                </div>
                                <div class="form-group">
                                    <input type="text"  class="form-control" placeholder="验证码" style="display:inline;width:100px;" name="checkcode"/>
									<img src="authImg" name="authImg" onClick="this.src=this.name+'?t='+Math.random();" alt="点击刷新" style="cursor:pointer;position:relative;left:10%;" />
                                </div>
                                <%if(null!=request.getAttribute("errorMsg")){ %>
	                                <div class="alert alert-warning" role="alert">
	                                    	<%=request.getAttribute("errorMsg") %>
	                                </div>
                                <%} %>
                                <!-- Change this to a button or input when using this as a form -->
                                <button type="submit" class="btn btn-primary">登	录</button>
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>

</html>
