package co.edu.uniquindio.adress.model;

import java.util.ArrayList;

public class Usuario {

	private Integer codigoUsuario;
	
	private String nobreUsuario;
	
	private String contrasenia;
	
	private Estudiante estudiante;
	
	private ArrayList<PruebaUsuario> pruebaUsuarios;
	
	public Usuario(Integer codigoUsuario,String nombreUsuario,String contrasenia,Estudiante estudiante){
		this.nobreUsuario = nombreUsuario;
		this.contrasenia = contrasenia;
		this.estudiante = estudiante;
		pruebaUsuarios = new ArrayList<PruebaUsuario>();
	}

	public Integer getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(Integer codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getNobreUsuario() {
		return nobreUsuario;
	}

	public void setNobreUsuario(String nobreUsuario) {
		this.nobreUsuario = nobreUsuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public ArrayList<PruebaUsuario> getPruebaUsuarios() {
		return pruebaUsuarios;
	}

	public void setPruebaUsuarios(ArrayList<PruebaUsuario> pruebaUsuarios) {
		this.pruebaUsuarios = pruebaUsuarios;
	}

	@Override
	public String toString() {
		return "Usuario [codigoUsuario=" + codigoUsuario + ", nobreUsuario=" + nobreUsuario + ", contrasenia="
				+ contrasenia + ", estudiante=" + estudiante + ", pruebaUsuarios=" + pruebaUsuarios + "]";
	}
	
	
	
}
