<!--
 * @Description: In User Settings Edit
 * @Author: your name
 * @Date: 2019-10-14 16:33:49
 * @LastEditTime: 2019-11-14 13:56:47
 * @LastEditors: Please set LastEditors
 -->
  <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/Common.jsp"%>
<%@include file="/WEB-INF/Taglib.jsp"%>
<!doctype html>
<html lang="zh" class="no-js">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>paint</title>
<link rel="stylesheet" type="text/css" href="${path}/static/web/css/normalize.css" />
<link rel="stylesheet" type="text/css" href="${path}/static/web/css/square-loader.min.css" />
<link rel="stylesheet" type="text/css" href="${path}/static/web/css/default.css">
<link rel="stylesheet" type="text/css" href="${path}/static/web/css/component.css" />
</head>
<body>


<div class="view">

	<header class="header">
		
		<nav class="demos">

		</nav>
		<nav class="demos">
			<a class="demos__item1 " id="y1">Home</a>
			<a class="demos__item1 " id="y2">Painting</a>
			<a class="demos__item1" id="y3">Videos</a>
			<a class="demos__item1 " id="y4">About</a>
			<a class="demos__item1 " id="y5">Activity</a>
			<a class="demos__item1 " id="y6">Contact</a>
		</nav>
	</header>
	<section class="page page--mover">
		<div class="la-square-loader"><div>
	</section>
	<div style="width: 100%;height: 20px;"></div>
	<div class="title-wrap">
		<h1 class="title title--main">OH<em>!</em>SNAP</h1>
		<p class="title title--sub">Smart Auto-Filtering for your shots.</p>
	</div>
	<section class="page page--static">
	
		<div class="page__title">
			<h2 class="page__title-main">tittle</h2>
			<p class="page__title-sub">Recreating the effect seen on the  takeit  website</p>
		</div>
		<ul class="grid" id="x">
			
		</ul>
	
	</section>
	<div class="device">
		<div class="device__screen"></div>
	</div>
	<button id="showgrid" class="button button--view" aria-label="Show me more">
		<svg width="100%" height="100%" viewBox="0 0 310 177" preserveAspectRatio="xMidYMid meet">
			<path fill="#FFFFFF" d="M159.875,174.481L306.945,27.41c2.93-2.929,2.93-7.678,0-10.606L292.803,2.661c-1.406-1.407-3.314-2.197-5.303-2.197c-1.989,0-3.896,0.79-5.303,2.197L154.572,130.287L26.946,2.661c-1.406-1.407-3.314-2.197-5.303-2.197c-1.989,0-3.897,0.79-5.303,2.197L2.197,16.804C0.733,18.269,0,20.188,0,22.107s0.732,3.839,2.197,5.303l147.071,147.071C152.197,177.411,156.945,177.411,159.875,174.481L159.875,174.481z" />
		</svg>
	</button>
	
</div>

<script src="${path}/static/web/js/classie.js"></script>
<!-- å¾ç -->
<script src="${path}/static/web/js/dynamics.min.js"></script>
<script src="${path}/static/web/js/imagesloaded.pkgd.min.js"></script>
<script src="${path}/static/web/js/img.js"></script>
<script src="${path}/static/web/js/main.js"></script>
<script src="${path}/static/web/js/jquery-3.3.1.min.js"></script>
<script src="${path}/static/web/js/skip.js"></script>
<script>
	document.documentElement.className = 'js';
</script>	
</body>
</html>