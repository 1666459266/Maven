<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/Common.jsp"%>
<%@include file="/WEB-INF/Taglib.jsp"%>
<!DOCTYPE html>
<html>

	<head lang="en">
		<meta charset="UTF-8">
		<title>Art Activity</title>
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<!--<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">-->
		<meta name="format-detection" content="telephone=no">
		<meta name="renderer" content="webkit">
		<meta http-equiv="Cache-Control" content="no-siteapp" />
		<!-- åºç¡åº -->
		<link href="https://cdn.bootcss.com/normalize/8.0.1/normalize.min.css" rel="stylesheet">
		<!-- amaze ui -->

		<link rel="stylesheet" type="text/css" href="${path}/static/web/css/amazeui.min.css" />
		<link rel="stylesheet" type="text/css" href=${path}/static/web/css/amazeui.css />
		<!-- å¯¼èªæ js -->
		<link rel="stylesheet" type="text/css" href="${path}/static/web/css/nav.css" />
		<link rel="stylesheet" type="text/css" href="${path}/static/web/css/activityhome.css" />
		<link rel="stylesheet" type="text/css" href="${path}/static/web/css/footer.css" />

		<!-- activity -->
		<link rel="stylesheet" type="text/css" href="${path}/static/web/css/demo.css" />
		<link rel="stylesheet" type="text/css" href="${path}/static/web/css/toPage.css" />
	</head>
	<body>
		<!-- å¯¼èªæ  -->
		<header class="am-topbar am-topbar-fixed-top">
			<nav class="">
				<div class=" nav-logo">
					<h3>David</h3>
				</div>

				<div class="nav-menu">
					menu
					<span></span>
					<span></span>
					<span></span>

				</div>

				<ul class=" nav-list">
					<li><a href="javascript:;" id="y1">Home</a></li>
					<li><a href="javascript:;" id="y2">Painting</a></li>
					<li><a href="javascript:;" id="y3">Videos</a></li>
					<li><a href="javascript:;" id="y4">About</a></li>
					<li><a href="javascript:;" id="y5">Activity</a></li>
					<li><a href="javascript:;" id="y6">Contact</a></li>
				</ul>
			</nav>
		</header>
		<!-- å¯¼èªæ  -->

		<!-- ç¦ç¹å¾ -->
		<div class="get">
			<div class=" content">
				<img src="${path }/static/web/image/timg.jpg" class="" style="width: 102%;">
			</div>
		</div>
		</div>
		<!--åå¼å¥jquery-->
		<script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
		<!--åå¼å¥toPage.js-->
		<script src="${path }/static/web/js/toPage.js"></script>
		<!--æä»¶ä½¿ç¨-->
		<script src="${path }/static/web/js/activity_index.js"></script>
		</div>
		<!-- åå®¹ -->

		<!-- Activity -->
		<div class="allframe">
			<div class="container">
				<!-- <div class="codrops-top clearfix">
					<a class="codrops-icon codrops-icon-prev" href=""><span>Back</span></a>
				</div> -->

				<!-- <li class="am-breadcrumb"> -->
				<div class="am-g">
					<div class="col-sm-4 col-lg-4 ">&nbsp;
					</div>
					<div class="col-sm-4 col-lg-4 " style="text-align: center;">
						<a id="homepage" href="javascript:;">HomePage&nbsp;&nbsp;&nbsp;&nbsp;</a>
						<a id="content" href="javascript:;">Content</a>
					</div>
					<div class="col-sm-4 col-lg-4 ">
					</div>
				</div>
				<!-- </li> -->
				<header>
					<h1 id="h1">Art Activity</h1>
				</header>


				<div class="page_1" id="page_1"></div>
			</div>
		</div>


		<!--åºé¨æ -->
		<footer class="footer">
			<p>Copyright&nbsp;&nbsp;Â©2019&nbsp;&nbsp;by&nbsp;&nbsp;David</p>
		</footer>
		<!--åºé¨æ -->

		<!-- amaze ui -->
		<script src="${path}/static/web/js/amazeui.js" type="text/javascript" charset="utf-8"></script>
		<script src="${path}/static/web/js/amazeui.min.js" type="text/javascript" charset="utf-8"></script>
		<!-- å¯¼èªæ js -->
		<script type="text/javascript">
			$(document).click(function() {
				$('.nav-list').removeClass('open')
			})
			$('.nav-menu,.nav-list').click(function(e) {
				e.stopPropagation()
			})
			$('nav').find('.nav-menu').click(function(e) {
				$('.nav-list').toggleClass('open')
			})
			$("#homepage").click(function() {
				window.location.href = "/toWeb?page=web/activity/homepage";
			});
			$("#content").click(function() {
				window.location.href = "/toWeb?page=web/activity/attachedpage";
			});
		</script>
		<!-- Activity -->
		<script src="${path}/static/web/js/toPage.js" type="text/javascript" charset="utf-8"></script>
		
		<script src="${path}/jsp/web/activity/activity_index.js" type="text/javascript" charset="utf-8"></script>
		<script src="${path}/static/web/js/jquery-3.3.1.min.js"></script>
		<script src="${path}/static/web/js/skip.js"></script>

		<script src="${path}/static/web/js/jquery.min.js"></script>
		<script src="${path}/static/web/js/amazeui.min.js"></script>
	</body>
</html>
