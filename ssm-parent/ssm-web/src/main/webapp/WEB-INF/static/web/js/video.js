var xmlhttp = new XMLHttpRequest();
// xmlhttp是连接名，由前端创建的接口
xmlhttp.onreadystatechange = function() {
	if (this.readyState == 4 && this.status == 200) {
		//onreadystatechange是接受事件，会有readyState和status两个事件产生，readyState=4的意思是请求已完成，相应已就绪，status=200的意思是“ok”，即找到该页面
		var myObj = (this.responseText);
	      myObj = eval("("+myObj+")");
		//json.parse的作用是将json转义成js可解析的文件
		document.getElementById("videotitle").innerHTML = myObj.videoTitle;
		document.getElementById("videocontent").innerHTML = myObj.videoContent;
		document.getElementById("videourl").src = myObj.videoUrl;
		//将myobj.msg的内容加载到id号为demo的html中
	}
};
xmlhttp.open("POST", "/separate/getVideoList", true);
// 通过get请求将http://119.23.202.18:8088/ERRS/v/equipmentList?id=1&page=1&limit=10中的json文件加载到xmlhttp中
xmlhttp.send();
