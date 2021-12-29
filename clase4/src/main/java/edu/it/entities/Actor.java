package edu.it.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@Table(name="actores")
@NoArgsConstructor
public class Actor {
	@Id
	public String id;
	public String nombre;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="actor_pelicula", 
			joinColumns = @JoinColumn(name="actor_id"),
			inverseJoinColumns = @JoinColumn(name="pelicula_id")
	)
	public List<Pelicula> peliculas = new ArrayList<Pelicula>();

	public Actor(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
}
