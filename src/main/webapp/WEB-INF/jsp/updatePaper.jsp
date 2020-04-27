<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css"
	rel="stylesheet">
<!--引用流行的响应式框架  Bootstrap  来美化它-->

<%@page import="java.util.List"%>
<%@page import="nuc.edu.cn.pojo.*"%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>大学信息</title>
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
    <center>
	<h1>高校科研提交与统计后台管理系统</h1>
	</center>
		<hr>
<%
	Teacher teacher = (Teacher)request.getAttribute("teacher");
%>
<body>
      <form action="/teacher/updateTeacherById" method="get" name="form3">
      <table align="center" class="table table-bordered table-hover ">
         <tr>
         <td>教师Id:</td>
         <td><input name="teacherId" type="text" class="form-control" value="${teacher.getTeacherId()}" /></td>
         </tr>
         <tr>
         <td>教师姓名:</td>
         <td><input name="teacherName" type="text" class="form-control"/></td>
         </tr>
         <tr>
         <td>学校ID:</td>
         <td><input name="universityId" type="text" class="form-control"/></td>
         </tr>
         <tr>
         <td>学院ID:</td>
         <td><input name="departmentId" type="text" class="form-control"/></td>
         </tr>
         <tr>
           <td></td>
         <td><center><input type="submit" name="submit" class="btn btn-primary"
          value="确定"></center></td>
         </tr>
         <tr align="center" >
           
			<td align="center" colspan="8">
				<a href="/paper/selectAllPaper">返回</a>
			</td>
		</tr>
      </table>
      </form>
</body>
</html>