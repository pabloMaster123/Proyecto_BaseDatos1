package co.edu.uniquindio.adress.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
	
	private final static String stringConexion = "jdbc:oracle:thin:@localhost:1521:orcl1";
	
	//Metodo para acceder a la BD
	public static Connection obtenerConexion(){
		Connection conexion = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexion = DriverManager.getConnection(stringConexion, "root","root");
			if(conexion != null){
			System.out.println("Conectado con exito");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("No se encuentra el driver");
		}
		catch(SQLException e){
			e.printStackTrace();
			System.out.println("Error en la conexión");
		}
		return conexion;
	}

}
