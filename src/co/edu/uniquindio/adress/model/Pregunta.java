package co.edu.uniquindio.adress.model;

import java.util.ArrayList;


public class Pregunta {
	
	private Integer codigo;

	private Float valorPregunta;
	
	private Tema tema;
	
	private Integer tiempoRespuesta;
	
	private String enunciado;
	
	private ArrayList<Pregunta> preguntas;
	
	private ArrayList<Prueba> pruebas;
	
	public Pregunta(Integer codigo,Float valorPregunta,Tema tema,Integer tiempoRespuesta,String enunciado) {
		this.codigo 	   = codigo;
		this.valorPregunta = valorPregunta;
		this.tema 		   = tema;
		pruebas 		   = new ArrayList<Prueba>();
	}
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Float getValorPregunta() {
		return valorPregunta;
	}

	public void setValorPregunta(Float valorPregunta) {
		this.valorPregunta = valorPregunta;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public Integer getTiempoRespuesta() {
		return tiempoRespuesta;
	}

	public void setTiempoRespuesta(Integer tiempoRespuesta) {
		this.tiempoRespuesta = tiempoRespuesta;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public ArrayList<Pregunta> getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(ArrayList<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}

	public ArrayList<Prueba> getPruebas() {
		return pruebas;
	}

	public void setPruebas(ArrayList<Prueba> pruebas) {
		this.pruebas = pruebas;
	}

}
