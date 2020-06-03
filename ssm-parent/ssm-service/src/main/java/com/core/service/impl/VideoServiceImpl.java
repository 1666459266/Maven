package com.core.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.dao.VideoMapper;
import com.core.entity.Video;
import com.core.service.VideoService;

@Service
public class VideoServiceImpl implements VideoService {
	
	@Autowired
	private VideoMapper videoMapper;

	@Override
	public int insertVideo(Video video) {
		// TODO Auto-generated method stub
		return videoMapper.insertSelective(video);
	}

	@Override
	public int modifyVideo(Video video) {
		// TODO Auto-generated method stub
		return videoMapper.updateByPrimaryKeySelective(video);
	}

	@Override
	public int deleteVideo(Integer id) {
		// TODO Auto-generated method stub
		return videoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Video selectVideo(Integer id) {
		// TODO Auto-generated method stub
		Video video = videoMapper.selectByPrimaryKey(id);
		return video;
	}

	@Override
	public List<Video> getVideoList(Map<String, Object> data) {
		// TODO Auto-generated method stub
		return videoMapper.getVideoList(data);
	}

	@Override
	public int selectCounts(Map<String, Object> count) {
		// TODO Auto-generated method stub
		return videoMapper.selectCounts(count);
	}

	@Override
	public int updateByStatus(Video video) {
		// TODO Auto-generated method stub
		return videoMapper.updateByStatus(video);
	}

}
