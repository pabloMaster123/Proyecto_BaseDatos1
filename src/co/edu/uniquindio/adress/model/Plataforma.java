package co.edu.uniquindio.adress.model;

import java.time.LocalDate;
import java.util.ArrayList;

import co.edu.uniquindio.adress.model.Preguntas.RespuestaUnica;

public class Plataforma {
 
	private ArrayList<Estudiante> estudiantes;
	
	private ArrayList<Pregunta> preguntas;
	
	private ArrayList<Tema> temas;
	
	private ArrayList<Docente> docentes;
	
	private ArrayList<BancoPregunta> bancoPreguntas;
	
	private ArrayList<Usuario> usuarios;
	
	private ArrayList<Prueba> pruebas;
	
	private ArrayList<Curso> cursos;
	
	public void crearAlumno(String cedula,String nombre,String apellido,String email,String pasword,String direccion,
			Integer codigoUsuario,String nombreUsuario){
		Estudiante estudiante = new Estudiante(cedula, nombre, apellido, email, pasword, direccion);
		crearUsuario(codigoUsuario,nombreUsuario,pasword,estudiante);
		estudiantes.add(estudiante);
	}
	
	private void crearUsuario(Integer codigoUsuario, String nombreUsuario, String pasword, Estudiante estudiante2) {
		Usuario usuario = new Usuario(codigoUsuario, nombreUsuario, pasword, estudiante2);
		usuarios.add(usuario);
	}

	public void crearDocente(){
		
	}
	
	public Prueba buscarPrueba(Integer codigoPrueba){
		Prueba pruebaBuscar = null;
		for (int i = 0; i < pruebas.size(); i++) {
			if(pruebas.get(i).getCodigoPrueba() == codigoPrueba){
				pruebaBuscar = pruebas.get(i);
			}
		}
		return pruebaBuscar;
	}
	
	public Tema buscarTema(Integer codigoTema) {
		Tema temaBuscar = null;
		for (int i = 0; i < temas.size(); i++) {
			if(temas.get(i).getCodigoTema() == codigoTema){
				temaBuscar = temas.get(i);
			}
		}
		return temaBuscar;
	}
	
	public BancoPregunta buscarPorTema(Tema tema){
		BancoPregunta bancoBuscar = null;
		for (int i = 0; i < bancoPreguntas.size(); i++) {
			if (bancoPreguntas.get(i).getTema().getCodigoTema() == tema.getCodigoTema()) {
				bancoBuscar = bancoPreguntas.get(i);
			}
		}
		return bancoBuscar;
	}
	
	public Pregunta buscarPreguntaEnBanco(Integer codigoBanco,Integer codigoPregunta) {
		Pregunta preguntaBuscar = null;
		for (int i = 0; i < bancoPreguntas.size(); i++) {
			if(bancoPreguntas.get(i).getCodigoBancoPregunta() == codigoBanco){
				for (int j = 0; j < bancoPreguntas.get(i).getPreguntas().size(); j++) {
						if (bancoPreguntas.get(i).getPreguntas().get(j).getCodigo() == codigoPregunta) {
							preguntaBuscar = bancoPreguntas.get(i).getPreguntas().get(j);
						}
					}
				}
		}
		return preguntaBuscar;
	}
	
	public Tema buscarUsuario(Integer codigoTema) {
		Tema temaBuscar = null;
		for (int i = 0; i < temas.size(); i++) {
			if(temas.get(i).getCodigoTema() == codigoTema){
				temaBuscar = temas.get(i);
			}
		}
		return temaBuscar;
	}
	
	public Tema crearTema(Integer codigoTema,String nombreTema,String descripsionTema) {
		Tema tema = new Tema(codigoTema, nombreTema, descripsionTema);
		return tema;
	}
	
	public void crearPregunta(Integer codigo,Double valorPregunta,Integer codigoTema,Integer tiempoRespuesta,String enunciado, 
			Integer tipoRespuesta,Integer codigoRespuesta,String contenidoRespuesta){
		Pregunta pregunta = new Pregunta(codigo, valorPregunta, buscarTema(codigoTema), tiempoRespuesta, enunciado);
		respuesta(pregunta,tipoRespuesta,codigoRespuesta,contenidoRespuesta);
		ingresarPreguntaBanco(pregunta,buscarTema(codigoTema));
		preguntas.add(pregunta);
	}

	private void ingresarPreguntaBanco(Pregunta pregunta2, Tema tema) {
		BancoPregunta bancoPregunta;
		if (bancoPreguntas.size() != 0) {
			bancoPregunta = new BancoPregunta(bancoPreguntas.size() + 1, tema);
			bancoPregunta.getPreguntas().add(pregunta2);
		}else{
			bancoPregunta = buscarPorTema(tema);
			bancoPregunta.getPreguntas().add(pregunta2);
		}
	}

	public void crearPrueba(Integer codigoPrueba,Double valorPrueba,
			String nombrePrueba,String descripisionPrueba,LocalDate fechaPresentacion,
			Tema tema){
		Prueba prueba = new Prueba(codigoPrueba, valorPrueba, 
				nombrePrueba, descripisionPrueba, fechaPresentacion, 
				CantidadPregunta(buscarPorTema(tema)).size(), CantidadPregunta(buscarPorTema(tema)), tema);
		buscarPorTema(tema).getPrueba().add(prueba);
		pruebas.add(prueba);
	}
	
	private ArrayList<Pregunta> CantidadPregunta(BancoPregunta bancoPregunta2) {
		ArrayList<Pregunta> cantidad = new ArrayList<Pregunta>();
		Double valor 	 = 0.0;
		Integer i = 0;
		do {
			valor = valor + bancoPregunta2.getPreguntas().get(i).getValorPregunta();
			if(valor > 5){
				valor = valor - bancoPregunta2.getPreguntas().get(i).getValorPregunta();
			}
			cantidad.add(bancoPregunta2.getPreguntas().get(i));
			
		}while(valor != 5.0 || i > bancoPregunta2.getPreguntas().size());
		return cantidad;
	}

	
	
	private void respuesta(Pregunta pregunta2, Integer tipoRespuesta, Integer codigoRespuesta, String contenidoRespuesta) {
		switch (tipoRespuesta) {
		case 1:
			
			break;
			
		case 2:
			
			break;
			
		case 3:
	
			break;
	
		case 4:
	
			break;

		case 5:
			
			break;
	
		case 6:
	
			break;
			
		default:
			break;
		}
	}
	
	
}
