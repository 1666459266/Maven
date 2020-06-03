package com.core.controller.login;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.core.entity.User;
import com.core.service.UserService;
import com.core.utils.Constant;
import com.core.utils.JsonResult;
import com.core.utils.ToolUtil;

@Controller("login")
@RequestMapping("/home")
public class LoginController extends BaseController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/toLogin")
	public ModelAndView toLogin(HttpServletRequest request,HttpServletResponse response,ModelMap modelMap) {
		ModelAndView modelAndView = new ModelAndView();
		modelMap.put("systemName", Constant.systemName);
		modelAndView.setViewName("login");
		return modelAndView;
	}
	
	@RequestMapping("/login")
	@ResponseBody
	public JsonResult login(HttpServletRequest request,HttpServletResponse response) {
		String user_code = ToolUtil.str("user_code", request);
		String user_password = ToolUtil.str("user_password", request);
		Map<String, Object> par = new HashMap<>();
		par.put("userCode", user_code);
		par.put("userPassword", user_password);
		List<User> userList = userService.findCodeAndPassword(par);
		System.out.println(userList);
		if (!CollectionUtils.isEmpty(userList)) {
			User user = userList.get(0);
			request.getSession().setAttribute(Constant.USER_SESSION, user);
		} else {
			return JsonResult.build(FLAG_FAILED, "用户名或密码错误");
		}
		return JsonResult.build(FLAG_SUCCESS);
	}
	
	@RequestMapping("/register")
	@ResponseBody
	public JsonResult register(HttpServletRequest request,HttpServletResponse response) {
		String user_code = ToolUtil.str("user_code", request);
		String user_password = ToolUtil.str("user_password", request);
		User user = new User();
		user.setUserCode(user_code);
		user.setUserPassword(user_password);
		int num = userService.insertUser(user);
		if (num > 0) {
			return JsonResult.build(FLAG_SUCCESS,"注册成功");
		} else {
			return JsonResult.build(FLAG_FAILED);
		}
	}
	
	@RequestMapping("/getSystem")
	@ResponseBody
	public JsonResult getSystem(HttpServletRequest request,HttpServletResponse response) {
		try {
			Map<String, Object> par = new HashMap<>();
			String systemName = Constant.systemName;
			String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort();
			par.put("systemName", systemName);
			par.put("systemLink", basePath);
			return JsonResult.build(FLAG_SUCCESS,par);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return JsonResult.build(FLAG_FAILED,Constant.SYS_ERR);
		}
	}
	
	@RequestMapping("/getUser")
	@ResponseBody
	public JsonResult getUser(HttpServletRequest request,HttpServletResponse response) {
		try {
			Map<String, Object> par = new HashMap<>();
			User user = (User) request.getSession().getAttribute(Constant.USER_SESSION);
			par.put("user", user);
			return JsonResult.build(FLAG_SUCCESS,par);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return JsonResult.build(FLAG_FAILED,Constant.SYS_ERR);
		}
	}
	
	@RequestMapping("/logout")
	@ResponseBody
	public JsonResult logout(HttpServletRequest request,HttpServletResponse response) {
		try {
			request.getSession().removeAttribute(Constant.USER_SESSION);
			return JsonResult.build(FLAG_SUCCESS);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return JsonResult.build(FLAG_FAILED,Constant.SYS_ERR);
		}
	}

}
