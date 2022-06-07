package co.edu.uniquindio.adress.model.Preguntas;

import co.edu.uniquindio.adress.model.Pregunta;

public class Emparejar {
	
	private Integer codigoRespuesta;
	
	private Pregunta pregunta;
	
	private MultiplesRespuestas parejas1;
	
	private MultiplesRespuestas parejas2;
	
	public Emparejar(Integer codigoRespuesta,Pregunta pregunta,
			MultiplesRespuestas parejas1,MultiplesRespuestas parejas2) {
		this.codigoRespuesta = codigoRespuesta;
		this.pregunta 		 = pregunta;
		this.parejas1 		 = parejas1;
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

	public MultiplesRespuestas getParejas1() {
		return parejas1;
	}

	public void setParejas1(MultiplesRespuestas parejas1) {
		this.parejas1 = parejas1;
	}

	public MultiplesRespuestas getParejas2() {
		return parejas2;
	}

	public void setParejas2(MultiplesRespuestas parejas2) {
		this.parejas2 = parejas2;
	}
	
}
