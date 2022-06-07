package co.edu.uniquindio.adress.model.Preguntas;

import java.util.ArrayList;

import co.edu.uniquindio.adress.model.Pregunta;

public class Ordenar {

	private Integer codigoRespuesta;
	
	private Pregunta pregunta;
	
	private ArrayList<MultiplesRespuestas> respuestas;
	
	public Ordenar(Integer codigoRespuesta,Pregunta pregunta) {
		this.codigoRespuesta = codigoRespuesta;
		this.pregunta 		 = pregunta;
		respuestas 			 = new ArrayList<MultiplesRespuestas>();
	}
	
	public Integer getCodigoRespuesta() {
		return codigoRespuesta;
	}

	public void setCodigoRespuesta(Integer codigoRespuesta) {
		this.codigoRespuesta = codigoRespuesta;
	}

	public Pregunta getPregunta() {
		return pregunta;
	}

	public void setPregunta(Pregunta pregunta) {
		this.pregunta = pregunta;
	}

	public ArrayList<MultiplesRespuestas> getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(ArrayList<MultiplesRespuestas> respuestas) {
		this.respuestas = respuestas;
	}
	
}
