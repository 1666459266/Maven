package com.core.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.core.controller.login.BaseController;
import com.core.entity.Image;
import com.core.entity.Resources;
import com.core.entity.Video;
import com.core.service.ImageService;
import com.core.service.ResourcesService;
import com.core.service.VideoService;
import com.core.utils.FileUploadTool;
import com.core.utils.JsonResult;
import com.core.utils.ToolUtil;

@Controller
@RequestMapping("/upload")
public class UploadController extends BaseController {
	
	@Autowired
	private ImageService imageService;
	@Autowired
	private VideoService videoService;
	@Autowired
	private ResourcesService resourcesService;

    @RequestMapping(value = "/uploadImage", method={RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public JsonResult uploadImage(@RequestParam(value = "file", required = false) MultipartFile multipartFile,
            HttpServletRequest request, HttpServletResponse response) {
    	JsonResult jsonResult = new JsonResult();
        String message = "";
        String url;
        FileUploadTool fileUploadTool = new FileUploadTool();
        try {
        	Date date = new Date();
            url = fileUploadTool.createFile(multipartFile, request);
            System.out.println(url);
            if (url != null) {
                message = "Upload success";
            } else {
                message = "Upload failure";
            }
            String image_title = ToolUtil.str("image_title", request);
        	String image_content = ToolUtil.str("image_content", request);
        	String image_tags = ToolUtil.str("image_tags", request);
        	Image image = new Image();
        	image.setImageTitle(image_title);
        	image.setImageContent(image_content);
        	image.setImageUrl(url);
        	image.setImageTags(image_tags);
        	image.setImageCreateTime(date);
        	System.out.println("传入参数成功");
        	int result = imageService.insertImage(image);
        	if (result > 0) {
				jsonResult = JsonResult.build(FLAG_SUCCESS,message);
			} else {
				jsonResult = JsonResult.build(FLAG_FAILED);
			}
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult = JsonResult.build(FLAG_FAILED, e.getMessage());
        }
        return jsonResult;
    }
    
    @RequestMapping(value = "/uploadVideo", method={RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public JsonResult uploadVideo(@RequestParam(value = "file", required = false) MultipartFile multipartFile,
            HttpServletRequest request, HttpServletResponse response) {
    	JsonResult jsonResult = new JsonResult();
        String message = "";
        String url;
        FileUploadTool fileUploadTool = new FileUploadTool();
        try {
        	Date date = new Date();
            url = fileUploadTool.createFile(multipartFile, request);
            System.out.println(url);
            if (url != null) {
                message = "Upload success";
            } else {
                message = "Upload failure";
            }
            String video_title = ToolUtil.str("video_title", request);
            String video_content = ToolUtil.str("video_content", request);
            String video_tags = ToolUtil.str("video_tags", request);
            Video video = new Video();
            video.setVideoTitle(video_title);
            video.setVideoContent(video_content);
            video.setVideoUrl(url);
            video.setVideoTags(video_tags);
            video.setVideoCreateTime(date);
            int result = videoService.insertVideo(video);
            if (result > 0) {
				jsonResult = JsonResult.build(FLAG_SUCCESS,message);
			} else {
				jsonResult = JsonResult.build(FLAG_FAILED);
			}
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult = JsonResult.build(FLAG_FAILED, e.getMessage());
        }
        return jsonResult;
    }
    
    @RequestMapping(value = "/uploadResources", method={RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public JsonResult uploadResources(@RequestParam(value = "file", required = false) MultipartFile multipartFile,
            HttpServletRequest request, HttpServletResponse response) {
    	JsonResult jsonResult = new JsonResult();
        String message = "";
        String url;
        FileUploadTool fileUploadTool = new FileUploadTool();
        try {
        	Date date = new Date();
            url = fileUploadTool.createFile(multipartFile, request);
            System.out.println(url);
            if (url != null) {
                message = "Upload success";
            } else {
                message = "Upload failure";
            }
            Resources resources = new Resources();
            resources.setBackgroundUrl(url);
            resources.setBackgroundCreateTime(date);
            int result = resourcesService.insertResources(resources);
            if (result > 0) {
				jsonResult = JsonResult.build(FLAG_SUCCESS, message);
			} else {
				jsonResult = JsonResult.build(FLAG_FAILED);
			}
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult = JsonResult.build(FLAG_FAILED,e.getMessage());
        }
        return jsonResult;
    }
    
}