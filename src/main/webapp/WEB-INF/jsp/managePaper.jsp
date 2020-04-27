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
    <title>所有论文信息</title>
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
		
	<form action = "/paper/selectOnePaper" method = "post" name="form1">
		<table align="center" class="table table-bordered table-hover ">
		<tr>
			<td style="font-size:20px;text-align:right">请输入论文ID:</td>
			<td><input name="paperId" class="form-control" type="text" maxlength="10" 
                    id="paperid" ></td>
			<td><input type = "submit" value = "查询"  class="btn btn-primary"></td>
		</tr>
		</table>
	</form>
	
	<table align="center" class="table table-bordered table-hover ">
	
		<tr align="center" >
			<td align="center" colspan="11">
				<h2>所有论文信息</h2>
			</td>
		</tr>
		<tr align="center"  >
			<td><b>论文ID</b></td>
			<td><b>论文名称</b></td>
			<td><b>论文语种</b></td>
			<td><b>学科门类</b></td>
			<td><b>项目来源</b></td>
			<td><b>所属项目</b></td>
			<td><b>研究类别</b></td>
			<td><b>刊物名称</b></td>
			<td><b>刊物级别</b></td>
			<td><b>国别</b></td>
			<!-- <td><b>修改</b></td> -->
			<td><b>删除</b></td>
		</tr>
		<c:forEach var="paper" items="${papers}">
			<tr align="center" >
				<td>${paper.paperId}</td>
				<td>${paper.paperName}</td>
				<td>${paper.language}</td>
				<td>${paper.subjectClassId}</td>
				<td>${paper.projectSourceId}</td>
				<td>${paper.projectId}</td>
				<td>${paper.researchType}</td>
				<td>${paper.magazineName}</td>
				<td>${paper.magazineGrade}</td>
				<td>${paper.country}</td>
				<%-- <td>
					<form action="/paper/updatePaper?paperId=${papaer.getPaperId()}" method="post" >
						<input type="hidden" name="paperId" value="${paper.getPaperId()}">
						<input type="submit" value="点击修改">
					</form>
				</td> --%>
				<td>
					<form action="/paper/deletePaperById?paperId=${paper.getPaperId()}" method="post" >
						<input type="hidden" name="paperId" value="${paper.getPaperId()}">
						<input type="submit" class="btn btn-danger" value="删除">
					</form>
				</td>
			</tr>
		</c:forEach>
		<tr align="center" >
			<td align="center" colspan="11">
				<a href="/displaymanage">返回</a>
			</td>
		</tr>
	</table>
</body>
</html>