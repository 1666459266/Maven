package com.core.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.core.controller.login.BaseController;
import com.core.entity.Resources;
import com.core.service.ResourcesService;
import com.core.utils.FileUploadTool;
import com.core.utils.JsonResult;
import com.core.utils.ToolUtil;

@Controller("resources")
@RequestMapping("/resources")
public class ResourcesController extends BaseController{
	
	@Autowired
	private ResourcesService resourcesService;
	
	@RequestMapping("/modifyResources")
	@ResponseBody
	public JsonResult modifyResources(@RequestParam(value = "file", required = false) MultipartFile multipartFile,
            HttpServletRequest request, HttpServletResponse response) {
		JsonResult jsonResult = new JsonResult();
		System.out.println("启用mofidyResources");
		String message = "";
		String url;
		FileUploadTool fileUploadTool = new FileUploadTool();
		try {
			Date date = new Date();
			Integer id = ToolUtil.integer("id", request);
			Resources resources = resourcesService.selectResources(id);
			if (resources == null) {
				jsonResult = JsonResult.build(FLAG_FAILED, "No user information or the ID is empty");
				return jsonResult;
			}
			url = fileUploadTool.createFile(multipartFile, request);
			System.out.println(url);
			if (url != null) {
				message = "Upload success";
			} else {
				message = "Upload failure";
			}
			resources.setBackgroundUrl(url);
			resources.setBackgroundModifyTime(date);
			System.out.println("传入参数成功");
			int result = resourcesService.modifyResources(resources);
			if (result > 0) {
				jsonResult = JsonResult.build(FLAG_SUCCESS, message);
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
	
	@RequestMapping("/deleteResources")
	@ResponseBody
	public JsonResult deleteResources(HttpServletRequest request,HttpServletResponse response) {
		JsonResult jsonResult = new JsonResult();
		System.out.println("启动deleteResources方法");
		try {
			Integer id = ToolUtil.integer("id", request);
			Resources resources = resourcesService.selectResources(id);
			if (resources == null) {
				jsonResult = JsonResult.build(FLAG_FAILED, "The resource information is not available or the ID is empty");
				return jsonResult;
			}
			resources.setStatus(2);
			int result = resourcesService.updateByStatus(resources);
			if (result > 0) {
				jsonResult = JsonResult.build(FLAG_SUCCESS);
			} else {
				jsonResult = JsonResult.build(FLAG_FAILED);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			jsonResult = JsonResult.build(FLAG_FAILED);
		}
		return jsonResult;
	}

}