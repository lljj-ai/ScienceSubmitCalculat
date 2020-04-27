<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>高校科研提交与统计系统</title>

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
                <a class="search-btn" href="/firstPage">系统描述</a>
                <a class="search-btn" href="/displayTeacher/dd">所含文献</a>
                 <a class="search-btn" href="/displayTeacher/gg">文献数量</a>
                <a class="search-btn" href="#">搜索</a>
                <a class="search-btn" href="#">搜索</a>
            </ul>
        </div>
        <div class="context">
           <form action="/firstPage" method="get"> 		 
               &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;科技研究主要集中在政府部门所属科研机构和大学。但限于以往计划经济下条件下行业关系，形成一定重复。大学由于经费投入不足，基础研究受到
                      影响。而企业却因为难以得到有效的经费，导致技术开发不够。大学，研究所与企业之间，在研究与技术开发和转移中缺少一个衔接环节，因而困扰用创
                     着工业技术创新活动，技术成果转化率低下，技术开发与生产以及技术开发与市场化环节之间存在严重脱节状况。国家将决定采取企业用于活动经费和运
                     新技术产生的利润实行减税等激励政策，逐步推动企业成为活动经费投入主体创造必要条件。同时，建立国家级管理体制实施国家科技发展战略，对大学
                     在逐步增加科研经费投入的同时，推动产学研三者的结合，加速大学技术开发和转移以及科研成果的转化。
                <hr>&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;此系统主页通过分为三部分，游客、教师和管理员都可登录主页，查看具体学校对应的老师的论文，以及各个大学和文献。而后关于用户登录部分可
                     以查看自己的基本信息，并且修改自己信息和密码后可以验证，在提交论文后可通过查看论文和教师连接信息来验证是否提交成功。关于管理员部分，管理
                     员登陆之后，管理员可以实现对教师，学校，学院，文献信息的增删改查功能，方便管理操作。     
    
      </form>
        </div>
    </div>
</div>
</header>
</body>
</html>
