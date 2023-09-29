package lecturas;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LecturasArquichosPequeñosCaracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Path FicheroEntrada= Paths.get("Ficheros/PrimeroFuera.txt");
		
		List<String> contenido;
		try {
			contenido=Files.readAllLines(FicheroEntrada, StandardCharsets.UTF_8);
			
			for(String s: contenido) {
				
				int indice= s.indexOf("[aeiou]");
				
				String sub=s.substring(indice);
				System.out.println(sub);
			}
			
			System.out.println("--------------------");
			for (int i=0; i<contenido.size(); i++) {
				System.out.println(contenido.get(i));
			}
	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
		}
	}

}
