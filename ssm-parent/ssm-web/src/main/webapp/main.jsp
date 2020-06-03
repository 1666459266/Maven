<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/Common.jsp" %>
<%@include file="/WEB-INF/Taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
	$(document).ready(function() {
		toLogin();
	});
	
	function toLogin() {
		window.location.href=window.path +"/home/toLogin";
	}
	</script>
</body>
</html>