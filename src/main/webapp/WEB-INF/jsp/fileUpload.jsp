<%@page contentType="text/html; charset=UTF-8" language="java"%>
<%@include file="common/tag.jsp"%>
<%@include file="common/head.jsp"%>
<jsp:include flush="true" page="common/navigation.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<title>文件上传</title>
</head>
<body>
	<div class="navs">
		<form method="post" action="doFileUpload"
			enctype="multipart/form-data">

			<div class="form-group">
				<label for="inputfile">上传文件</label> <input type="file"
					id="inputfile" name="courseFile">
				<p class="help-block">文件的格式必须为。。。。</p>
			</div>

			<label for="name">所属学院</label> <select class="form-control"
				name="courseFileCollege">
				<option>矿业工程学院</option>
				<option>安全工程学院</option>
				<option>力学与建筑工程学院</option>
				<option>机电工程学院</option>
				<option>信息与电气工程学院</option>
				<option>资源与地球科学学院</option>
				<option>化工学院</option>
				<option>环境与测绘学院</option>
				<option>电力工程学院</option>
				<option>材料科学与工程学院</option>
				<option>理学院</option>
				<option>计算机科学与技术学院</option>
				<option>管理学院</option>
				<option>文学与法政学院</option>
				<option>马克思主义学院</option>
				<option>外国语言文化学院</option>
				<option>艺术与设计学院</option>
				<option>体育学院</option>
				<option>孙越崎学院</option>
				<option>国际学院</option>
				<option>应用技术学院</option>
				<option>成人教育学院</option>
			</select>
			<div class="form-group">
				<label class="col-sm-2 control-label">用户名</label>

			</div>
			<label>
			<div class="col-sm-10">
				课程名 <input class="form-control input-lg2" name="courseFileSubject"
					type="text" placeholder="请输入课程全名">
			</div></label>
			<div class="radio">
				<label> <input type="radio" name="courseFileLevel"
					id="optionsRadios1" value="0" checked> 全部可下载
				</label>
			</div>
			<div class="radio">
				<label> <input type="radio" name="courseFileLevel"
					id="optionsRadios2" value="1"> 仅老师可下载
				</label>
			</div>

			<button type="submit" class="btn btn-default">提交</button>
		</form>

	</div>
	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>

	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script
		src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>
</html>