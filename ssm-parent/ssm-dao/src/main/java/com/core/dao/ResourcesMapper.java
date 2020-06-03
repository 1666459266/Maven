package com.core.dao;

import java.util.List;
import java.util.Map;

import com.core.entity.Resources;

public interface ResourcesMapper {
	
	 	int deleteByPrimaryKey(Integer id);

	    int insert(Resources resources);

	    int insertSelective(Resources resources);

	    Resources selectByPrimaryKey(Integer id);

	    int updateByPrimaryKeySelective(Resources resources);

	    int updateByPrimaryKey(Resources resources);
	    //查询列表数据
	    List<Resources> getResourcesList(Map<String, Object> data);
	    //查询数据条数
	    int selectCounts(Map<String, Object> count);
	    //软删除，改变status
	    int updateByCounts(Resources resources);
	
}
