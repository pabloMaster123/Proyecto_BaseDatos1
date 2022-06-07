package co.edu.uniquindio.adress;

import co.edu.uniquindio.adress.view.RespuestaUnica;
import co.edu.uniquindio.adress.view.emparejarConceptos;
import co.edu.uniquindio.adress.view.falsoVerdadero;
import co.edu.uniquindio.adress.view.respuestaMultiple;

public class Principal {

	    public static void main(String[] args) {
	       
	    	respuestaMultiple t1= new respuestaMultiple();
	        falsoVerdadero t2= new falsoVerdadero();
	        emparejarConceptos t3= new emparejarConceptos();
	        RespuestaUnica t4= new RespuestaUnica();
	       // Examentipo3 t3= new Examentipo3();
	        t1.setVisible(true);
	        t2.setVisible(true);
	        t3.setVisible(true);
	        t4.setVisible(true);
	       // t3.setVisible(true);
	    }
	
}
