package com.pauli.mvc;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
	
	ArrayList<Person> lista = new ArrayList<>();
	
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
	
	// Tulosta vieraat
	@RequestMapping("/vieraslista")
	public String visitors(Model model) {
		model.addAttribute("vieraat", lista);
		return "guests";
	}
	
	// Lis‰‰ uusi vieras 
	@RequestMapping(value = "/addGuest", method = RequestMethod.POST)
	public String post(@RequestParam String name, @RequestParam int age) {
		lista.add(new Person(name, age));
		return "redirect:/vieraslista";
	}
	
	
}
