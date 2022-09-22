package models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class UsuariooModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private  Long id_usuario;
	
	private String nombre_usuario ;
	private String puesto;

	
	
	
	//fk
	//private String localizacion;




	public Long getId_usuario() {
		return id_usuario;
	}




	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}




	public String getNombre_usuario() {
		return nombre_usuario;
	}




	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}




	public String getPuesto() {
		return puesto;
	}




	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	

}
