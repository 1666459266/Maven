package com.core.service;

import java.util.List;
import java.util.Map;

import com.core.entity.User;

public interface UserService {

	public int insertUser(User user);
	
	public int modifyUser(User user);
	
	public int deleteUser(Integer id);
	
	public User selectUser(Integer id);
	//查询列表数据
	public List<User> getUserList(Map<String, Object> data);
	//查询数据条数
	public int selectCounts(Map<String, Object> count);
	//软删除，改变status
	public int updateByStatus(User user);
	//查询用户密码
	public List<User> findCodeAndPassword(Map<String, Object> par);
	
}
