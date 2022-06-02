package co.edu.uniquindio.adress.model.Preguntas;

import java.util.ArrayList;

import co.edu.uniquindio.adress.model.Pregunta;

public class RespuestaMultiple {
	
	private Integer codigoRespuesta;
	
	private Pregunta pregunta;
	
	private ArrayList<String> respuestas;
	
	public RespuestaMultiple(Integer codigoRespuesta,Pregunta pregunta) {
		this.codigoRespuesta = codigoRespuesta;
		this.pregunta 		 = pregunta;
		respuestas 			 = new ArrayList<String>();
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

	public ArrayList<String> getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(ArrayList<String> respuestas) {
		this.respuestas = respuestas;
	}
	
}
