package com.example.burgertracker1.controllers;

import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.burgertracker1.models.Burger;
import com.example.burgertracker1.services.BurgerService;

import jakarta.validation.Valid;

@Controller
public class BurgerController {

	@Autowired
	private BurgerService burgerService;

//	Display Route: Display all Burgers | Create Burger Form
	@GetMapping("/")
	public String getAllBurgers(Model model, @ModelAttribute("burger") Burger burger) {

		List<Burger> allBurgers = burgerService.getAllBurgers();
		model.addAttribute("burgers", allBurgers);
		return "index.jsp";
	}

//	Action Route: Create a Burger
	@PostMapping("/burgers")
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

//	Display Route: Display Edit Form
	@GetMapping("/burgers/{id}")
	public String updateBurger(Model model, @PathVariable("id") Long id) {

		Burger burger = burgerService.getBurgerById(id);
		model.addAttribute("burger", burger);
		return "edit.jsp";

	}

// Action Route -- Edit a Book

	@PutMapping("/burgers/{id}")
	public String updateBurger(@Valid @ModelAttribute("burger") Burger burger, BindingResult result) {

		if (result.hasErrors()) {
			return "edit.jsp";
		} else {
			burgerService.updateBurger(burger);
			return "redirect:/";
		}
	}

}
