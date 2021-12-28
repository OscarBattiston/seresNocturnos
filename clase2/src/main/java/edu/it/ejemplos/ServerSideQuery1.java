package edu.it.ejemplos;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

import edu.it.entities.Usuario;

public class ServerSideQuery1 implements EjemploJPA {
	Logger logger = LoggerFactory.getLogger(getClass());
	public void run(EntityManager em) {
		var strQuery = "SELECT u FROM Usuario u WHERE apellido = :apellidoParam";
		TypedQuery<Usuario> queryusu = em.createQuery(strQuery, Usuario.class);
		queryusu.setParameter("apellidoParam", "Dietrich");
		
		for (Usuario u : queryusu.getResultList()) {
			logger.info(new Gson().toJson(u));
		}
	}
}
