package Escritura;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EscrituraSecuencialConBuffer {

	
	static List<String>contenido;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rellenarList();
		Path FicheroEscritura = Paths.get("Ficheros/EscrituraConBuffer.txt");
		BufferedWriter bw;
		
		try {
			bw=Files.newBufferedWriter(FicheroEscritura);
			for(String s: contenido) {// BUCLE UTILIZADO PARA RECCORRER EL ARRAY DE CONTENIDO PREVIAMENTE ESCRITO
				bw.write(s + "\n");// SE ESCRIBE EL CONTENIDO EN EL FICHRO 
			}
			
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
/**
 * ESTE METODO SE CREA PARA RELLENAR LA VARIABLE CONTENIDO 
 */
	private static void rellenarList() {
		// TODO Auto-generated method stub
		contenido = new ArrayList<String>(); // se crea la variable vacia que se rellenara con el metono anterior
			for (int i=0; i<=100; i++) {
				contenido.add("fila" + i); // este es el contendido que se añadira a la lista se utiliza.add porque es un String
		}
	}
}
