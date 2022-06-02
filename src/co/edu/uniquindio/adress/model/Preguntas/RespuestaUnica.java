package co.edu.uniquindio.adress.model.Preguntas;

import co.edu.uniquindio.adress.model.Pregunta;

public class RespuestaUnica {

	private Integer codigoRespuesta;
	
	private Pregunta pregunta;
	
	private String contenidoRespuesta;

	public RespuestaUnica(Integer codigoRespuesta,Pregunta pregunta,String contenidoRespuesta) {
		this.codigoRespuesta 	= codigoRespuesta;
		this.pregunta 			= pregunta;
		this.contenidoRespuesta = contenidoRespuesta;
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

	public String getContenidoRespuesta() {
		return contenidoRespuesta;
	}

	public void setContenidoRespuesta(String contenidoRespuesta) {
		this.contenidoRespuesta = contenidoRespuesta;
	}
	
}
