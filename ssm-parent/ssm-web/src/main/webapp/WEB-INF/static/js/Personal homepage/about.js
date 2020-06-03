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
					var laydate = layui.laydate;

					laydate.render({
						elem : '#date',
					});

					var tableIns = table.render({
						elem : '#test',
						url : "/separate/getaboutList",
						page : true,
						method : 'post',
						cols : [ [ {
							field : 'aboutId',
							width : '12%',
							title : 'ID',
							minWidth : 100,
							align : 'center'
						},{
							field : 'aboutTitle',
							width : '12%',
							title : 'Title',
							minWidth : 100,
							align : 'center'
						},{
							field : 'aboutText',
							width : '48%',
							title : 'Text',
							minWidth : 100,
							align : 'center'
						}, {
							field : 'aboutDate',
							width : '12%',
							title : 'Date',
							minWidth : 100,
							templet : function(row) {
								return createTime(row.aboutDate);
							},
							align : 'center'
						}, {
							field : 'buttom',
							width : '16%',
							toolbar : "#buttom",
							title : 'Operation',
							minWidth : 100,
							align : 'center'
						} ] ]

					})

					table
							.on(
									'tool(test)',
									function(obj) {
										var data = obj.data;
										var layEvent = obj.event;
										if (layEvent === 'del') {// 删除
											layer
													.confirm(
															'Are you sure to delete?',
															function(index) {
																$
																		.ajax({
																			url : '/about/deleteAbout',
																			type : "POST",
																			data : {
																				id : data.aboutId
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
														content : [ '/toPage?page=Personal homepage/about_modify' ],
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

$("#insert").click(function() {
	layer.open({
		title : "Add",
		type : 2,
		content : [ '/toPage?page=Personal homepage/about_add' ],
		resize : false,
		area : [ '60%', '75%' ]
	});
	

});

function createTime(v) {
	var date = new Date(v);
	var y = date.getFullYear();
	var m = date.getMonth() + 1;
	m = m < 10 ? '0' + m : m;
	var d = date.getDate();
	d = d < 10 ? ("0" + d) : d;
	var str = y + "-" + m + "-" + d;
	return str;
}