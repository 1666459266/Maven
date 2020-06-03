function logout() {
	$.ajax({
		type : "POST", // 提交方式
		url : window.path + "/home/logout",// 路径
		data : {},// 数据，这里使用的是Json格式进行传输
		dataType : "json",
		success : function(result) {// 返回数据根据结果进行相应的处理
			if (result.code == "0") {
				window.location.href = "/toWeb?page=web/Personal website/home";
			} else {
				layer.msg(result.msg);
			}
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			layer.msg("系统错误");
		}
	});
}

$("#main").click(function() {
	window.location.href = "/toPage?page=web/Personal website/home";
});

$("#user").click(function() {
	window.location.href = "/toPage?page=User management/user";
});

$("#resource").click(function() {
	window.location.href = "/toPage?page=Resource management/resource";
});

$("#pictureCRUD").click(function() {
	window.location.href = "/toPage?page=Picture management/pictureCRUD";
});

$("#videoCRUD").click(function() {
	window.location.href = "/toPage?page=Video management/videoCRUD";
});

$("#page").click(function() {
	window.location.href = "/toPage?page=Page management/webpage";
});

$("#about").click(function() {
	window.location.href = "/toPage?page=Personal homepage/about";
});