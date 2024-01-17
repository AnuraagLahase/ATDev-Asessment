package org.jsp.spring_boot_student_app.controller;

import java.util.List;

import org.jsp.spring_boot_student_app.dto.Student;
import org.jsp.spring_boot_student_app.service.Student_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student_Controller {
	@Autowired
	private Student_Service service;
	
	@PostMapping("/save/stud")
	public Student save(@RequestBody Student student) {
		return service.save(student);
	}
	
	@GetMapping("/find/stud/{id}")
	public Student findById(@PathVariable int id) {
		return service.findById(id);
	}
	
	@PutMapping("/update/stud/{id}")
	public Student update(@RequestBody Student student,@PathVariable int id) {
		return service.update(student, id);
	}
	
	@GetMapping("/findAll/stud")
	public List<Student> findAll() {
		return service.findAll();
	}
	
	@DeleteMapping("/delete/stud/{id}")
	public void deleteById(@PathVariable int id) {
		 service.deleteById(id);
	}
	
	@DeleteMapping("/deleteAll/stud")
	public void deleteAll() {
		service.deleteAll();
	}
	
	@GetMapping("/login/stud")
	public Student login(@RequestBody Student student) {
		return service.login(student);
	}
}
