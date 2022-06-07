package co.edu.uniquindio.adress.model;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.text.StyleContext.SmallAttributeSet;

import co.edu.uniquindio.adress.model.Preguntas.Completar;
import co.edu.uniquindio.adress.model.Preguntas.Emparejar;
import co.edu.uniquindio.adress.model.Preguntas.FalsoVerdadero;
import co.edu.uniquindio.adress.model.Preguntas.MultiplesRespuestas;
import co.edu.uniquindio.adress.model.Preguntas.Ordenar;
import co.edu.uniquindio.adress.model.Preguntas.RespuestaMultiple;
import co.edu.uniquindio.adress.model.Preguntas.RespuestaUnica;

public class UniQuiz {
 
	private Connection conexionBD;
	
	private ResultSet resultSet;
	
	private Statement statement;
	
	private ArrayList<Estudiante> estudiantes;
	
	private ArrayList<Pregunta> preguntas;
	
	private ArrayList<Tema> temas;
	
	private ArrayList<Docente> docentes;
	
	private ArrayList<BancoPregunta> bancoPreguntas;
	
	private ArrayList<Usuario> usuarios;
	
	private ArrayList<Prueba> pruebas;
	
	private ArrayList<Curso> 			 cursos;
	
	private ArrayList<RespuestaUnica>    respuestaUnicas;
	
	private ArrayList<RespuestaMultiple> respuestaMultiples;
	
	private ArrayList<Ordenar> 			 ordenar;
	
	private ArrayList<FalsoVerdadero> 	 falsoVerdaderos;
	
	private ArrayList<Emparejar> 		 emparejars ;
	
	private ArrayList<Completar> 	     completars;
	
	public UniQuiz(){
		new ConexionBD();
		conexionBD = ConexionBD.obtenerConexion();
		inicializarEstudiante();
		System.out.println();
		inicializarDocente();
		System.out.println();
		inicializarUsuario();
		System.out.println();
	}
	
