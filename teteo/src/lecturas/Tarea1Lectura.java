package lecturas;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Tarea1Lectura {
	private static void lecturaVariosCaracteres() {
		Path FichEntrada=Paths.get("Ficheros/PrimeroFuera.txt");
		InputStream iStream;
		String contenido="";
		try {
			
			iStream=Files.newInputStream(FichEntrada);
			byte[] bytes= new byte[10];
			while (iStream.read(bytes)!=-1) {
				contenido+= new String (bytes);
				// vaciar para que no se sobra escriba
				bytes=new byte[10];
			}
			System.out.println(contenido);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	private static void lecturasCaractearACaracter() {
		Path FichEntrada=Paths.get("Ficheros/PrimeroFuera.txt");
		
		InputStream iSream;
		String contenido="";
		
		try {
			iSream=Files.newInputStream(FichEntrada);
			
			
		}catch(IOException e){
			e.printStackTrace();
			
		}
	}
	
	
	
	
public static void main(String[] args) {
	

}
}
