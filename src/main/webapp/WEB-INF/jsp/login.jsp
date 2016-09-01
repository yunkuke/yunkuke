<%@page contentType="text/html; charset=UTF-8" language="java"%>
<%@include file="common/tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>云库课-登录</title>
<%@include file="common/head.jsp"%>

<style type="text/css">
body {
	margin: 0;
	padding: 0;
	border: 0;
	font-size: 100%;
	font: inherit;
	vertical-align: baseline;
	line-height: 1;
	
	<!-- TODO背景图片 -->
	
	background-image: url("../resources/login2.png");
	background-position: left left;
	background-size: cover;
	background-attachment: fixed;
	background-repeat: no-repeat;
}

.login {
	margin: 10% 60%;
	padding: 18px 20px;
	width: 300px;
	background: #ff0000;
	background-clip: padding-box;
	border-bottom-color: #142647;
	border-radius: 5px;
	background-image: -webkit-radial-gradient(cover, #ff00ff, #3960a6);
	background-image: -moz-radial-gradient(cover, #ff00ff, #3960a6);
	background-image: -o-radial-gradient(cover, #ff00ff, #3960a6);
	background-image: radial-gradient(cover, #ff00ff, #3960a6);
	-webkit-box-shadow: inset 0 1px rgba(255, 255, 255, 0.3), inset 0 0 1px
		1px rgba(255, 255, 255, 0.1), 0 2px 10px rgba(0, 0, 0, 0.5);
	box-shadow: inset 0 1px rgba(255, 255, 255, 0.3), inset 0 0 1px 1px
		rgba(255, 255, 255, 0.1), 0 2px 10px rgba(0, 0, 0, 0.5);
}

.login>h1 {
	margin-bottom: 20px;
	font-size: 16px;
	font-weight: bold;
	color: white;
	text-align: center;
	text-shadow: 0 -1px rgba(0, 0, 0, 0.4);
}

.form-control {
	display: block;
	width: 120%;
	height: 37px;
	margin-bottom: 20px;
	padding: 0 9px;
	color: white;
	text-shadow: 0 1px black;
	background: #2b3e5d;
	border: 1px solid #15243b;
	border-top-color: #0d1827;
	border-radius: 4px;
	background-image: -webkit-linear-gradient(top, rgba(0, 0, 0, 0.35),
		rgba(0, 0, 0, 0.2) 20%, rgba(0, 0, 0, 0));
	background-image: -moz-linear-gradient(top, rgba(0, 0, 0, 0.35),
		rgba(0, 0, 0, 0.2) 20%, rgba(0, 0, 0, 0));
	background-image: -o-linear-gradient(top, rgba(0, 0, 0, 0.35),
		rgba(0, 0, 0, 0.2) 20%, rgba(0, 0, 0, 0));
	background-image: linear-gradient(to bottom, rgba(0, 0, 0, 0.35),
		rgba(0, 0, 0, 0.2) 20%, rgba(0, 0, 0, 0));
	-webkit-box-shadow: inset 0 1px 2px rgba(0, 0, 0, 0.3), 0 1px
		rgba(255, 255, 255, 0.2);
	box-shadow: inset 0 1px 2px rgba(0, 0, 0, 0.3), 0 1px
		rgba(255, 255, 255, 0.2);
	line-height: 35px;
}

.form-control:focus {
	outline: 0;
	background-color: #11246d;
	-webkit-box-shadow: inset 0 1px 2px rgba(0, 0, 0, 0.3), 0 0 4px 1px
		rgba(255, 255, 255, 0.6);
	box-shadow: inset 0 1px 2px rgba(0, 0, 0, 0.3), 0 0 4px 1px
		rgba(255, 255, 255, 0.6);
}
</style>
</head>
<body>
	<div align="center">

		<form method="post" action="doLogin" class="login">
			<h1>登录云库课<%=request.getContextPath()%></h1>
			<div class="form-group">
				
				<div class="col-sm-10">
					<input class="form-control input-lg2" name="userId" type="text"
						placeholder="学号/邮箱/用户名">
				</div>
			</div>
			<div class="form-group">
				
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