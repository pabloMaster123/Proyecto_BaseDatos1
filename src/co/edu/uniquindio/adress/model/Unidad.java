package co.edu.uniquindio.adress.model;

import java.util.ArrayList;

public class Unidad {
	
	private Integer codigoUnidad;
	
	private String nombreUnidad;
	
	private String descripsionUnidad;
	
	private ArrayList<Contenido> contenidos;
	
	public Unidad(Integer codigoUnidad,String nombreUnidad,String descripsionUnidad ) {
		this.codigoUnidad = codigoUnidad;
		this.nombreUnidad = nombreUnidad;
		this.descripsionUnidad = descripsionUnidad;
		contenidos = new ArrayList<Contenido>();
	}

	public ArrayList<Contenido> getContenidos() {
		return contenidos;
	}

	public void setContenidos(ArrayList<Contenido> contenidos) {
		this.contenidos = contenidos;
	}

	public Integer getCodigoUnidad() {
		return codigoUnidad;
	}

	public void setCodigoUnidad(Integer codigoUnidad) {
		this.codigoUnidad = codigoUnidad;
	}

	public String getNombreUnidad() {
		return nombreUnidad;
	}

	public void setNombreUnidad(String nombreUnidad) {
		this.nombreUnidad = nombreUnidad;
	}

	public String getDescripsionUnidad() {
		return descripsionUnidad;
	}

	public void setDescripsionUnidad(String descripsionUnidad) {
		this.descripsionUnidad = descripsionUnidad;
	}
	
}
