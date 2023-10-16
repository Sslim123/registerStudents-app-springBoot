package com.register.students.demo;
//import java.nio.channels.IllegalChannelGroupException;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicesController {
	private final RepositoryController repositories;

	@Autowired
	public ServicesController(RepositoryController repositories) {
		this.repositories = repositories;
	}

	public List<ModlController> getStudents() {

		return repositories.findAll();

	}
//	public void getAllStudents(ModlController student) {
//		Optional<ModlController> modlOption = repositories.findModlStudentByEmail(student.getEmail());
//		if(modlOption.isPresent()) {
//		throw	new IllegalStateException("email don found");
//		}
//		repositories.save(student);
//		System.out.println(student);
//	}

}
