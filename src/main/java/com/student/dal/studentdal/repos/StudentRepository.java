package com.student.dal.studentdal.repos;

import org.springframework.data.repository.CrudRepository;

import com.student.dal.studentdal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
	
}
