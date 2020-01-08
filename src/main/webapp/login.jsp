<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>机考一体化平台</title>

    <!-- Bootstrap Core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style type="text/css">
        body{
            background: url(images/bg.jpg)repeat;
        }
        #login-box {
            /*border:1px solid #F00;*/
            padding: 35px;
            border-radius:15px;
            background: #56666B;
            color: #fff;
        }
    </style>
</head>

<body>

<div class="container" id="top">
    <div class="row" style="margin-top: 280px; ">
        <div class="col-md-4"></div>
        <div class="col-md-4" id="login-box">
            <form class="form-horizontal" role="form" action="${pageContext.request.contextPath}/login" id="from1" method="post">
                <div class="form-group">
                    <h3 class="panel-title" style="font-weight: bold;font-size:20px;margin-bottom: 20px">机考一体化登陆平台</h3>
                    <%--@declare id="firstname"--%><label for="firstname" class="col-sm-3 control-label">用户id</label>
                    <div class="col-sm-9">
                        <input type="text" class="form-control" id="userID" placeholder="请输入名字" name="username">
                    </div>
                </div>
                <div class="form-group">
                    <%--@declare id="lastname"--%><label for="lastname" class="col-sm-3 control-label">密码</label>
                    <div class="col-sm-9">
                        <input type="password" class="form-control" id="password" placeholder="请输入密码" name="password">
                    </div>
                </div>
                <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                <div class="checkbox">
                <label class="checkbox-inline">
                <input type="radio" name="role" value="管理员" checked>管理员
                </label>
                <label class="checkbox-inline">
                <input type="radio" name="role" value="老师">老师
                </label>
                <label class="checkbox-inline">
                <input type="radio" name="role" value="学生">学生
                </label>
                </div>
                </div>
                </div>
<%--                <div class="form-group pull-right" style="margin-right: 15px;">--%>
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-default btn-info" style="position: absolute;left: -10px">登录</button>
<%--                    </div>--%>

                </div>
                <div class="col-sm-offset-2 col-sm-10">
                    <button onClick="location.href='/reg.jsp'" class="btn btn-default btn-info"style="position: absolute;right: 45px">注册</button>
            </div>
            </form>
        </div>
        <div class="col-md-4"></div>
    </div>
</div>

    <!-- jQuery -->
    <script src="vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="vendor/metisMenu/metisMenu.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="dist/js/sb-admin-2.js"></script>

</body>

</html>
