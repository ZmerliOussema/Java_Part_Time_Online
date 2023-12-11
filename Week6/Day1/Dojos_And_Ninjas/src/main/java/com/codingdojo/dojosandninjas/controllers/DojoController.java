package com.codingdojo.dojosandninjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.services.DojoService;
import jakarta.validation.Valid;

@Controller
public class DojoController {

	@Autowired
	private DojoService dojoServ;

	@GetMapping("/dojos/new")
	public String dojos(@ModelAttribute("dojo") Dojo dojo) {

		return "createDojo.jsp";
	}

	@PostMapping("/dojos")
	public String process_dojo_form(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {

		if (result.hasErrors()) {
			return "createDojo.jsp";
		} else {

			// save the dojo in DB
			Dojo newly_created_dojo = dojoServ.createDojo(dojo);
			return "redirect:/dojos/new";
		}

	}

	@GetMapping("/dojos/{id}")
	public String getDojoById(@PathVariable("id") Long id, Model model) {

		Dojo dojo = dojoServ.findDojo(id);
		model.addAttribute("dojo", dojo);

		return "dojoDetails.jsp";

	}
}
