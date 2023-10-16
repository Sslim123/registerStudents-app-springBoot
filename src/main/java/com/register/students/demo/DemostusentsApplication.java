package com.register.students.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemostusentsApplication implements CommandLineRunner {

	public static void main(String[] args) {
	SpringApplication.run(DemostusentsApplication.class, args);
	
	}
	@Autowired
	
	private  RepositoryController repositoryController;
	@Override
	public void run(String... args) throws Exception{
		ModlController modle = new ModlController();
		modle.setFirstName("ali");
		modle.setLastName("hamid");
		modle.setAge(32);
		modle.setEmail("dayfan@gmail.com");

		repositoryController.save(modle);
	}

}
