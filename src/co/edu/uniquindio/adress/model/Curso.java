package co.edu.uniquindio.adress.model;

public class Curso {
	
	private Integer codigoCurso;
	
	private String nombreCurso;
	
	private String descripsionCurso;
	
	private Docente docente;
	
	private PlanEstudio planEstudio;
	
	public Curso(Integer codigoCurso,String nombreCurso,String descripsionCurso,Docente docente,PlanEstudio planEstudio){
		this.codigoCurso 	  = codigoCurso;
		this.nombreCurso 	  = nombreCurso;
		this.descripsionCurso = descripsionCurso;
		this.docente		  = docente;
		this.planEstudio 	  = planEstudio;
	}

	public Integer getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(Integer codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public String getDescripsionCurso() {
		return descripsionCurso;
	}

	public void setDescripsionCurso(String descripsionCurso) {
		this.descripsionCurso = descripsionCurso;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public PlanEstudio getPlanEstudio() {
		return planEstudio;
	}

	public void setPlanEstudio(PlanEstudio planEstudio) {
		this.planEstudio = planEstudio;
	}

	@Override
	public String toString() {
		return "Curso [codigoCurso=" + codigoCurso + ", nombreCurso=" + nombreCurso + ", descripsionCurso="
				+ descripsionCurso + ", docente=" + docente + ", planEstudio=" + planEstudio + "]";
	}
	
}
