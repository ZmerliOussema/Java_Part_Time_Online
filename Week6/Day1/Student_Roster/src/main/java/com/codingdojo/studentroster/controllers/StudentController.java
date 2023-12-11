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
import com.codingdojo.studentroster.models.Student;
import com.codingdojo.studentroster.services.DormService;
import com.codingdojo.studentroster.services.StudentService;

import jakarta.validation.Valid;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService; 
	
	@Autowired
	private DormService dormService; 
	
	@GetMapping("/students/new")
	public String students(@ModelAttribute("student")Student student, Model model) {
		List<Dorm> dorms = dormService.allDorms();
		model.addAttribute("dorms", dorms);
		
		return "createStudent.jsp";
	}


	@PostMapping("/students")
	public String process_student_form(@Valid @ModelAttribute("student") Student student, BindingResult result) {
		
		if(result.hasErrors()) {
			return "createStudent.jsp";
		}else {
			
			// save the student in DB
			Student newly_created_student = studentService.createStudent(student);
			return "redirect:/dorms";
		}
		
	}
	
	@GetMapping("/students/{id}")
	public String one_student_books(@PathVariable("id") Long id, Model model){
		
		Student selected_student = studentService.findStudent(id);
		model.addAttribute("student", selected_student);
		
		return "one_student.jsp";
		
	}
}
