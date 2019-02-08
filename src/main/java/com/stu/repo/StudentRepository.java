package com.stu.repo;


import org.springframework.data.repository.CrudRepository;

import com.stu.pojo.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>{
	
	
	boolean addStudent(Student student);
	
}
	

