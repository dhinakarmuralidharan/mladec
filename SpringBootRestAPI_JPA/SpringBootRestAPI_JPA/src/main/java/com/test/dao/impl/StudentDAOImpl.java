package com.test.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dao.StudentDAO;
import com.test.entity.Student;
import com.test.repository.StudentRepository;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private StudentRepository repository;
	
	@Override
	public Student createStudent(Student std) {
		
		return repository.save(std);
	}

	@Override
	public Optional<Student> getStudentById(int id) {
		
		return repository.findById(id);
	}

	@Override
	public Student updateStudentById(Student std) {
		
		return repository.save(std);
	}

	@Override
	public List<Student> deleteStudentById(int id) {
		repository.deleteById(id);
		
		return repository.findAll();
	}

	@Override
	public List<Student> getAllStudents() {
		
		return repository.findAll();
	}

	
}
