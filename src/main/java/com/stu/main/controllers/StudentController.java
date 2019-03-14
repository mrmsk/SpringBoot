package com.stu.main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stu.main.pojo.Student;
import com.stu.main.service.StudentService;

@RestController
@RequestMapping(value = "/home")
public class StudentController {
	@Autowired
	private StudentService stuService;

	@PostMapping(value = "/registerstudent", consumes = "application/json", produces = "application/json")
	public Student addStudent(@RequestBody Student student) {

		stuService.addStudent(student);

		return null;

	}

	@GetMapping(value = "/test")
	public Iterable<Student> testmethod() {
		return stuService.temp();
	}
}
