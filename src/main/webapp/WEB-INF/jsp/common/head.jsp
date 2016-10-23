<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />

<!-- 兼容ie -->
<meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1" />
<meta http-equiv="X-UA-Compatible" content="IE=9" />
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">
<!-- 可选的Bootstrap主题文件（一般不使用） -->
<script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap-theme.min.css"></script>
<!-- cookie -->
<script src="http://cdn.bootcss.com/jquery-cookie/1.4.1/jquery.cookie.min.js"></script>
<!-- HTML5 Shim 和 Respond.js 用于让 IE8 支持 HTML5元素和媒体查询 -->
<!-- 注意： 如果通过 file://  引入 Respond.js 文件，则该文件无法起效果 -->
<!--[if lt IE 9]>
<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
<script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
<![endif]-->
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.2/css/font-awesome.min.css" media="all" rel="stylesheet" type="text/css">
<!--  
<link href='http://fonts.useso.com/css?family=Viga' rel='stylesheet' type='text/css'>
<link href='http://fonts.useso.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'>
-->

<!-- /font files -->
<!-- css files -->
<link href="/yunkuke/resources/css/font-awesome.min.css" rel="stylesheet" type="text/css" media="all" />
<link href="/yunkuke/resources/css/info.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" type="text/css" href="/yunkuke/resources/js/fancybox/fancybox.css" />
<link href="/yunkuke/resources/css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- js files -->
<script src="/yunkuke/resources/js/jquery.min.js"></script>
<script src="/yunkuke/resources/js/fancybox/jquery.fancybox.pack.js" ></script>
<script src="/yunkuke/resources/js/bootstrap.min.js"></script>
<script src="/yunkuke/resources/js/SmoothScroll.min.js"></script>
<!-- js for team section --> 
<script src="/yunkuke/resources/js/index.js"></script>
<!-- /js for team section -->
<!-- js for banner -->
<script type="text/javascript">
	$(document).ready(function () {
		$( ".fancybox").fancybox();
	});
</script>
<script type="text/javascript" src="/yunkuke/resources/js/zslider-1.0.1.js"></script>
<script type="text/javascript">
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
</script>


