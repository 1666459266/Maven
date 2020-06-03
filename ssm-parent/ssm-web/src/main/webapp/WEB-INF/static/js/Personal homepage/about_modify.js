function init(data) {
	id = data.aboutId;
	$("#aboutId").val(data.aboutId);
	$("#aboutTitle").val(data.aboutTitle);
	$("#aboutText").val(data.aboutText);
	document.getElementById("about_title").value = data.aboutTitle;
	document.getElementById("about_text").value = data.aboutText;
}

function exit() {
	var index = parent.layer.getFrameIndex(window.name); // 先得到当前iframe层的索引
	parent.layer.close(index); // 再执行关闭
}

layui
		.use(
				[ 'form', 'table', 'layedit','laydate' ],
				function() {
					var form = layui.form;
					var laydate = layui.laydate;
					var layedit = layui.layedit;
					

					layui.use('element', function() {
						var element = layui.element;
					});
					
					var index1=layedit.build('about_text', {
						  height: 300
						  ,tool: [
							  'strong' //加粗
							  ,'italic' //斜体
							  ,'underline' //下划线
							  ,'del' //删除线
							  ,'left' //左对齐
							  ,'center' //居中对齐
							  ,'right' //右对齐
							  ,'link' //超链接
							  ,'unlink' //清除链接
							]
						});	
					
					// 提交功能
					form
							.on(
									'submit(submit)',
									function(data) {
										/* 获取$值存入params */
										var params = {};
										
										params.about_text = layedit.getText(index1);
										params.about_title = $("#about_title").val();
										
										layer
												.confirm(
														'Are you sure to submit?',
														{
															icon : 3,
															title : 'Tips'
														},
														function(index) {
															$
																	.ajax({
																		type : "POST",
																		url : '/about/modifyAbout?about_id='
																				+ id,

																		data : $
																				.param(params),
																		// 预期服务器返回数据的类型
																		dataType : "json",
																		success : function(
																				data) {
																			if (data) {
																				// console.log($.param(params));
																				if (data.code == 0) {
																					layer
																							.msg("Success");
																					setTimeout(
																							function() {
																								parent.window.location
																										.reload();
																							},
																							500);
																				} else if (data.code != 0) {
																					layer
																							.msg("Failed, data missing!");
																				}
																			}
																		},
																		error : function(
																				code1) {
																			alert("An error occurred. Please contact the administrator");
																		}
																	});
															layer.close(index);
														});

										return false; // 阻止表单跳转。如果需要表单跳转，去掉这段即可。
									});

				});