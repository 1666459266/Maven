/*
 * @Author: your name
 * @Date: 2019-11-12 20:32:51
 * @LastEditTime: 2019-11-12 20:38:48
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \整合\about\js\index.js
 */

var xmlhttp1 = new XMLHttpRequest();
//xmlhttp是连接名，由前端创建的接口
xmlhttp1.onreadystatechange = function() {
	if (this.readyState == 4 && this.status == 200) {
		
	      var myObj = (this.responseText);
	      myObj = eval("("+myObj+")");
	
		document.getElementById("text").innerHTML = 'myobj.aboutDate';
		document.getElementById("text2").innerHTML ='myobj.aboutText';
var obj_1 = { //定义分页参数和方法
    obj_box: '.page_1', //翻页容器
    total_item: 200, //条目总数
    per_num: 15, //每页条目数
    current_page: 1, //当前页
    //此处,请为页面翻页展示内容定义方法
    change_content: function(per_num, current_page) {
        per_num = per_num ? per_num : 10; //每页显示条数,默认为10条
        current_page = current_page ? current_page : 1; //当前页,默认为1
        /*此处根据项目实际自行编写页面显示内容的方法,举例说明:*/
        var page_content = '<ul style="width: 700px;margin: 10px auto;">'; //当前页内容
        for (var i = 0; i < per_num; i++) {
            page_content += '<li >' +'myObj.data[i].text'+'</li>';
            page_content +='<li >'+'&nbsp&nbspmyObj.data[i].text2</li>';
			// myObj.data[i].text
        }
        page_content += '</ul>';
        $(this.obj_box).children('.page_content').html(page_content);
    }
     
};
    page_ctrl(obj_1); //调用分页插件
}
}

xmlhttp1.open("POST", "/separate/getaboutList", true);
//通过get请求将http://119.23.202.18:8088/ERRS/v/equipmentList?id=1&page=1&limit=10中的json文件加载到xmlhttp中	
xmlhttp1.send();