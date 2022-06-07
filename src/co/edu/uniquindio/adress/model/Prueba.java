package co.edu.uniquindio.adress.model;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class Prueba {
	
	private Integer codigoPrueba;
	
	private Float valorPrueba;
	
	private String nombrePrueba;
	
	private String descripisionPrueba;
	
	private Date fechaPresentacion;
	
	private Integer cantidadPreguntas;
	
	private ArrayList<Pregunta> lista;
	
	private BancoPregunta preguntas;
	
	private Tema tema;
	
	private Estadistica estadistica;

	public Prueba(Integer codigoPrueba,Float valorPrueba,String nombrePrueba
			,String descripisionPrueba,Date fechaPresentacion,Integer cantidadPreguntas
			,BancoPregunta preguntas,Tema tema) {
		this.codigoPrueba 		= codigoPrueba;
		this.valorPrueba  		= valorPrueba;
		this.nombrePrueba  		= nombrePrueba;
		this.descripisionPrueba = descripisionPrueba;
		this.fechaPresentacion	= fechaPresentacion;
		this.cantidadPreguntas	= cantidadPreguntas;
		this.preguntas			= preguntas;
		this.tema				= tema;
		lista 					= new ArrayList<Pregunta>();
	}
	
	public Integer getCodigoPrueba() {
		return codigoPrueba;
	}

	public void setCodigoPrueba(Integer codigoPrueba) {
		this.codigoPrueba = codigoPrueba;
	}

	public Float getValorPrueba() {
		return valorPrueba;
	}

	public void setValorPrueba(Float valorPrueba) {
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

	public Date getFechaPresentacion() {
		return fechaPresentacion;
	}

	public void setFechaPresentacion(Date fechaPresentacion) {
		this.fechaPresentacion = fechaPresentacion;
	}

	public Integer getCantidadPreguntas() {
		return cantidadPreguntas;
	}

	public void setCantidadPreguntas(Integer cantidadPreguntas) {
		this.cantidadPreguntas = cantidadPreguntas;
	}

	public BancoPregunta getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(BancoPregunta preguntas) {
		this.preguntas = preguntas;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public ArrayList<Pregunta> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Pregunta> lista) {
		this.lista = lista;
	}

	public Estadistica getEstadistica() {
		return estadistica;
	}

	public void setEstadistica(Estadistica estadistica) {
		this.estadistica = estadistica;
	}
	
}
