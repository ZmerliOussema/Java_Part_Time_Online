package com.codingdojo.studentroster.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.studentroster.models.Dorm;
import com.codingdojo.studentroster.services.DormService;

import jakarta.validation.Valid;

@Controller
public class DormController {

@Autowired	
private DormService dormService; 
	
	@GetMapping("/dorms")
	public String dorms(Model model) {
		List<Dorm> dorms = dormService.allDorms();
		model.addAttribute("dorms", dorms);
		return "index.jsp";
	}

	@GetMapping("/dorms/new")
	public String dormForm(@ModelAttribute("dorm")Dorm dorm) {
		
		return "createDorm.jsp";
	}

	@PostMapping("/dorms")
	public String process_dorm_form(@Valid @ModelAttribute("dorm") Dorm dorm, BindingResult result) {
		
		if(result.hasErrors()) {
			return "createDorm.jsp";
		}else {
			
			// save the dorm in DB
			Dorm newly_created_dorm = dormService.createDorm(dorm);
			return "redirect:/dorms";
		}
		
	}
	
	@GetMapping("/dorms/{id}")
	public String one_dorm_books(@PathVariable("id") Long id, Model model){
		
		Dorm selected_dorm = dormService.findDorm(id);
		model.addAttribute("dorm", selected_dorm);
		
		return "one_dorm.jsp";
		
	}
}
