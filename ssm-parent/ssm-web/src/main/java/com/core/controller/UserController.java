package com.core.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.core.controller.login.BaseController;
import com.core.entity.User;
import com.core.service.UserService;
import com.core.utils.JsonResult;
import com.core.utils.ToolUtil;

@Controller("user")
@RequestMapping("/user")
public class UserController extends BaseController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/insertUser")
	@ResponseBody
	public JsonResult addUser(HttpServletRequest request,HttpServletResponse response) {
		JsonResult jsonResult = new JsonResult();
		System.out.println("启用insertUser方法");
		try {
			Date date = new Date();
			String user_name = ToolUtil.str("user_name",request);
			String user_code = ToolUtil.str("user_code",request);
			String user_password = ToolUtil.str("user_password",request);
			String user_gender = ToolUtil.str("user_gender",request);
			String user_email = ToolUtil.str("user_email",request);
			String user_telephone = ToolUtil.str("user_telephone",request);
			User user = new User();
			user.setUserName(user_name);
			user.setUserCode(user_code);
			user.setUserPassword(user_password);
			user.setUserGender(user_gender);
			user.setUserEmail(user_email);
			user.setUserTelephone(user_telephone);
			user.setUserCreateTime(date);
			if ((ToolUtil.equalBool(user_name)&&ToolUtil.equalBool(user_code)&&ToolUtil.equalBool(user_password)&&ToolUtil.equalBool(user_gender)&&ToolUtil.equalBool(user_email)&&ToolUtil.equalBool(user_telephone)) == false) {
				jsonResult = JsonResult.build(FLAG_FAILED, "Missing data");
				return jsonResult;
			}
			System.out.println("传入参数成功");
			int result = userService.insertUser(user);
			if (result > 0) {
				jsonResult = JsonResult.build(FLAG_SUCCESS);
			} else {
				jsonResult = JsonResult.build(FLAG_FAILED);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			jsonResult = JsonResult.build(FLAG_FAILED,e.getMessage());
		}
		return jsonResult;
	}
	
	@RequestMapping("/modifyUser")
	@ResponseBody
	public JsonResult modifyUser(HttpServletRequest request,HttpServletResponse response) {
		JsonResult jsonResult = new JsonResult();
		System.out.println("启用modifyUser方法");
		try {
			Date date = new Date();
			Integer id = ToolUtil.integer("id", request);
			String user_name = ToolUtil.str("user_name", request);
			String user_code = ToolUtil.str("user_code", request);
			String user_password = ToolUtil.str("user_password", request);
			String user_gender = ToolUtil.str("user_gender", request);
			String user_email = ToolUtil.str("user_email", request);
			String user_telephone = ToolUtil.str("user_telephone", request);
			User user = userService.selectUser(id);
			if (user == null) {
				jsonResult = JsonResult.build(FLAG_FAILED,"No user information or the ID is empty");
				return jsonResult;
			}
			user.setUserId(id);
			user.setUserName(user_name);
			user.setUserCode(user_code);
			user.setUserPassword(user_password);
			user.setUserGender(user_gender);
			user.setUserEmail(user_email);
			user.setUserTelephone(user_telephone);
			user.setUserModifyTime(date);
			if ((ToolUtil.equalBool(id)&&ToolUtil.equalBool(user_name)&&ToolUtil.equalBool(user_code)&&ToolUtil.equalBool(user_password)&&ToolUtil.equalBool(user_gender)&&ToolUtil.equalBool(user_email)&&ToolUtil.equalBool(user_telephone)) == false ) {
				jsonResult = JsonResult.build(FLAG_FAILED, "Missing data");
				return jsonResult;
			}
			System.out.println("传入参数成功");
			int result = userService.modifyUser(user);
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
	
	@RequestMapping("/deleteUser")
	@ResponseBody
	public JsonResult deleteUser(HttpServletRequest request,HttpServletResponse response) {
		JsonResult jsonResult = new JsonResult();
		System.out.println("启动deleteUser方法");
		try {
			Integer id = ToolUtil.integer("id", request);
			User user = userService.selectUser(id);
			if (user == null) {
				jsonResult = JsonResult.build(FLAG_FAILED, "No user information or the ID is empty");
				return jsonResult;
			}
			user.setStatus(2);
			int result = userService.updateByStatus(user);
			if (result > 0) {
				jsonResult = JsonResult.build(FLAG_SUCCESS);
			} else {
				jsonResult = JsonResult.build(FLAG_FAILED);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			jsonResult = JsonResult.build(FLAG_FAILED,e.getMessage());
		}
		return jsonResult;
	}

}