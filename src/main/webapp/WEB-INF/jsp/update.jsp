<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
   <title>用户界面</title>
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
<body>
<header  class="container">
    <div class="row">
        <img src="imgs/cc1.jpg" class="img-responsive">
    </div>
   <br><br><br><br><br>
   <center>
   <h1>高校科研提交与统计教师管理系统</h1>
   </center>
<form action="/index" method="get" name="form">
      <table align="center"  class="table table-bordered table-hover ">
         <tr>
         <td><center>
         <a href="/displayTeacher/aa">显示个人信息</a>
         </center>
         </td>
         </tr>
         <tr>
         <td><center><a href="/password">修改密码</a></center></td>
         </tr>
         <tr>
         <td><center><a href="/message">修改信息</a></center></td>
         </tr>
         <tr>
         <td><center><a href="/insertPaper">文献提交</a></center></td>
         </tr>
         <tr>
         <td><center><a href="/displayTeacher/bb">文献信息显示</a></center></td>
         </tr>
         <tr>
         <td><center><input type="submit" name="submit" class="btn btn-primary" 
         value="返回登录页面"></center></td>
         </tr>
      </table>
      </form>
</body>
</html>