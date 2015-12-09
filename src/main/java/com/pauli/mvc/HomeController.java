package com.pauli.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String view(Model model) {
		model.addAttribute("viesti", "aikamoista");
		return "home";
	}
	
	@RequestMapping("/sijainti")
	public String view(Model model, @RequestParam(required=false, defaultValue="Hesa") String sijainti,
									@RequestParam(required=false, defaultValue="1990") String aika){
		
		model.addAttribute("sijainti", sijainti);
		model.addAttribute("aika", aika);
		
		return "sijainti";
	}
	
	
}
