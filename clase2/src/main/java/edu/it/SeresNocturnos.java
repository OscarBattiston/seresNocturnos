package edu.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.it.components.ConectorJPA;
import edu.it.ejemplos.ClientSideQuery;

@SpringBootApplication
public class SeresNocturnos {
	public static void main(String[] args) {
		SpringApplication.run(SeresNocturnos.class, args);
	}
}
