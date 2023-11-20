package modelo.data;

public class Tipo {

	private int id_tipo;
	private  nombre_tipo NOMBRE;
	public Tipo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tipo(int id_tipo, nombre_tipo string) {
		super();
		this.id_tipo = id_tipo;
		NOMBRE = string;
	}
	public int getId_tipo() {
		return id_tipo;
	}
	public void setId_tipo(int id_tipo) {
		this.id_tipo = id_tipo;
	}
	public nombre_tipo getNOMBRE() {
		return NOMBRE;
	}
	public void setNOMBRE(nombre_tipo nOMBRE) {
		NOMBRE = nOMBRE;
	}
	@Override
	public String toString() {
		return "Tipo [id_tipo=" + id_tipo + ", NOMBRE=" + NOMBRE + "]";
	}
	
	
	
}
