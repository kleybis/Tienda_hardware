package teteo;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ManejoPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Path FicheroPrimero = Paths.get("FicheroPath/primero.txt");
			
			// obtener el nombre del prichero
			System.out.println("0.- Nombre del fichero" + FicheroPrimero.getFileName());
			// OBTENER EL NOMBRE DE LA CARPETA PADRE
			System.out.println("1.- nombre del elemento elgido de mi ruta" + FicheroPrimero.getName(0));
				
			
			Path FicheroSegundo=Paths.get("FicheroPath/FicherosSegundo/segundo.txt");
			System.out.println("2.- Nombre del elemento elegido de mi ruta: " + FicheroSegundo.getName(2));
			
			System.out.println("3.- Nombre del padre: " + FicheroSegundo.getParent());
			System.out.println("4.- Nombre de la ruta: " + FicheroSegundo.getRoot());
			
			
			System.out.println(FicheroSegundo.compareTo(FicheroPrimero));// sirve para comparar la longitud de los nombre de los ficheros
			System.out.println(FicheroSegundo.subpath(0, 2)); // es como el subString pero para rutas
			
			
			
			
			
	}

}
