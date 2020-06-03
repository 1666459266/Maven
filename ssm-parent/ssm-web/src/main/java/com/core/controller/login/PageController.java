package com.core.controller.login;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController extends BaseController {
		
	@RequestMapping("/toPage")
	public String index(HttpServletRequest request) {
		String pageName = request.getParameter("page");
		return pageName;
	}
	
	@RequestMapping("/toWeb")
	public String index2(HttpServletRequest request) {
		String webString = request.getParameter("page");
		return webString;
	}
	
}
