package edu.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.it.entities.Pelicula;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, String> {

}
