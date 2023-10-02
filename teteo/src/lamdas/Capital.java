package lamdas;

public class Capital {

	
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	private String pais;
	private String capital;
	public Capital(String pais, String capital) {
		super();
		this.pais = pais;
		this.capital = capital;
	}
	@Override
	public String toString() {
		return "Capital [pais=" + pais + ", capital=" + capital + "]";
	}
}
