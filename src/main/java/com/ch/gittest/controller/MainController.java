package com.ch.gittest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@GetMapping("/test")
	@ResponseBody
	public String main() {
		return "Wongka";
	}
	
}
