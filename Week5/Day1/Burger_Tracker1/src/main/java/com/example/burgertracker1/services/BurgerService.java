package com.example.burgertracker1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.burgertracker1.models.Burger;
import com.example.burgertracker1.repositories.BurgerRepository;

@Service
public class BurgerService {
	
	@Autowired
	private BurgerRepository burgerRepository;
	
	// returns all burgers
    public List<Burger> getAllBurgers() {
        return burgerRepository.findAll();
    }
    
 // creates a burger
    public Burger createBurger(Burger b) {
        return burgerRepository.save(b);
    }
}
