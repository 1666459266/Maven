//表格
layui.use('element', function() {
	var element = layui.element;
});

layui
		.use(
				[ 'form', 'table', 'laydate', 'laytpl' ],
				function() {
					var form = layui.form;
					var table = layui.table;
					var laytpl = layui.laytpl;

					// 时间控件
					var laydate = layui.laydate;
					laydate.render({
						elem : '#date',
					});
					var tableIns = table.render({
						elem : '#test',
						url : '/separate/getUserList',
						page : true // 开启分页
						,
						cols : [ [ {
							field : 'userId',
							width : '12%',
							title : 'ID',
							minWidth : 100,
							align : 'center'
						}, {
							field : 'userName',
							width : '12%',
							title : 'Name',
							minWidth : 100,
							align : 'center'
						}, {
							field : 'userCode',
							width : '12%',
							title : 'Account',
							minWidth : 100,
							align : 'center'
						}, {
							field : 'userPassword',
							width : '12%',
							title : 'Password',
							minWidth : 100,
							align : 'center'
						}, {
							field : 'userGender',
							width : '12%',
							title : 'Gender',
							templet : '#userGender',
							minWidth : 100,
							align : 'center'
						}, {
							field : 'userEmail',
							width : '12%',
							title : 'Email',
							minWidth : 100,
							align : 'center'
						}, {
							field : 'userTelephone',
							width : '12%',
							title : 'Telephone',
							minWidth : 100,
							align : 'center'
						}, {
							fixed : 'right',
							toolbar : '#buttom',
							title : 'operation',
							width : '16%',
							align : 'center',
						} ] ]
					});

					// 监听列工具事件
					table
							.on(
									'tool(test)',
									function(obj) {
										var data = obj.data;
										var layEvent = obj.event;
										if (layEvent === 'dels') {// 删除
											layer
													.confirm(
															'Are you sure to delete?',
															function(index) {
																/*
																 * obj.del();
																 * //删除对应行（tr）的DOM结构，并更新缓存
																 * layer.close(index);
																 * //向服务端发送删除指令
																 */
																$
																		.ajax({
																			url : '/user/deleteUser',
																			type : "POST",
																			data : {
																				id : data.userId
																			},
																			dataType : "json",
																			success : function(
																					data) {
																				var page = $(
																						".layui-laypage-skip")
																						.find(
																								"input")
																						.val();// 获取当前页
																				var limits = $(
																						".layui-laypage-limits")
																						.find(
																								"option:selected")
																						.val();// 获取当前页条数
																				var countstr = $(
																						".layui-laypage-count")
																						.text();// 获取总数据
																				var count = countstr
																						.replace(
																								/[^0-9]/ig,
																								"");
																				var nowPage = tableIns.config.page.curr;// 返回当前页数
																				var reloadPage = (nowPage - 1) > 0 ? nowPage
																						: 1;
																				if (count > (limits * (page - 1))) {
																					if (count - 1 <= (limits * (page - 1))) {
																						reloadPage = reloadPage - 1;
																					}
																				}

																				layer
																						.msg("Delete successful");
																				layer
																						.close(index);
																				tableIns
																						.reload({
																							page : {
																								curr : reloadPage
																							}
																						});
																			}
																		});
															});
										} else if (layEvent === 'edit') {// 编辑
											layer
													.open({
														title : "Edit",
														type : 2,
														content : [ '/toPage?page=User management/user_modify' ],
														resize : false,
														area : [ '60%', '75%' ],
														success : function(
																layero, index) {
															// 获取子页面的iframe
															var iframe = window['layui-layer-iframe'
																	+ index];
															// 向子页面的全局函数child传参
															iframe.init(data);
														}
													});
										}
									});

					return false; // 阻止表单跳转。如果需要表单跳转，去掉这段即可。
				});

// 添加
$("#insert").click(function() {
	layer.open({
		title : "Add",
		type : 2,
		content : [ '/toPage?page=User management/user_add' ],
		resize : false,
		area : [ '60%', '75%' ]
	});
});
