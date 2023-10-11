package control;

import java.util.ArrayList;
import java.util.List;

import modelo.fichero.ManejoFicheros;
import modelo.fichero.datos.Capital;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>contenidoFichero=ManejoFicheros.leerFicheroCompletoFilas("C:\\Users\\alumno.DESKTOP-H121FO5\\eclipse-workspace\\EjemploCSV\\src\\capitales.csv");
		System.out.println(contenidoFichero);
		List<Capital>capitalesList=new ArrayList<Capital>();
		contenidoFichero.remove(0);
		for(String linea: contenidoFichero) {
			String [] eltos=linea.split(";");
			capitalesList.add(new Capital(eltos[1],eltos[2]));
			
		}
		capitalesList.forEach(System.out::println);
		
	}

}
