<%@page contentType="text/html; charset=UTF-8" language="java"%>
<%@include file="common/tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>用户注册</title>
<%@include file="common/head.jsp"%>
<jsp:include flush = "true" page="common/navigation.jsp"></jsp:include>
</head>
<body>
<div class="navs">
	<form method="post" class="form-horizontal" role="form" action="doRegister">
		<div class="form-group">
			<label class="col-sm-2 control-label">学号</label>
			<div class="col-sm-10">
				<input class="form-control input-lg2" name="userId" type="text"
					placeholder="学号">
			</div>
		</div>

		<div class="form-group">
			<label class="col-sm-2 control-label">姓名</label>
			<div class="col-sm-10">
				<input class="form-control input-lg2" name="userName" type="text"
					placeholder="姓名">
			</div>
		</div>

		<div class="form-group">
			<label for="inputPassword" class="col-sm-2 control-label">密码</label>
			<div class="col-sm-10">
				<input type="password" class="form-control" name="userPassword"
					id="inputPassword" placeholder="请输入密码">
			</div>
		</div>
		<div class="form-group">
			<label for="name" class="col-sm-2 control-label">学校</label>
			<div class="col-sm-10">
				<select class="form-control" name="userSchool">
					<option>中国矿业大学</option>
					<option>浙江大学</option>
					<option>清华大学</option>
					<option>北京大学</option>
				</select>
			</div>
		</div>
			
		<div align="center">
			<label class="col-sm-2 control-label">用户类型</label>
			<div class="radio" align="left">
				<label> <input type="radio" name="userLevel" id="sdutent"
					value="0" checked> 学生
				</label>
			
				<label> <input type="radio" name="userLevel" id="teacher"
					value="1"> 教师
				</label>
			</div>

		</div>
	
	<div align="center">
		<button type="submit" class="btn btn-default ">提交</button>
	</div>
	</form>

	
	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>

	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script
		src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</div>
</body>
</html>