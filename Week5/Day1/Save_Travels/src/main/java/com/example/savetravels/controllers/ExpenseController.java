package com.example.savetravels.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.savetravels.models.Expense;
import com.example.savetravels.services.ExpenseService;

import jakarta.validation.Valid;

@Controller
public class ExpenseController {

	@Autowired
	private ExpenseService expenseServ;
	
	@GetMapping("/expenses")
	public String getAllExpenses(Model model, @ModelAttribute("expense") Expense expense) {
		
		List<Expense> all_expenses = expenseServ.allExpenses();
		model.addAttribute("expenses", all_expenses);
		
		return "home.jsp";
		
	}
	
	@PostMapping("/expenses")
	public String createExpense(@Valid @ModelAttribute("expense")Expense expense,BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			List<Expense> all_expenses = expenseServ.allExpenses();
			model.addAttribute("expenses", all_expenses);
			return "home.jsp";
		} else {
			Expense newexpense = expenseServ.createExpense(expense);
			return "redirect:/expenses";
		}
		
		
	}
	
	@GetMapping("/expenses/edit/{id}")
	public String updateexpense(Model model, @PathVariable("id") Long id) {
		
		Expense thisexpense = expenseServ.findExpense(id);
		model.addAttribute("expense", thisexpense);
		return "editExpense.jsp";
		
	}
	
	@GetMapping("/expenses/{id}")
	public String getExpenseById(Model model, @PathVariable("id") Long id) {
		
		Expense thisexpense = expenseServ.findExpense(id);
		model.addAttribute("expense", thisexpense);
		return "expenseDetails.jsp";
		
	}
	
	@PutMapping("/expenses/{id}")
	public String updateExpense(@Valid @ModelAttribute("expense") Expense expense,
			BindingResult result) {
		
		if(result.hasErrors()) {
			return "editExpense.jsp";
		} else {
			expenseServ.updateExpense(expense);
			return "redirect:/expenses";
		}
	}
	
	@DeleteMapping("/expenses/{id}")
	public String delete(@PathVariable("id") Long id) {
		expenseServ.deleteExpense(id);
		return "redirect:/expenses";
	}
}
