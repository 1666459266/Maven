package com.core.service;

import java.util.List;
import java.util.Map;

import com.core.entity.About;

public interface AboutService {
	
	public int insertAbout(About about);
	
	public int modifyAbout(About about);
	
	public int deleteAbout(Integer id);
	
	public About selectAbout(Integer id);
	
	public List<About> getAboutList(Map<String, Object> data);
	
	public int selectCounts(Map<String, Object> count);
	
	public int updateByStatus(About about);
}
