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
						url : '/separate/getResourcesList',
						page : true // 开启分页
						,
						cols : [ [ {
							field : 'id',
							title : 'ID',
							width : '20%',
							align : 'center',
						}, {
							field : 'backgroundUrl',
							title : 'Background',
							width : '30%',
							align : 'center',
							templet : "#backgroundUrltmp"
						}, {
							field : 'backgroundCreateTime',
							width : '30%',
							title : 'CreateDate',
							minWidth : '20%',
							templet : function(row) {
								return createTime(row.backgroundCreateTime);
							},
							align : 'center'
						}, {
							fixed : 'right',
							toolbar : '#barDemo',
							title : 'operation',
							width : '20%',
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
																			url : '/resources/deleteResources',
																			type : "POST",
																			data : {
																				id : data.id
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

										}
									});
					return false; // 阻止表单跳转。如果需要表单跳转，去掉这段即可。
				});

// 添加
$("#insert").click(function() {
	layer.open({
		title : "Add",
		type : 2,
		content : [ '/toPage?page=Resource management/resource_add' ],
		resize : false,
		area : [ '100%', '100%' ]
	});
});

function show_img(t) {
	var t = $(t).find("img");
	// 页面层
	layer.open({
		type : 1,
		skin : 'none', // 加上边框
		title : 'picture',
		area : [ '100%', '100%' ], // 宽高
		shadeClose : true, // 开启遮罩关闭
		end : function(index, layero) {
			return false;
		},
		content : '<div style="text-align:center"><img src="'
				+ $(t).attr('src') + '" /></div>'
	});
}

// 时间
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
