package com.core.service;

import java.util.List;
import java.util.Map;

import com.core.entity.Webpage;

public interface WebpageService {

	public int insertWebpage(Webpage webpage);

	public int modifyWebpage(Webpage webpage);

	public int deleteWebpage(Integer id);

	public Webpage selectWebpae(Integer id);
	// 查询列表数据
	public List<Webpage> getUserList(Map<String, Object> data);
	// 查询数据条数
	public int selectCounts(Map<String, Object> count);
	// 软删除，改变status
	public int updateByStatus(Webpage webpage);
	
}
