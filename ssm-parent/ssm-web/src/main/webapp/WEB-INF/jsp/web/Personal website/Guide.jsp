<!--
 * @Author: your name
 * @Date: 2019-11-14 20:57:15
 * @LastEditTime: 2019-11-14 21:00:33
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \web\Personal website\Guide.html
 -->
 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/Common.jsp"%>
<%@include file="/WEB-INF/Taglib.jsp"%>
<!DOCTYPE html>
<html lang="en" class="no-js">
	<head>
		<meta charset="UTF-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Guide page</title>
		<meta name="description" content="Animated WebGL lines created with the THREE.MeshLine library" />
		<meta name="keywords" content="webgl, three.js, meshline, animation, lines" />
		<meta name="author" content="Codrops" />
		<!-- åºç¡åºnormalize -->
		<link href="https://cdn.bootcss.com/normalize/8.0.1/normalize.min.css" rel="stylesheet">
		<link href="${path}/static/web/css/G_vendors.css" rel="stylesheet">
		<link href="${path}/static/web/css/Guide.css" rel="stylesheet">
		<script>
			document.documentElement.className = "js";
			var supportsCssVars = function() {
				var e, t = document.createElement("style");
				return t.innerHTML = "root: { --tmp-var: bold; }", document.head.appendChild(t), e = !!(window.CSS && window.CSS.supports &&
					window.CSS.supports("font-weight", "var(--tmp-var)")), t.parentNode.removeChild(t), e
			};
			supportsCssVars() || alert("Please view this demo in a modern browser that supports CSS Variables.");
		</script>
	</head>
	<body>
		<div class="overlay"></div>
		<main>
			<div class="frame">
				<div class="frame__title-wrap">
					<h1 class="frame__title" style="color: black;">David</h1>
				</div>
				<!-- <a class="frame__github" href="https://github.com/Jeremboo/animated-mesh-lines">GitHub</a> -->
				<div class="frame__links">
					<a href="#" style="color: black;">EN/CN</a>
					<!-- <a href="https://tympanus.net/codrops/?p=37034">Article</a> -->
				</div>
				<div class="frame__demos">
					<!-- <a href="index.html" class="frame__demo">demo 1</a>
					<a href="demo2.html" class="frame__demo">demo 2</a>
					<a href="demo3.html" class="frame__demo frame__demo--current">demo 3</a>
					<a href="demo4.html" class="frame__demo">demo 4</a>
					<a href="demo5.html" class="frame__demo">demo 5</a> -->
					<a href="javascript:;" id="start"class="start" style="font-size: 100px;color: black;">Start→</a>
				</div>
			</div>
		</main>
		<script  src="${path}/static/web/js/G_vendors.js"></script>
		<script  src="${path}/static/web/js/Guide.js"></script>
		<script  src="${path}/static/web/js/jquery.min.js"></script>
	</body>
	<script >$("#start").click(function() {
		window.location.href = "/toWeb?page=web/Personal website/home";
	});</script>
</html>
