package co.edu.uniquindio.adress.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Prueba {
	
	private Integer codigoPrueba;
	
	private Double valorPrueba;
	
	private String nombrePrueba;
	
	private String descripisionPrueba;
	
	private LocalDate fechaPresentacion;
	
	private Integer cantidadPreguntas;
	
	private ArrayList<Pregunta> preguntas;
	
	private Tema tema;

	public Prueba(Integer codigoPrueba,Double valorPrueba,String nombrePrueba
			,String descripisionPrueba,LocalDate fechaPresentacion,Integer cantidadPreguntas
			,ArrayList<Pregunta> preguntas,Tema tema) {
		this.codigoPrueba 		= codigoPrueba;
		this.valorPrueba  		= valorPrueba;
		this.nombrePrueba  		= nombrePrueba;
		this.descripisionPrueba = descripisionPrueba;
		this.fechaPresentacion	= fechaPresentacion;
		this.cantidadPreguntas	= cantidadPreguntas;
		this.preguntas			= preguntas;
		this.tema				= tema;
	}
	
	public Integer getCodigoPrueba() {
		return codigoPrueba;
	}

	public void setCodigoPrueba(Integer codigoPrueba) {
		this.codigoPrueba = codigoPrueba;
	}

	public Double getValorPrueba() {
		return valorPrueba;
	}

	public void setValorPrueba(Double valorPrueba) {
		this.valorPrueba = valorPrueba;
	}

	public String getNombrePrueba() {
		return nombrePrueba;
	}

	public void setNombrePrueba(String nombrePrueba) {
		this.nombrePrueba = nombrePrueba;
	}

	public String getDescripisionPrueba() {
		return descripisionPrueba;
	}

	public void setDescripisionPrueba(String descripisionPrueba) {
		this.descripisionPrueba = descripisionPrueba;
	}

	public LocalDate getFechaPresentacion() {
		return fechaPresentacion;
	}

	public void setFechaPresentacion(LocalDate fechaPresentacion) {
		this.fechaPresentacion = fechaPresentacion;
	}

	public Integer getCantidadPreguntas() {
		return cantidadPreguntas;
	}

	public void setCantidadPreguntas(Integer cantidadPreguntas) {
		this.cantidadPreguntas = cantidadPreguntas;
	}

	public ArrayList<Pregunta> getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(ArrayList<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}
	
}
