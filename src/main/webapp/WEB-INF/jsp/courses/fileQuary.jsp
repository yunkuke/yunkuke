<%@page contentType="text/html; charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
<%@include file="../common/tag.jsp"%>
<!DOCTYPE html>
<html>
<head>

<title>fileQuary</title>
<%@include file="../common/head.jsp"%>

</head>
<body>
	<section class="subs">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="subscribe">
						<form action="list" method="get">
							<div class="form-group1">
								<input class="form-control" id="email" name="fileQuaryStr"
									placeholder="课件名/学院名/课程名" type="text">
							</div>
							<div class="form-group2">
								<button class="btn btn-outline btn-lg" type="submit">搜索</button>
							</div>
							<a href="/yunkuke/courses/seniorFileQuary">高级搜索</a>
							<div class="clear-fix"></div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>

	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>

	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script
		src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>
</html>