package com.core.dao;

import java.util.List;
import java.util.Map;

import com.core.entity.Video;

public interface VideoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Video video);

    int insertSelective(Video video);

    Video selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Video video);

    int updateByPrimaryKey(Video video);
    //获取列表数据
    List<Video> getVideoList(Map<String, Object> data);
    //统计数据条数
    int selectCounts(Map<String, Object> count);
    //软删除，改变status
    int updateByStatus(Video video);
    
}