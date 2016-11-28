<%@page contentType="text/html; charset=UTF-8" language="java"%>
<%@include file="../common/tag.jsp"%>
<%@include file="../common/head.jsp"%>
<jsp:include flush = "true" page="../common/navigation.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<title>账户信息</title>
</head>
<body>
<div class="navs">
	<div class="container">
		<div class="panel panel-default">
		
			<div class="panel-body">
				<table class="table table-hover">
					<thead>
						<tr>
							<th>账户</th>
							<th>名称</th>
							<th>学校</th>
							<th>类型</th>
						</tr>
					</thead>
					<tbody>
							<tr>
								<td>${userInfo.userId}</td>
								<td>${userInfo.userName}</td>
								<td>${userInfo.userSchool}</td>
								<td>${uLevel}</td>
							</tr>
							
						
					</tbody>
				</table>
		
			</div>
		</div>
	</div>
	<section class="contact-w3ls">
		<div class="container">
			<!-- Content Row -->
			<div class="row">
				<div class="col-md-18">
					<form action="changeUserPwd" method="post" class="login">
						
						<div class="control-group form-group">
							<div class="controls">
								<label>旧密码:</label> <input type="password" name="userOldPassword"
									class="form-control" id="phone" placeholder="密码" required />
							</div>
						</div>
						<div class="control-group form-group">
							<div class="controls">
								<label>新密码:</label> <input type="password" name="userNewPassword"
									class="form-control" id="phone" placeholder="密码" required />
							</div>
						</div>
						<button href="#" type="submit" class="btn btn-primary">修改</button>
					</form>
				</div>
				<!-- /.row -->
			</div>
	</section>
</div>


	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>

	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script
		src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
	
	<%@include file="../common/footer.jsp"%>
</body>
</html>