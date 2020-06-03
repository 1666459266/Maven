package com.core.service;

import java.util.List;
import java.util.Map;

import com.core.entity.Image;

public interface ImageService {
	
	public int insertImage(Image image);
	
	public int modifyImage(Image image);
	
	public int deleteImage(Integer id);
	
	public Image selectImage(Integer id);
	
	public List<Image> getImageList(Map<String, Object> data);
	
	public int selectCounts(Map<String, Object> count);
	
	public int updateByStatus(Image image);

}
