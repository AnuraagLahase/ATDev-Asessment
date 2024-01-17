package org.jsp.spring_boot_student_app.repository;

import org.jsp.spring_boot_student_app.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Student_Repository extends JpaRepository<Student,Integer>{
	Student save(Student student);
	Student findById(int id);
	
	@Query("Select student from Student student where email=:myemail And pwd=:mypassword")
	Student login(@Param(value = "myemail") String email,@Param(value = "mypassword") String pwd);
}
