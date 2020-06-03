$(document).ready(function() {
	if (window.top != null && window.top.document.URL != document.URL) {
		window.top.location = document.URL;
	}
	// 立即登录
	$("#login").click(function() {
		login();
	})
});

function KeyDown(e) {
    e = window.event || e;
    var ke = e.keyCode || e.which;
    if (ke == 13) {
        login();
    }
}

function login(){
	var user_code = $("#user_code").val();
	var user_password = $("#user_password").val();
	if(user_code =="" || user_password ==""){
		alert("Account or password cannot be empty");
		return;
	}
	else{
		console.log(window.path +"/home/login")
		$.ajax({ 
		     type : "POST", //提交方式 
		     url : window.path +"/home/login",//路径 
		     data : { 
		    	 "user_code": user_code,
			     "user_password": user_password,
		     },//数据，这里使用的是Json格式进行传输 
		     dataType:"json",
		     success : function(result) {//返回数据根据结果进行相应的处理 
		    	 if (result.code == "0") { 
		    		window.location.href="/toPage?page=index"; 
			     }else{
			    	 alert("Wrong account or password");
			         document.getElementById("user_code").value="";
			         document.getElementById("user_password").value="";
			     }
		     },
		     error : function(XMLHttpRequest, textStatus, errorThrown){
		    	 layer.msg("System error");
		     } 
		}); 
	}
}