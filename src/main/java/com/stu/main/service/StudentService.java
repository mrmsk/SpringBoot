package com.stu.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stu.main.pojo.Student;
import com.stu.main.repo.StudentRepository;

@Service
public class StudentService {
@Autowired	
StudentRepository studentRepository;
	public Student addStudent(Student student) {
		
		return studentRepository.save(student);
		
		
	}
	
	
	
public Iterable<Student> temp() {	
	
	return studentRepository.findAll(); 
	

}
}