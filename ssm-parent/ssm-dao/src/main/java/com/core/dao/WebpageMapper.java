package com.core.dao;

import java.util.List;
import java.util.Map;

import com.core.entity.Webpage;

public interface WebpageMapper {

    int deleteByPrimaryKey(Integer webpageId);

    int insert(Webpage record);

    int insertSelective(Webpage record);

    Webpage selectByPrimaryKey(Integer webpageId);

    int updateByPrimaryKeySelective(Webpage record);

    int updateByPrimaryKey(Webpage record);
    //获取列表数据
    List<Webpage> getWebPageList(Map<String, Object> data);
    //统计数据条数
    int selectCounts(Map<String, Object> count);
    //软删除，改变status
    int updateByStatus(Webpage webpage);
    
}