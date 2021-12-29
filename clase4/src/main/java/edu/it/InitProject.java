package edu.it;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import edu.it.ejemplos.EjemploPersistir;
import edu.it.ejemplos.MuchosMuchosInsert;

@Component
public class InitProject implements CommandLineRunner {
	
	@Autowired MuchosMuchosInsert muchosMuchosInsert;
	
	public void run(String... args) throws Exception {
		System.out.println("Inicio App");
		
		muchosMuchosInsert.run();
	}

}
