<%@page contentType="text/html; charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="head.jsp"%>
<title>云库课</title>
</head>
<body>
<div class="navbar-wrapper">
	<div class="container">
		<nav class="navbar navbar-inverse navbar-static-top cl-effect-5">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="/yunkuke/index.html"><h1>云库课 </h1></a>
				</div>
				<div id="navbar" class="navbar-collapse collapse">
					<ul class="nav navbar-nav navbar-right">
						<li class="active"><a href="/yunkuke/index.htm">首页</a></li>
						<li><a href="/yunkuke/about.htm">团队介绍</a><span class="line1">/</span></li>
						<%
					if (session.getAttribute("userLevel")!=null && 1 == (int) session.getAttribute("userLevel")) {
					%>	
						<li><a href="/yunkuke/courses/fileUpload">上传课件</a><span class="line1">/</span></li>
					<%}%>
						
					
						<li><a href="/yunkuke/courses/list">课件中心</a><span class="line1">/</span></li>
						<%
					if (session.getAttribute("userLevel")!=null ) {
					%>	
						<li><a href="/yunkuke/user/userInfo">个人中心</a><span class="line1">/</span></li>
						<li><a href="/yunkuke/user/logout">注销</a><span class="line1">/</span></li>
						
					<%}%>
						
							<%
						String login = (String) session.getAttribute("userId");
						if (null == login) {
						%>
					
					
					<li><a href="/yunkuke/user/login">登录</a><span class="line1">/</span></li>
					<li><a href="/yunkuke/user/register">注册</a><span class="line1">/</span></li>
					<%
						}
					%>
					</ul>
				</div>
			</div>
		</nav>
	</div>
</div>
<section class="innerpage-banner"> </section>


</body>
</html>
