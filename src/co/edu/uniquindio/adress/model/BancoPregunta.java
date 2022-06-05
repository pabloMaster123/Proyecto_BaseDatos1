package co.edu.uniquindio.adress.model;

import java.util.ArrayList;

public class BancoPregunta {
	
	private Integer codigoBancoPregunta;
	
	private ArrayList<Pregunta> preguntas;
	
	private ArrayList<Prueba> prueba;
	
	private Tema tema;
	
	public BancoPregunta(Integer codigoBancoPregunta,Tema tema){
		this.codigoBancoPregunta = codigoBancoPregunta;
		this.tema 				 = tema;
		preguntas				 = new ArrayList<Pregunta>();
		prueba 					 = new   ArrayList<Prueba>();
	}

	public Integer getCodigoBancoPregunta() {
		return codigoBancoPregunta;
	}

	public void setCodigoBancoPregunta(Integer codigoBancoPregunta) {
		this.codigoBancoPregunta = codigoBancoPregunta;
	}

	public ArrayList<Pregunta> getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(ArrayList<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}
	
	public ArrayList<Prueba> getPrueba() {
		return prueba;
	}

	public void setPrueba(ArrayList<Prueba> prueba) {
		this.prueba = prueba;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}
	
}
