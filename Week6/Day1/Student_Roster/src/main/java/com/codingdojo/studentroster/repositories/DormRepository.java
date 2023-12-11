package com.codingdojo.studentroster.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.studentroster.models.Dorm;

public interface DormRepository extends CrudRepository<Dorm, Long> {

	List<Dorm> findAll();
}
