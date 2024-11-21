package com.springmvc.controller.lookism;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Lookism {

	@RequestMapping("/home")
	public String home() {
		return "lookism";
	}
}
