package com.codingdojo.studentroster.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.studentroster.models.Dorm;
import com.codingdojo.studentroster.repositories.DormRepository;

@Service
public class DormService {

	@Autowired
	private DormRepository dormRepo;

//	READ ALL
	public List<Dorm> allDorms() {
		return dormRepo.findAll();
	}

//	CREATE
	public Dorm createDorm(Dorm p) {
		return dormRepo.save(p);
	}

//	READ ONE
	public Dorm findDorm(Long id) {
		Optional<Dorm> maybeDorm = dormRepo.findById(id);
		if (maybeDorm.isPresent()) {
			return maybeDorm.get();
		} else {
			return null;
		}
	}

//	UPDATE
	public Dorm updateDorm(Dorm p) {
		return dormRepo.save(p);
	}

//	DELETE
	public void deleteDorm(Long id) {
		dormRepo.deleteById(id);
	}
}
