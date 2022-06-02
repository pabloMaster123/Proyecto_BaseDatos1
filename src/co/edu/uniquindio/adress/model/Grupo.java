package co.edu.uniquindio.adress.model;

import java.util.ArrayList;

public class Grupo {
	
	private Integer codigoGrupo;
	
	private Curso curso;
	
	private ArrayList<Usuario> usuarios;	
	
	public Grupo(Integer codigoGrupo,Curso curso) {
		this.codigoGrupo = codigoGrupo;
		this.curso 		 = curso;
		usuarios 		 = new ArrayList<Usuario>();
	}
	
	public Integer getCodigoGrupo() {
		return codigoGrupo;
	}

	public void setCodigoGrupo(Integer codigoGrupo) {
		this.codigoGrupo = codigoGrupo;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
}
