package com.codingdojo.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojosandninjas.models.Ninja;
import com.codingdojo.dojosandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {

	@Autowired
	private NinjaRepository ninjaRepo;

//	READ ALL
	public List<Ninja> allNinjas() {
		return ninjaRepo.findAll();
	}

//	CREATE
	public Ninja createNinja(Ninja n) {
		return ninjaRepo.save(n);
	}

//	READ ONE
	public Ninja findNinja(Long id) {
		Optional<Ninja> maybeNinja = ninjaRepo.findById(id);
		if (maybeNinja.isPresent()) {
			return maybeNinja.get();
		} else {
			return null;
		}
	}

//	UPDATE
	public Ninja updateNinja(Ninja n) {
		return ninjaRepo.save(n);
	}

//	DELETE
	public void deleteNinja(Long id) {
		ninjaRepo.deleteById(id);
	}
}
