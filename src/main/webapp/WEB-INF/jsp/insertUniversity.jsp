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
    <title>添加学校</title>
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
        <center>
        <h1>添加学校</h1>
        <form action="/university/insertUniversity" method="post" name="form1">
           <table align="center" valign="middle" class="table table-bordered table-hover " >     <!--利用表格来使文本框对齐-->
                 <hr color="#FF6433">
                 <h1>请输入学校信息 </h1>
	             <tr>  <!--利用空格来使文字对齐---->
	                <td>学校名称：</td>
	                <td><input name="universityName" class="form-control" type="text" 
	                    id="universityName" size="20" maxlength="20" placeholder="必填"></td>
	             </tr>
	             <tr>
	                <td>学校等级：</td>
	                <td><input name="universityGrade" class="form-control" type="text" 
	                    id="universityGrade" size="20" maxlength="20" placeholder="必填"></td>
	             </tr>
	             <tr>
	                <td>学校类型：</td>
	                <td><input name="universityType" class="form-control" type="text" 
	                    id="universityType" size="20" maxlength="20" placeholder="必填"></td>
	             </tr>
        	</table><br>
         
            <div class="row">
                <!--按钮使用了Bootstrap-->
                    <input type="submit" class="btn btn-primary" name="submit"  onclick="check()" value="提交">&nbsp;&nbsp;&nbsp;
                    <input type="reset" class="btn btn-danger" name="reset" value="重置"> 
            </div>
        
        </form><br>
             <a href="/university/selectAllUniversity">返回</a>
        </center>
     <script type="text/javascript">
            function check(){
                if(form1.teacherName.value==""){  
                    alert("请输入教师姓名！");
                    form1.teacherName.focus();
                    return;
                }else if(form1.departmentId.value==""){  
                    alert("请输入学院Id！");
                    form1.departmentId.focus();
                    return;
                }else if(form1.universityId.value==""){  
                    alert("请输入学校Id！");
                    form1.universityId.focus();
                    return;
                }else if(form1.password.value==""){  
                    alert("请输入密码！");
                    form1.password.focus();
                    return;
                }
            }
        </script> 
    </body>
</html>