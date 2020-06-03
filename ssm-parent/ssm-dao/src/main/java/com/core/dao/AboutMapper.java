package com.core.dao;

import java.util.List;
import java.util.Map;

import com.core.entity.About;

public interface AboutMapper {
	int deleteByPrimaryKey(Integer id);

    int insert(About about);

    int insertSelective(About about);

    About selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(About about);

    int updateByPrimaryKey(About about);
    //获取列表数据
    List<About> getaboutList(Map<String, Object> data);
    //统计数据条数
    int selectCounts(Map<String, Object> count);
    //软删除，改变status
    int updateByStatus(About about);

}