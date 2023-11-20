package modelo.data;

public class Componente {

	private int ID_componente;
	private  String nombre_componente;
	private String Fabricante;
	private double precio;
	private Tipo tipo;
	public Componente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Componente(int iD_componente, String nombre_componente, String fabricante, double precio, Tipo tipo) {
		super();
		ID_componente = iD_componente;
		this.nombre_componente = nombre_componente;
		Fabricante = fabricante;
		this.precio = precio;
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Componente [ID_componente=" + ID_componente + ", nombre_componente=" + nombre_componente
				+ ", Fabricante=" + Fabricante + ", precio=" + precio + ", tipo=" + tipo + "]";
	}
	public int getID_componente() {
		return ID_componente;
	}
	public void setID_componente(int iD_componente) {
		ID_componente = iD_componente;
	}
	public String getNombre_componente() {
		return nombre_componente;
	}
	public void setNombre_componente(String nombre_componente) {
		this.nombre_componente = nombre_componente;
	}
	public String getFabricante() {
		return Fabricante;
	}
	public void setFabricante(String fabricante) {
		Fabricante = fabricante;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	
	
}
