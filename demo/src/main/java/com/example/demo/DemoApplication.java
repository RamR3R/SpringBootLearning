package com.example.demo;

import com.example.demo.User.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

	}

	@GetMapping
	public List<User> print(){
        return List.of(
				new User(
				1L,
				"Ram",
				"sendtoramsundar@gmail.com",
				25,
				LocalDate.of(1998,10,30)
		));
	}
}
