package co.edu.uniquindio.adress.model.Preguntas;

import co.edu.uniquindio.adress.model.Pregunta;

public class FalsoVerdadero {
	
	private Integer codigoRespuesta;
	
	private Pregunta pregunta;
	
	private boolean falsoVerdadero;
	
	public FalsoVerdadero(Integer codigoRespuesta,Pregunta pregunta,boolean falsoVerdadero) {
		this.codigoRespuesta = codigoRespuesta;
		this.pregunta 		 = pregunta;
		this.falsoVerdadero  = falsoVerdadero;
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

	public boolean isFalsoVerdadero() {
		return falsoVerdadero;
	}

	public void setFalsoVerdadero(boolean falsoVerdadero) {
		this.falsoVerdadero = falsoVerdadero;
	}
	
}
