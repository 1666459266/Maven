
layui.use('upload', function(){
  var $ = layui.jquery
  ,upload = layui.upload;
  //普通图片上传
  var uploadInst = upload.render({
    elem: '#test1'
    ,url: '/upload/uploadResources'
    ,before: function(obj){
      //预读本地文件示例，不支持ie8
      obj.preview(function(index, file, result){
        $('#demo1').attr('src', result); //图片链接（base64）
      });
    }
    ,done: function(res){
      //如果上传失败
    	if(res.code > 0){
	          return layer.msg('Upload Fail');
	        }else{
	        	setTimeout("layer.msg('Upload sucess')",500);
	        	setTimeout("window.parent.location.reload();",2000);
                layer.close(layer.index)
	        }
    }
    ,error: function(){
      //演示失败状态，并实现重传
      var demoText = $('#demoText');
      demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
      demoText.find('.demo-reload').on('click', function(){
        uploadInst.upload();
      });
    }
  });
});