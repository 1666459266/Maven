/**
 * 分页主要参数和调用方法 var obj={ obj_box:'.class/#id...', //翻页容器(css选择器均可)
 * total_item:'自然数,必填', //条目总数 per_num:'自然数,选填,默认10', //每页条目数
 * current_page:'自然数,选填,默认1', //当前页
 * change_content:function(per_num,current_page){ //内容加载方法,可参考示例 } };
 * page_ctrl(obj);//调用分页插件
 */
// 示例:

var xmlhttp1 = new XMLHttpRequest();
// xmlhttp是连接名，由前端创建的接口
xmlhttp1.onreadystatechange = function() {
	if (this.readyState == 4 && this.status == 200) {
		// onreadystatechange是接受事件，会有readyState和status两个事件产生，readyState=4的意思是请求已完成，相应已就绪，status=200的意思是“ok”，即找到该页面
		var myObj = (this.responseText);
		myObj = eval("(" + myObj + ")");
		// json.parse的作用是将json转义成js可解析的文件
		// document.getElementById("demo").innerHTML = myObj.msg;
		// 将myobj.msg的内容加载到id号为demo的html中

		// 图片
		document.getElementById("picture").src = "http://101.132.135.179:8080"
				+ myObj.data[0].imageUrl;
		document.getElementById("text").innerHTML = myObj.data[0].imageTitle;
		
		document.getElementById("text2").innerHTML = myObj.data[0].imageContent;

	}
};
xmlhttp1.open("POST", "/separate/getImageList", true);
// 通过get请求将http://119.23.202.18:8088/ERRS/v/equipmentList?id=1&page=1&limit=10中的json文件加载到xmlhttp中
xmlhttp1.send();

var xmlhttp2 = new XMLHttpRequest();
// xmlhttp是连接名，由前端创建的接口
xmlhttp2.onreadystatechange = function() {
	if (this.readyState == 4 && this.status == 200) {
		// onreadystatechange是接受事件，会有readyState和status两个事件产生，readyState=4的意思是请求已完成，相应已就绪，status=200的意思是“ok”，即找到该页面
		var myObj = (this.responseText);
		myObj = eval("(" + myObj + ")");
		// json.parse的作用是将json转义成js可解析的文件
		// document.getElementById("demo").innerHTML = myObj.msg;
		// 将myobj.msg的内容加载到id号为demo的html中
		// 分页
		var obj_1 = { // 定义分页参数和方法
			obj_box : '.page_1', // 翻页容器
			total_item : myObj.count, // 条目总数
			per_num : 10, // 每页条目数
			current_page : 1, // 当前页
			// 此处,请为页面翻页展示内容定义方法
			change_content : function(per_num, current_page) {
				per_num = per_num ? per_num : 10; // 每页显示条数,默认为10条
				current_page = current_page ? current_page : 1; // 当前页,默认为1
				/* 此处根据项目实际自行编写页面显示内容的方法,举例说明: */
				var f=current_page - 1;
				
				var page_content = '<ul style="width: 450px;margin: 10px auto;font-size:25px;">'; // 当前页内容
				for (var i = 0; i < per_num; i++) {
					var x=(current_page - 1) * per_num + i + 1
					if(x>myObj.count)
					{
						page_content += '<a href="attachedpage.html" >'+ '</br>';
					
					}
					else{
						page_content += '<a href="attachedpage.html" >'
							+ (x)+'.'
							+ myObj.data[x-1].webpageTitle+'</br>';
						}
					
					
				}
				page_content += '</ul>';
				console.log(myObj);
				$(this.obj_box).children('.page_content').html(page_content);
			}
		
		};
		
		page_ctrl(obj_1); // 调用分页插件
	
			
		
	}
};
xmlhttp2.open("POST", "/separate/getWebpageList", true);
// 通过get请求将http://119.23.202.18:8088/ERRS/v/equipmentList?id=1&page=1&limit=10中的json文件加载到xmlhttp中
xmlhttp2.send();
