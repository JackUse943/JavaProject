package com.nit.configration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowFirstPage
{

	@RequestMapping("/home")
	public String fisrtPageWeb()
	{
		return "welcome";
		
	}
	
}
