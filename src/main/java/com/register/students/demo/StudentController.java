package com.register.students.demo;
import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/student")
public class StudentController {

	private final ServicesController servicesController;

	@Autowired
	private RepositoryController repositoryController;

	public StudentController(ServicesController servicesController) {
		super();
		this.servicesController = servicesController;
	}

	@GetMapping
	public List<ModlController> getAllStudent() {
		return repositoryController.findAll();
	}

	@PostMapping
	public void registerStudent(@RequestBody ModlController student) {
		repositoryController.save(student);
	}

	@GetMapping("{id}")
	public ResponseEntity<ModlController> getStudentById(@PathVariable Long id) {
		ModlController studentModl = repositoryController.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("student not found with id " + id));
		return ResponseEntity.ok(studentModl);
	}

	@PutMapping("{id}")
	public ResponseEntity<ModlController> updateStudentById(@PathVariable Long id,
			@RequestBody ModlController updateModl) {
		ModlController updateStudent = repositoryController.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("student not found with id " + id));
		updateStudent.setAge(updateModl.getAge());
		updateStudent.setEmail(updateModl.getEmail());
		updateStudent.setFirstName(updateModl.getFirstName());
		updateStudent.setLastName(updateModl.getLastName());
		repositoryController.save(updateModl);
		return ResponseEntity.ok(updateStudent);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<HttpStatus> deleteStudentById(@PathVariable Long id) {
		ModlController studentModl = repositoryController.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("student not found with id " + id));
		repositoryController.delete(studentModl);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
