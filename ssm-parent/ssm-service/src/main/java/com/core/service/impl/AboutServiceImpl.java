package com.core.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.dao.AboutMapper;
import com.core.entity.About;
import com.core.service.AboutService;

@Service
public class AboutServiceImpl implements AboutService {
	
	@Autowired
	private AboutMapper aboutmapper;

	@Override
	public int insertAbout(About about) {
		// TODO Auto-generated method stub
		return aboutmapper.insertSelective(about);
	}

	@Override
	public int modifyAbout(About about) {
		// TODO Auto-generated method stub
		return aboutmapper.updateByPrimaryKeySelective(about);
	}

	@Override
	public int deleteAbout(Integer id) {
		// TODO Auto-generated method stub
		return aboutmapper.deleteByPrimaryKey(id);
	}

	@Override
	public About selectAbout(Integer id) {
		// TODO Auto-generated method stub
		About about = aboutmapper.selectByPrimaryKey(id);
		return about;
	}

	@Override
	public List<About> getAboutList(Map<String, Object> data) {
		// TODO Auto-generated method stub
		return aboutmapper.getaboutList(data);
	}

	@Override
	public int selectCounts(Map<String, Object> count) {
		// TODO Auto-generated method stub
		return aboutmapper.selectCounts(count);
	}

	@Override
	public int updateByStatus(About about) {
		// TODO Auto-generated method stub
		return aboutmapper.updateByStatus(about);
	}

}
