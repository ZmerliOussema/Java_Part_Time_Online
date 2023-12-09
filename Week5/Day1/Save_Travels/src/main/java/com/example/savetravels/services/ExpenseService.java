package com.example.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.savetravels.models.Expense;
import com.example.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {

	@Autowired
	private ExpenseRepository ExpenseRepo;

//	READ ALL
	public List<Expense> allExpenses() {
		return ExpenseRepo.findAll();
	}

//	CREATE
	public Expense createExpense(Expense e) {
		return ExpenseRepo.save(e);
	}

//	READ ONE
	public Expense findExpense(Long id) {
		Optional<Expense> maybeExpense = ExpenseRepo.findById(id);
		if (maybeExpense.isPresent()) {
			return maybeExpense.get();
		} else {
			return null;
		}
	}

//	UPDATE
	public Expense updateExpense(Expense e) {
		return ExpenseRepo.save(e);
	}

//	DELETE
	public void deleteExpense(Long id) {
		ExpenseRepo.deleteById(id);
	}
}
