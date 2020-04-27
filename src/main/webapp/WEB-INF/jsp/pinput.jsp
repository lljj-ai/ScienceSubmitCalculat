<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
       <form action="/displayTeacher/ff" method="get" name="form1" class="form-horizontal" >
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">论文名称：</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="papername" name="papername" placeholder="请输入论文名称">
            </div>
            <label> <button type="submit" class="btn btn-default">查询</button>
            </label>
        </div>
    </form>
</body>
</html>