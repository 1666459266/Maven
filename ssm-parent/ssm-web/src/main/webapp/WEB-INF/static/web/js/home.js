document.getElementById('lubo').getElementsByTagName('li')[0].style = 'opacity: 1;filter:alpha(opacity=100);';
document.getElementById('avatar-picture').style = 'background-size:100% 100%;';
//document.getElementById('pic1').style = 'background-size:100% 100%;';
//document.getElementById('pic2').style = 'background-size:100% 100%;';
document.getElementById('avatar-picture').style = 'background-size:100% 100%;';
for (var i = 0; i < document.getElementById('lubo').getElementsByTagName('a').length; i++) {
	document.getElementById('lubo').getElementsByTagName('a')[i].style =
		'background:center top no-repeat;background-size:100% 100%;';
}

// 背景图片 焦点图
var xmlhttp1 = new XMLHttpRequest();
//xmlhttp是连接名，由前端创建的接口
xmlhttp1.onreadystatechange = function() {
	if (this.readyState == 4 && this.status == 200) {
		//onreadystatechange是接受事件，会有readyState和status两个事件产生，readyState=4的意思是请求已完成，相应已就绪，status=200的意思是“ok”，即找到该页面
		var myObj = (this.responseText);
		//json.parse的作用是将json转义成js可解析的文件
		myObj = eval("(" + myObj + ")");
	
		// 轮播图图片
		for(var j=0;document.getElementById('lubo').getElementsByTagName('img').length;j++){
			document.getElementById('lubo').getElementsByTagName('img')[j].src="http://101.132.135.179:8080"+myObj.data[j].backgroundUrl;
		}

	}
};
xmlhttp1.open("POST", "/separate/getResourcesList", true);
//通过get请求将http://119.23.202.18:8088/ERRS/v/equipmentList?id=1&page=1&limit=10中的json文件加载到xmlhttp中
xmlhttp1.send();


// 文字对接
var xmlhttp2 = new XMLHttpRequest();
//xmlhttp是连接名，由前端创建的接口
xmlhttp2.onreadystatechange = function() {
	if (this.readyState == 4 && this.status == 200) {
		//onreadystatechange是接受事件，会有readyState和status两个事件产生，readyState=4的意思是请求已完成，相应已就绪，status=200的意思是“ok”，即找到该页面
		var myObj = (this.responseText);
		//json.parse的作用是将json转义成js可解析的文件
		myObj = eval("(" + myObj + ")");
		console.log(myObj);
		// 优秀作品标题一
		document.getElementById('excellent').getElementsByTagName('h3')[0].innerHTML = myObj.data[1].imageTitle;
		// 优秀作品内容一
		document.getElementById('excellent').getElementsByTagName('p')[0].innerHTML = myObj.data[1].imageContent;
		// 优秀作品图片一
		document.getElementById('pic1').getElementsByTagName('img')[0].src="http://101.132.135.179:8080"+myObj.data[1].imageUrl;

		// 优秀作品二
		// 优秀作品标题二
		document.getElementById('excellent').getElementsByTagName('h3')[1].innerHTML = myObj.data[2].imageTitle;
		// 优秀作品内容二
		document.getElementById('excellent').getElementsByTagName('p')[1].innerHTML = myObj.data[2].imageContent;
		// 优秀作品图片二
		document.getElementById('pic2').getElementsByTagName('img')[0].src="http://101.132.135.179:8080"+myObj.data[2].imageUrl;

		// about me的人名和简介
		document.getElementById('word1').innerHTML = myObj.data[0].imageTitle;
		document.getElementById('text1').innerHTML = myObj.data[0].imageContent;
		// about me 图片
		document.getElementById('avatar-picture').getElementsByTagName('img')[0].src="http://101.132.135.179:8080"+myObj.data[0].imageUrl;

	}
};
xmlhttp2.open("POST", "/separate/getImageList", true);
//通过get请求将http://119.23.202.18:8088/ERRS/v/equipmentList?id=1&page=1&limit=10中的json文件加载到xmlhttp中
xmlhttp2.send();
