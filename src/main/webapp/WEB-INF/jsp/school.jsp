<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>学院高校</title>

<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="js/bootstrap.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="js/bootstrap.min.js"></script>
<style>
    .paddtop{
        padding-top:  10px;
    }
    .search-input{
        float: left;
        border: 2px solid #89cbff;
        width: 350px;
        height: 35px;
        padding-left: 5px;
        margin-top: 15px;
    }
    .search-btn{
        float: left;
        border: 1px solid rgba(95, 176, 255, 0.19);
        width: 90px;
        height: 35px;
        background-color: rgba(95, 176, 255, 0.19);
        text-align: center;
        line-height: 35px;
        margin-top: 15px;
    }
    .wrapper {
        display: grid;
        grid-template-columns: 200px auto;
    }

    .list {
        background: rgba(95, 176, 255, 0.13);
    }

    .context {
        height: 500px;
    }
</style>
</head>
<body>
<!--1.页眉部分-->
<header  class="container">
    <div class="row">
        <img src="imgs/cc1.jpg" class="img-responsive">
    </div>
    <div class="row paddtop">
        <div class="col-md-3">
            <img src="imgs/tb1.jpg" class="img-responsive">
        </div>
         <div class="col-md-6">
            <form action="/displayTeacher/ff" method="get" name="form1" class="form-horizontal" >
                <input type="text" class="search-input" id="papername" name="papername" placeholder="请输入论文名称"/>
        <label> <button type="submit" class="search-btn">查询</button></label>
            </form>
         </div>
        <div class="col-md-4"></div>
        <img src="imgs/tb6.jpg" class="img-responsive">
        <a href="/index">登录</a></div>
    </div>
    <!--导航栏-->
    <div class="row">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/firstPage">首页</a>
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
           <ul class="nav navbar-nav">
                <li class="active"><a href="/school">高校学院 <span class="sr-only">(current)</span></a></li>
                <li><a href="/process">发表流程</a></li>
                <li><a href="/call">联系我们</a></li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
    </nav>
    </div>

<div class="navbar-brand">
    <div class="wrapper">
        <div class="list">
            <ul>
                <a class="search-btn" href="/displayTeacher/ee">完整信息</a>
                <a class="search-btn" href="/displayTeacher/cc">学校信息</a>
                <a class="search-btn" href="#">搜索</a>
            </ul>
        </div>
        <div class="context">
            <img src="imgs/ky.jpg" class="img-responsive">

        </div>
    </div>
</div>
</header>
</body>
</html>