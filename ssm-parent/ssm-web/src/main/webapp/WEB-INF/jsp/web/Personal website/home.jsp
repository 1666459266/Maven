<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/Common.jsp"%>
<%@include file="/WEB-INF/Taglib.jsp"%>
<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8">
<title>Home</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<!-- <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-000scale=1.0, user-scalable=no"> -->
<meta name="format-detection" content="telephone=no">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!-- åºç¡åº -->
<link href="https://cdn.bootcss.com/normalize/8.0.1/normalize.min.css"
	rel="stylesheet">
<!-- amaze ui -->
<link rel="stylesheet" type="text/css"
	href="${path}/static/web/css/amazeui.min.css" />
<link rel="stylesheet" type="text/css"
	href="${path}/static/web/css/amazeui.css" />
<!-- å¯¼èªæ js -->
<link rel="stylesheet" type="text/css"
	href="${path}/static/web/css/nav.css" />
<!-- ç¦ç¹å¾css -->
<link rel="stylesheet" type="text/css"
	href="${path}/static/web/css/focus.css" />
<!-- åå®¹css -->
<link rel="stylesheet" type="text/css"
	href="${path}/static/web/css/home.css" />
<!-- åºé¨å¯¼èªæ css -->
<link rel="stylesheet" type="text/css"
	href="${path}/static/web/css/footer.css" />
</head>
<body>
	<!-- å¯¼èªæ  -->
	<header class="am-topbar am-topbar-fixed-top">
		<nav class="daohang">
			<div class="nav-logo">
				<h3 id="tologin">David</h3>
			</div>

			<div class="nav-menu">
				menu <span></span> <span></span> <span></span>
			</div>

			<ul class="nav-list">
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
		<div class="lubo" id="lubo">
			<ul class="lubo_box">
				<li style=""><a href="" style=""><img src="" alt=""></a></li>
				<li><a href="" style=""><img src="" alt=""></a></li>
				<li><a href="" style=""><img src="" alt=""></a></li>
				<li><a href="" style=""><img src="" alt=""></a></li>

			</ul>
		</div>
		<!-- æ¯é¡µçæ é¢ -->
		<div class="am-g title">
			<h2 class="col-sm-2 col-lg-2 title-h2">
				<strong>EXCELLENT&nbsp;&nbsp;PAINTINGS</strong>
			</h2>
			<div class="col-sm-4 col-lg-4"></div>
			<div class="col-sm-6 col-lg-6"></div>
		</div>
	</div>
	<!-- ç¦ç¹å¾ -->

	<!-- åå®¹ -->
	<div class="am-g bigbox">
		<div class="col-sm-12 col-lg-7 excellent" id="excellent">
			<div class="excellent-picture">
				<div class="pic" id="pic1">
					<img src="" alt="" class="a">
				</div>
				<div class="excellent-content1">
					<!-- æ é¢å1 -->
					<h3 class="subtitle"></h3>
					<!-- ä»ç»å¾çåå®¹1 -->
					<p class="text"></p>
				</div>
			</div>
			<div>
				<div class="excellent-picture">
					<div class="pic" id="pic2">
						<img src="" alt="" class="a">
					</div>
					<div class="excellent-content2">
						<!-- æ é¢å2 -->
						<h3 class="subtitle"></h3>
						<!-- ä»ç»å¾çåå®¹2 -->
						<p class="text"></p>
					</div>
				</div>
			</div>
		</div>
		<div class="col-sm-0 col-lg-5 aboutme">
			<div class="aboutme-content">
				<div class="">
					<h2 class="title1">ABOUT ME</h2>
				</div>
				<div class="avatar-picture" id="avatar-picture">
					<img src="" alt="" class="b">
				</div>
				<div class="">
					<h2 class="subtitle" id="word1"></h2>
					<p class="text1" id="text1"></p>
				</div>
			</div>
		</div>
	</div>
	<!-- åå®¹ -->

	<!--åºé¨æ -->
	<footer class="footer">
		<p>Copyright&nbsp;&nbsp;©2019&nbsp;&nbsp;by&nbsp;&nbsp;David</p>
	</footer>
	<!--åºé¨æ -->
    <script src="${path}/static/web/js/jquery.min.js"
		type="text/javascript" charset="utf-8"></script>
		
	<!-- amaze ui -->
	<script src="${path}/static/web/js/amazeui.js" type="text/javascript"
		charset="utf-8"></script>
	<script src="${path}/static/web/js/amazeui.min.js"
		type="text/javascript" charset="utf-8"></script>
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
	
		$("#tologin").click(function() {
			window.location.href = "/toWeb?page=login";
		});
	</script>
	<!-- ç¦ç¹å¾js -->
	<%-- <script src="${path}/static/web/js/F1_jquery-1.7.2.js"
		type="text/javascript" charset="utf-8"></script> --%>
	<script src="${path}/static/web/js/F1_lubotu.js" type="text/javascript"
		charset="utf-8"></script>
	<!-- åå®¹js -->
	<script src="${path}/static/web/js/home.js" type="text/javascript"
		charset="utf-8"></script>
	<%-- <script src="${path}/static/web/js/jquery-3.3.1.min.js"></script> --%>
	<script src="${path}/static/web/js/skip.js"></script>

</body>
</html>
