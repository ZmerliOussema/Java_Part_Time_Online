package com.example.burgertracker1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.burgertracker1.models.Burger;
import com.example.burgertracker1.repositories.BurgerRepository;

@Service
public class BurgerService {

	@Autowired
	private BurgerRepository burgerRepository;

//	Returns all Burgers
	public List<Burger> getAllBurgers() {
		return burgerRepository.findAll();
	}

//    Returns a Burger by Id
	public Burger getBurgerById(Long id) {
		Optional<Burger> burger = burgerRepository.findById(id);
		if (burger.isPresent()) {
			return burger.get();
		} else {
			return null;
		}
	}

// Creates a burger
	public Burger createBurger(Burger b) {
		return burgerRepository.save(b);
	}

//  Edit a Burger
	public Burger updateBurger(Burger b) {
		return burgerRepository.save(b);
	}
}
