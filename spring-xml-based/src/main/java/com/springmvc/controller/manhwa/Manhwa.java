package com.springmvc.controller.manhwa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller("/me") - note: controller only mentions the bean class name not the endpoint
@Controller
public class Manhwa {

	@ResponseBody // writes http response i.e not on html or jsp page but directly as http response
	@RequestMapping("/chuva")
	public String home() {
		System.out.println("Inside Controller");
		return "WAnjam Chuva";
	}

	@RequestMapping("/home")
	public String genere() {

		return "homepage";// without @ResbonseBody Annotation the spring searches the file named
							// homepage.jsp
	}

	@RequestMapping("/lookism")
	public String myFavo(Model model) {
		List<String> favo = new ArrayList<String>();
		favo.add("VIN JIN");
		favo.add("GOO");
		favo.add("GUN");
		model.addAttribute("saraang", favo.get(0));
		model.addAttribute("CRAZY", favo.get(1));
		model.addAllAttributes(favo);
		return "chuva";
	}
}
