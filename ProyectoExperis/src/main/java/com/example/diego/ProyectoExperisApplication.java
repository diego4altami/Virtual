package com.example.diego;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Permite crear rutar para una API
@SpringBootApplication
public class ProyectoExperisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoExperisApplication.class, args);
	}

}
