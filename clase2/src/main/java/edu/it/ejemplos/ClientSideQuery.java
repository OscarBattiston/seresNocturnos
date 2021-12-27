package edu.it.ejemplos;

import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

import edu.it.entities.Usuario;

public class ClientSideQuery implements EjemploJPA {

	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
	public void run(EntityManager em) {
		
		String queryStr = "SELECT u FROM Usuario u";
		TypedQuery<Usuario> tq = em.createQuery(queryStr, Usuario.class);
		var unaLista = tq.getResultStream()
			.filter(z -> z.apellido.equals("Dietrich"))
			.collect(Collectors.toList());
		
		for (Usuario u : unaLista) {
			logger.info(new Gson().toJson(u));
			logger.info("");
		}
	}

}
