package com.codingdojo.counter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {
	
	@RequestMapping("/counter")
	public String counter() {
		
		return "counter.jsp";
	}
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		// If the count is not already in session
				if (session.getAttribute("count") == null) {
					// Use setAttribute to initialize the count in session
					session.setAttribute("count", 0);
				}
				else {
					session.setAttribute("count", (int) session.getAttribute("count") + 1);
				}
		
				return "welcome.jsp";
	}
	
	// Ninja Bonus 1.
	@RequestMapping("/ninja1")
	public String ninja1(HttpSession session) {
		// If the count is not already in session
				if (session.getAttribute("count") == null) {
					// Use setAttribute to initialize the count in session
					session.setAttribute("count", 0);
				}
				else {
					session.setAttribute("count", (int) session.getAttribute("count") + 2);
				}
				
				return "ninja1.jsp";
	}
	
	// Ninja Bonus 2.
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		
		session.invalidate();
		return "counter.jsp";
	}
	
}
