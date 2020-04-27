<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
	<title>Insert title here</title>
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
       <form action="/school" method="get" >
        <table align="center"  class="table table-bordered table-hover ">
             <tr>
             <td>学校编号</td>
             <td>学校名称</td>
             <td>学校等级</td>
             <td>学校类型</td>
             </tr>
             <c:forEach items="${list}" var="list">
             <tr>
              <td>${list.universityId}</td>
              <td>${list.universityName}</td>
              <td>${list.universityGrade}</td>
              <td>${list.universityType}</td>
             </tr>
             </c:forEach>
        <tr>
        <td>
        <input type="submit" name="submit"  value="返回">
        </td>
        </tr>
        </table>
     </form>
</body>
</html>