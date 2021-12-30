package edu.it;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import edu.it.ejemplos.QueryXConvencion;

@Component
public class InitProject implements CommandLineRunner {
	
	@Autowired QueryXConvencion queryXConvencion;
	
	public void run(String... args) throws Exception {
		System.out.println("Inicio App");
		
		queryXConvencion.run();
	}

}
