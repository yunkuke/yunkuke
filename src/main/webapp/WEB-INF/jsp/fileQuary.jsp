<%@page contentType="text/html; charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
<%@include file="common/tag.jsp"%>
<!DOCTYPE html>
<html>
<head>

<title>fileQuary</title>
<%@include file="common/head.jsp"%>

</head>
<body>
	<section class="subs">
		<h3 class="text-center">搜索课件</h3>
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
							<div class="clear-fix"></div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="subs">
		<div class="navs">
			<h3 class="text-center">多条件查询</h3>
			<div class="container">
			<div class="row">
				<form class="form-horizontal" role="form" action="list" method="get">
					<div class="form-group1">
						<label for="firstname" class="col-sm-2 control-label">根据文件名查询</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="email"
								name="courseFileName" placeholder="请输入文件名">
						</div>
					</div>
					<div class="form-group1">
						<label for="firstname" class="col-sm-2 control-label">根据学院查询</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="email"
								name="courseFileCollege" placeholder="请输入学院">
						</div>
					</div>
					<div class="form-group1">
						<label for="firstname" class="col-sm-2 control-label">根据课程名查询</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="email"
								name="courseFileSubject" placeholder="请输入课程名">
						</div>
					</div>
					<div align="center" class="form-group2">
						<button type="submit" class="btn btn-outline btn-lg">确定</button>
					</div>
			</form>
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