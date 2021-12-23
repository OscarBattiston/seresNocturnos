package edu.it.ejemplos;

import javax.persistence.*;
import com.github.javafaker.Faker;
import edu.it.components.Utiles;

public class CargaMasiva implements EjemploJPA {
	
	@Override
	public void run(EntityManager em) {
		
		Faker fkr = new Faker();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		for (int i=1; i<=1000; i++) {
			var usuario = Utiles.crearUsuario(fkr);
			em.persist(usuario);
		}
		
		tx.commit();
	}
	
}
