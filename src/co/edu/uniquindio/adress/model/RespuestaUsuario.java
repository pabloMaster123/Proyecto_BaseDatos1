package co.edu.uniquindio.adress.model;

public class RespuestaUsuario {
	
	private Integer respuestaUsuario;
	
	private PreguntaUsuario preguntaUsuario;
	
	private String respuesta;

	public RespuestaUsuario(Integer respuestaUsuario,PreguntaUsuario preguntaUsuario,String respuesta) {
		this.respuestaUsuario   = respuestaUsuario;
		this.preguntaUsuario    = preguntaUsuario;
		this.respuesta 			= respuesta;
	}
	
	public Integer getRespuestaUsuario() {
		return respuestaUsuario;
	}

	public void setRespuestaUsuario(Integer respustaUsuario) {
		this.respuestaUsuario = respustaUsuario;
	}

	public PreguntaUsuario getPreguntaUsuario() {
		return preguntaUsuario;
	}

	public void setPreguntaUsuario(PreguntaUsuario preguntaUsuario) {
		this.preguntaUsuario = preguntaUsuario;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	
}
