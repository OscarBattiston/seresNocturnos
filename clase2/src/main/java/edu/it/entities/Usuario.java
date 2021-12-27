package edu.it.entities;

import javax.persistence.*;

@Entity
@Table(name="usuarios")
public class Usuario {
	@Id
	public String id;
    public String nombre;
    public String apellido;
    public String domicilio;
    public String pais;
    @Column(name="tipo_de_usuario")
    public TipoDeUsuario tipoDeUsuario;
}
