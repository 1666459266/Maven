package com.core.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.dao.ResourcesMapper;
import com.core.entity.Resources;
import com.core.service.ResourcesService;

@Service
public class ResourcesServiceImpl implements ResourcesService {
	
	@Autowired
	private ResourcesMapper resourcesMapper;

	@Override
	public int insertResources(Resources resources) {
		// TODO Auto-generated method stub
		return resourcesMapper.insertSelective(resources);
	}

	@Override
	public int modifyResources(Resources resources) {
		// TODO Auto-generated method stub
		return resourcesMapper.updateByPrimaryKey(resources);
	}

	@Override
	public int deleteResources(Integer id) {
		// TODO Auto-generated method stub
		return resourcesMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Resources selectResources(Integer id) {
		// TODO Auto-generated method stub
		return resourcesMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Resources> getResourcesList(Map<String, Object> data) {
		// TODO Auto-generated method stub
		return resourcesMapper.getResourcesList(data);
	}

	@Override
	public int selectCounts(Map<String, Object> count) {
		// TODO Auto-generated method stub
		return resourcesMapper.selectCounts(count);
	}

	@Override
	public int updateByStatus(Resources resources) {
		// TODO Auto-generated method stub
		return resourcesMapper.updateByCounts(resources);
	}
	
}
