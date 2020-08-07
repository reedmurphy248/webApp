package com.tts.WebApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tts.WebApp.Model.AskPost;
import com.tts.WebApp.Repository.AskPostRepository;

@Controller
public class AskMeController {

	@Autowired
	AskPostRepository askPostRepository;
	
	@GetMapping(value = "/askme")
	public String askMePage(Model model) {
		
		model.addAttribute("askPost", new AskPost());
		
		
		return "AskMeAnything";
		
	}
	
	@PostMapping(value = "/askme")
	public String newPost(Model model, AskPost askPost) {
		
		askPostRepository.save(askPost);
		model.addAttribute("askPost", askPost);
		
		return "AskMeAnything";
		
	}
	
	
	
}
