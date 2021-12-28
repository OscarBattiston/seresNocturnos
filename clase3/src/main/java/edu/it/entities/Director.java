package edu.it.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="directores")
public class Director {
	@Id
	public String id;
	public String nombre;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="director_id")
	public List<Pelicula> peliculas = new ArrayList<Pelicula>(); 
}
