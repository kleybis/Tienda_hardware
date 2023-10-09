package ejercicio4.Control;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import ejercicio4.Vista.ManejoVista;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> contenido= leerFichero("Ficheros/PrimeroFuera.txt");
		String cadenaContenido = convertirCadena(contenido);
		ManejoVista.mostrarMenu();
		int opcion=ManejoVista.leerOpcion();
		while (opcion!=5) { 
			Controlador.acciones(opcion, cadenaContenido);
			opcion=ManejoVista.leerOpcion();
			}
	}
	
	private static String convertirCadena(List<String> contenido) {
		StringBuilder cadena= new StringBuilder();
		for (String fila: contenido) {
			cadena.append(fila.trim());
		}
		return cadena.toString();
	}

	public static List<String> leerFichero(String fichero) {
		Path fichEntrada= Paths.get(fichero);
		List<String> contenido=new ArrayList<String>();		
		try {
			contenido= Files.readAllLines(fichEntrada);				
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return contenido;
	}
			
			
			
			
	}	


