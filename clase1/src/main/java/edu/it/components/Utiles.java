package edu.it.components;

import java.util.Random;
import java.util.UUID;

import com.github.javafaker.Faker;

import edu.it.entities.TipoDeUsuario;
import edu.it.entities.Usuario;

public class Utiles {
	public static Usuario crearUsuario(Faker fkr) {
		var u = new Usuario();
		
		u.id = UUID.randomUUID().toString();
		u.nombre = fkr.address().firstName();
		u.apellido = fkr.address().lastName();
		u.domicilio = String.join(" ", fkr.address().streetName(), 
				fkr.address().streetAddressNumber());
		u.pais = fkr.address().country();
		u.tipoDeUsuario = (new Random().nextInt() % 2 == 0) ? 
				TipoDeUsuario.USUARIO_ESTANDAR :
				TipoDeUsuario.USUARIO_ROOT;
		
		return u;
	}
}
