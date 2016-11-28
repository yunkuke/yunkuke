<%@page contentType="text/html; charset=UTF-8" language="java"%>
<%@include file="../common/tag.jsp"%>
<%@include file="../common/head.jsp"%>
<jsp:include flush = "true" page="../common/navigation.jsp"></jsp:include>
<!DOCTYPE HTML>
<html>
<head>
<title>云库课上传课件</title>
</head>
<body>
<section class="innerpage-header">
    <div class="container">
		<!-- Page Heading/Breadcrumbs -->
        <div class="row">
            <div class="col-lg-12">               
				<h2 class="page-header text-center">选择类型</h2>
            </div>
        </div>
        <!-- /.row -->
	</div>
</section> 
 <!-- Page Content -->
<section class="service-w3ls">
    <div class="container">
		<!-- Service Panels -->
        <div class="row">
            <div class="col-md-3 col-sm-6">
				<div class="thumbnail">
					<div class="hi-icon-wrap hi-icon-effect-5 hi-icon-effect-5c">
						<a href="/yunkuke/courses/fileUpload" class="hi-icon hi-icon-pencil">Mobile</a>
					</div>
					<h4>自制</h4>
					<p class="service-p1">由个人制作的课件，这个声明不会对您的课件上传产生任何影响，只针对于我们的审核而言进行</p>
				</div>	
            </div>
            <div class="col-md-3 col-sm-6">
                <div class="thumbnail">
					<div class="hi-icon-wrap hi-icon-effect-5 hi-icon-effect-5c">
						<a href="/yunkuke/courses/fileUpload" class="hi-icon hi-icon-archive">Mobile</a>
					</div>
					<h4>公共课件</h4>
					<p class="service-p1">是学校公共制作的课件，这个声明不会对您的课件上传产生任何影响，只针对于我们的审核而言进行</p>
				</div>
            </div>
            <div class="col-md-3 col-sm-6">
                <div class="thumbnail">
					<div class="hi-icon-wrap hi-icon-effect-5 hi-icon-effect-5c">
						<a href="/yunkuke/courses/fileUpload" class="hi-icon hi-icon-user">Mobile</a>
					</div>
					<h4>实验课件</h4>
					<p class="service-p1">这是专门为你的课程实验开设的，可以上传以后做实验时的说明等文件，唯一的不同就是所属区域</p>
				</div>
            </div>
            <div class="col-md-3 col-sm-6">
                <div class="thumbnail">
					<div class="hi-icon-wrap hi-icon-effect-5 hi-icon-effect-5c">
						<a href="/yunkuke/courses/fileUpload" class="hi-icon hi-icon-contract">Mobile</a>
					</div>
					<h4>作业课件</h4>
					<p class="service-p1">忘记留作业了？这里可以上传一些作业内容文件，我们会在学生上线的第一时间通知，当然他们装作没看到就没有办法了.</p>
				</div>
            </div>
        </div>
	</div>
</section>	
<jsp:include flush="true" page="../common/footer.jsp"></jsp:include>
<script>
	var slider = $('.slider').zslider({
		imagePanels: $('.slider-panel'),
		ctrlItems: $('.slider-item'),
		ctrlItemHoverCls: 'slider-item-selected',
		//panelHoverShowFlipBtn: false,
		flipBtn: {
			container: $('.slider-page'),
			preBtn: $('.slider-pre'),
			nextBtn: $('.slider-next')
		},
		callbacks: {
			animate: function(imagePanels, ctrlItems, fromIndex, toIndex) {
				return true;
			}
		}
	});
	document.querySelector('#squit').onclick =function(){
		swal("该功能暂未开启，期待我们后续的开发")};
	document.querySelector('#squit1').onclick =function(){
		swal("该功能暂未开启，期待我们后续的开发")};
	document.querySelector('#squit2').onclick =function(){
		swal("该功能暂未开启，期待我们后续的开发")};
</script>

<!-- /js for banner -->
<!-- /js files -->
</body>
</html>