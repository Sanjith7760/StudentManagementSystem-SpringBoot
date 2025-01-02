package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/stu")
public class StudentController {

	@Autowired
	StudentService service;
	
	@PostMapping("/poststu")
	public Student createStudent(@RequestBody Student student) {
		return service.createStudent(student);
	}
	
	@GetMapping("/students")
	public List<Student> fetchAllStudent(){
		return service.fetchAllStudent();
	}
	
	@GetMapping("/student/{id}")
	public Student fetchStudentById(@PathVariable int id) {
		return service.fetchStudentById(id);
	}
	
	@PutMapping("/updatestu")
	public Student updateStudent(@RequestBody Student student) {
		return service.updateStudent(student);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		return service.deleteStudent(id);
	}
}
