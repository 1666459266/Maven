<!--
 * @Author: your name
 * @Date: 2019-11-14 13:40:27
 * @LastEditTime: 2019-11-14 14:02:59
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \æ´å\video\video.html
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/Common.jsp"%>
<%@include file="/WEB-INF/Taglib.jsp"%>
<!DOCTYPE html>
<html>
	<head lang="en">
		<meta charset="UTF-8">
		<title>Video</title>
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<!-- <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-000scale=1.0, user-scalable=no"> -->
		<meta name="format-detection" content="telephone=no">
		<meta name="renderer" content="webkit">
		<meta http-equiv="Cache-Control" content="no-siteapp" />
		<!-- åºç¡åº -->
		<link href="https://cdn.bootcss.com/normalize/8.0.1/normalize.min.css" rel="stylesheet">
		<!-- amaze ui -->
		
		<link rel="stylesheet" type="text/css" href="${path}/static/web/css/amazeui.min.css" />
		<link rel="stylesheet" type="text/css" href="${path}/static/web/css/amazeui.css" />
		<!-- å¯¼èªæ js -->
		<link rel="stylesheet" type="text/css" href="${path}/static/web/css/nav.css" />
		<link rel="stylesheet" type="text/css" href="${path}/static/web/css/home.css" />
		<link rel="stylesheet" type="text/css" href="${path}/static/web/css/video.css" />
	</head>
	<body>
		<!-- å¯¼èªæ  -->
		<header class="am-topbar am-topbar-fixed-top">
			<nav class="">
				<div class="nav-logo">
					<h3>David</h3>
				</div>

				<div class="nav-menu">
					menu
					<span></span>
					<span></span>
					<span></span>
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
		<div class="kobai"></div>
		<!-- å¯¼èªæ  -->
		<div class="content">
				<img src="${path}/static/web/image/timg.jpg">
		</div>
<div class="videowarp">
		<div class="am-g main">
			<div class="col-sm-12 col-lg-12 videobox">
				<video id="videourl" controls="controls"></video>
			</div>
		</div>
		
			<div class="am-g tp">
				<div id="videotitle" class="videotitle"></div>
				<hr>
				<div id="videocontent" class="video-text"></div>
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
		<script src="${path}/static/web/js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="${path}/static/web/js/video.js" type="text/javascript"></script>
		<script src="${path}/static/web/js/jquery-3.3.1.min.js"></script>
		<script src="${path}/static/web/js/skip.js"></script>
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
		</script>
	</body>
</html>
