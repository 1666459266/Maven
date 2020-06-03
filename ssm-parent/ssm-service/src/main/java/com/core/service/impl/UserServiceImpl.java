package com.core.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.dao.UserMapper;
import com.core.entity.User;
import com.core.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.insertSelective(user);
	}

	@Override
	public int modifyUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public int deleteUser(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public User selectUser(Integer id) {
		// TODO Auto-generated method stub
		User user = userMapper.selectByPrimaryKey(id);
		return user;
	}

	@Override
	public List<User> getUserList(Map<String, Object> data) {
		// TODO Auto-generated method stub
		return userMapper.getUserList(data);
	}

	@Override
	public int selectCounts(Map<String, Object> count) {
		// TODO Auto-generated method stub
		return userMapper.selectCounts(count);
	}

	@Override
	public int updateByStatus(User user) {
		// TODO Auto-generated method stub
		return userMapper.updateBystatus(user);
	}

	@Override
	public List<User> findCodeAndPassword(Map<String, Object> par) {
		// TODO Auto-generated method stub
		return userMapper.findCodeAndPassword(par);
	}

}
