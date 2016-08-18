<%@page contentType="text/html; charset=UTF-8" language="java"%>
<%@include file="common/tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>fileQuary</title>
<%@include file="common/head.jsp"%>
</head>
<body>
	<form class="form-horizontal" role="form" action="list">
   <div class="form-group">
      <label for="firstname" class="col-sm-2 control-label">根据文件名查询</label>
      <div class="col-sm-10">
         <input type="text" class="form-control" id="firstname" name="courseFileName"
            placeholder="请输入文件名">
      </div>
   </div>
   <div class="form-group">
      <label for="firstname" class="col-sm-2 control-label">根据学院查询</label>
      <div class="col-sm-10">
         <input type="text" class="form-control" id="firstname" name="courseFileCollege"
            placeholder="请输入学院">
      </div>
   </div>
   <div class="form-group">
      <label for="firstname" class="col-sm-2 control-label">根据课程全名查询</label>
      <div class="col-sm-10">
         <input type="text" class="form-control" id="firstname" name="courseFileSubject"
            placeholder="请输入课程全名">
      </div>
   </div>
   <div align="center">
		<button type="submit" class="btn btn-default ">确定</button>
	</div>
   </form>


<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>

	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script
		src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>
</html>