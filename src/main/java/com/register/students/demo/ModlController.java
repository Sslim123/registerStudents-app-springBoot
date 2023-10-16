package com.register.students.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_login")
public class ModlController {
	@Id
	@SequenceGenerator(
			name = "id_sequence",
			sequenceName = "id_sequence",
			allocationSize = 1
			)
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="id_sequence")
	private Long id;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")

	private String lastName;
	@Column(name = "age")

	private int age;
	@Column(name = "emailAddress")

	private String email;
	
	public ModlController(Long id,String firstName, String lastName, int age, String email) {
		super();
		this.setId(id);
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
	}
	public ModlController() {
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	

}
