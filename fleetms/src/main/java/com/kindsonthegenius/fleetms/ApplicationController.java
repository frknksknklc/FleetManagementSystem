package com.kindsonthegenius.fleetms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ApplicationController {
	
	@GetMapping("/index")
	public String home() {
		return "index";
	}

	@GetMapping("/fleet")
	public String fleet() {
		return "/fleet/index";
	}
	
	@GetMapping("/helpdesk")
	public String helpdesk() {
		return "/helpdesk/index";
	}
	
	@GetMapping("/accounts")
	public String accounts() {
		return "/accounts/index";
	}
	
	@GetMapping("/payroll")
	public String payroll() {
		return "/payroll/index";
	}
	
	@GetMapping("/hr")
	public String widget() {
		return "/hr/index";
	}
	
	@GetMapping("/parameters")
	public String parameters() {
		return "/parameters/index";
	}

}
