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
	
			
			<form action="files" method="get">
							<div class="form-group1">
								<input class="form-control" id="email" name="fileId"
									placeholder="课件id" type="text">
							</div>
							<div class="form-group2">
								<button class="btn btn-outline btn-lg" type="submit">搜索</button>
							</div>
							<div class="clear-fix"></div>
			</form>
			<div class="table-responsive">
				<table class="table table-hover">
					<thead>
						<tr>
							<th>ID</th>
							<th>名称</th>
							<th>学院</th>
							<th>课程名</th>
							<th>删除</th>
							
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${files}" var="f">
							<tr>
								<td>${f.courseFileId}</td>
								<td>${f.courseFileName}</td>
								<td>${f.courseFileCollege}</td>
								<td>${f.courseFileSubject}</td>						
								<td><a class="btn btn-info"
									href="/yunkuke/admin/${f.courseFileId}/file_deletion"
									 >刪除</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
		
	</div>
</div>


	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>

	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script
		src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
	
	<%@include file="../common/footer.jsp"%>
</body>
</html>