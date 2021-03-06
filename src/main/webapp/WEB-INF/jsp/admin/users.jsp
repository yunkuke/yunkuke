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
	<div class="table-responsive">
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
						<c:forEach items="${allUser}" var="usr">
							<tr>
								<td>${usr.userId}</td>
								<td>${usr.userName}</td>
								<td>${usr.userSchool}</td>
								<td>${usr.userLevel}</td>
								<td><a class="btn btn-info"
									href="/yunkuke/admin/${usr.userId}/deletion"
									 >删除</a></td>
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