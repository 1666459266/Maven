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
<link rel="stylesheet" href="${path }/static/public/layui/css/layui.css">
<script src="${path}/static/public/jquery/jquery-3.3.1.min.js"
	type="text/javascript" charset="utf-8"></script>
</head>
<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin">
		<%@include file="public.jsp"%>
		<div class="layui-body">
			<!-- 内容主体区域 -->
			<!-- 刷新 -->
			<div>
				<a class="layui-btn layui-btn-small"
					style="line-height: 1.6em; float: right"
					href="javascript:location.replace(location.href);" title="刷新">
					<i class="layui-icon layui-icon-refresh" style="line-height: 30px"></i>
				</a>
			</div>
			<!-- 添加 -->
			<div class="layui-upload">
				<a type="button" class="layui-btn" id="insert"
					style="margin-left: 30px; margin-top: 20px">Add</a>
			</div>
			<!-- 查找页面 -->
			<div class="layui-body" style="margin-left: -170px">
				<div class="layui-col-md12 layui-content-white">
					<table class="layui-hide" id="test" lay-filter="test"></table>
				</div>
				<script type="text/html" id="barDemo">
  					<a class="layui-btn-danger layui-btn layui-btn-xs" lay-event="dels"><i class="layui-icon">&#xe640;</i>Delete</a>
				</script>
			</div>
			<!-- 内容主体区域 -->
			
			
			
		</div>
	</div>
</body>
<script src="${path }/static/public/layui/layui.js"></script>
<script type="text/javascript"
	src="${path}/static/js/Resource management/resource.js"></script>
<script>
	//JavaScript代码区域
	layui.use('element', function() {
		var element = layui.element;
	});
	layui.use('form', function() {
		var form = layui.form;
	});
</script>
<!-- <script type="text/javascript" id="backgroundUrltmp">
	<img src="{{d.backgroundUrl}}">
</script>  -->
<script type="text/html" id="backgroundUrltmp">
<div onclick="show_img(this)" ><img src="{{ d.backgroundUrl }}" alt="" width="72" height="50"></a></div>
</script>
<!--layui.table图片显示不全，需重新定义CSS  -->
<style type="text/css"> 
.layui-table-cell{
	height:auto!important;
	white-space:normal;
}
 
</style> 
<script type="text/javascript">
  
 $(function(){ 
    $(".pic").click(function(){ 
      var _this = $(this);//将当前的pimg元素作为_this传入函数 
      imgShow("#outerdiv", "#innerdiv", "#bigimg", _this); 
    }); 
  }); 
  function imgShow(outerdiv, innerdiv, bigimg, _this){ 
    var src = _this.attr("src");//获取当前点击的pimg元素中的src属性 
    $(bigimg).attr("src", src);//设置#bigimg元素的src属性 
      /*获取当前点击图片的真实大小，并显示弹出层及大图*/
    $("<img/>").attr("src", src).load(function(){ 
      var windowW = $(window).width();//获取当前窗口宽度 
      var windowH = $(window).height();//获取当前窗口高度 
      var realWidth = this.width;//获取图片真实宽度 
      var realHeight = this.height;//获取图片真实高度 
      var imgWidth, imgHeight; 
      var scale = 0.8;//缩放尺寸，当图片真实宽度和高度大于窗口宽度和高度时进行缩放 
      if(realHeight>windowH*scale) {//判断图片高度 
        imgHeight = windowH*scale;//如大于窗口高度，图片高度进行缩放 
        imgWidth = imgHeight/realHeight*realWidth;//等比例缩放宽度 
        if(imgWidth>windowW*scale) {//如宽度扔大于窗口宽度 
          imgWidth = windowW*scale;//再对宽度进行缩放 
        } 
      } else if(realWidth>windowW*scale) {//如图片高度合适，判断图片宽度 
        imgWidth = windowW*scale;//如大于窗口宽度，图片宽度进行缩放 
              imgHeight = imgWidth/realWidth*realHeight;//等比例缩放高度 
      } else {//如果图片真实高度和宽度都符合要求，高宽不变 
        imgWidth = realWidth; 
        imgHeight = realHeight; 
      } 
          $(bigimg).css("width",imgWidth);//以最终的宽度对图片缩放 
      var w = (windowW-imgWidth)/2;//计算图片与窗口左边距 
      var h = (windowH-imgHeight)/2;//计算图片与窗口上边距 
      $(innerdiv).css({"top":h, "left":w});//设置#innerdiv的top和left属性 
      $(outerdiv).fadeIn("fast");//淡入显示#outerdiv及.pimg 
    }); 
    $(outerdiv).click(function(){//再次点击淡出消失弹出层 
      $(this).fadeOut("fast"); 
    }); 
  }
  
</script>
</html>