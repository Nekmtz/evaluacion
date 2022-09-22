package models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

public class EquipoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private  Long id_equipo;
	private Integer marca;
	private String localización;
	
	@ManyToOne
    @JoinColumn(nullable = false, name = "id_usuario")
	@JsonProperty(access = Access.WRITE_ONLY)
    private UsuariooModel registro;
	
	public Long getId_equipo() {
		return id_equipo;
	}
	public void setId_equipo(Long id_equipo) {
		this.id_equipo = id_equipo;
	}
	public Integer getMarca() {
		return marca;
	}
	public void setMarca(Integer marca) {
		this.marca = marca;
	}
	public String getLocalización() {
		return localización;
	}
	public void setLocalización(String localización) {
		this.localización = localización;
	}

	
}
