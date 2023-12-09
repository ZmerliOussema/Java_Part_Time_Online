package com.codingdojo.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {

//	@RequestMapping("/")
//	public String human(@RequestParam(value = "name", required = false) String name,
//						@RequestParam(value = "last_name", required = false) String lastname) {
//		if (name == null && lastname == null) {
//			return "Hello Human";
//		}
//		return "Hello " + name + " " + lastname;
//	}
	
	// Sensei Bonus
	@RequestMapping("/")
	public String human(@RequestParam(value = "name", required = false) String name,
						@RequestParam(value = "times", required = false) int times) {
		if (name == null) {
			return "Hello Human";
		}
		String string1 = "Hello " + name;
		for (int i=2; i<=times; i++) {
			string1 = string1 + " " +"Hello " + name;
		}
		return string1;
	}

}
