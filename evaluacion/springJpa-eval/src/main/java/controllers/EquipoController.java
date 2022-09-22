package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import models.UsuariooModel;
import services.EquipoServices;
;

@RestController
@RequestMapping("/equipo")
public class EquipoController {
	
	
	@GetMapping("/{id}")  // http://localhost:8080/equipo
	public UsuariooModel getProducto(@PathVariable Long id_equipo) {
		return EquipoServices.obtenerUsuario(id_equipo);
	}
	
	
	
	
	

}
