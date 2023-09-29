package lecturas;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
resolucionTextoCompleto("Ficheros/PrimeroFuera.txt");
		lecturaPorCaractereres("Ficheros/PrimeroFuera.txt");

	}


	private static void lecturaPorCaractereres(String fichero) {
		// TODO Auto-generated method stub
		Path FicheroEntrada=Paths.get(fichero);
		InputStream iStream;
		String contenido="";
		Set<Character> vocalesSet=Set.of('a','e','i','o','u');
		
			try {
				iStream=Files.newInputStream(FicheroEntrada);
				int c;
				while((c=iStream.read())!=-1) {
					if(!vocalesSet.contains((char) c)) {
						System.out.println((char)c);
						contenido+=(char)c;
					}
				}
				
			}catch (IOException e){
				e.printStackTrace();
			}
			System.out.println("__________________");
			System.out.println(contenido);
	}


	private static void resolucionTextoCompleto(String fichero) {
		List<String> contenido = LecturaFichero(fichero);
		String contenidoTotal="";
			for (String l: contenido) {
					contenidoTotal+=l+"\n";
				
				
			}
			String sinVocales=contenidoTotal.replaceAll("[aeiouAEIOU]", "");
			System.out.println(sinVocales);
			System.out.println("Tamaño sin vocales " + sinVocales.length());
			
			
	}




	private static List<String> LecturaFichero(String fichero) {
		// TODO Auto-generated method stub
		

		Path ficheroEntrada = Paths.get(fichero);
		List<String> contenido=null;
	try {
			
			contenido=Files.readAllLines(ficheroEntrada);
			
			

			}catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	return contenido;
	}
}
