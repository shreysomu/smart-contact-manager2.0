package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	@GetMapping("/home")

	public String home(Model model) {
		System.out.println("Home Page handler");
		model.addAttribute("name","SubString Technologies");
		model.addAttribute("youtubeChannel", "CodeVibes");
		model.addAttribute("githubRepository", "https://github.com/codevibes/scm-springboot");
		return "home";
	}
}