	public void inicializarEstudiante() {
		estudiantes = new ArrayList<Estudiante>();
	
		try {
			String sql = "SELECT * FROM estudiante";

			PreparedStatement pstmt = conexionBD.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery(sql);
            while(rs.next()){
                Estudiante estudiante = new Estudiante(rs.getString(1),
                        rs.getString(2), 
                        rs.getString(3), 
                        rs.getString(4), 
                        rs.getString(5), 
                        rs.getString(6));
                estudiantes.add(estudiante);
            }
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		for (int i = 0; i < estudiantes.size(); i++) {
			System.out.println(estudiantes.get(i));
		}
	}
	
	public void inicializarUsuario() {
		usuarios = new ArrayList<Usuario>();
		try {
			String sql = "SELECT * FROM usuario";

			PreparedStatement pstmt = conexionBD.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery(sql);
            while(rs.next()){
                Usuario usuario = new Usuario(rs.getInt(1),
                        rs.getString(2), 
                        rs.getString(3), 
                        buscarEstudiante(rs.getString(4)));
                usuarios.add(usuario);
            }
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		for (int i = 0; i < usuarios.size(); i++) {
			System.out.println(usuarios.get(i));
		}
	}
	
	public void inicializarDocente() {
		docentes = new ArrayList<Docente>();
		
		try {
			String sql = "SELECT * FROM docente";

			PreparedStatement pstmt = conexionBD.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery(sql);
            while(rs.next()){
                Docente docente = new Docente(rs.getString(1),
                        rs.getString(2), 
                        rs.getString(3), 
                        rs.getString(4), 
                        rs.getString(5), 
                        rs.getString(6));
                docentes.add(docente);
            }
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		for (int i = 0; i < docentes.size(); i++) {
			System.out.println(docentes.get(i));
		}
	}
	
	

	public void inicializarBanco_Pregunta() {
		preguntas = new ArrayList<Pregunta>();
		
		try {
			String sql = "SELECT * FROM pregunta";

			PreparedStatement pstmt = conexionBD.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery(sql);
            while(rs.next()){
                Pregunta pregunta = new Pregunta(rs.getInt(1),
                        rs.getFloat(2), 
                        buscarTema(rs.getInt(3)), 
                        rs.getInt(4), 
                        rs.getString(5));
                preguntas.add(pregunta);
            }
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		for (int i = 0; i < estudiantes.size(); i++) {
			System.out.println(estudiantes.get(i));
		}
	}
	
	public void inicializarPregunta() {
		preguntas = new ArrayList<Pregunta>();
		
		try {
			String sql = "SELECT * FROM pregunta";

			PreparedStatement pstmt = conexionBD.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery(sql);
            while(rs.next()){
                Pregunta pregunta = new Pregunta(rs.getInt(1),
                        rs.getFloat(2), 
                        buscarTema(rs.getInt(3)), 
                        rs.getInt(4), 
                        rs.getString(5));
                preguntas.add(pregunta);
            }
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		for (int i = 0; i < preguntas.size(); i++) {
			System.out.println(preguntas.get(i));
		}
	}
	
	public void inicializarPruebas() {
		pruebas = new ArrayList<Prueba>();
		
		try {
			String sql = "SELECT * FROM pruebas";

			PreparedStatement pstmt = conexionBD.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery(sql);
            while(rs.next()){
                Estudiante estudiante = new Estudiante(rs.getString(1),
                        rs.getString(2), 
                        rs.getString(3), 
                        rs.getString(4), 
                        rs.getString(5), 
                        rs.getString(6));
                estudiantes.add(estudiante);
            }
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		for (int i = 0; i < pruebas.size(); i++) {
			System.out.println(pruebas.get(i));
		}
	}
	
	public boolean crearAlumno(String cedula,String nombre,String apellido,String email,String pasword,String direccion){
		try {
			String sql = "INSERT INTO ESTUDIANTE (cedula , nombre , apellido , email , pasword , direccion )"
					+ " VALUES (? , ?  , ? , ? , ? , ?  )";
			
			PreparedStatement statement = conexionBD.prepareStatement(sql);
			
			statement.setString(1, cedula);
			statement.setString(2, nombre);
			statement.setString(3, apellido);
			statement.setString(4, email);
			statement.setString(5, pasword);
			statement.setString(6, direccion);

			int rows = statement.executeUpdate();
			
			if(rows >= 1){
				System.out.println("Estudainte creado");
				return true;
			}
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean crearUsuario(Integer codigo, String nombre, String pasword, String cedula_Estudiante) {
		try {
			String sql = "INSERT INTO USUARIO (codigo , nombre , pasword , cedula_Estudiante)"
					+ " VALUES (? , ? , ? , ? )";
			PreparedStatement statement = conexionBD.prepareStatement(sql);
			
			statement.setInt(1, codigo);
			statement.setString(2, nombre);
			statement.setString(3, pasword);
			statement.setString(4, cedula_Estudiante);

			int rows = statement.executeUpdate();
			if(rows >= 1){
				System.out.println("Usuario creado");
				return true;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		return false;
	}

	public boolean crearDocente(String cedula,String nombre,String apellido,String email,String pasword,String direccion){
		try {
			String sql = "INSERT INTO DOCENTE (cedula , nombre , apellido , email , pasword , direccion )"
					+ " VALUES (? , ?  , ? , ? , ? , ?  )";
			PreparedStatement statement = conexionBD.prepareStatement(sql);
			
			statement.setString(1, cedula);
			statement.setString(2, nombre);
			statement.setString(3, apellido);
			statement.setString(4, email);
			statement.setString(5, pasword);
			statement.setString(6, direccion);

			int rows = statement.executeUpdate();
			if(rows >= 1){
				System.out.println("Docente creado");
				return true;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean crearCurso(Integer codigo,String nombre,String descripsion,String cedulaDocente ,Integer codigoPlanEstudio){
		try {
			String sql = "INSERT INTO CURSO (codigo , nombre , descripsion , cedulaDocente , codigoPlanEstudio )"
					+ " VALUES (? , ?  , ? , ? , ? , ?  )";
			PreparedStatement statement = conexionBD.prepareStatement(sql);
			
			statement.setInt	(1, codigo);
			statement.setString (2, nombre);
			statement.setString (3, descripsion);
			statement.setString (4, cedulaDocente);
			statement.setInt	(5, codigoPlanEstudio);

			int rows = statement.executeUpdate();
			if(rows >= 1){
				System.out.println("Curso creado");
				return true;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean crearPlanEstudio(Integer codigo,Integer codigoUnidad){
		try {
			String sql = "INSERT INTO PLAN_ESTUDIO (codigo , codigoUnidad )"
					+ " VALUES (? , ? )";
			PreparedStatement statement = conexionBD.prepareStatement(sql);
			
			statement.setInt(1, codigo);
			statement.setInt(2, codigoUnidad);


			int rows = statement.executeUpdate();
			if(rows >= 1){
				System.out.println("Docente creado");
				return true;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean crearUnidad(Integer codigo,String nombre,String descripsion,Integer codigoContenido){
		try {
			String sql = "INSERT INTO UNIDAD (codigo , nombre , descripsion , codigoContenido)"
					+ " VALUES (? , ?  , ? , ? )";
			PreparedStatement statement = conexionBD.prepareStatement(sql);
			
			statement.setInt(1, codigo);
			statement.setString(2, nombre);
			statement.setString(3, descripsion);
			statement.setInt(4, codigoContenido);

			int rows = statement.executeUpdate();
			if(rows >= 1){
				System.out.println("Docente creado");
				return true;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean crearContenido(Integer codigoC,String descripsion){
		try {
			String sql = "INSERT INTO CONTENIDO (codigoContenido , descripsion )"
					+ " VALUES (? , ? )";
			PreparedStatement statement = conexionBD.prepareStatement(sql);
			
			statement.setInt(1, codigoC);
			statement.setString(2, descripsion);

			int rows = statement.executeUpdate();
			if(rows >= 1){
				System.out.println("Docente creado");
				return true;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean crearTema(Integer codigoTema,String nombreTema,String descripsion) {
		try {
			String sql = "INSERT INTO TEMA (codigoTema , nombreTema , descripsion)"
					+ " VALUES (? , ? , ?)";
			PreparedStatement statement = conexionBD.prepareStatement(sql);
			
			statement.setInt  	(1, codigoTema);
			statement.setString	(2, nombreTema);
			statement.setString (3, descripsion);
	
			int rows = statement.executeUpdate();
			if(rows >= 1){
				System.out.println("TEMA creado");
				return true;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		return false;
		
	}
	
	public boolean crearPregunta(Integer codigo,Float valorPregunta,Integer codigoTema,Integer tiempoRespuesta,String enunciado){
		try {
			String sql = "INSERT INTO PREGUNTA (codigo , valorPregunta , codigoTema, tiempoRespuesta, enunciado)"
					+ " VALUES (? , ? , ?, ?, ?)";
			PreparedStatement statement = conexionBD.prepareStatement(sql);
			
			statement.setInt  	(1, codigo);
			statement.setFloat	(2, valorPregunta);
			statement.setInt  	(3, codigoTema);
			statement.setInt    (4, tiempoRespuesta);
			statement.setString (5, enunciado);


			int rows = statement.executeUpdate();
			if(rows >= 1){
				System.out.println("Docente creado");
				return true;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		return false;
		
	}

	public boolean crearGrupo(Integer codigo,Integer codigo_curso,Integer codigo_usuario){
		try {
			String sql = "INSERT INTO GRUPO (codigo , codigo_curso , codigo_usuario)"
					+ " VALUES (? , ? , ?)";
			PreparedStatement statement = conexionBD.prepareStatement(sql);
			
			statement.setInt  	(1, codigo);
			statement.setInt    (2, codigo_curso);
			statement.setInt  	(3, codigo_usuario);
			
			int rows = statement.executeUpdate();
			if(rows >= 1){
				System.out.println("GRUPO creado");
				return true;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		return false;
		
	}
	
	public boolean ingresarPreguntaBanco(Integer codigoBanco,Pregunta pregunta2, Tema tema) {
			try {
				String sql = "INSERT INTO PREGUNTA_BANCO (codigoBanco , pregunta , contenidoRespuesta)"
							+ " VALUES (? , ? , ?)";
					
				PreparedStatement statement = conexionBD.prepareStatement(sql);
					
				statement.setInt  	(1, codigoBanco);
				statement.setInt	(2, tema.getCodigoTema());
				statement.setInt  	(3, pregunta2.getCodigo());

				int rows = statement.executeUpdate();
					if(rows >= 1){
					System.out.println("PREGUNTA_BANCO creado");
					return true;
				}
					
			} catch (SQLException e) {
			  JOptionPane.showMessageDialog(null, e.getMessage());
			  e.printStackTrace();
		 }
		return false;
	}

	public boolean crearPrueba(Integer codigoPrueba,Double valorPrueba,
			String nombrePrueba,String descripisionPrueba,LocalDate fechaPresentacion,
			Tema tema){
		try {
		String sql = "INSERT INTO PRUEBA (codigo,valor,nombre,descripision,fechaPresentacion,"
				+ " cantidadPreguntas,codigo_tema,"
				+ "codigo_grupo)"
				+ " VALUES (? , ? , ? , ? , ? , ?)";
		
		PreparedStatement statement = conexionBD.prepareStatement(sql);

		
		
		int rows = statement.executeUpdate();
		if(rows >= 1){
			System.out.println("PRUEBA creado");
			return true;
		}
		
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean crearRespuestaCompletar(Integer codigoRespuesta,Pregunta pregunta,String contenidoRespuesta) {
		try {
			String sql = "INSERT INTO COMPLETAR (codigoRespuesta , pregunta , contenidoRespuesta)"
					+ " VALUES (? , ? , ?)";
			PreparedStatement statement = conexionBD.prepareStatement(sql);
			
			statement.setInt  	(1, codigoRespuesta);
			statement.setInt	(2, pregunta.getCodigo());
			statement.setString (3, contenidoRespuesta);


			int rows = statement.executeUpdate();
			if(rows >= 1){
				System.out.println("COMPLETAR creado");
				return true;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		return false;			
	}

	public boolean crearRespuestaEmparejar(Integer codigoRespuesta,Pregunta pregunta,MultiplesRespuestas 
			contenidoRespuesta) {
		try {
			String sql = "INSERT INTO EMPAREJAR (codigoRespuesta , pregunta , contenidoRespuesta)"
					+ " VALUES (? , ? , ?)";
			PreparedStatement statement = conexionBD.prepareStatement(sql);
			
			statement.setInt  	(1, codigoRespuesta);
			statement.setInt 	(2, contenidoRespuesta.getCodigo());
			statement.setInt	(3, pregunta.getCodigo());


			int rows = statement.executeUpdate();
			if(rows >= 1){
				System.out.println("EMPAREJAR creado");
				return true;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		return false;					
	}

	public boolean crearRespuestaOrdenar(Integer codigoRespuesta,Pregunta pregunta,MultiplesRespuestas 
			contenidoRespuesta) {
		try {
			String sql = "INSERT INTO ORDENAR (codigoRespuesta , codigo_multiple_respuesta , codigo_pregunta)"
					+ " VALUES (? , ? , ?)";
			PreparedStatement statement = conexionBD.prepareStatement(sql);
			
			statement.setInt  	(1, codigoRespuesta);
			statement.setInt 	(2, contenidoRespuesta.getCodigo());
			statement.setInt	(3, pregunta.getCodigo());


			int rows = statement.executeUpdate();
			if(rows >= 1){
				System.out.println("ORDENAR creado");
				return true;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		return false;			
	}

	public boolean crearRespuestaFalsoVerdadero(Integer codigoRespuesta,Pregunta pregunta,MultiplesRespuestas 
			contenidoRespuesta) {
		try {
			String sql = "INSERT INTO FALSO_VERDADERO (codigoRespuesta , codigo_multiple_respuesta , codigo_pregunta)"
					+ " VALUES (? , ? , ?)";
			PreparedStatement statement = conexionBD.prepareStatement(sql);
			
			statement.setInt  	(1, codigoRespuesta);
			statement.setInt 	(2, contenidoRespuesta.getCodigo());
			statement.setInt	(3, pregunta.getCodigo());


			int rows = statement.executeUpdate();
			if(rows >= 1){
				System.out.println("FALSO_VERDADERO creado");
				return true;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		return false;			
	}

	public boolean crearRespuestaMultiple(Integer codigoRespuesta,Pregunta pregunta,MultiplesRespuestas 
			contenidoRespuesta) {
		try {
			String sql = "INSERT INTO RESPUESTA_MULTIPLE (codigoRespuesta , pregunta , contenidoRespuesta)"
					+ " VALUES (? , ? , ?)";
			PreparedStatement statement = conexionBD.prepareStatement(sql);
			
			statement.setInt  	(1, codigoRespuesta);
			statement.setInt	(2, pregunta.getCodigo());
			statement.setInt 	(3, contenidoRespuesta.getCodigo());


			int rows = statement.executeUpdate();
			if(rows >= 1){
				System.out.println("RESPUESTA_MULTIPLE creado");
				return true;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		return false;		
	}

	public boolean crearRespuestaUnica(Integer codigoRespuesta,Pregunta pregunta,String contenidoRespuesta) {
		try {
			String sql = "INSERT INTO RESPUESTA_UNICA (codigoRespuesta , pregunta , contenidoRespuesta)"
					+ " VALUES (? , ? , ?)";
			PreparedStatement statement = conexionBD.prepareStatement(sql);
			
			statement.setInt  	(1, codigoRespuesta);
			statement.setInt	(2, pregunta.getCodigo());
			statement.setString (3, contenidoRespuesta);


			int rows = statement.executeUpdate();
			if(rows >= 1){
				System.out.println("RESPUESTA_UNICA creado");
				return true;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean crearMultipleRespuesta(Integer codigo,String respuesta) {
		try {
			String sql = "INSERT INTO MULTIPLE_RESPUESTA (codigo , respuesta)"
					+ " VALUES (? , ? )";
			PreparedStatement statement = conexionBD.prepareStatement(sql);
			
			statement.setInt  	(1, codigo);
			statement.setString (2, respuesta);

			int rows = statement.executeUpdate();
			if(rows >= 1){
				System.out.println("MULTIPLE_RESPUESTA creado");
				return true;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean crearEstadistica(Integer codigo,Integer respuestasCorrectas,Integer respuestasIncorrectas,
			Float notaMenor,Float notaMayor,Prueba prueba) {
		try {
			String sql = "INSERT INTO ESTADISTICA (codigo , respuestasCorrectas,respuestasIncorrectas,"
					+ "notaMenor,nomaMayor)"
					+ " VALUES (? , ? ,? , ? ,? )";
			PreparedStatement statement = conexionBD.prepareStatement(sql);
			
			statement.setInt  	(1, codigo);
			statement.setInt    (2, respuestasCorrectas);
			statement.setInt    (3, respuestasIncorrectas);
			statement.setFloat  (4, notaMenor);
			statement.setFloat  (5, notaMayor);
			statement.setInt    (6, prueba.getCodigoPrueba());

			int rows = statement.executeUpdate();
			if(rows >= 1){
				System.out.println("ESTADISTICA creado");
				return true;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean crearRespuestaUsuario(Integer respuestaUsuario,PreguntaUsuario preguntaUsuario,String respuesta) {
		try {
			String sql = "INSERT INTO RESPUESTA_USUARIO (respuestaUsuario , codigoResouesta, respuesta)"
					+ " VALUES (? , ? ,?)";
			PreparedStatement statement = conexionBD.prepareStatement(sql);
			
			statement.setInt  	(1, respuestaUsuario);
			statement.setInt    (2, preguntaUsuario.getCodigoUsuario());
			statement.setString (3, respuesta);

			int rows = statement.executeUpdate();
			if(rows >= 1){
				System.out.println("RESPUESTA_USUARIO creado");
				return true;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean crearPruebaUsuario(Integer codigo,Usuario usuario,Prueba prueba,float notaMaxima) {
		try {
			String sql = "INSERT INTO PRUEBA_USUARIO (codigo , codigo_usuario,codigo_prueba,notaMaxima)"
					+ " VALUES (? , ?, ? , ?)";
			PreparedStatement statement = conexionBD.prepareStatement(sql);
			
			statement.setInt  	(1, codigo);
			statement.setInt    (2, usuario.getCodigoUsuario());
			statement.setInt    (3, prueba.getCodigoPrueba());
			statement.setFloat  (4, notaMaxima);

			int rows = statement.executeUpdate();
			if(rows >= 1){
				System.out.println("ESTADISTICA creado");
				return true;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean crearPreguntaUsuario(Integer codigoUsuario,PruebaUsuario pruebaUsuario,BancoPregunta bancoPregunta,RespuestaUsuario respuestaUsuario) {
		try {
			String sql = "INSERT INTO PREGUNTA_USUARIO (codigoUsuario , codigo_Prueba_Usuario,Banco_Pregunta,Codigo_Us)"
					+ " VALUES (? , ? ,? , ? ,? )";
			PreparedStatement statement = conexionBD.prepareStatement(sql);
			
			int rows = statement.executeUpdate();
			if(rows >= 1){
				System.out.println("ESTADISTICA creado");
				return true;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		return false;
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

	public void login(){
		
	}
	
	public Estudiante buscarEstudiante(String cedula) {
		Estudiante estudiante = null;
		 String SQL = "SELECT * FROM estudiante WHERE cedula = ?";
		 try {
			PreparedStatement pstmt = conexionBD.prepareStatement(SQL);
			pstmt.setString(1, cedula);
			ResultSet rs =pstmt.executeQuery();
			
			while(rs.next()){
				estudiante = new Estudiante(rs.getString(1),
	                    rs.getString(2), 
	                    rs.getString(3), 
	                    rs.getString(4), 
	                    rs.getString(5), 
	                    rs.getString(6));
			}
			
//			System.out.println(estudiante.toString());
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		return estudiante;
	}
	
	public Docente buscarDocente(String cedula) {
		Docente docente = null;
		 String SQL = "SELECT * FROM docente WHERE cedula = ?";
		 try {
			PreparedStatement pstmt = conexionBD.prepareStatement(SQL);
			pstmt.setString(1, cedula);
			ResultSet rs =pstmt.executeQuery();
			
			while(rs.next()){
				docente = new Docente(rs.getString(1),
	                    rs.getString(2), 
	                    rs.getString(3), 
	                    rs.getString(4), 
	                    rs.getString(5), 
	                    rs.getString(6));
			}
			
//			System.out.println(estudiante.toString());
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		return docente;
	}
	
	public Usuario buscarUsuario(Integer codigo) {
		Usuario usuario = null;
		 String SQL = "SELECT * FROM usuario WHERE codigo = ?";
		 try {
			PreparedStatement pstmt = conexionBD.prepareStatement(SQL);
			pstmt.setInt(1, codigo);
			ResultSet rs =pstmt.executeQuery();
			
			while(rs.next()){
				usuario = new Usuario(rs.getInt(1),
                        rs.getString(2), 
                        rs.getString(3), 
                        buscarEstudiante(rs.getString(4))
                        );
			}
			
//			System.out.println(estudiante.toString());
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		return usuario;
	}
	
	public Prueba buscarPrueba(Integer codigo,Integer codigoTema){
		Prueba pruebaBuscar = null;
		String SQL = "SELECT * FROM prueba WHERE codigo = ?";
		 try {
			PreparedStatement pstmt = conexionBD.prepareStatement(SQL);
			pstmt.setInt(1, codigo);
			ResultSet rs =pstmt.executeQuery();
			
			while(rs.next()){
		    pruebaBuscar = new Prueba(rs.getInt(1),
	                       rs.getFloat(2), 
	                       rs.getString(3), 
	                       rs.getString(4),
	                       rs.getDate(5),
	                       rs.getInt(6),
	                       buscarBanco(rs.getInt(8)),
	                       buscarTema(rs.getInt(7)));
			}
			
//			System.out.println(estudiante.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pruebaBuscar;
	}
	
	

	private BancoPregunta buscarBanco(int int1) {
		// TODO Auto-generated method stub
		return null;
	}

	public Tema buscarTema(Integer codigo) {
		Tema temaBuscar = null;
		String SQL = "SELECT * FROM tema WHERE codigo = ?";
		 try {
			PreparedStatement pstmt = conexionBD.prepareStatement(SQL);
			pstmt.setInt(1, codigo);
			ResultSet rs =pstmt.executeQuery();
			
			while(rs.next()){
				temaBuscar = new Tema(rs.getInt(1),
	                    rs.getString(2), 
	                    rs.getString(3));
			}
			
//			System.out.println(estudiante.toString());
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		return temaBuscar;
	}
	
	public BancoPregunta buscarPorTema(Tema tema){
		BancoPregunta bancoBuscar = null;
		String SQL = "SELECT * FROM banco_pregunta WHERE codigo_tema = ?";
		try {
			PreparedStatement pstmt = conexionBD.prepareStatement(SQL);
			pstmt.setInt(1, tema.getCodigoTema());
			ResultSet rs =pstmt.executeQuery();
			
			while(rs.next()){
				bancoBuscar = new BancoPregunta(rs.getInt(1),
	                    buscarTema(rs.getInt(2)));
				
			}
			
//			System.out.println(estudiante.toString());
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		return bancoBuscar;
	}
	
	public Docente buscar(String cedula) {
		Docente docente = null;
		 String SQL = "SELECT * FROM docente WHERE cedula = ?";
		 try {
			PreparedStatement pstmt = conexionBD.prepareStatement(SQL);
			pstmt.setString(1, cedula);
			ResultSet rs =pstmt.executeQuery();
			
			while(rs.next()){
				docente = new Docente(rs.getString(1),
	                    rs.getString(2), 
	                    rs.getString(3), 
	                    rs.getString(4), 
	                    rs.getString(5), 
	                    rs.getString(6));
			}
			
//			System.out.println(estudiante.toString());
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		return docente;
	}
	
}
