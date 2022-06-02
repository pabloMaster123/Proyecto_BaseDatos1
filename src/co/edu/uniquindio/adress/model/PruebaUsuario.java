package co.edu.uniquindio.adress.model;

import java.util.ArrayList;

public class PruebaUsuario {
	
	private Usuario usuario;
	
	private Prueba prueba;
	
	private Double notaMaxima;
	
	private ArrayList<PreguntaUsuario> preguntaUsuarios;
	
	public PruebaUsuario(Usuario usuario,Prueba prueba,Double notaMaxima) {
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

	public Double getNotaMaxima() {
		return notaMaxima;
	}

	public void setNotaMaxima(Double notaMaxima) {
		this.notaMaxima = notaMaxima;
	}

	public ArrayList<PreguntaUsuario> getPreguntaUsuarios() {
		return preguntaUsuarios;
	}

	public void setPreguntaUsuarios(ArrayList<PreguntaUsuario> preguntaUsuarios) {
		this.preguntaUsuarios = preguntaUsuarios;
	}
	
}
