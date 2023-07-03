package com.kindsonthegenius.fleetms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
	
	@GetMapping("/index")
	public String home() {
		return "index";
	}

	@GetMapping("/hr")
	public String widget() {
		return "/hr/index";
	}
	
//	@GetMapping("/hr")
//	public String hr() {
//		return "/hr/index";
//	}
	

}
