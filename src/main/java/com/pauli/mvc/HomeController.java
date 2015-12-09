package com.pauli.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String view(Model model) {
		model.addAttribute("viesti", "aikamoista");
		return "home";
	}
	
}
