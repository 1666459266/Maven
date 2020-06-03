<!--
 * @Author: your name
 * @Date: 2019-11-12 20:32:51
 * @LastEditTime: 2019-11-14 14:02:25
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \整合\about\about.html
 -->
<!--
 * @Author: your name
 * @Date: 2019-11-12 20:32:51
 * @LastEditTime: 2019-11-13 17:49:20
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \整合\about\about.html
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/Common.jsp"%>
<%@include file="/WEB-INF/Taglib.jsp"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<!-- <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-000scale=1.0, user-scalable=no"> -->
		<meta name="format-detection" content="telephone=no">
		<meta name="renderer" content="webkit">
		<meta http-equiv="Cache-Control" content="no-siteapp" />
		<!-- 基础库 -->
		<link href="https://cdn.bootcss.com/normalize/8.0.1/normalize.min.css" rel="stylesheet">
		<!-- amaze ui -->
		
		<link rel="stylesheet" type="text/css" href="${path}/static/web/css/amazeui.min.css" />
		<link rel="stylesheet" type="text/css" href="${path}/static/web/css/amazeui.css" />
		<!-- 导航栏css -->
		<link rel="stylesheet" type="text/css" href="${path}/static/web/css/nav.css" />
		<!-- 底部导航栏css -->
		<link rel="stylesheet" type="text/css" href="${path}/static/web/css/footer.css"/>
		<link rel="stylesheet" href="${path}/static/web/css/toPage.css">
	</head>
	<body>
		<!-- 导航栏 -->
		<header class="am-topbar am-topbar-fixed-top">
			<nav class="daohang">
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
		<div style="width: 100%;height: 100px;">
			
		</div>
		<div class="get">
			<div class="content">
				<img src="${path }/static/web/image/timg.jpg">
			</div>
		
		</div>
		<div class="kobai"></div>
		<!-- 导航栏 -->
		<div class="am-g a">
			<div class="col-sm-6 col-lg-6 pe">Personal experience</div>
			<div class="col-sm-6 col-lg-6"></div>
		</div>
		<div style="margin-top: 100px;">
			<div class="page_1">
		<!-- 填写你的内容 -->
		<div class="">
		
		</div>
		
		
		<!--底部栏-->
		<footer class="footer">
			<p>Copyright&nbsp;©2019&nbsp;by&nbsp;David</p>
		</footer>
		<!--底部栏-->
		
		<!-- amaze ui -->
		<script src="${path}/static/web/js/amazeui.js" type="text/javascript" charset="utf-8"></script>
		<script src="${path}/static/web/js/amazeui.min.js" type="text/javascript" charset="utf-8"></script>
		<!-- 导航栏 -->
		<script src="${path}/static/web/js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
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
				<script src="${path}/static/web/js/jquery-3.3.1.min.js"></script>
				<script src="${path}/static/web/js/skip.js"></script>
		<script src="${path}/jsp/web/about/js/about-index.js" type="text/javascript" charset="UTF-8"></script>
	</body>
</html>
