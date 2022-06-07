package co.edu.uniquindio.adress.model;

public class Estudiante extends Persona {

	public Estudiante(String cedula, String nombre, String apellido, String email,String pasword, String direccion) {
		super(cedula, nombre, apellido, email,pasword,direccion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Estudiante [getCedula()=" + getCedula() + ", getNombre()=" + getNombre() + ", getApellido()="
				+ getApellido() + ", getEmail()=" + getEmail() + ", getDirrecion()=" + getDirrecion()
				+ ", getPasword()=" + getPasword() + "]";
	}

	
	
}
