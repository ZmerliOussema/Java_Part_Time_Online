package com.example.burgertracker1.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.burgertracker1.models.Burger;

public interface BurgerRepository extends CrudRepository<Burger, Long> {
	
	List<Burger> findAll();

}
