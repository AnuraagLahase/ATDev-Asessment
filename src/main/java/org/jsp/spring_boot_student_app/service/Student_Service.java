package org.jsp.spring_boot_student_app.service;

import java.util.List;

import org.jsp.spring_boot_student_app.dao.Student_Dao;
import org.jsp.spring_boot_student_app.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Student_Service {
	@Autowired
	private Student_Dao dao;
	
	public Student save(Student student) {
		return dao.save(student);
	}
	
	public Student findById(int id) {
		return dao.findById(id);
	}
	
	public Student update(Student student,int id) {
		return dao.update(student, id);
	}
	
	public List<Student> findAll() {
		return dao.findAll();
	}
	
	public void deleteById(int id) {
		 dao.deleteById(id);
	}
	
	public void deleteAll() {
		dao.deleteAll();
	}
	
	public Student login(Student student) {
		return dao.login(student);
	}
}
