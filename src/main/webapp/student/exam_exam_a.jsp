<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>机考一体化平台</title>

    <link href="http://v.bootstrapmb.com/2019/5/lkfg64899/css/font.css" rel="stylesheet">
    <link href="http://v.bootstrapmb.com/2019/5/lkfg64899/css/style.css" rel="stylesheet">
    <link href="http://v.bootstrapmb.com/2019/5/lkfg64899/css/mui.min.css" rel="stylesheet">
<%--    <link href="http://v.bootstrapmb.com/2019/5/lkfg64899/css/mui.css" rel="stylesheet">--%>
    <script src="http://v.bootstrapmb.com/2019/5/lkfg64899/js/jquery-1.8.3.min.js"></script>
    <script src="http://v.bootstrapmb.com/2019/5/lkfg64899/js/TouchSlide.1.1.js"></script>


    <!-- Bootstrap Core CSS -->
    <link href="../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="../vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="../vendor/morrisjs/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="../vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

<div id="wrapper">

    <!-- Navigation -->
    <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index.html">机考一体化平台----学生端</a>
        </div>
        <!-- /.navbar-header -->

        <ul class="nav navbar-top-links navbar-right">

            <!-- /.dropdown -->
            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                    <i class="fa fa-bell fa-fw"></i> <i class="fa fa-caret-down"></i>
                </a>
                <ul class="dropdown-menu dropdown-alerts">
                    <li>
                        <a href="#">
                            <div>
                                <i class="fa fa-tasks fa-fw"></i> New Task
                                <span class="pull-right text-muted small">4 minutes ago</span>
                            </div>
                        </a>
                    </li>
                    <li class="divider"></li>
                    <li>
                        <a href="#">
                            <div>
                                <i class="fa fa-upload fa-fw"></i> Server Rebooted
                                <span class="pull-right text-muted small">4 minutes ago</span>
                            </div>
                        </a>
                    </li>
                    <li class="divider"></li>
                    <li>
                        <a class="text-center" href="#">
                            <strong>See All Alerts</strong>
                            <i class="fa fa-angle-right"></i>
                        </a>
                    </li>
                </ul>
                <!-- /.dropdown-alerts -->
            </li>
            <!-- /.dropdown -->
            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                    <i class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
                </a>
                <ul class="dropdown-menu dropdown-user">
                    <li><a href="#"><i class="fa fa-user fa-fw"></i> 用户资料</a>
                    </li>
                    <li class="divider"></li>
                    <li><a href="${pageContext.request.contextPath}/login.jsp"><i class="fa fa-sign-out fa-fw"></i> 登出</a>
                    </li>
                </ul>
                <!-- /.dropdown-user -->
            </li>
            <!-- /.dropdown -->
        </ul>
        <!-- /.navbar-top-links -->
        <div class="chs">Collect from <a href="http://www.cssmoban.com/" >网页模板</a></div>

        <div class="navbar-default sidebar" role="navigation">
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
                        <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i>考试练习<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="${pageContext.request.contextPath}/showCourses">在线练习</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>

                    <li>
                        <a href="#"><i class="fa fa-wrench fa-fw"></i>在线考试<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="${pageContext.request.contextPath}/showCoursess">在线考试</a>
                            </li>

                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-sitemap fa-fw"></i>成绩反馈<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="${pageContext.request.contextPath}/showScore">练习成绩查询</a>
                            </li>
                            <li>
                                <a href="${pageContext.request.contextPath}/showScoreq">考试成绩查询</a>
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
</div><div class="container" id="content" style="margin-left: 16%;width: 100%">
    <div class="row">
        <div class="col-md-10">
            <div class="panel panel-default">
                <div class="panel-heading">

                    <form action="${pageContext.request.contextPath}/addtestss" method="post">
                        <article style="padding-bottom:44px;padding-top:44px;" id="leftTabBox">
                            <div class="bd" id="bd12">
                                <span>（一）单选题 </span>
                                <c:forEach  items="${list1}" var="item">
                                    <div class="test" style="margin-top:10px;">
                                        <div class="test_con">
                                            <div class="item">
                                                <div class="tit">
                                                        ${item.examName}
                                                </div>
