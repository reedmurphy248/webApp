package com.tts.WebApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping(value="/")
	public String home() {
		return "Home";
	}
	
	@GetMapping(value="/aboutme")
	public String aboutMe() {
		return "AboutMe";
	}
	
}