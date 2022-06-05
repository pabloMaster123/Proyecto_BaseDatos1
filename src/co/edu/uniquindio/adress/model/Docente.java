package co.edu.uniquindio.adress.model;

import java.util.ArrayList;

public class Docente extends Persona {

	private ArrayList<Curso> cursos;
	
	public Docente(String cedula, String nombre, String apellido, String email,String pasword, String direccion) {
		super(cedula, nombre, apellido, email, pasword, direccion);
		cursos = new ArrayList<Curso>();
	}

	public ArrayList<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}

	
}
