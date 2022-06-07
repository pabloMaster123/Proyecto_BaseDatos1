package co.edu.uniquindio.adress.model;

import java.util.ArrayList;

public class Estadistica {
	
	private Integer codigo;
	
	private Prueba  prueba;
	
	private Integer respuestasCorrectas;
	
	private Integer respuestasIncorectas;

	private Float notaMinima;
	
	private Float notaMaxima;
	

	public Estadistica(Integer codigo,Prueba  prueba,Integer respuestasCorrectas,Integer respuestasIncorectas,
			Float notaMinima,Float notaMaxima) {
		this.codigo 			  = codigo;
		this.prueba				  = prueba;
		this.respuestasCorrectas  = respuestasCorrectas;
		this.respuestasIncorectas = respuestasIncorectas;
		this.notaMinima			  = notaMinima;
		this.notaMaxima			  = notaMaxima;
	}
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public Prueba getPruebas() {
		return prueba;
	}

	public void setPruebas(Prueba pruebas) {
		this.prueba = pruebas;
	}

	public Integer getRespuestasCorrectas() {
		return respuestasCorrectas;
	}

	public void setRespuestasCorrectas(Integer respuestasCorrectas) {
		this.respuestasCorrectas = respuestasCorrectas;
	}

	public Integer getRespuestasIncorectas() {
		return respuestasIncorectas;
	}

	public void setRespuestasIncorectas(Integer respuestasIncorectas) {
		this.respuestasIncorectas = respuestasIncorectas;
	}

	public Float getNotaMinima() {
		return notaMinima;
	}

	public void setNotaMinima(Float notaMinima) {
		this.notaMinima = notaMinima;
	}

	public Float getNotaMaxima() {
		return notaMaxima;
	}

	public void setNotaMaxima(Float notaMaxima) {
		this.notaMaxima = notaMaxima;
	}

}
