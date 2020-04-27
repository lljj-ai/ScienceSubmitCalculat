<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>全局样式</title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="js/bootstrap.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="js/bootstrap.min.js"></script>
    <style>

        .container {
            background: url(imgs/bj1.jpg) bottom center no-repeat #efeff4;

            height: 100%;
        }
    </style>
</head>
<body >
<!--1.页眉部分-->
<header  class="container">
    <div class="row">
        <img src="imgs/cc1.jpg" class="img-responsive">
    </div>
    <br><br><br><br><br>
    <form action="/indexController/in" method="get" name="form1" class="form-horizontal" >
        <div class="form-group">
            <label class="col-sm-4 control-label"> <span color="red">${msg}</span></label>
        </div>
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label"> 账号：</label>
            <div class="col-sm-4">
                <input type="text" name="userid" class="form-control" id="inputEmail3" placeholder="请输入账号">
            </div>
        </div>
        <div class="form-group">
            <label for="inputPassword3" class="col-sm-2 control-label">密码：</label>
            <div class="col-sm-4">
                <input type="password"  name="password"class="form-control" id="inputPassword3" placeholder="请输入密码">
            </div>
        </div>
        <div class="form-group">
            <label for="inputPassword3" class="col-sm-2 control-label">类型：</label>
            <div class="col-sm-4">
                <label>
                    <input type="radio" name="select" value="manager" class="a-radio">管理员
                </label>
                <label>
                    <input type="radio" name="select" value="teacher" class="a-radio">教师</label>
                <br><br>
                <label> <button type="submit" class="btn btn-primary" onclick="check()">登录</button>
                </label>
                <label><a href="/firstPage">返回主页</a></label>
            </div>
        </div>
    </form>
    <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</header>
<!-- <script type="text/javascript">
            function check(){
                if(form1.userid.value==""){  
                    alert("请输入账户！");
                    form1.userid.focus();
                    return ;
                }else if(form1.password.value==""){  
                    alert("请输入密码！");
                    form1.password.focus();
                    return ;
                }
            }
        </script> -->
</body>
</html>
<% request.getSession().setAttribute("msg","请输入账号密码");%>