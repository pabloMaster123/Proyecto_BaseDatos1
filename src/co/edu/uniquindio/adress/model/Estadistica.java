package co.edu.uniquindio.adress.model;

import java.util.ArrayList;

public class Estadistica {
	
	private Integer codigo;
	
	private ArrayList<Prueba> pruebas;
	
	private Integer respuestasCorrectas;
	
	private Integer respuestasIncorectas;

	private Double notaMinima;
	
	private Double notaMaxima;

	public Estadistica(Integer codigo) {
		this.codigo 			  = codigo;
		this.respuestasCorrectas  = 0;
		this.respuestasIncorectas = 0;
		this.notaMinima			  = 0.0;
		this.notaMaxima			  = 0.0;
	}
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public ArrayList<Prueba> getPruebas() {
		return pruebas;
	}

	public void setPruebas(ArrayList<Prueba> pruebas) {
		this.pruebas = pruebas;
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

	public Double getNotaMinima() {
		return notaMinima;
	}

	public void setNotaMinima(Double notaMinima) {
		this.notaMinima = notaMinima;
	}

	public Double getNotaMaxima() {
		return notaMaxima;
	}

	public void setNotaMaxima(Double notaMaxima) {
		this.notaMaxima = notaMaxima;
	}
	
}
