package com.core.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.dao.ImageMapper;
import com.core.entity.Image;
import com.core.service.ImageService;

@Service
public class ImageServiceImpl implements ImageService {
	
	@Autowired
	private ImageMapper imageMapper;

	@Override
	public int insertImage(Image image) {
		// TODO Auto-generated method stub
		return imageMapper.insertSelective(image);
	}

	@Override
	public int modifyImage(Image image) {
		// TODO Auto-generated method stub
		return imageMapper.updateByPrimaryKeySelective(image);
	}

	@Override
	public int deleteImage(Integer id) {
		// TODO Auto-generated method stub
		return imageMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Image selectImage(Integer id) {
		// TODO Auto-generated method stub
		Image image = imageMapper.selectByPrimaryKey(id);
		return image;
	}

	@Override
	public List<Image> getImageList(Map<String, Object> data) {
		// TODO Auto-generated method stub
		return imageMapper.getImageList(data);
	}

	@Override
	public int selectCounts(Map<String, Object> count) {
		// TODO Auto-generated method stub
		return imageMapper.selectCounts(count);
	}

	@Override
	public int updateByStatus(Image image) {
		// TODO Auto-generated method stub
		return imageMapper.updateByStatus(image);
	}

}
