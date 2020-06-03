package com.core.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.core.controller.login.BaseController;
import com.core.entity.Image;
import com.core.service.ImageService;
import com.core.utils.JsonResult;
import com.core.utils.ToolUtil;

@Controller("image")
@RequestMapping("/image")
public class ImageController extends BaseController {
	
	@Autowired
	private ImageService imageService;
	
	@RequestMapping("/modifyImage")
	@ResponseBody
	public JsonResult modifyImage(HttpServletRequest request, HttpServletResponse response) {
		JsonResult jsonResult = new JsonResult();
		System.out.println("启用modifyImage方法");
		try {
			Date date = new Date();
			Integer id = ToolUtil.integer("id", request);
			String image_title = ToolUtil.str("image_title", request);
			String image_content = ToolUtil.str("image_content", request);
			String image_tags = ToolUtil.str("image_tags", request);
			Image image = imageService.selectImage(id);
			if (image == null) {
				jsonResult = JsonResult.build(FLAG_FAILED, "No user information or the ID is empty");
				return jsonResult;
			}
			image.setImageId(id);
			image.setImageTitle(image_title);
			image.setImageContent(image_content);
			image.setImageModifyTime(date);
			image.setImageTags(image_tags);
			System.out.println("传入参数成功");
			int result = imageService.modifyImage(image);
			if (result > 0) {
				jsonResult = JsonResult.build(FLAG_SUCCESS);
			} else {
				jsonResult = JsonResult.build(FLAG_FAILED);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			jsonResult = JsonResult.build(FLAG_FAILED, e.getMessage());
		}
		return jsonResult;
	}
	
	@RequestMapping("/deleteImage")
	@ResponseBody
	public JsonResult deleteImage(HttpServletRequest request,HttpServletResponse response) {
		JsonResult jsonResult = new JsonResult();
		System.out.println("启用deleteImage方法");
		try {
			Integer id = ToolUtil.integer("id", request);
			Image image = imageService.selectImage(id);
			if (image == null) {
				jsonResult = JsonResult.build(FLAG_FAILED, "No such picture information or the ID is empty");
				return jsonResult;
			}
			image.setStatus(2);
			int result = imageService.updateByStatus(image);
			if (result > 0) {
				jsonResult = JsonResult.build(FLAG_SUCCESS);
			} else {
				jsonResult = JsonResult.build(FLAG_FAILED);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			jsonResult = JsonResult.build(FLAG_FAILED, e.getMessage());
		}
		return jsonResult;
	}

}