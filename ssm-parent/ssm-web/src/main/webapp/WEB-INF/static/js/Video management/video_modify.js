function init(data) {
	id = data.videoId;
	$("#videoTitle").val(data.videoTitle);
	$("#videoContent").val(data.videoContent);
	$("#videoTags").val(data.videoTags);
	document.getElementById("video_title").value = data.videoTitle;
	document.getElementById("video_content").value = data.videoContent;
	document.getElementById("video_tags").value = data.videoTags;
}

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

					layui.use('element', function() {
						var element = layui.element;

					});

					// 提交功能
					form
							.on(
									'submit(submit)',
									function(data) {
										/* 获取$值存入params */
										var params = {};
										params.id = $("#id").val();
										params.video_title = $(
												"#video_title").val();
										params.video_content = $(
												"#video_content").val();
										params.video_tags = $(
												"#video_tags").val();
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
																		url : '/video/modifyVideo?id='
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