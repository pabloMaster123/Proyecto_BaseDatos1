package co.edu.uniquindio.adress.model;

import java.util.ArrayList;

public class PruebaUsuario {
	
	private Integer codigoUsuario;
	
	private Usuario usuario;
	
	private Prueba prueba;
	
	private Float notaMaxima;
	
	private ArrayList<PreguntaUsuario> preguntaUsuarios;
	
	public PruebaUsuario(Integer codigoUsuario,Usuario usuario,Prueba prueba,Float notaMaxima) {
		this.codigoUsuario = codigoUsuario;
		this.usuario 	= usuario;
		this.prueba 	= prueba;
		this.notaMaxima = notaMaxima;
		preguntaUsuarios = new ArrayList<PreguntaUsuario>();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Prueba getPrueba() {
		return prueba;
	}

	public void setPrueba(Prueba prueba) {
		this.prueba = prueba;
	}

	public Float getNotaMaxima() {
		return notaMaxima;
	}

	public void setNotaMaxima(Float notaMaxima) {
		this.notaMaxima = notaMaxima;
	}

	public ArrayList<PreguntaUsuario> getPreguntaUsuarios() {
		return preguntaUsuarios;
	}

	public void setPreguntaUsuarios(ArrayList<PreguntaUsuario> preguntaUsuarios) {
		this.preguntaUsuarios = preguntaUsuarios;
	}
	
}
