package vivienda.modelo.fichero;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ManejoFichero {

	public static List<String>leerFichero(String NombreFichero){
		
		Path ficheroEntrada=Paths.get(NombreFichero);
		List<String>contenido=null;
		
		try {
			contenido=Files.readAllLines(ficheroEntrada, StandardCharsets.ISO_8859_1);
			
		}catch(IOException e) {
			
			System.out.println(e.getMessage());
		}
		return contenido;
	}
	
		
	}
	
	

