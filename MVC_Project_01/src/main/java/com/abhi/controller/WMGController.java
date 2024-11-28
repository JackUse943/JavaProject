package com.abhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WMGController {
	@RequestMapping("/")
	public String showmsg() {
		return "home";
	}

}
