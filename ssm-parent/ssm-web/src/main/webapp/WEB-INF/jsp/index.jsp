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
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<title>Backstage Management System</title>
<link rel="stylesheet" href="${path }/static/public/layui/css/layui.css">
</head>
<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin">

		<%@include file="public.jsp"%>

		<div class="layui-body">
			<!-- 内容主体区域 -->
			<div style="padding: 15px;text-align:center;font-size: 65px;text-shadow: 70px -15px 8px grey;position:relative;top: 30%;left:0%;font-family: monospace;" >Welcome to the admin interface</div>
		</div>

	</div>
</body>
<script src="${path }/static/public/layui/layui.js"></script>
<script>
	//JavaScript代码区域
	layui.use('element', function() {
		var element = layui.element;
	});
</script>
</html>