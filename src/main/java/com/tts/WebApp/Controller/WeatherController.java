package com.tts.WebApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tts.WebApp.Model.Request;
import com.tts.WebApp.Model.WeatherResponse;
import com.tts.WebApp.Service.WeatherService;

@Controller
public class WeatherController {

	@Autowired
	private WeatherService weatherService;
	
	@GetMapping(value="/weather")
	public String getIndex(Model model) {
		
		model.addAttribute("request", new Request());
		return "WeatherPage";
		
	}
	
	@PostMapping(value="/weather")
	public String postIndex(Request request, Model model) {
		
		WeatherResponse data = weatherService.getForecast(request.getZipCode());
		model.addAttribute("data", data);
		return "WeatherPage";
		
	}
	
}
