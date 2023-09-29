package teteo;

import java.io.File;
import java.io.IOException;



public class Ejclase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			File fichero1=new File ("Ficheros/segundoFuera.txt");
				System.out.println( " esta es la ruta del fichero" + fichero1.getAbsolutePath());
				
			System.out.println("existe:" + fichero1.exists());
			
			try {
				// si el fichero existe no hace nada 
				fichero1.createNewFile();
			}catch (IOException e) {
				e.printStackTrace();
			}
			
 			System.out.println("despues de crearlo, existe" + fichero1.exists());
 			
 			System.out.println("carpeta padre: " + fichero1.getParent());
 			System.out.println(" nombre " + fichero1.getName());
 			
 			System.out.println("Fichero?: " + fichero1.isFile());// para saber si es un archicvo
 			System.out.println("Directorio?" + fichero1.isDirectory());// para saber si es una carpera
 			
 			
 			// crea una carpeta dentro de una carpeta
 			File ruta = new File("Ficheros/subcarpeta");
 			ruta.mkdir();
 			
 				System.out.println(" directorio, la subcarpeta " + ruta.isDirectory());
 			
 				
 				System.out.println(ruta.isDirectory()?  "la ruta es directorio":"la ruta no es directorio");
 				
 				File fichero3 = new File("Ficheros/subcarpeta/tercero.txt");
 				
 				
 				try {
 					// si el fichero existe no hace nada 
 					fichero3.createNewFile();
 				}catch (IOException e) {
 					e.printStackTrace();
 				}
	}

}
