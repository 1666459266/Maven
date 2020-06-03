<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/Common.jsp"%>
<%@include file="/WEB-INF/Taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title>Resource</title>
<link rel="stylesheet" href="${path}/static/public/layui/css/layui.css">
<script src="${path}/static/public/jquery/jquery-3.3.1.min.js"
	type="text/javascript" charset="utf-8"></script>
</head>
<body>
	<div class="layui-upload">
		<button type="button" class="layui-btn" id="test1"
			style="margin-left: 15px; margin-top: 20px">Upload</button>
		<div class="layui-upload-list">
			<blockquote class="layui-elem-quote layui-quote-nm" style="margin-top: 10px;">
				<img class="layui-upload-img" id="demo1" width="100%" height="85%">
				<p id="demoText"></p>
			</blockquote>
		</div>
	</div>
</body>
<script src="${path }/static/public/layui/layui.js"></script>
<script type="text/javascript"
	src="${path}/static/js/Resource management/resource_add.js"></script>
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