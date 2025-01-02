package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {

	public Student createStudent(Student employee);
	public List<Student> fetchAllStudent();
	public Student fetchStudentById(int id);
	public Student updateStudent(Student employee);
	public String deleteStudent(int id);
}
