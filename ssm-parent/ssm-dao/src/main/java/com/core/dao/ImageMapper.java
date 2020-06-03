package com.core.dao;

import java.util.List;
import java.util.Map;

import com.core.entity.Image;

public interface ImageMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Image image);

    int insertSelective(Image image);

    Image selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Image image);

    int updateByPrimaryKey(Image image);
    //获取列表数据
    List<Image> getImageList(Map<String, Object> data);
    //统计数据条数
    int selectCounts(Map<String, Object> count);
    //软删除，改变status
    int updateByStatus(Image image);
    
}