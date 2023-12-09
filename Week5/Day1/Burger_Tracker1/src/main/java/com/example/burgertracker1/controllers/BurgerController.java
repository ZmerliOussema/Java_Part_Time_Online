package com.example.burgertracker1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.burgertracker1.models.Burger;
import com.example.burgertracker1.services.BurgerService;

import jakarta.validation.Valid;

@Controller
public class BurgerController {
	
	@Autowired
	private BurgerService burgerService;
	
	@GetMapping("/")
	public String getAllBurgers(Model model, @ModelAttribute("burger") Burger burger) {
		
		List<Burger> allBurgers = burgerService.getAllBurgers();
		model.addAttribute("burgers", allBurgers);
		return "index.jsp";
	}
	
	@PostMapping("/newBurger")
    public String create(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model) {
        if (result.hasErrors()) {
        	List<Burger> allBurgers = burgerService.getAllBurgers();
    		model.addAttribute("burgers", allBurgers);
            return "index.jsp";
        } else {
            burgerService.createBurger(burger);
            return "redirect:/";
        }
    }
	
}
