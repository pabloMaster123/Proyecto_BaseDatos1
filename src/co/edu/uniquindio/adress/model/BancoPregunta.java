package co.edu.uniquindio.adress.model;

import java.util.ArrayList;

public class BancoPregunta {
	
	private Integer codigoBancoPregunta;
	
	private ArrayList<Pregunta> preguntas;
	
	private Prueba prueba;
	
	public BancoPregunta(){
		
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

	public Prueba getPrueba() {
		return prueba;
	}

	public void setPrueba(Prueba prueba) {
		this.prueba = prueba;
	}
	
}
