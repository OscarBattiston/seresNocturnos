package edu.it.ejemplos;

import javax.persistence.EntityManager;

import com.github.javafaker.Faker;

import edu.it.components.Utiles;
import edu.it.entities.Usuario;

public class PersistVsMerge implements EjemploJPA {
	public void run(EntityManager em) {
		//var fkr = new Faker();
		//var usu = Utiles.crearUsuario(fkr);
		var usu = em.find(Usuario.class, "1234");
		
		if (usu == null) {
			throw new RuntimeException("1234 no existe");
		}
		
		usu.nombre = "Andys";
		
		var tx = em.getTransaction();
		tx.begin();
		em.merge(usu);
		tx.commit();
	}
}
