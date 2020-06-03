package com.core.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.core.controller.login.BaseController;
import com.core.entity.Video;
import com.core.service.VideoService;
import com.core.utils.JsonResult;
import com.core.utils.ToolUtil;

@Controller("video")
@RequestMapping("/video")
public class VideoController extends BaseController {
	
	@Autowired
	private VideoService videoService;
	
	@RequestMapping("/modifyVideo")
	@ResponseBody
	public JsonResult modifyVideo(HttpServletRequest request, HttpServletResponse response) {
		JsonResult jsonResult = new JsonResult();
		System.out.println("启用modifyVideo方法");
		try {
			Date date = new Date();
			Integer id = ToolUtil.integer("id", request);
			String video_title = ToolUtil.str("video_title", request);
			String video_content = ToolUtil.str("video_content", request);
			String video_tags = ToolUtil.str("video_tags", request);
			Video video = videoService.selectVideo(id);
			if (video == null) {
				jsonResult = JsonResult.build(FLAG_FAILED, "No user information or the ID is empty");
				return jsonResult;
			}
			video.setVideoId(id);
			video.setVideoTitle(video_title);
			video.setVideoContent(video_content);
			video.setVideoModifyTime(date);
			video.setVideoTags(video_tags);
			System.out.println("传入参数成功");
			int result = videoService.modifyVideo(video);
			if (result > 0) {
				jsonResult = JsonResult.build(FLAG_SUCCESS);
			} else {
				jsonResult = JsonResult.build(FLAG_FAILED);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			jsonResult = JsonResult.build(FLAG_SUCCESS,e.getMessage());
		}
		return jsonResult;
	}
	
	@RequestMapping("/deleteVideo")
	@ResponseBody
	public JsonResult deletevideo(HttpServletRequest request,HttpServletResponse response) {
		JsonResult jsonResult = new JsonResult();
		System.out.println("启用deleteVideo方法");
		try {
			Integer id = ToolUtil.integer("id", request);
			Video video = videoService.selectVideo(id);
			if (video == null) {
				jsonResult = JsonResult.build(FLAG_FAILED, "No video information or the ID is empty");
				return jsonResult;
			}
			video.setStatus(2);
			int result = videoService.updateByStatus(video);
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