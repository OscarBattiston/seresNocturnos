package edu.it;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import edu.it.components.ConectorJPA;
import edu.it.ejemplos.*;

import javax.persistence.*;

@Component
public class InitProject implements CommandLineRunner {
	public void run(String... args) throws Exception {
		System.out.println("Inicio App");
		
		ConectorJPA connector = new ConectorJPA();
		EntityManager em = connector.getEntityManager();
		
		new EagerVsLazy().run(em);
		
		System.out.println("FIN DE LA APP O CONTINUA LA APP");
	}

}
