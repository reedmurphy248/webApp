package com.tts.WebApp.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.tts.WebApp.Model.WeatherResponse;

@Service
public class WeatherService {

	@Value("${api_key}")
	private String apiKey;
	
	public WeatherResponse getForecast(String zipCode) {
		
		String url = "http://api.openweathermap.org/data/2.5/weather?zip=" + zipCode + "&units=imperial&appid=" + apiKey;
		RestTemplate restTemplate = new RestTemplate();
		try {
			return restTemplate.getForObject(url, WeatherResponse.class);
		}
		catch (HttpClientErrorException ex) {
			WeatherResponse response = new WeatherResponse();
			response.setName("error");
			return response;
		}
		
	}
	
	
}
