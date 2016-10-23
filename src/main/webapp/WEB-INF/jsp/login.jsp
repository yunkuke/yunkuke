<%@page contentType="text/html; charset=UTF-8" language="java"%>
<%@include file="common/tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>云库课-登录</title>
<link rel="icon" href="/yunkuke/favicon.ico" type="image/x-icon" />
<link rel="shortcut icon" href="/yunkuke/favicon.ico" type="image/x-icon" />
<link rel="bookmark" href="/yunkuke/favicon.ico" type="image/x-icon" />
<jsp:include flush="true" page="common/navigation.jsp"></jsp:include>

</head>
<body>
	<section class="innerpage-header">
		<div class="container">
			<!-- Page Heading/Breadcrumbs -->
			<div class="row">
				<div class="col-lg-12">
					<h2 class="page-header text-center">登录</h2>
				</div>
			</div>
			<!-- /.row -->
		</div>
	</section>
	<!-- Page Content -->
	<section class="contact-w3ls">
		<div class="container">
			<!-- Content Row -->
			<div class="row">
				<div class="col-md-18">
					<form action="doLogin" method="post" class="login">
						<div class="control-group form-group">
							<div class="controls">
								<label>学号/用户名/邮箱:</label> <input type="text" name="userId"
									class="form-control" id="name" placeholder="学号/用户名/邮箱."
									required />
							</div>
						</div>
						<div class="control-group form-group">
							<div class="controls">
								<label>密码:</label> <input type="password" name="userPassword"
									class="form-control" id="phone" placeholder="密码" required />
							</div>
						</div>
						<div class="text-center">
							<button href="#" type="submit" class="btn btn-primary">登录</button>
							<button href="#" type="reset"
								onClick="location='<%=request.getContextPath()%>/user/register' "
								return=false class="btn btn-primary">注册</button>
						</div>
					</form>
				</div>
				<!-- /.row -->
			</div>
	</section>


	<!--   	<div class="navs">
		<div align="center">
			<div class="container">
				<section id="content">
					<form method="post" action="doLogin" class="login">
						<h1>登录云库课</h1>
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
								href="<%=request.getContextPath()%>/user/register"
								target="_blank">注册</a>
						</div>
					</form>
					</section>
					</div>
			</div>
-->

	<jsp:include flush="true" page="common/footer.jsp"></jsp:include>
	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>

	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script
		src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
	</div>
	
</body>
</html>
