package co.edu.uniquindio.adress.model;

import java.time.LocalDate;

public class Prueba {
	
	private Integer codigoPrueba;
	
	private Double valorPrueba;
	
	private String nombrePrueba;
	
	private String descripisionPrueba;
	
	private LocalDate fechaPresentacion;
	
	private Integer cantidadPreguntas;
	
	private BancoPregunta bancoPregunta;
	
	private Tema tema;

	public Prueba() {
		
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

	public BancoPregunta getBancoPregunta() {
		return bancoPregunta;
	}

	public void setBancoPregunta(BancoPregunta bancoPregunta) {
		this.bancoPregunta = bancoPregunta;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}
	
}
