package co.edu.uniquindio.adress.model.Preguntas;

import java.util.HashMap;

import co.edu.uniquindio.adress.model.Pregunta;

public class Emparejar {
	
	private Integer codigoRespuesta;
	
	private Pregunta pregunta;
	
	private HashMap<String, String> parejas;
	
	public Emparejar(Integer codigoRespuesta,Pregunta pregunta) {
		this.codigoRespuesta = codigoRespuesta;
		this.pregunta = pregunta;
		parejas = new HashMap<String, String>();
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

	public HashMap<String, String> getParejas() {
		return parejas;
	}

	public void setParejas(HashMap<String, String> parejas) {
		this.parejas = parejas;
	}
	
}
