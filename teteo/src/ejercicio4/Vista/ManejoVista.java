package ejercicio4.Vista;

import java.util.Scanner;

public class ManejoVista {
static Scanner scan= new Scanner(System.in);
	
	public static void mostrarMenu() {
		StringBuilder sb= new StringBuilder();
		sb.append("--------------------------------------\n");
		sb.append("ELIJA UNA DE LAS OPCIONES SIGUIENTES:\n");
		sb.append("\t1: Número de palabras\n");
		sb.append("\t2: Número de vocales\n");
		sb.append("\t3: Número de consonantes\n");
		sb.append("\t4: Número de espacios\n");
		sb.append("\t5: Salir");
		System.out.println(sb.toString());
	}

	public static int leerOpcion() {
		return scan.nextInt();
		
	}

	public static void escribir(String string, int valor) {
		System.out.println(string + valor);
		
		
	}


}
