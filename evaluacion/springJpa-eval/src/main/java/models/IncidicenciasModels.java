package models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class IncidicenciasModels {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private  Long id_incidencia;
	
	private String estatus;
	private String localización;
	 private Date fecha;
	
	
	
	public Long getId_incidencia() {
		return id_incidencia;
	}
	public void setId_incidencia(Long id_incidencia) {
		this.id_incidencia = id_incidencia;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public String getLocalización() {
		return localización;
	}
	public void setLocalización(String localización) {
		this.localización = localización;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	

	///FK nombre_operador de Operdormodel
	
	
	

}
