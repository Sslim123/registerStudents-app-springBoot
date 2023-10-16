package com.register.students.demo;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryController extends JpaRepository<ModlController, Long> {
	//@Query("SELECT s FROM student_login s WHERE s.email = ?1")
Optional<ModlController>  findModlStudentByEmail(String email);
}
