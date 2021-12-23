package edu.it.ejemplos;

import javax.persistence.*;

import com.github.javafaker.Faker;

import edu.it.components.Utiles;

public class EjemploPersist implements EjemploJPA {

	@Override
	public void run(EntityManager em) {
		Faker fkr = new Faker();
		
		var usuario = Utiles.crearUsuario(fkr);
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(usuario);
		tx.commit();
	}
}
