<%@page contentType="text/html; charset=UTF-8" language="java"%>
<%@include file="common/tag.jsp"%>
<%@include file="common/head.jsp"%>
<jsp:include flush = "true" page="common/navigation.jsp"></jsp:include>
<jsp:include flush = "true" page="courses/fileQuary.jsp"></jsp:include>
<!DOCTYPE HTML>
<html>
<head>
<title>云库课高级搜索</title>
<!-- /css files -->
</head>
<body>
<section class="subs">
	<h3 class="text-center">高级搜索</h3>
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="subscribe">
					<form action="#" method="post">
						<div class="form-group1">
							<input class="form-control" id="email-1" name="bb" placeholder="课件名" type="email" required>
						</div>
                                                <div class="form-group1">
							<input class="form-control" id="email-2" name="bb" placeholder="课件名" type="email" required>
						</div>
                                                <div class="form-group1">
							<input class="form-control" id="email-3" name="bb" placeholder="课件名" type="email" required>
						</div>
						<div class="form-group2">
							<button class="btn btn-outline-1 btn-lg" type="submit">搜索</button>
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
	<div class="container">
		<div class="panel panel-default">
			<div class="panel-heading text-center">
				<h2 class="text-center">文件列表</h2>
			</div>
			<div class="panel-body">
				<div class="bs-docs-example">
					<table class="table table-striped">
						<thead>
						   <tr>
							<th>ID</th>
							<th>名称</th>
							<th>学院</th>
							<th>课程名</th>
							<th>大小</th>
							<th>点赞量</th>
							<th>上传时间</th>
							<th>下载</th>
							<th>预览</th>
							<th>点赞</th>
						   </tr>
						</thead>
						<tbody>
							<tr>
								<td>1000</td>
								<td><a class="btn btn-info"
									href="http://ow365.cn/?i=10787&furl=http://yunkuke.cn/yunkuke/courses/1000/download"
								>patternfinder.zip</a></td>
								<td>计算机科学与技术学院</td>
								<td>AI</td>
								<td>2&nbsp;KB</td>
								<td>2</td>
								<td>2016-10-16"</td>
								<td><a class="btn btn-info"
									href="/yunkuke/courses/1000/download"
								>下载</a></td>
								<td><a class="btn btn-info"
									href="http://ow365.cn/?i=10787&furl=http://yunkuke.cn/yunkuke/courses/1000/download"
								>预览</a></td>								
								<td><a class="btn btn-info"
									href="/yunkuke/courses/1000/goodpoint"
									 >点赞</a></td>
							</tr>
							<tr>
								<td>1000</td>
								<td><a class="btn btn-info"
									href="http://ow365.cn/?i=10787&furl=http://yunkuke.cn/yunkuke/courses/1000/download"
								>patternfinder.zip</a></td>
								<td>计算机科学与技术学院</td>
								<td>AI</td>
								<td>2&nbsp;KB</td>
								<td>2</td>
								<td>2016-10-16"</td>
								<td><a class="btn btn-info"
									href="/yunkuke/courses/1000/download"
								>下载</a></td>
								<td><a class="btn btn-info"
									href="http://ow365.cn/?i=10787&furl=http://yunkuke.cn/yunkuke/courses/1000/download"
								>预览</a></td>								
								<td><a class="btn btn-info"
									href="/yunkuke/courses/1000/goodpoint"
									 >点赞</a></td>
							</tr>
							<tr>
								<td>1000</td>
								<td><a class="btn btn-info"
									href="http://ow365.cn/?i=10787&furl=http://yunkuke.cn/yunkuke/courses/1000/download"
								>patternfinder.zip</a></td>
								<td>计算机科学与技术学院</td>
								<td>AI</td>
								<td>2&nbsp;KB</td>
								<td>2</td>
								<td>2016-10-16"</td>
								<td><a class="btn btn-info"
									href="/yunkuke/courses/1000/download"
								>下载</a></td>
								<td><a class="btn btn-info"
									href="http://ow365.cn/?i=10787&furl=http://yunkuke.cn/yunkuke/courses/1000/download"
								>预览</a></td>								
								<td><a class="btn btn-info"
									href="/yunkuke/courses/1000/goodpoint"
									 >点赞</a></td>
							</tr>
						</tbody>
					</table>
				</div>
		       </div>
	       </div>
</div>
</div>
</section>

<!-- /subscribe section -->
 <!-- Page Content -->
<section class="portfolio-w3ls"> 
	<div class="container">
	</div>
</section>
<!-- contact section -->
<%@include file="common/footer.jsp"%>

<!-- /js for banner -->
<!-- /js files -->
</body>
</html>