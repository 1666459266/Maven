<!--
 * @Author: your name
 * @Date: 2019-11-13 17:45:52
 * @LastEditTime: 2019-11-14 21:03:03
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \æ´å\activity\attachedpage.html
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/Common.jsp"%>
<%@include file="/WEB-INF/Taglib.jsp"%>
<!DOCTYPE html>
<html lang="en" class="no-js">
	<head>
		<meta charset="UTF-8" />
		<title>Art Activity</title>
		<link rel="stylesheet" type="text/css" href="${path}/static/web/css/demo.css" />
		<link rel="stylesheet" type="text/css" href="${path}/static/web/css/component.css" />

		<link rel="stylesheet" type="text/css" href="${path}/static/web/css/amazeui.min.css" />
		<link rel="stylesheet" type="text/css" href="${path}/static/web/css/amazeui.css" />
	</head>
	<body>
		<div class="allframe">
			<div class="container">
				<div class="codrops-top clearfix">
					<a  id="homepage"><span><--Back</span></a>
				</div>

				<div class="am-g">
					<div class="col-sm-4 col-lg-4 ">&nbsp;
					</div>
					<div class="col-sm-4 col-lg-4 " style="text-align: center;">
						<a >HomePage&nbsp;&nbsp;&nbsp;&nbsp;</a>
						<a >Content</a>
					</div>
					<div class="col-sm-4 col-lg-4 ">
					</div>
				</div>

				<div class="am-g">
					<div class="col-sm-12 col-lg-6 " style="margin: auto;">
						<img class="framefirst" id="picture"></img>
					</div>
					<div class="col-sm-0 col-lg-6 " style="margin: auto;">
						<div class="framesecond">
							<a class="first" id="text"></a>
							<p id="text2"></p>
						</div>
					</div>
				</div>
				<!-- <p class="am-article-meta">author:David</p> -->
			</div>
		</div>
		<script src="${path}/static/web/js/amazeui.js" type="text/javascript" charset="utf-8"></script>
		<script src="${path}/static/web/js/amazeui.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="${path}/static/web/js/activity_index.js" type="text/javascript" charset="utf-8"></script>
		<script src="${path}/static/web/js/jquery-3.3.1.min.js"></script>
		<script src="${path}/static/web/js/skip.js"></script>
		<script>
		$("#homepage").click(function() {
			window.location.href = "/toWeb?page=web/activity/homepage";
		});
		</script>
	</body>
</html>
