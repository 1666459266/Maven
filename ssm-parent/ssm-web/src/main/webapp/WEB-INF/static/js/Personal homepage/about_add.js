/**
 * 新增页面的js
 */
// 关闭弹窗监听
function exit() {
	var index = parent.layer.getFrameIndex(window.name); // 先得到当前iframe层的索引
	parent.layer.close(index); // 再执行关闭
}

layui
		.use(
				[ 'form', 'table', 'layedit', 'laydate', 'laydate' ],
				function() {
					var form = layui.form;
					var laydate = layui.laydate;
					var layedit = layui.layedit;

					laydate.render({
						elem : '#about_date',
						trigger : 'click'
					});
					

					var index = layedit.build('about_text', {
						height : 300 ,// 设置编辑器高度
						tool : [ 'strong' // 加粗
						, 'italic' // 斜体
						, 'underline' // 下划线
						, 'del' // 删除线
						, 'left' // 左对齐
						, 'center' // 居中对齐
						, 'right' // 右对齐
						, 'link' // 超链接
						, 'unlink' // 清除链接
						]
					});
					form
							.on(
									'submit(submit)',
									function(data) {
										/* 获取$值存入params */
										var params = {};

										params.about_text = layedit.getText(index);
										params.about_date = $("#about_date").val();
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
																		url : '/about/insertAbout',
																		data : $
																				.param(params),
																		// 预期服务器返回数据的类型
																		dataType : "json",
																		success : function(
																				data) {
																			if (data) {
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
																							.msg("Failed, data may be incorrectly filled in or necessary data may be missing！");
																				}
																			}
																		},
																		error : function(
																				code) {
																			layer
																					.alert("An error occurred. Please contact the administrator");
																		}
																	});

															layer.close(index);
														});

										return false; // 阻止表单跳转。如果需要表单跳转，去掉这段即可。
									});

				});
