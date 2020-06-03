<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/Taglib.jsp"%>
<%@include file="/WEB-INF/Common.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>Backstage Management System</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<!-- Bootstrap core CSS -->
<link href="${path }/static/public/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Custom styles for this template -->
<link href="${path }/static/public/css/signin.css" rel="stylesheet">
</head>
<body onkeydown="KeyDown(event);">
	<form class="form-signin">
		<img class="mb-4"
			src="${path }/static/public/images/bootstrap-solid.svg" alt=""
			width="300" height="72"><br>
		<h3 align="center">Backstage Management</h3>
		<br> <br> <label class="sr-only">Username</label> <input
			type="text" class="form-control" id="user_code"
			placeholder="Username" autocomplete="off" /><br> <br> <label
			class="sr-only">Password</label> <input type="password"
			class="form-control" id="user_password" value=""
			placeholder="Password" autocomplete="off" /><br> <br> <a
			class="btn btn-lg btn-primary btn-block" id="login">Sign in</a>
	</form>
</body>
<script src="${path}/static/js/login.js" type="text/javascript"
	charset="utf-8"></script>
<script>
	layui
			.use(
					[ 'form', 'layedit', 'laydate' ],
					function() {
						var form = layui.form, layer = layui.layer, layedit = layui.layedit, laydate = layui.laydate;

					});
</script>
</html>