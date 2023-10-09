package ejercicio4.Control;

import ejercicio4.Vista.ManejoVista;

public class Controlador {
	
	public static void acciones(int opcion, String texto) {
		switch(opcion) {
			case 1: ManejoVista.escribir ("Número de palabras: ", numPalabras(texto));break;
			case 2: ManejoVista.escribir("Número de vocales: ", numVocales(texto));break;
			case 3: ManejoVista.escribir("Número de consonantes: ", numConsonantes(texto)); break;
			case 4: ManejoVista.escribir("Número de espacios: ", numEspacios(texto));break;
			
		}
		
	}
	
	private static int numEspacios(String texto) {
		int numEspacios=0;
		numEspacios= texto.length()- texto.replaceAll("[ ]" ,"").length();
		return numEspacios;
	}
	private static int numConsonantes(String texto) {
		int numConsonantes=0;
		//numConsonantes= texto.length()- texto.toLowerCase().replaceAll("[b-df-hj-np-tv-zñ]", "").length();
		numConsonantes=texto.toLowerCase().replaceAll("[\\W_aeiou^ñ]", "").length();
		return numConsonantes;
	}
	
	private static int numVocales(String texto) {
		int numVocales=0;
		numVocales= texto.length()- texto.toLowerCase().replaceAll("[aeiouáéíóú]", "").length();
		return numVocales;
	}

	private static int numPalabras(String texto) {
		texto= texto.replaceAll("[ ,;:-]",";").replaceAll(";;", ";").replaceAll(";;", ";");
		String[] arrayTexto=texto.split("[;]");
	//	System.out.println(Arrays.toString(arrayTexto));
		return arrayTexto.length;
	}


}

