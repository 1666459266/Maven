/*
 * @Author: your name
 * @Date: 2019-11-08 14:19:04
 * @LastEditTime: 2019-11-15 20:49:45
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \整合\painting\album\js\img.js
 */
		var xmlhttp = new XMLHttpRequest();

xmlhttp.onreadystatechange = function() {
	if (this.readyState == 4 && this.status == 200) {
		//onreadystatechange是接受事件，会有readyState和status两个事件产生，readyState=4的意思是请求已完成，相应已就绪，status=200的意思是“ok”，即找到该页面
		var myObj = (this.responseText);
	      myObj = eval("("+myObj+")");
	      var j=myObj.count;
	      console.log(myObj);
	      
	      
	      
	      for(var i=0;i<j;i++){
	        var one=document.createElement("li");
	        var two=document.createElement("a");
	       var three=document.createElement("img");
	       var four=document.createElement("h3");
	      
	       document.getElementById('x').appendChild(one);
	       document.getElementsByTagName('ul')[0].getElementsByTagName('li')[i].appendChild(two);
	       document.getElementsByTagName('ul')[0].getElementsByTagName('a')[i].appendChild(three);
	       document.getElementsByTagName('ul')[0].getElementsByTagName('a')[i].appendChild(four);
	       
	       
	       
	       document.getElementsByTagName('ul')[0].getElementsByTagName('a')[i].target="blank"
	       document.getElementsByTagName('ul')[0].getElementsByTagName('a')[i].className="grid__link"
	       document.getElementsByTagName('img')[i].className="grid__img"
	       document.getElementsByTagName('h3')[i].className="ggrid__item-title"
	       document.getElementsByTagName('img')[i].alt="Some img"
	       document.getElementsByTagName('li')[i].className="grid__item"
	       document.getElementsByTagName('h3')[i].innerHTML=myObj.data[i].imageTags;
	       document.getElementsByTagName('img')[i].id=i ;
	       document.getElementsByTagName('img')[i].src="http://101.132.135.179:8080"+myObj.data[i].imageUrl;
	      }
	}
	
}
xmlhttp.open("POST", "/separate/getImageList", true);
// 通过get请求将http://119.23.202.18:8088/ERRS/v/equipmentList?id=1&page=1&limit=10中的json文件加载到xmlhttp中
xmlhttp.send();
