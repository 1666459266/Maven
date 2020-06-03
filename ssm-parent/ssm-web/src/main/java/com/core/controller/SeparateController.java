package com.core.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.core.controller.login.BaseController;
import com.core.entity.About;
import com.core.entity.Image;
import com.core.entity.Resources;
import com.core.entity.User;
import com.core.entity.Video;
import com.core.entity.Webpage;
import com.core.service.AboutService;
import com.core.service.ImageService;
import com.core.service.ResourcesService;
import com.core.service.UserService;
import com.core.service.VideoService;
import com.core.service.WebpageService;
import com.core.utils.JsonResult;
import com.core.utils.PageVO;
import com.core.utils.ToolUtil;

@Controller("separate")
@RequestMapping("/separate")
public class SeparateController extends BaseController {
	
	@Autowired
	private AboutService aboutService;
	@Autowired
	private ImageService imageService;
	@Autowired
	private ResourcesService resourcesService;
	@Autowired
	private UserService userService;
	@Autowired
	private VideoService videoService;
	@Autowired
	private WebpageService webpageService;

	@RequestMapping("/getaboutList")
	@ResponseBody
	public JsonResult getaboutList(HttpServletRequest request, HttpServletResponse response) {
		JsonResult jsonResult = new JsonResult();
		System.out.println("启动getaboutList方法");
		try {
			Map<String, Object> data = new HashMap<>();
			String about_text = ToolUtil.str("about_text", request);
			Integer limit = ToolUtil.integer("limit", request);
			Integer page = ToolUtil.integer("page", request);
			Integer pages = 0;
			PageVO pageVO = new PageVO(page, limit);
			pages = pageVO.getBeginNum();
			data.put("about_text", about_text);
			data.put("limit", pageVO.getLimit());
			data.put("pages", pages);
			data.put("status", 1);
			Map<String, Object> count = new HashMap<>();
			count.put("about_text", about_text);
			count.put("limit", pageVO.getLimit());
			count.put("pages", pages);
			count.put("status", 1);
			int counts = 0;
			String msg = "success";
			List<About> abouts = aboutService.getAboutList(data);
			counts = aboutService.selectCounts(count);
			jsonResult = JsonResult.build(FLAG_SUCCESS, abouts, msg, counts);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			jsonResult = JsonResult.build(FLAG_FAILED, e.getMessage());
		}
		return jsonResult;
	}
	
	@RequestMapping("/getImageList")
	@ResponseBody
	public JsonResult getImageList(HttpServletRequest request,HttpServletResponse response) {
		JsonResult jsonResult = new JsonResult();
		System.out.println("启用getImageList方法");
		try {
			Map<String, Object> data = new HashMap<>();
			String image_title = ToolUtil.str("image_title", request);
			String image_content = ToolUtil.str("image_content", request);
			String image_url = ToolUtil.str("image_url", request);
			String image_tags = ToolUtil.str("image_tags", request);
			Integer limit = ToolUtil.integer("limit", request);
			Integer page = ToolUtil.integer("page", request);
			Integer pages = 0;
			PageVO pageVO = new PageVO(page,limit);
			pages = pageVO.getBeginNum();
			data.put("image_title", image_title);
			data.put("image_content", image_content);
			data.put("image_url", image_url);
			data.put("image_tags", image_tags);
			data.put("limit", pageVO.getLimit());
			data.put("pages", pages);
			data.put("status", 1);
			Map<String, Object> count = new HashMap<>();
			count.put("image_title", image_title);
			count.put("image_content", image_content);
			count.put("image_url", image_url);
			count.put("image_tags", image_tags);
			count.put("limit", pageVO.getLimit());
			count.put("pages", pages);
			count.put("status", 1);
			int counts = 0;
			String msg = "success";
			List<Image> images = imageService.getImageList(data);
			counts = imageService.selectCounts(count);
			jsonResult = JsonResult.build(FLAG_SUCCESS, images, msg, counts);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			jsonResult = JsonResult.build(FLAG_FAILED, e.getMessage());
		}
		return jsonResult;
	}
	
