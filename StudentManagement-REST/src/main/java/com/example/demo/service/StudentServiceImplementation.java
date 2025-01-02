package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public Student createStudent(Student employee) {
		return studentRepository.save(employee);
	}

	@Override
	public List<Student> fetchAllStudent() {
		return studentRepository.findAll();
	}

	@Override
	public Student fetchStudentById(int id) {
		return studentRepository.findById(id).orElse(null);
	}

	@Override
	public Student updateStudent(Student employee) {
		return studentRepository.save(employee);
	}

	@Override
	public String deleteStudent(int id) {
		studentRepository.deleteById(id);
		return "DELETED SUCCESSFULLY";
	}

}
