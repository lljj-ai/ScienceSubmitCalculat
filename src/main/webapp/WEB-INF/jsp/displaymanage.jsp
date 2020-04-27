<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>高校科研提交与统计后台管理系统</title>
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
<header  class="container">
    <div class="row">
        <img src="imgs/cc1.jpg" class="img-responsive">
    </div>
   <br><br><br><br><br>
<body>
	<h1 align="center">高校科研提交与统计后台管理系统</h1>
	<form action="/index" method="get" name="form">
	      <table align="center" class="table table-bordered table-hover ">
	        
	         <tr>
	         	<td> <center>
	         		<!-- <a href="/teacher/selectAllTeacher">管理教师</a> -->
	         		<a href="/teacher/selectAllTeacher">管理教师</a>
	         	     </center>
	         	</td>
	         </tr>
	         <tr>
	         	<td><center>
	         		<a href="/paper/selectAllPaper">管理论文</a>
	         		</center>
	         	</td>
	         </tr>
	         <tr>
	         	<td><center>
	         		<a href="/university/selectAllUniversity">管理学校</a>
	         		</center>
	         	</td>
	         </tr>
	         <tr>
	         	<td><center>
	         		<a href="/department/selectAllDepartment">管理学院</a>
	         		</center>
	         	</td>
	         </tr>
	         <tr>
	         	<td><center>
	         		<a href="/account/toInsertManager">添加管理员</a>
	         		</center>
	         	</td>
	         </tr>
	         <tr>
	         	<td><center>
	         		<input type="submit" class="btn btn-primary"  name="submit" 
	         		value="返回首页">
	         		</center>
	         	</td>
	         </tr>
	        
	      </table>
      </form>
	</body>
</html>