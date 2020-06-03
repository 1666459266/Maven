package com.core.dao;

import java.util.List;
import java.util.Map;

import com.core.entity.User;

public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(User user);

    int insertSelective(User user);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User user);

    int updateByPrimaryKey(User user);
    //获取列表数据
    List<User> getUserList(Map<String, Object> data);
    //统计数据条数
    int selectCounts(Map<String, Object> count);
    //软删除，改变status
    int updateBystatus(User user);
    //查询用户密码
    List<User> findCodeAndPassword(Map<String, Object> par);
    
}