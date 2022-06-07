package co.edu.uniquindio.adress;

import co.edu.uniquindio.adress.model.Estudiante;
import co.edu.uniquindio.adress.model.UniQuiz;

public class Test {
	
	public static void main(String[] args) {
		
		UniQuiz uniQuiz = new UniQuiz();
		
		//uniQuiz.crearAlumno("1000496120", "Pablo andres", "Lozano sanchez", "pablitoal157@gmail.com", 
				//"1234", "cr19 25N-50");
		
		//uniQuiz.inicializarEstudiante();
	
//		uniQuiz.crearUsuario(1, "pablitoal157@gmail.com", "1234", "1000496120");
		
		//uniQuiz.crearDocente("1000496121", "Jose Ramirez", "Espinosa", "Jose@gmail.com", "1234", "cr19 25N-51");
		
		//uniQuiz.crearMultipleRespuesta(2, "Finlandia");
		
//		uniQuiz.crearTema(1, "Geofrafia", "Geografia el estudio del mundo");
		
		Estudiante aux = uniQuiz.buscarEstudiante("1000496120");
		System.out.println(aux.toString());
		
	}
	
}
