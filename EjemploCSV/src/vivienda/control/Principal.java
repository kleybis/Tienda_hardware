package vivienda.control;

import java.util.ArrayList;
import java.util.List;

import vivienda.modelo.datos.vivienda;
import vivienda.modelo.fichero.ManejoFichero;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>contenidoFichero=ManejoFichero.leerFichero("C:\\Users\\alumno.DESKTOP-H121FO5\\eclipse-workspace\\EjemploCSV\\src\\vivienda\\actividadesEconomicas2023.csv");
		
		List<vivienda>ViviendaList=new ArrayList<vivienda>();
		contenidoFichero.remove(0);
		
		for(String linea: contenidoFichero) {
			String[] eltos=linea.split(";");
			
			ViviendaList.add(new vivienda(eltos[26],eltos[27], Integer.parseInt(eltos[29]),eltos[46]));
		}
		
	ViviendaList.forEach(System.out::println);
		
	}

}
