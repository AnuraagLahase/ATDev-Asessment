package org.jsp.spring_boot_student_app.dao;

import java.util.List;

import org.jsp.spring_boot_student_app.dto.Student;
import org.jsp.spring_boot_student_app.repository.Student_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Student_Dao {
	@Autowired
	private Student_Repository repository;
	
	public Student save(Student student) {
		return repository.save(student);
	}
	
	public Student findById(int id) {
		return repository.findById(id);
	}
	
	public Student update(Student student,int id) {
		student.getId();
		return repository.save(student);
	}
	
	public List<Student> findAll() {
		return repository.findAll();
	}
	
	public void deleteById(int id) {
		 repository.deleteById(id);
	}
	
	public void deleteAll() {
		repository.deleteAll();
	}
	
	public Student login(Student student) {
		return repository.login(student.getEmail(), student.getPwd());
	}
}
