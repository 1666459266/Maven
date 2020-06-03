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
<title>添加页面</title>
<link rel="stylesheet" href="${path}/static/public/layui/css/layui.css">
<script src="${path}/static/public/jquery/jquery-3.3.1.min.js"
	type="text/javascript" charset="utf-8"></script>
</head>
<body>
	<form class="layui-form">
		<div class="layui-col-md12" style="margin-top: 2%">
			<div class="layui-form-item">
				<label class="layui-form-label">Title</label>
				<div class="layui-input-inline" style="width: 20.5%">
					<input type="text" id="about_title" required lay-verify="required"
						placeholder="Please enter a title" autocomplete="off"
						class="layui-input">
				</div>
			</div>
		</div>
		<div class="layui-col-md12" style="margin-top: 2%">
			<div class="layui-form-item">
				<label class="layui-form-label">Date</label>
				<div class="layui-input-inline" style="width: 20.5%">
					<input type="text" id="about_date" required lay-verify="required"
						class="layui-input test-item" placeholder="Please select a date"
						autocomplete="off" class="layui-input">
				</div>
			</div>
		</div>
		<div class="layui-col-md12" style="margin-top: 2%">
			<div class="layui-form-item">
				<label class="layui-form-label">Text</label>
				<div class="layui-input-inline" style="width: 75%">
					<textarea id="about_text" class="layui-input test-item"></textarea>
				</div>
			</div>
		</div>
		<div style="margin-left: 30%">
			<div class="layui-form-item">
				<div class="layui-input-block">
					<button class="layui-btn" lay-submit lay-filter="submit">Submit</button>
					<button type="reset" class="layui-btn layui-btn-danger">Reset</button>
				</div>
			</div>
		</div>
	</form>
</body>
<script src="${path }/static/public/layui/layui.js"></script>
<script type="text/javascript"
	src="${path}/static/js/Personal homepage/about_add.js"></script>
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