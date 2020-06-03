<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/Common.jsp"%>
<%@include file="/WEB-INF/Taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<title>Backstage Management System</title>
<link rel="stylesheet" href="${path }/static/public/layui/css/layui.css">
</head>
<body>
	<div class="layui-header">
		<div class="layui-logo">My Website</div>
		<!-- 头部区域（可配合layui已有的水平导航） -->
		<ul class="layui-nav layui-layout-right">
			<li class="layui-nav-item"><a id="main" href="javascript:;">homepage</a></li>
			<li class="layui-nav-item"><a onclick="logout()"
				href="javascript:;">Logout</a></li>
		</ul>
	</div>
	<div class="layui-side layui-bg-black">
		<div class="layui-side-scroll">
			<ul class="layui-nav layui-nav-tree" lay-filter="test">
				<li class="layui-nav-item"><a id="user"
					href="javascript:;">User MGT</a></li>
				<li class="layui-nav-item layui-bg-green"><a id="resource" href="javascript:;">Resource
						MGT</a></li>
				<li class="layui-nav-item "><a id="pictureCRUD"
					href="javascript:;">Picture MGT</a></li>
				<li class="layui-nav-item"><a id="videoCRUD"
					href="javascript:;">Video MGT</a></li>
				<li class="layui-nav-item"><a id="page"
					href="javascript:;">Page MGT</a></li>
				<li class="layui-nav-item"><a id="about"
					href="javascript:;">About MGT</a></li>
			</ul>
		</div>
	</div>
</body>
<script src="${path }/static/js/public.js"></script>
</html>