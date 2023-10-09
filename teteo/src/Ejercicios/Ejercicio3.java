package Ejercicios;

import java.util.List;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>contenido=LeerFichero();
		String cadena=convertirCadena(contenido);
		
	System.out.println(" num palabrea " + numPalabras(cadena));
	}

	private static String numPalabras(String texto) {
		// TODO Auto-generated method stub
		texto=texto.replaceAll("[,;:-_]", "");
		
		return null;
	}

	private static String convertirCadena(List<String> contenido) {
		// TODO Auto-generated method stub
		StringBuilder cadena=new StringBuilder();
		for ( String f: contenido) {
			cadena.append(f.trim());
		}
		
		
		return cadena.toString();
	}

	private static List<String> LeerFichero() {
		// TODO Auto-generated method stub
		return null;
	}

}
