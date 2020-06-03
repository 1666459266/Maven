function exit() {
	var index = parent.layer.getFrameIndex(window.name); // 先得到当前iframe层的索引
	parent.layer.close(index); // 再执行关闭
}

layui
		.use(
				[ 'form', 'table', 'laydate' ],
				function() {
					var form = layui.form;
					var laydate = layui.laydate;

					// 提交功能
					form
							.on(
									'submit(submit)',
									function(data) {
										/* 获取$值存入params */
										var params = {};
										params.webpage_title = $(
												"#webpage_title").val();
										params.webpage_content = $(
												"#webpage_content").val();
										params.webpage_classify = $(
												"#webpage_classify").val();

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
																		url : '/webpage/insertWebpage',
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