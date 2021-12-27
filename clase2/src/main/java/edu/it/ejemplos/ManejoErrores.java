package edu.it.ejemplos;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.github.javafaker.Faker;

import edu.it.components.Utiles;

public class ManejoErrores implements EjemploJPA {
	public void run(EntityManager em) {
		Faker fkr = new Faker();
		
		var usuario = Utiles.crearUsuario(fkr);
		usuario.id = "123456789";
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(usuario);
		tx.commit();
	}
}
