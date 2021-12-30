package edu.it.ejemplos;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import edu.it.entities.Usuario;
import edu.it.repository.UsuarioRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class QueryXConvencion  {
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public void run() {
		var lst = usuarioRepository
				.findTop1ByNombreOrderByApellidoDesc("Elliot");
		
		for (Usuario u : lst) {
			log.info(new Gson().toJson(u));
		}
		
		Optional<Usuario> optUsu = usuarioRepository.findById("");
		
		if (optUsu.isPresent()) {
			log.info(new Gson().toJson(optUsu.get()));
		}
	}
}
