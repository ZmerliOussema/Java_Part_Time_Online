package com.codingdojo.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoService {

	@Autowired
	private DojoRepository dojoRepo;

//	READ ALL
	public List<Dojo> allDojos() {
		return dojoRepo.findAll();
	}

//	CREATE
	public Dojo createDojo(Dojo d) {
		return dojoRepo.save(d);
	}

//	READ ONE
	public Dojo findDojo(Long id) {
		Optional<Dojo> maybeDojo = dojoRepo.findById(id);
		if (maybeDojo.isPresent()) {
			return maybeDojo.get();
		} else {
			return null;
		}
	}

//	UPDATE
	public Dojo updateDojo(Dojo d) {
		return dojoRepo.save(d);
	}

//	DELETE
	public void deleteDojo(Long id) {
		dojoRepo.deleteById(id);
	}
}
