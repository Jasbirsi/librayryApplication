package com.example.libarayandstudent.libarayandstudent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibarayandstudentApplication implements CommandLineRunner {
													//we use command line runner to check if our program is running will of not
													//without using api
													//this will mainy use to check if our program if working fine with the databases or not

	public static void main(String[] args) {
		SpringApplication.run(LibarayandstudentApplication.class, args);
	}

	@Autowired
	CardRepository cardRepository;

	@Autowired
	StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

		Student student=new Student("jasbir",33,"India");
		Card card=new Card(100);

		student.setCard(card);

		cardRepository.save(card);
		studentRepository.save(student);





	}
}
