package co.edu.uniquindio.adress.model;

public class PreguntaUsuario {
	
	private Integer codigoUsuario;
	
	private PruebaUsuario pruebaUsuario;
	
	private BancoPregunta bancoPregunta;
	
	private RespuestaUsuario respuestaUsuario;

	public PreguntaUsuario(Integer codigoUsuario,PruebaUsuario pruebaUsuario,BancoPregunta bancoPregunta,RespuestaUsuario respuestaUsuario) {
		this.codigoUsuario 	  = codigoUsuario;
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

	public Integer getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(Integer codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	
	
	
}
