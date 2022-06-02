package co.edu.uniquindio.adress.model;

public class PreguntaUsuario {
	
	private PruebaUsuario pruebaUsuario;
	
	private BancoPregunta bancoPregunta;
	
	private RespuestaUsuario respuestaUsuario;

	public PreguntaUsuario(PruebaUsuario pruebaUsuario,BancoPregunta bancoPregunta,RespuestaUsuario respuestaUsuario) {
		this.pruebaUsuario 	  = pruebaUsuario;
		this.bancoPregunta 	  = bancoPregunta;
		this.respuestaUsuario = respuestaUsuario;
	}
	
	public PruebaUsuario getPruebaUsuario() {
		return pruebaUsuario;
	}

	public void setPruebaUsuario(PruebaUsuario pruebaUsuario) {
		this.pruebaUsuario = pruebaUsuario;
	}

	public BancoPregunta getBancoPregunta() {
		return bancoPregunta;
	}

	public void setBancoPregunta(BancoPregunta bancoPregunta) {
		this.bancoPregunta = bancoPregunta;
	}

	public RespuestaUsuario getRespuestaUsuario() {
		return respuestaUsuario;
	}

	public void setRespuestaUsuario(RespuestaUsuario respuestaUsuario) {
		this.respuestaUsuario = respuestaUsuario;
	}
	
}
