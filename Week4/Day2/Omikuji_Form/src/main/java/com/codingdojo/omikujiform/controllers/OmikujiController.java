package com.codingdojo.omikujiform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class OmikujiController {
	
	@GetMapping("/omikuji")
	public String form() {
		return "form.jsp";
	}
	
	@PostMapping("/processForm")
	public String processForm(@RequestParam(value="pickNumber") String pickNumber, 
							@RequestParam(value="city") String city, 
							@RequestParam(value="realPerson") String realPerson, 
							@RequestParam(value="hobby") String hobby, 
							@RequestParam(value="livingThing") String livingThing,
							@RequestParam(value="somethingNice") String somethingNice, 
							HttpSession session) {
		
		session.setAttribute("pickNumber", pickNumber);
		session.setAttribute("city", city);
		session.setAttribute("realPerson", realPerson);
		session.setAttribute("hobby", hobby);
		session.setAttribute("livingThing", livingThing);
		session.setAttribute("somethingNice", somethingNice);
		
		return "redirect:/omikuji/show";
		
	}
	
	@GetMapping("/omikuji/show")
	public String show() {
		
		return "show.jsp";
	}
}
