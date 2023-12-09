package com.codingdojo.daikichi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/daikichi")
@RestController
public class DaikichiController {
	
	@RequestMapping("")
	public String welcome () {
		
		return "Welcome!";
	}
	
	@RequestMapping("/today")
	public String today () {
		
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow () {
		
		return "Tomorrow, an apportunity will arise, so be sure to be open to new ideas!";
	}
}
