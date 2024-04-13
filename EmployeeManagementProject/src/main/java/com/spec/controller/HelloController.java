package com.spec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {
	@RequestMapping("/hello")
	public String sayHello() {
		return "HEllo spec";
	}
	@RequestMapping("/bye")
	public String sayBye() {
		return"BYE SPEC";
	}
		
	

}
