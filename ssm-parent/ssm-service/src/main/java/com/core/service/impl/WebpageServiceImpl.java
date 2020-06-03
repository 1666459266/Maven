package com.core.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.dao.WebpageMapper;
import com.core.entity.Webpage;
import com.core.service.WebpageService;

@Service
public class WebpageServiceImpl implements WebpageService {

	@Autowired
	private WebpageMapper webpageMapper;
	
	@Override
	public int insertWebpage(Webpage webpage) {
		// TODO Auto-generated method stub
		return webpageMapper.insertSelective(webpage);
	}

	@Override
	public int modifyWebpage(Webpage webpage) {
		// TODO Auto-generated method stub
		return webpageMapper.updateByPrimaryKeySelective(webpage);
	}

	@Override
	public int deleteWebpage(Integer id) {
		// TODO Auto-generated method stub
		return webpageMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Webpage selectWebpae(Integer id) {
		// TODO Auto-generated method stub
		Webpage webpage = webpageMapper.selectByPrimaryKey(id);
		return webpage;
	}

	@Override
	public List<Webpage> getUserList(Map<String, Object> data) {
		// TODO Auto-generated method stub
		return webpageMapper.getWebPageList(data);
	}

	@Override
	public int selectCounts(Map<String, Object> count) {
		// TODO Auto-generated method stub
		return webpageMapper.selectCounts(count);
	}

	@Override
	public int updateByStatus(Webpage webpage) {
		// TODO Auto-generated method stub
		return webpageMapper.updateByStatus(webpage);
	}

}