	@RequestMapping("/getResourcesList")
	@ResponseBody
	public JsonResult getResourcesList(HttpServletRequest request,HttpServletResponse response) {
		JsonResult jsonResult = new JsonResult();
		System.out.println("启用getResourcesList方法");
		try {
			Map<String, Object> data = new HashMap<>();
			String background_url = ToolUtil.str("background_url", request);
			Date date = ToolUtil.date2("date", request);
			Integer limit = ToolUtil.integer("limit", request);
			Integer page = ToolUtil.integer("page", request);
			Integer pages = 0;
			PageVO pageVO = new PageVO(page,limit);
			pages = pageVO.getBeginNum();
			data.put("background_url", background_url);
			data.put("date", date);
			data.put("limit", pageVO.getLimit());
			data.put("pages", pages);
			data.put("status", 1);
			Map<String, Object> count = new HashMap<>();
			count.put("background_url", background_url);
			count.put("date", date);
			count.put("limit", pageVO.getLimit());
			count.put("pages", pages);
			count.put("status", 1);
			int counts = 0;
			String msg = "success";
			List<Resources> reses = resourcesService.getResourcesList(data);
			counts = resourcesService.selectCounts(count);
			jsonResult = JsonResult.build(FLAG_SUCCESS, reses, msg, counts);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			jsonResult = JsonResult.build(FLAG_FAILED,e.getMessage());
		}
		return jsonResult;
	}
	
	
	@RequestMapping("/getUserList")
	@ResponseBody
	public JsonResult getUserList(HttpServletRequest request,HttpServletResponse response) {
		JsonResult jsonResult = new JsonResult();
		System.out.println("启动getUserList方法");
		try {
			Map<String, Object> data = new HashMap<>();
			String user_name = ToolUtil.str("user_name", request);
			String user_gender = ToolUtil.str("user_gender", request);
			String user_email = ToolUtil.str("user_email", request);
			String user_telephone = ToolUtil.str("user_telephone", request);
			Integer limit = ToolUtil.integer("limit", request);
			Integer page = ToolUtil.integer("page", request);
			Integer pages = 0;
			PageVO pageVO = new PageVO(page,limit);
			pages = pageVO.getBeginNum();
			data.put("user_name", user_name);
			data.put("user_gender", user_gender);
			data.put("user_email", user_email);
			data.put("user_telephone", user_telephone);
			data.put("limit", pageVO.getLimit());
			data.put("pages", pages);
			data.put("status", 1);
			Map<String, Object> count = new HashMap<>();
			count.put("user_name", user_name);
			count.put("user_gender", user_gender);
			count.put("user_email", user_email);
			count.put("user_telephone", user_telephone);
			count.put("limit", pageVO.getLimit());
			count.put("pages", pages);
			count.put("status", 1);
			int counts = 0;
			String msg = "success";
			List<User> users = userService.getUserList(data);
			counts = userService.selectCounts(count);
			jsonResult = JsonResult.build(FLAG_SUCCESS, users, msg, counts);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			jsonResult = JsonResult.build(FLAG_FAILED,e.getMessage());
		}
		return jsonResult;
	}
	
	@RequestMapping("/getVideoList")
	@ResponseBody
	public JsonResult getvideoList(HttpServletRequest request,HttpServletResponse response) {
		JsonResult jsonResult = new JsonResult();
		System.out.println("启用getVideoList方法");
		try {
			Map<String, Object> data = new HashMap<>();
			String video_title = ToolUtil.str("video_title", request);
			String video_content = ToolUtil.str("video_content", request);
			String video_url = ToolUtil.str("video_url", request);
			String video_tags = ToolUtil.str("video_tags", request);
			Integer limit = ToolUtil.integer("limit", request);
			Integer page = ToolUtil.integer("page", request);
			Integer pages = 0;
			PageVO pageVO = new PageVO(page,limit);
			pages = pageVO.getBeginNum();
			data.put("video_title", video_title);
			data.put("video_content", video_content);
			data.put("video_url", video_url);
			data.put("video_tags", video_tags);
			data.put("limit", pageVO.getLimit());
			data.put("pages", pages);
			data.put("status", 1);
			Map<String, Object> count = new HashMap<>();
			count.put("video_title", video_title);
			count.put("video_content", video_content);
			count.put("video_url", video_url);
			count.put("video_tags", video_tags);
			count.put("limit", pageVO.getLimit());
			count.put("pages", pages);
			count.put("status", 1);
			int counts = 0;
			String msg = "success";
			List<Video> videos = videoService.getVideoList(data);
			counts = videoService.selectCounts(count);
			jsonResult = JsonResult.build(FLAG_SUCCESS, videos, msg, counts);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			jsonResult = JsonResult.build(FLAG_FAILED, e.getMessage());
		}
		return jsonResult;
	}
	
	@RequestMapping("/getWebpageList")
	@ResponseBody
	public JsonResult getWebpageList(HttpServletRequest request, HttpServletResponse response) {
		JsonResult jsonResult = new JsonResult();
		System.out.println("启用getWebpageList方法");
		try {
			Map<String, Object> data = new HashMap<>();
			String webpage_content = ToolUtil.str("webpage_content", request);
			Integer limit = ToolUtil.integer("limit", request);
			Integer page = ToolUtil.integer("page", request);
			Integer pages = 0;
			PageVO pageVO = new PageVO(page, limit);
			pages = pageVO.getBeginNum();
			data.put("webpage_content", webpage_content);
			data.put("limit", pageVO.getLimit());
			data.put("pages", pages);
			data.put("status", 1);
			Map<String, Object> count = new HashMap<>();
			count.put("webpage_content", webpage_content);
			count.put("limit", pageVO.getLimit());
			count.put("pages", pages);
			count.put("status", 1);
			int counts = 0;
			String msg = "success";
			List<Webpage> webpage = webpageService.getUserList(data);
			counts = webpageService.selectCounts(data);
			jsonResult = JsonResult.build(FLAG_SUCCESS, webpage, msg, counts);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			jsonResult = JsonResult.build(FLAG_FAILED, e.getMessage());
		}
		return jsonResult;
	}

}