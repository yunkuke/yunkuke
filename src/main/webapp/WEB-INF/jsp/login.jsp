<%@page contentType="text/html; charset=UTF-8" language="java"%>
<%@include file="common/tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>云库课-登录</title>
<%@include file="common/head.jsp"%>
</head>
<body>
	<div align="center">

		<form method="post" action="doLogin">
			<h1>登录云库课</h1>
			<div class="form-group">
				<label class="col-sm-2 control-label">用户名</label>
				<div class="col-sm-10">
					<input class="form-control input-lg2" name="userId" type="text"
						placeholder="学号/邮箱/用户名">
				</div>
			</div>
			<div class="form-group">
				<label for="inputPassword" class="col-sm-2 control-label">密码</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" name="userPassword"
						id="inputPassword" placeholder="密码">
				</div>
			</div>
			<div>
				<input class="btn btn-info" type="submit" value="登陆"> <a
					class="btn btn-info"
					href="<%=request.getContextPath()%>/user/register" target="_blank">注册</a>
			</div>
		</form>
	</div>
	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>

	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script
		src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>
</html>