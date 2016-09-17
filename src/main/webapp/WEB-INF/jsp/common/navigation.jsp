<%@page contentType="text/html; charset=UTF-8" language="java"%>
<%@include file="tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="head.jsp"%>
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>导航</title>
</head>
<body>

	<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">导航栏</a>
			</div>
			<div>
				<ul class="nav navbar-nav">
					<li class="active"><a href="/yunkuke/courses/list">文件列表</a></li>
					<li class="active"><a href="/yunkuke/courses/fileQuary">查询</a></li>
					<li class="active"><a href="/yunkuke/user/login">登陆</a></li>
					<li class="active"><a href="/yunkuke/user/register">注册</a></li>
					<li class="active"><a href="/yunkuke/user/userInfo">账户信息</a></li>
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="/yunkuke/user/register"> 关于团队 <span
							class="caret"></span>
					</a>
						<ul class="dropdown-menu">
							<li><a href="#">团队介绍</a></li>
							<li class="divider"></li>
							<li><a href="#">联系客服</a></li>
						</ul></li>
					<li class="btn btn-info" ><a href="/yunkuke/user/logout" target="_blank">退出</a>
				</ul>
			</div>
		</div>
	</nav>
	
	
	<style type="text/css">
	.navs{
	postion: absolute;
	margin: 300px 300px
	};
	</style>





	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>

	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script
		src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>
</html>