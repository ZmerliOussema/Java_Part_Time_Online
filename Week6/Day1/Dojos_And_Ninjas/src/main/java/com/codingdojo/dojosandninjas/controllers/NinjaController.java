package com.codingdojo.dojosandninjas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.models.Ninja;
import com.codingdojo.dojosandninjas.services.DojoService;
import com.codingdojo.dojosandninjas.services.NinjaService;

import jakarta.validation.Valid;

@Controller
public class NinjaController {

	@Autowired
	private NinjaService ninjaService;
	
	@Autowired
	private DojoService dojoService;

	@GetMapping("/ninjas/new")
	public String ninjas(@ModelAttribute("ninja") Ninja ninja, Model model) {
		
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		
		return "createNinja.jsp";
	}

	@PostMapping("/ninjas")
	public String process_ninja_form(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {

		if (result.hasErrors()) {
			return "createNinja.jsp";
		} else {

			// save the ninja in DB
			Ninja newly_created_ninja = ninjaService.createNinja(ninja);
			return "redirect:/ninjas/new";
		}

	}

	@GetMapping("/ninjas/{id}")
	public String one_ninja_books(@PathVariable("id") Long id, Model model) {

		Ninja selected_ninja = ninjaService.findNinja(id);
		model.addAttribute("ninja", selected_ninja);

		return "one_ninja.jsp";

	}
}