<%--                                                <input type="hidden" name="examId" value="${item.examId}">--%>
                                                <input type="hidden" name="examName" value="${item.examName}">
                                                <input type="hidden" name="answer" value="${item.answer}">
                                                <input type="hidden" name="nanswer" id="nanswer" value="">
                                                <div class="item_con">
                                                    <div class="answ">
                                                        <ul>
                                                            <li class='options'><input  type="checkbox" name="nanswer" value="${item.answerA}"><i>${item.answerA}</i></li>
                                                            <li class='options'><input  type="checkbox" name="nanswer" value="${item.answerB}"><i>${item.answerB}</i></li>
                                                            <li class='options'><input  type="checkbox" name="nanswer" value="${item.answerC}"><i>${item.answerC}</i></li>
                                                            <li class='options'><input  type="checkbox" name="nanswer" value="${item.answerD}"><i>${item.answerD}</i></li>
                                                        </ul>
                                                    </div>
                                                </div><!--item_con结束-->
                                            </div><!--item结束-->
                                        </div><!--test_con结束-->
                                    </div><!--test结束-->

                                </c:forEach> </div>

                        </article>
                        <form action="${pageContext.request.contextPath}/addtestss" method="post">
                            <article style="padding-bottom:44px;padding-top:44px;" id="leftTabBox1">
                                <div class="bd" id="bd121">
                                    <span>（二）填空题</span>
                                    <c:forEach  items="${list2}" var="items">
                                        <div class="test" style="margin-top:10px;">
                                            <div class="test_con">
                                                <div class="item">
                                                    <div class="tit">
                                                            ${items.examName}
                                                    </div>
                                                    <input type="hidden" name="examId" value="${items.examId}">
                                                    <input type="hidden" name="examName" value="${items.examName}">
                                                    <input type="hidden" name="answer" value="${items.answer}">
                                                    <div class="item_con">
                                                        <div class="answ">
                                                                <%--                                                    <input type='hidden' name='QuestionA13' class='answ' id='QuestionA13' value='' />--%>
                                                                <%--                                                    <ul>--%>
                                                                <%--                                                        <li class='options' ids='12' val='${items.answerA}'><i>${items.answerA}</i></li>--%>
                                                                <%--                                                        <li class='options' ids='12' val='${items.answerB}'><i>${items.answerB}</i></li>--%>
                                                                <%--                                                        <li class='options' ids='12' val='${items.answerC}'><i>${items.answerC}</i></li>--%>
                                                                <%--                                                        <li class='options' ids='12' val='${items.answerD}'><i>${items.answerD}</i></li>--%>
                                                                <%--                                                    </ul>--%>

                                                            <textarea name="nanswer"></textarea>
                                                        </div>
                                                    </div><!--item_con结束-->
                                                </div><!--item结束-->
                                            </div><!--test_con结束-->
                                        </div><!--test结束-->

                                    </c:forEach>
                                </div>

                            </article>
                            <div class="form-group" style="text-align: center">
                                <button class="btn btn-default" type="submit">提交</button>
                                <button class="btn btn-default" type="reset">重置</button>
                            </div>
                        </form></form>
                </div>

            </div>

        </div>
    </div>
</div>
<div class="container" id="footer">
    <div class="row">
        <div class="col-md-12"></div>
    </div>
</div>
<!-- /#wrapper -->

<!-- jQuery -->
<script src="../vendor/jquery/jquery.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="../vendor/bootstrap/js/bootstrap.min.js"></script>

<!-- Metis Menu Plugin JavaScript -->
<script src="../vendor/metisMenu/metisMenu.min.js"></script>

<!-- Morris Charts JavaScript -->
<script src="../vendor/raphael/raphael.min.js"></script>
<script src="../vendor/morrisjs/morris.min.js"></script>
<script src="../data/morris-data.js"></script>

<!-- Custom Theme JavaScript -->
<script src="../dist/js/sb-admin-2.js"></script>
<script type="text/javascript">
    $("#nav li:nth-child(2)").addClass("active");

    function confirmd() {
        var msg = "您真的确定要删除吗？！";
        if (confirm(msg)==true){
            return true;
        }else{
            return false;
        }
    };

    $("#sub").click(function () {
        $("#form1").submit();
    });

    <c:if test="${pagingVO != null}">
    if (${pagingVO.curentPageNo} == ${pagingVO.totalCount}) {
        $(".pagination li:last-child").addClass("disabled")
    };

    if (${pagingVO.curentPageNo} == ${1}) {
        $(".pagination li:nth-child(1)").addClass("disabled")
    };
    </c:if>
</script>
<script type="text/javascript">
    $(function(){
        $("#AnsDis").click(function(){
            var questionid=$("#QuesDoing").val();
            if(questionid=="")
            {
                $("#QuesDoing").val($("#QuestionDoing1").val());
                questionid=$("#QuesDoing").val();
            }
            $("#QuesAnsw"+questionid).css("display","block");
            if($("#TrueAns"+questionid).text()=="")
            {
                $("#TrueAns"+questionid).text("无");
            }
        });

        $("#closeLayAB").click(function(){
            $("#layAB").hide();
        });
        $("#collection").click(function(){
            mui.alert("添加收藏成功!", "提示",function(){});
        });
    });
</script>
<script type="text/javascript">
    pushHistory();
    window.addEventListener("popstate", function(e) {
        pushHistory();
    }, false);
    function pushHistory() {
        var state = {
            title:"title",
            url:"#"
        };
        window.history.pushState(state, "title", "#");
    }
</script>






</body>
</html>
