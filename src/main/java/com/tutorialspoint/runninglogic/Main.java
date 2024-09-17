package com.tutorialspoint.runninglogic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class Main implements CommandLineRunner {
	@Value("${spring.application.name:demoservice}")
	private String name;

	private PostConstructExampleBean postConstructExampleBean = new PostConstructExampleBean();

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello World from Command Line Runner");
		System.out.println("postConstructExampleBean: " + postConstructExampleBean);

	}

	@RequestMapping(value = "/")
	public String name() {
		return name;
	}

}
