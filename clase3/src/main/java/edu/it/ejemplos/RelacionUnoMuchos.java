package edu.it.ejemplos;

import javax.persistence.EntityManager;

import edu.it.entities.Director;
import edu.it.entities.Pelicula;

public class RelacionUnoMuchos implements EjemploJPA {
	public void run(EntityManager em) {
		/*
		 * Van a crear un director, una pelicula
		 * van a setear todos los datos de pelicula (2 peliculas)
		 * todos los datos de director
		 * 
		 * El que quiera va a realizar un merge sobre el director
		 * El que quiera va a realizar un merge sobre pelicula
		 */
		
		Director kubrick = new Director("200000001", "Stanley Kubrick");
        Director almodovar = new Director("200000002", "Pedor Almodovar");
        Director pineiro = new Director("200000003", "Marcelo Pyneiro");
        Director rodrigoGrande = new Director("200000004", "Rodrigo Grande");
        Director ethanCohen = new Director("200000005", "Hermanos Cohen");
        
        Pelicula volver = new Pelicula("100000001", "Volver", "drama", almodovar);
        Pelicula doloryGloria = new Pelicula("100000002", "Dolor y Gloria", "drama", almodovar);

        Pelicula elResplandor = new Pelicula("100000003", "El resplandor", "suspenso", kubrick);

        Pelicula barryLindon = new Pelicula("100000004", "Barry Lyndon", "drama", kubrick);
        Pelicula plataQuemada = new Pelicula("100000005", "Plata quemada","Drama", pineiro);
        Pelicula alFinalDelTunnel = new Pelicula("100000006", "Al final del tunnel","Suspenso", rodrigoGrande);
        Pelicula elMetodo = new Pelicula("100000007", "El metodo", "Suspenso", pineiro);
        Pelicula noCountryForOldMen = new Pelicula("100000008", "No Country for Old Men", "Suspenso", ethanCohen);

        
        
		var tx = em.getTransaction();
		tx.begin();
		em.merge(kubrick);
		em.merge(almodovar);
		em.merge(pineiro);
		em.merge(rodrigoGrande);
		em.merge(ethanCohen);
		tx.commit();
        
	}
}
