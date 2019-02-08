package com.stu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stu.pojo.Student;
import com.stu.repo.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;

	public void addStudent(Student student) {
		
		studentRepository.addStudent(student);
		
		
	}
	
	
	
	

}
