package edu.it.ejemplos;

import static edu.it.components.Utiles.crearUsuario;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.github.javafaker.Faker;
import com.google.gson.Gson;

import edu.it.repository.UsuarioRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EjemploPersistir {
	private UsuarioRepository usuarioRepository;

	public EjemploPersistir(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	@Transactional
	public void run() {
		Faker fkr = new Faker();
		
		for (int z : new int[1000]) {
			var usu = crearUsuario(fkr);
			usuarioRepository.save(usu);
			log.info(new Gson().toJson(usu));
		}
	}
}
