package Escritura;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EscrituraArchivosPequeñosCaracteres {

	static List<String> contenido; // variable global utilizada desde cualquier parte del programa
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			rellenarList();// llamamiento al metodo que rellenaraa el  fichro 
		
		Path FicheroEscritura = Paths.get("Ficheros/escriturPuqueCaracteres");
		
		try {
			Files.write(FicheroEscritura, contenido);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
/**
 * 
 */
	private static void rellenarList() {
		// TODO Auto-generated method stub
		contenido = new ArrayList<String>(); // se crea la variable vacia que se rellenara con el metono anterior
			for (int i=0; i<=10; i++) {
				contenido.add("fila" + i); // este es el contendido que se añadira a la lista se utiliza.add porque es un String
		}
	}

}
