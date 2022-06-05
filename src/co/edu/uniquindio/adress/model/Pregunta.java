package co.edu.uniquindio.adress.model;

import java.util.ArrayList;

import co.edu.uniquindio.adress.model.Preguntas.Completar;
import co.edu.uniquindio.adress.model.Preguntas.Emparejar;
import co.edu.uniquindio.adress.model.Preguntas.FalsoVerdadero;
import co.edu.uniquindio.adress.model.Preguntas.Ordenar;
import co.edu.uniquindio.adress.model.Preguntas.RespuestaMultiple;
import co.edu.uniquindio.adress.model.Preguntas.RespuestaUnica;

public class Pregunta {
	
	private Integer codigo;

	private Double valorPregunta;
	
	private Tema tema;
	
	private Integer tiempoRespuesta;
	
	private String enunciado;
	
	private ArrayList<Pregunta> preguntas;
	
	private Prueba prueba;
	
	private RespuestaUnica respuestaUnica;
	
	private RespuestaMultiple respuestaMultiple;
	
	private Ordenar ordenar;
	
	private FalsoVerdadero falsoVerdadero;
	
	private Emparejar emparejar;
	
	private Completar completar;
	
	public Pregunta(Integer codigo,Double valorPregunta,Tema tema,Integer tiempoRespuesta,String enunciado) {
		this.codigo 	   = codigo;
		this.valorPregunta = valorPregunta;
		this.tema 		   = tema;
	}
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getValorPregunta() {
		return valorPregunta;
	}

	public void setValorPregunta(Double valorPregunta) {
		this.valorPregunta = valorPregunta;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public Integer getTiempoRespuesta() {
		return tiempoRespuesta;
	}

	public void setTiempoRespuesta(Integer tiempoRespuesta) {
		this.tiempoRespuesta = tiempoRespuesta;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public ArrayList<Pregunta> getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(ArrayList<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}

	public RespuestaUnica getRespuestaUnica() {
		return respuestaUnica;
	}

	public void setRespuestaUnica(RespuestaUnica respuestaUnica) {
		this.respuestaUnica = respuestaUnica;
	}

	public RespuestaMultiple getRespuestaMultiple() {
		return respuestaMultiple;
	}

	public void setRespuestaMultiple(RespuestaMultiple respuestaMultiple) {
		this.respuestaMultiple = respuestaMultiple;
	}

	public Ordenar getOrdenar() {
		return ordenar;
	}

	public void setOrdenar(Ordenar ordenar) {
		this.ordenar = ordenar;
	}

	public FalsoVerdadero getFalsoVerdadero() {
		return falsoVerdadero;
	}

	public void setFalsoVerdadero(FalsoVerdadero falsoVerdadero) {
		this.falsoVerdadero = falsoVerdadero;
	}

	public Emparejar getEmparejar() {
		return emparejar;
	}

	public void setEmparejar(Emparejar emparejar) {
		this.emparejar = emparejar;
	}

	public Completar getCompletar() {
		return completar;
	}

	public void setCompletar(Completar completar) {
		this.completar = completar;
	}

	public Prueba getPrueba() {
		return prueba;
	}

	public void setPrueba(Prueba prueba) {
		this.prueba = prueba;
	}
	
}
