package services;

import java.util.Optional;

import models.UsuariooModel;
import repositories.usuarioRepository;


public class EquipoServices {
	
	
	//obtener equipo por id
		public static UsuariooModel obtenerUsuario(Long id) {
			Optional<UsuariooModel> user = usuarioRepository.findById(id);
			return user.orElse(null);
		}
		
		public UsuariooModel guardarUsuario(UsuariooModel usuario){
	        return usuarioRepository.save(usuario);
	    }

		

}
