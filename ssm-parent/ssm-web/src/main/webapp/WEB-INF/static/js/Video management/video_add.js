layui.use('upload', function() {
	var $ = layui.jquery, upload = layui.upload;
	// 拖拽上传
	upload.render({
		elem : '#test1',
		url : '/upload/uploadVideo',
		accept : 'video' // 视频
		,
		before : function(obj) {
			// 预读本地文件示例，不支持ie8
			obj.preview(function(index, file, result) {
				$('#demo10').attr('src', result); // 图片链接（base64）
			});
		},
		done : function(res) {
			console.log(res)
			if (res.code > 0) {
				return layer.msg('Upload Fail');
			} else {
				setTimeout("layer.msg('Upload Successful')", 500);
				setTimeout("window.parent.location.reload();", 2000);
				layer.close(layer.index)
			}
		}
	});
});