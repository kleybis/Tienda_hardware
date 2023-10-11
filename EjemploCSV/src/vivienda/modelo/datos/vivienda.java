package vivienda.modelo.datos;

public class vivienda {

	
	private String tipoCalle;
	public String getTipoCalle() {
		return tipoCalle;
	}
	public void setTipoCalle(String tipoCalle) {
		this.tipoCalle = tipoCalle;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	private String nombre;
	private int numero;
	private String descripcion;
	
	@Override
	public String toString() {
		return "vivienda [tipoCalle=" + tipoCalle + ", nombre=" + nombre + ", numero=" + numero + ", descripcion="
				+ descripcion + "]";
	}
	public vivienda(String tipoCalle, String nombre, int numero, String descripcion) {
		super();
		this.tipoCalle = tipoCalle;
		this.nombre = nombre;
		this.numero = numero;
		this.descripcion = descripcion;
	}
	
	
}
