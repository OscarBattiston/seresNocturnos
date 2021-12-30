package edu.it.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.it.entities.TipoDeUsuario;
import edu.it.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {
	List<Usuario> findAllByTipoDeUsuario(TipoDeUsuario tu);
	List<Usuario> findAllByTipoDeUsuarioAndNombre(TipoDeUsuario tu, String nombre);
	List<Usuario> findAllByNombreOrderByApellido(String nombre);
	List<Usuario> findAllByNombreOrderByApellidoDesc(String nombre);
	List<Usuario> findTop1ByNombreOrderByApellidoDesc(String nombre);
	
}

/*
 * Para mas convenciones, https://www.baeldung.com/spring-data-derived-queries
 */
