package co.edu.uniquindio.adress.model.Preguntas;

import co.edu.uniquindio.adress.model.Pregunta;

public class Completar {
	
	private Integer codigoRespuesta;
	
	private Pregunta pregunta;
	
	private String faltante;
	
	public Completar(Integer codigoRespuesta,Pregunta pregunta,String faltante) {
		this.codigoRespuesta = codigoRespuesta;
		this.pregunta 		 = pregunta;
		this.faltante 		 = faltante;
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

	public String getFaltante() {
		return faltante;
	}

	public void setFaltante(String faltante) {
		this.faltante = faltante;
	}
	
}
