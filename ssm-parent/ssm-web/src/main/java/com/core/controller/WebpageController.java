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
import com.core.entity.Webpage;
import com.core.service.WebpageService;
import com.core.utils.JsonResult;
import com.core.utils.PageVO;
import com.core.utils.ToolUtil;

@Controller("webpage")
@RequestMapping("/webpage")
public class WebpageController extends BaseController {
	
	
	@Autowired
	private WebpageService webpageService;
	
	@RequestMapping("/insertWebpage")
	@ResponseBody
	public JsonResult addUser(HttpServletRequest request, HttpServletResponse response) {
		JsonResult jsonResult = new JsonResult();
		System.out.println("启用insertWebpage方法");
		try {
			Date date = new Date();
			String webpage_title = ToolUtil.str("webpage_title",request);
			String webpage_classify = ToolUtil.str("webpage_classify",request);
			String webpage_content = ToolUtil.str("webpage_content", request);
			Webpage webpage = new Webpage();
			webpage.setWebpageTitle(webpage_title);
			webpage.setWebpageClassify(webpage_classify);
			webpage.setWebpageContent(webpage_content);
			webpage.setWebpageCreateTime(date);
			if ((ToolUtil.equalBool(webpage_content)&&ToolUtil.equalBool(webpage_title)&&ToolUtil.equalBool(webpage_classify)) == false) {
				jsonResult = JsonResult.build(FLAG_FAILED, "Missing data");
				return jsonResult;
			}
			System.out.println("传入参数成功");
			int result = webpageService.insertWebpage(webpage);
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
	
	@RequestMapping("/modifyWebpage")
	@ResponseBody
	public JsonResult modifyUser(HttpServletRequest request, HttpServletResponse response) {
		JsonResult jsonResult = new JsonResult();
		System.out.println("启用modifyWebpage方法");
		try {
			Date date = new Date();
			Integer id = ToolUtil.integer("id", request);
			String webpage_content = ToolUtil.str("webpage_content", request);
			String webpage_classify = ToolUtil.str("webpage_classify", request);
			String webpage_title = ToolUtil.str("webpage_title",request);
			Webpage webpage = webpageService.selectWebpae(id);
			if (webpage == null) {
				jsonResult = JsonResult.build(FLAG_FAILED, "No content information or ID is empty");
				return jsonResult;
			}
			webpage.setWebpageId(id);
			webpage.setWebpageContent(webpage_content);
			webpage.setWebpageClassify(webpage_classify);
			webpage.setWebpageTitle(webpage_title);
			webpage.setwebpageModifyTime(date);
			if ((ToolUtil.equalBool(id)&&ToolUtil.equalBool(webpage_title) && ToolUtil.equalBool(webpage_content)&& ToolUtil.equalBool(webpage_classify)) == false) {
				jsonResult = JsonResult.build(FLAG_FAILED, "Missing data");
				return jsonResult;
			}
			System.out.println("传入参数成功");
			int result = webpageService.modifyWebpage(webpage);
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
	@RequestMapping("/deleteWebpage")
	@ResponseBody
	public JsonResult deleteUser(HttpServletRequest request, HttpServletResponse response) {
		JsonResult jsonResult = new JsonResult();
		System.out.println("启动deleteWebpage方法");
		try {
			Integer id = ToolUtil.integer("id", request);
			Webpage webpage = webpageService.selectWebpae(id);
			if (webpage == null) {
				jsonResult = JsonResult.build(FLAG_FAILED, "No content information or ID is empty");
				return jsonResult;
			}
			webpage.setStatus(2);
			int result = webpageService.updateByStatus(webpage);
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
	@RequestMapping("/getWebpageList")
	@ResponseBody
	public JsonResult getUserList(HttpServletRequest request, HttpServletResponse response) {
		JsonResult jsonResult = new JsonResult();
		System.out.println("启用getWebpageList方法");
		try {
			Map<String, Object> data = new HashMap<>();
//			String webpage_content = ToolUtil.str("webpage_content", request);
//			String webpage_classify = ToolUtil.str("webpage_classify",request);
			Integer limit = ToolUtil.integer("limit", request);
			Integer page = ToolUtil.integer("page", request);
			Integer pages = 0;
			PageVO pageVO = new PageVO(page, limit);
			pages = pageVO.getBeginNum();
//			data.put("webpage_content", webpage_content);
//			data.put("webpage_classify", webpage_classify);
			data.put("limit", pageVO.getLimit());
			data.put("pages", pages);
			data.put("status", 1);
			Map<String, Object> count = new HashMap<>();
//			count.put("webpage_content", webpage_content);
//			count.put("webpage_classify", webpage_classify);
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
