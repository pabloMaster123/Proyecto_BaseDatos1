package co.edu.uniquindio.adress.model;

import java.util.ArrayList;

public class PlanEstudio {
	
	private Integer codigoPlan;
	
	private ArrayList<Unidad> unidades;
	
	public PlanEstudio(Integer codigoPlan) {
		this.codigoPlan = codigoPlan;
		unidades = new ArrayList<Unidad>();
	}

	public Integer getCodigoPlan() {
		return codigoPlan;
	}

	public void setCodigoPlan(Integer codigoPlan) {
		this.codigoPlan = codigoPlan;
	}

	public ArrayList<Unidad> getUnidades() {
		return unidades;
	}

	public void setUnidades(ArrayList<Unidad> unidades) {
		this.unidades = unidades;
	}
	
}
