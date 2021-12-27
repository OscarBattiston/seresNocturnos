package edu.it.ejemplos;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.apache.log4j.Logger;

import com.github.javafaker.Faker;

import edu.it.components.Utiles;

public class ManejoErrores implements EjemploJPA {
	Logger logger = Logger.getLogger(getClass());
	public void run(EntityManager em) {
		Faker fkr = new Faker();
		
		var usuario = Utiles.crearUsuario(fkr);
		usuario.id = "123456789";
		var usuario2 = Utiles.crearUsuario(fkr);
		
		EntityTransaction tx = null;
		
		try {
			tx = em.getTransaction();
			tx.begin();
			em.persist(usuario2);
			// em.persist(usuario);
			em.persist(new String());
			tx.commit();
		}
		catch (Throwable t) {
			System.out.println("**************************************************");
			System.out.println("SALE X EXCEPTION VOY A INTENTAR ROLLBACK");
			System.out.println(t.getClass().getName().toString());
			System.out.println("**************************************************");
			if (tx != null) try { tx.rollback(); } catch (Throwable z) {}
		}
	}
}
