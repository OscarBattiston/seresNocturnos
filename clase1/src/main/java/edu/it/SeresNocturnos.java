package edu.it;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.it.components.ConectorJPA;
import edu.it.entities.Usuario;

@SpringBootApplication
public class SeresNocturnos {
	public static void main(String[] args) {
		System.out.println("Inicio App");
		
		var connector = new ConectorJPA();
		var em = connector.getEntityManager();
		
		// new CargaMasiva().run(em);
		
		java.util.function.Predicate<Usuario> predicadoSobreUsuario = (Usuario u) -> {
			if (u.nombre.equals("beto")) {
				return true;
			}
			return false;
		};
		
		java.util.function.Predicate<Usuario> predicadoSobreUsuariov2 = u -> {
			if (u.nombre.equals("beto")) {
				return true;
			}
			return false;
		};
		
		java.util.function.Predicate<Usuario> predicadoSobreUsuariov3 = u -> {
			return (u.nombre.equals("beto"));
		};
		
		java.util.function.Predicate<Usuario> predicadoSobreUsuariov4 = 
													u -> u.nombre.equals("beto");
													
		java.util.function.Predicate<Usuario> predicadoSobreUsuariov5 = 
															u -> false;
		
		Usuario u = new Usuario();
		u.nombre = "beto";
		
		Boolean b = predicadoSobreUsuario.test(u);
		System.out.println(b);
		b = predicadoSobreUsuariov2.test(u);
		System.out.println(b);
		b = predicadoSobreUsuariov3.test(u);
		System.out.println(b);
		b = predicadoSobreUsuariov4.test(u);
		System.out.println(b);
		b = predicadoSobreUsuariov5.test(u);
		System.out.println(b);
	}
}
