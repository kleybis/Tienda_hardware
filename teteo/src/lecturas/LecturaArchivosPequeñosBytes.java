package lecturas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class LecturaArchivosPequeñosBytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Path FichEntrada= Paths.get("Ficheros/1.jpg");
		
		byte[] contenido;
		
		try {
			contenido=Files.readAllBytes(FichEntrada);
			System.out.println(Arrays.toString(contenido));
			
			for(byte b: contenido) {
				
				System.out.println((char)b);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
