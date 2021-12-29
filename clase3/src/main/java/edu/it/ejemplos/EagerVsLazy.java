package edu.it.ejemplos;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import edu.it.entities.Director;
import edu.it.entities.Pelicula;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EagerVsLazy implements EjemploJPA {

	public void run(EntityManager em) {
		TypedQuery<Director> tq = em.createQuery("SELECT d from Director d", Director.class);
		var listaDirectores = tq.getResultList();
		
		for (Director d : listaDirectores) {
			log.info(d.id);
			log.info(d.nombre);
			for (Pelicula p : d.peliculas) {
				log.info("        " + p.nombre);
			}
			edu.it.components.Utiles.dormir();
		}
	}

}
