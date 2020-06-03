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
<title>User</title>
<link rel="stylesheet" href="${path }/static/public/layui/css/layui.css">
<script src="${path}/static/public/jquery/jquery-3.3.1.min.js"
	type="text/javascript" charset="utf-8"></script>
</head>
<body>
	<form class="layui-form">
		<div class="layui-col-md4" style="margin-left: 35%; margin-top: 2%">
			<div class="layui-form-item">
				<label class="layui-form-label">Name</label>
				<div class="layui-input-inline">
					<input type="text" id="user_name" name="user_name" required lay-verify="required"
						placeholder="Please enter a name" autocomplete="off"
						class="layui-input">
				</div>
			</div>
		</div>
		<div class="layui-col-md4" style="margin-left: 35%; margin-top: 2%">
			<div class="layui-form-item">
				<label class="layui-form-label">Account</label>
				<div class="layui-input-inline">
					<input type="text" id="user_code" name="user_code" required lay-verify="required"
						placeholder="Please enter your account" autocomplete="off"
						class="layui-input">
				</div>
			</div>
		</div>
		<div class="layui-col-md4" style="margin-left: 35%; margin-top: 2%">
			<div class="layui-form-item">
				<label class="layui-form-label">Password</label>
				<div class="layui-input-inline">
					<input type="text" id="user_password" name="user_password" required lay-verify="required"
						placeholder="Please enter a password" autocomplete="off"
						class="layui-input">
				</div>
			</div>
		</div>
		<div class="layui-col-md4" style="margin-left: 35%; margin-top: 2%">
			<div class="layui-form-item">
				<label class="layui-form-label">Gender</label>
				<div class="layui-input-block" id="user_gender">
					<input type="radio" name="user_gender" value="man" title="man" checked>
					<input type="radio" name="user_gender" value="woman" title="woman">
				</div>
			</div>
		</div>
		<div class="layui-col-md4" style="margin-left: 35%; margin-top: 2%">
			<div class="layui-form-item">
				<label class="layui-form-label">E-mail</label>
				<div class="layui-input-inline">
					<input type="text" id="user_email" name="user_email" required lay-verify="required"
						placeholder="Please enter E-mail" autocomplete="off"
						class="layui-input">
				</div>
			</div>
		</div>
		<div class="layui-col-md4" style="margin-left: 35%; margin-top: 2%">
			<div class="layui-form-item">
				<label class="layui-form-label">Telephone</label>
				<div class="layui-input-inline">
					<input type="text" id="user_telephone" name="user_telephone" required lay-verify="required"
						placeholder="Please enter phone number" autocomplete="off"
						class="layui-input">
				</div>
			</div>
		</div>
		<div class="layui-col-md4" style="margin-left: 35%; margin-top: 2%;">
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
	src="${path}/static/js/User management/user_add.js"></script>
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