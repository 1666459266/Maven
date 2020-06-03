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
<title>Page</title>
<link rel="stylesheet" href="${path }/static/public/layui/css/layui.css">
<script src="${path}/static/public/jquery/jquery-3.3.1.min.js"
	type="text/javascript" charset="utf-8"></script>
</head>
<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin">
		<%@include file="public.jsp"%>
		<div class="layui-body">
			<!-- 内容主体区域 -->
			<div>
				<a class="layui-btn layui-btn-small"
					style="line-height: 1.6em; float: right"
					href="javascript:location.replace(location.href);" title="刷新">
					<i class="layui-icon layui-icon-refresh" style="line-height: 30px"></i>
				</a>
			</div>
			<a type="button" class="layui-btn" id="insert"
				style="margin-left: 30px; margin-top: 20px">Add</a>
			<div class="layui-body" style="margin-left: -10%">
				<table class="layui-hide" id="test" lay-filter="test"></table>
			</div>
		</div>
		<script type="text/html" id="buttom">
  			<a class="layui-btn layui-btn-warm layui-btn-xs" lay-event="edit"> <i class="layui-icon">&#xe642;</i>Edit </a>
  			<a class="layui-btn-danger layui-btn layui-btn-xs" lay-event="del"><i class="layui-icon">&#xe640;</i>Delete</a>
		</script>
	</div>
</body>
<script src="${path }/static/public/layui/layui.js"></script>
<script src="${path }/static/js/Page management/webpage.js"></script>
<script>
	//JavaScript代码区域
	layui.use('element', function() {
		var element = layui.element;
	});
	layui.use('form', function() {
		var form = layui.form;
	});
</script>
</html>