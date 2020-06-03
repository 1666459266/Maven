package com.core.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.core.controller.login.BaseController;
import com.core.entity.About;
import com.core.service.AboutService;
import com.core.utils.JsonResult;
import com.core.utils.ToolUtil;

@Controller("about")
@RequestMapping("/about")
public class AboutController extends BaseController {

	@Autowired
	private AboutService aboutService;

	@RequestMapping("/insertAbout")
	@ResponseBody
	public JsonResult insertAbout(HttpServletRequest request, HttpServletResponse response) {
		JsonResult jsonResult = new JsonResult();
		System.out.println("启用insertAbout方法");
		try {
			String about_title = ToolUtil.str("about_title",request);
			String about_text = ToolUtil.str("about_text", request);
			Date about_date = ToolUtil.date2("about_date", request);
			About about = new About();
			about.setAboutTitle(about_title);
			about.setAboutText(about_text);
			about.setAboutDate(about_date);
			if ((ToolUtil.equalBool(about_text)&&ToolUtil.equalBool(about_date)&&ToolUtil.equalBool(about_title)) == false) {
				jsonResult = JsonResult.build(FLAG_FAILED, "Missing data");
				return jsonResult;
			}
			System.out.println("传入参数成功");
			int result = aboutService.insertAbout(about);
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

	@RequestMapping("/modifyAbout")
	@ResponseBody
	public JsonResult modifyAbout(HttpServletRequest request, HttpServletResponse response) {
		JsonResult jsonResult = new JsonResult();
		System.out.println("启用modifyAbout方法");
		try {
			Integer about_id = ToolUtil.integer("about_id", request);
			String about_text = ToolUtil.str("about_text", request);
			String about_title = ToolUtil.str("about_title",request);
			About about = aboutService.selectAbout(about_id);
			if (about == null) {
				jsonResult = JsonResult.build(FLAG_FAILED, "No such information or the ID is empty");
				return jsonResult;
			}
			about.setAboutTitle(about_title);
			about.setAboutId(about_id);
			about.setAboutText(about_text);
			if ((ToolUtil.equalBool(about_id)&&ToolUtil.equalBool(about_text)&&ToolUtil.equalBool(about_title)) == false) {
				jsonResult = JsonResult.build(FLAG_FAILED, "Missing data");
				System.out.println(about_title);
				System.out.println(about_text);
				return jsonResult;
			}
			System.out.println("传入参数成功");
			int result = aboutService.modifyAbout(about);
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

	@RequestMapping("/deleteAbout")
	@ResponseBody
	public JsonResult deleteAbout(HttpServletRequest request, HttpServletResponse response) {
		JsonResult jsonResult = new JsonResult();
		System.out.println("启用delete方法");
		try {
			Integer id = ToolUtil.integer("id", request);
			About about = aboutService.selectAbout(id);
			if (about == null) {
				jsonResult = JsonResult.build(FLAG_FAILED, "No such information or the ID is empty");
				return jsonResult;
			}
			about.setStatus(2);
			int result = aboutService.updateByStatus(about);
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
//
//	@RequestMapping("/getaboutList")
//	@ResponseBody
//	public JsonResult getaboutList(HttpServletRequest request, HttpServletResponse response) {
//		JsonResult jsonResult = new JsonResult();
//		System.out.println("启动getList方法");
//		try {
//			Map<String, Object> data = new HashMap<>();
//			String about_text = ToolUtil.str("about_text", request);
//			String about_title = ToolUtil.str("about_title", request);
//			Integer limit = ToolUtil.integer("limit", request);
//			Integer page = ToolUtil.integer("page", request);
//			Integer pages = 0;
//			PageVO pageVO = new PageVO(page, limit);
//			pages = pageVO.getBeginNum();
//			data.put("about_text", about_text);
//			data.put("about_title", about_title);
//			data.put("limit", pageVO.getLimit());
//			data.put("pages", pages);
//			data.put("status", 1);
//			Map<String, Object> count = new HashMap<>();
//			count.put("about_text", about_text);
//			count.put("about_title", about_title);
//			count.put("limit", pageVO.getLimit());
//			count.put("pages", pages);
//			count.put("status", 1);
//			int counts = 0;
//			String msg = "success";
//			List<About> abouts = aboutService.getAboutList(data);
//			counts = aboutService.selectCounts(count);
//			jsonResult = JsonResult.build(FLAG_SUCCESS, abouts, msg, counts);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			jsonResult = JsonResult.build(FLAG_FAILED, e.getMessage());
//		}
//		return jsonResult;
//	}

}
