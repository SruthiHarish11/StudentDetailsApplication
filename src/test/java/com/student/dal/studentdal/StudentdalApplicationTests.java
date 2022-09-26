package com.student.dal.studentdal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.student.dal.studentdal.entities.Student;
import com.student.dal.studentdal.repos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	private StudentRepository studentRepository;
	@Test
	void testCreateStudent() {
		
		Student student = new Student();
		student.setName("student1");
		student.setCourse("Computer");
		student.setFees(30.00);
		studentRepository.save(student);
	}

	@Test
	void findByStudent() {
		Student student = studentRepository.findById(1l).get();
		System.out.println(student);
	}
	
	@Test
	void updateStudent() {
		Student student = studentRepository.findById(1l).get();
		student.setFees(122.00);
		studentRepository.save(student);
	}
	
	@Test
	void testDeleteStudent() {
		Student student = studentRepository.findById(1l).get();
		studentRepository.delete(student);
	}
}
