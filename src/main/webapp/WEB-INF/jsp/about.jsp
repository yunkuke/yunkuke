<%@page contentType="text/html; charset=UTF-8" language="java"%>
<%@include file="common/tag.jsp"%>
<%@include file="common/head.jsp"%>
<jsp:include flush = "true" page="common/navigation.jsp"></jsp:include>
<!DOCTYPE HTML>
<html>
<head>
<title>云库课关于我们</title>
	<section class="about-intro">
		<div class="container">
			<!-- Intro Content -->
			<div class="row">
				<div class="col-md-6">
					<video id="example_video_1" class="video-js vjs-default-skin"
						controls preload="none" width="480" height="320"
						poster="resources/aboutmv/TZlogo.jpg">
						<source src="resources/aboutmv/logomv.mp4" type='video/mp4' />
					</video>
				</div>
				<div class="col-md-6">
					<h3>中国矿业大学</h3>
					<p>来自计算机学院自我组建的项目开发团队</p>
				</div>
			</div>
			<!-- /.row -->
		</div>
	</section>
	<!-- divider section -->
	<section class="divider">
		<div class="container">
			<blockquote>"
				于千万人之中遇见你所要遇见的人，于千万年之中，时间的无涯的荒野里，没有早一步，也没有晚一步，刚巧赶上了，没有别的话可说，惟有轻轻地问一声:噢，你也在这里？"
			</blockquote>
			<h3>- 张爱玲《爱》 -</h3>
		</div>
	</section>
	<!-- /divider section -->
	<!-- Team Members -->
	<section class="about-team">
		<h3 class="text-center">团队成员</h3>
		<p class="text-center">亦于此与心之交汇</p>
		<div class="container">
			<div class="row">
				<div class="col-md-4 text-center team-agile">
					<div class="thumbnail">
						<ul class="grid cs-style-3">
							
									<img class="img-responsive" src="resources/images/team-img1.jpg" alt="">

						</ul>
						<div class="caption">
							<h4>赵勤博</h4>
							<p class="team-w3ls">首席CEO，TZStudio长期观察师</p>
						</div>
					</div>
				</div>
				<div class="col-md-4 text-center team-agile">
					<div class="thumbnail">
						<ul class="grid cs-style-3">
							
									<img class="img-responsive" src="resources/images/team-img2.jpg" alt="">

						</ul>
						<div class="caption">
							<h4>张帅</h4>
							<p class="team-w3ls">Application架构师</p>
						</div>
					</div>
				</div>
				<div class="col-md-4 text-center team-agile">
					<div class="thumbnail">
						<ul class="grid cs-style-3">
							
									<img class="img-responsive" src="resources/images/team-img3.jpg" alt="">

							
						</ul>
						<div class="caption">
							<h4>周超</h4>
							<p class="team-w3ls">前端工程师</p>
						</div>
					</div>
				</div>
			</div>
			<!-- /.row -->
		</div>
	</section>
	<!-- team section -->
	<!-- map section -->
	<!--<section class="map">
	<iframe class="googlemaps" src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d380510.6741687111!2d-88.01234121699822!3d41.83390417061058!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2sin!4v1455598377120" frameborder="0" style="border:0" allowfullscreen></iframe>
</section> --!>
<!-- /map section -->
	<!-- contact section -->

	<!-- /contact section -->
	<jsp:include flush="true" page="common/footer.jsp"></jsp:include>

	<!-- /js for banner -->
	<!-- /js files -->
</body>
</html>