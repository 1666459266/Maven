<!--
 * @Description: In User Settings Edit
 * @Author: your name
 * @Date: 2019-10-15 13:12:26
 * @LastEditTime: 2019-11-15 10:02:15
 * @LastEditors: Please set LastEditors
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/Common.jsp"%>
<%@include file="/WEB-INF/Taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="divport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Contact</title>
	<link rel="stylesheet" href="${path}/static/web/css/amazeui.min.css"/>
	<link rel="stylesheet" type="text/css" href="http://www.fontawesome.com.cn/wp-content/themes/deeptimes/fonts/font-awesome/css/font-awesome.min.css"/>
	<link rel="stylesheet" href="${path}/static/web/css/contact-home.css">
	<link rel="stylesheet" href="${path}/static/web/css/contact.css">
	<link rel="stylesheet" href="${path}/static/web/css/nav.css">
	<link rel="stylesheet" href="${path}/static/web/css/footer.css">
</head>
<body >
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
	<div class="a" style="width: 100%;height: 100px;"></div>
<!--é¡µé¢åå®¹-->

	<!-- å¯¼èªæ ä¸çå¾ç  -->
	<div class="content">
		<img src="${path}/static/web/image/timg.jpg">
	</div>
 <div class='main'>
	<div class='body'>
		<!-- è½¯ä»¶å¾æ  -->
		<div class="am-g">
			<div  class="links">
					<a href="#"><i class="fa fa-facebook-square" aria-hidden="true"></i></a>
					<a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a>
					<a href="#"><i class="fa fa-pinterest" aria-hidden="true"></i></a>
					<a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a>
			</div>
		</div>
		<hr>	
			<!-- èç³»è¯¦æ -->
				<div class="am-g">
					<ul class="col-sm-5 col-lg-5 logo">
						<li><i class="fa fa-phone fa-5" aria-hidden="true"></i></li>
						<li><i class="fa fa-envelope-o fa-5" aria-hidden="true"></i></li>
						<li><i class="fa fa-map-marker fa-5" id="add" aria-hidden="true"></i></li>
					</ul>
					<div>
						<ul class="col-sm-6 col-lg-6 text">
							<li><h3>Call Me</h3>
							<p id="Phone">135******84</p></li>
							<li><h3>Drop a Line</h3>
							<p id="Email">23467899@163.com</p></li>
							<li><h3>Address</h3>
							<p id="Address">4 Chome - 12 Numa, Yao-shi, Åsaka-fu 581-0036 Japan.</p></li>
						</ul>
					</div>
				</div>
			</div>
	</div>
</div>
<!--é¡µé¢åå®¹-->
  

  <!--åºé¨æ -->
  <footer class="footer">
	<p>Copyright&nbsp;&nbsp;Â©2019&nbsp;&nbsp;by&nbsp;&nbsp;David</p>
</footer>
  
<!--åºé¨æ -->

<script src="${path}/static/web/js/jquery-3.3.1.min.js"></script>
<script src="${path}/static/web/js/skip.js"></script>
</body>
</html>
