package com.codingdojo.studentroster.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.studentroster.models.Student;
import com.codingdojo.studentroster.repositories.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepo;

//	READ ALL
	public List<Student> allStudents() {
		return studentRepo.findAll();
	}

//	CREATE
	public Student createStudent(Student p) {
		return studentRepo.save(p);
	}

//	READ ONE
	public Student findStudent(Long id) {
		Optional<Student> maybeStudent = studentRepo.findById(id);
		if (maybeStudent.isPresent()) {
			return maybeStudent.get();
		} else {
			return null;
		}
	}

//	UPDATE
	public Student updateStudent(Student p) {
		return studentRepo.save(p);
	}

//	DELETE
	public void deleteStudent(Long id) {
		studentRepo.deleteById(id);
	}
}
