<%@page contentType="text/html; charset=UTF-8" language="java"%>
<%@include file="common/tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>课程文件列表</title>
<%@include file="common/head.jsp"%>
<jsp:include flush = "true" page="common/navigation.jsp"></jsp:include>
</head>
<body>
<div class="navs">
	<div class="container">
		<div class="panel panel-default">
			<div class="panel-heading text-center">
				<h2>文件列表</h2>
			</div>
			<div class="panel-body">
				<table class="table table-hover">
					<thead>
						<tr>
							<th>ID</th>
							<th>名称</th>
							<th>学院</th>
							<th>课程名</th>
							<th>点赞量</th>
							<th>上传时间</th>
							<th>下载</th>
							<th>点赞</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${list}" var="cf">
							<tr>
								<td>${cf.courseFileId}</td>
								<td>${cf.courseFileName}</td>
								<td>${cf.courseFileCollege}</td>
								<td>${cf.courseFileSubject}</td>
								<td>${cf.courseFileGoodpoint}</td>
								<td>${cf.courseFileUplodeDate}"</td>
								<td><a class="btn btn-info"
									href="/yunkuke/courses/${cf.courseFileId}/detail"
									target="_blank">下载</a></td>
								<td><a class="btn btn-info"
									href="/yunkuke/courses/${cf.courseFileId}/goodpoint"
									target="_blank" >点赞</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>

			</div>
		</div>
	</div>
</div>


	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>

	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script
		src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>
</html>