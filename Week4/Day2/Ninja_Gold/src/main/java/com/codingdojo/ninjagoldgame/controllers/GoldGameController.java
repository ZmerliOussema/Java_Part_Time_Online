package com.codingdojo.ninjagoldgame.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GoldGameController {
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
}
