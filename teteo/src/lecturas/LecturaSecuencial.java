package lecturas;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LecturaSecuencial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Path FicheroEntrada=Paths.get("Ficheros/PrimeroFuera.txt");
		
		InputStream iStream;
		
		String contenido= null;
		
		
		try {
			iStream=Files.newInputStream(FicheroEntrada);
			int c;
			while ((c=iStream.read())!=-1) {
				System.out.print((char)c);
				contenido+=(char)c;			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("-------------------");
		System.out.println(contenido);
	}

}
