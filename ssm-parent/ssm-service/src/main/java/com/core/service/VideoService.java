package com.core.service;

import java.util.List;
import java.util.Map;

import com.core.entity.Video;

public interface VideoService {
	
	public int insertVideo(Video video);
	
	public int modifyVideo(Video video);
	
	public int deleteVideo(Integer id);
	
	public Video selectVideo(Integer id);
	
	public List<Video> getVideoList(Map<String, Object> data);
	
	public int selectCounts(Map<String, Object> count);
	
	public int updateByStatus(Video video);

}
