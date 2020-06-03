/**
 * 修改页面的js
 */
// 初始化赋值
function init(data) {
	id = data.userId;
	$("#userName").val(data.userName);
	document.getElementById("user_name").value = data.userName;
	$("#userCode").val(data.userCode);
	document.getElementById("user_code").value = data.userCode;
	$("#userPassword").val(data.userPassword);
	document.getElementById("user_password").value = data.userPassword;
	$("#userGender").val(data.userGender);
	$("#userEmail").val(data.userEmail);
	document.getElementById("user_email").value = data.userEmail;
	$("#userTelephone").val(data.userTelephone);
	document.getElementById("user_telephone").value = data.userTelephone;
}

// 关闭监听
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
										params.user_name = $("#user_name")
												.val();
										params.user_code = $("#user_code")
												.val();
										params.user_password = $(
												"#user_password").val();
										params.user_gender = $(
												"input[name='user_gender']:checked")
												.val();
										params.user_email = $("#user_email")
												.val();
										params.user_telephone = $(
												"#user_telephone").val();
										console.log(params);
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
																		url : '/user/modifyUser?id='
																				+ id,
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
																							.msg("Failed. The data may be filled in incorrectly or the necessary data is missing!");
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