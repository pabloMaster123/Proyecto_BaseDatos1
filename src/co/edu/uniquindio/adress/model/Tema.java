package co.edu.uniquindio.adress.model;

import java.util.ArrayList;

public class Tema {
	
	private Integer codigoTema;
	
	private String nombreTema;
	
	private String descripsionTema;
	
	private ArrayList<Prueba> pruebas;
	
	private ArrayList<Pregunta> preguntas;
	
	public Tema(Integer codigoTema,String nombreTema,String descripsionTema){
		this.codigoTema 	 = codigoTema;
		this.nombreTema 	 = nombreTema;
		this.descripsionTema = descripsionTema;
		pruebas   = new ArrayList<Prueba>();
		preguntas = new ArrayList<Pregunta>();
	}

	public Integer getCodigoTema() {
		return codigoTema;
	}

	public void setCodigoTema(Integer codigoTema) {
		this.codigoTema = codigoTema;
	}

	public String getNombreTema() {
		return nombreTema;
	}

	public void setNombreTema(String nombreTema) {
		this.nombreTema = nombreTema;
	}

	public String getDescripsionTema() {
		return descripsionTema;
	}

	public void setDescripsionTema(String descripsionTema) {
		this.descripsionTema = descripsionTema;
	}

	public ArrayList<Prueba> getPruebas() {
		return pruebas;
	}

	public void setPruebas(ArrayList<Prueba> pruebas) {
		this.pruebas = pruebas;
	}
	
	public ArrayList<Pregunta> getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(ArrayList<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}
		
}
