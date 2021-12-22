package edu.it;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.it.components.ConectorJPA;

@SpringBootApplication
public class SeresNocturnos {
	public static void main(String[] args) {
		System.out.println("Inicio App");
		
		var connector = new ConectorJPA();
		connector.getEntityManager();
	}
}
