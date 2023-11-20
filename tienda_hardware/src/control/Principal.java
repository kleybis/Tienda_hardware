package control;


import modelo.dao.TipoDAO;
import modelo.data.Tipo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TipoDAO.seleccionarTipos().forEach(System.out::println);
	
	}

}
