package com.core.service;

import java.util.List;
import java.util.Map;

import com.core.entity.Resources;

public interface ResourcesService {
	
	public int insertResources(Resources resources);
	
	public int modifyResources(Resources resources);
	
	public int deleteResources(Integer id);
	
	public Resources selectResources(Integer id);
	//查询列表数据
	public List<Resources> getResourcesList(Map<String, Object> data);
	//查询数据条数
	public int selectCounts(Map<String, Object> count);
	//软删除，改变status
	public int updateByStatus(Resources resources);
	
}
