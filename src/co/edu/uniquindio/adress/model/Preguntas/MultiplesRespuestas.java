package co.edu.uniquindio.adress.model.Preguntas;

public class MultiplesRespuestas {

	public Integer codigo;
	
	private String respuestas;
	
	public MultiplesRespuestas(Integer codigo,String respuestas) {
		this.codigo 	= codigo;
		this.respuestas = respuestas;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(String respuestas) {
		this.respuestas = respuestas;
	}
	
}
