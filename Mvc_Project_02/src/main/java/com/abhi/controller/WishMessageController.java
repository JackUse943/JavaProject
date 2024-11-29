package com.abhi.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abhi.entity.AdminUser;
import com.abhi.service.IUserService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class WishMessageController {
	@Autowired
	private IUserService iUserService;

	@RequestMapping("/")
	public String viewMessage() {
		return "home";
	}

	@RequestMapping("/saveAdminUser")
	public String saveAdminUser(HttpServletRequest req, Map<String, Object> map, AdminUser adminUser) {

		adminUser.setUsername(req.getParameter("username"));
		adminUser.setPassword(req.getParameter("password"));

		String insertDetails = iUserService.insertDetails(adminUser);

		map.put("msg", insertDetails);
		return "welcome";
	}
}
