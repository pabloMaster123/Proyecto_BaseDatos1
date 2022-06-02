package co.edu.uniquindio.adress.model;

public class Contenido {
	
	private Integer codigoContenido;
	
	private String descripsionContenido;
	
	public Contenido(Integer codigoContenido,String descripsionContenido) {
		this.codigoContenido 	  = codigoContenido;
		this.descripsionContenido = descripsionContenido;
	}

	public Integer getCodigoContenido() {
		return codigoContenido;
	}

	public void setCodigoContenido(Integer codigoContenido) {
		this.codigoContenido = codigoContenido;
	}

	public String getDescripsionContenido() {
		return descripsionContenido;
	}

	public void setDescripsionContenido(String descripsionContenido) {
		this.descripsionContenido = descripsionContenido;
	}
	
}
