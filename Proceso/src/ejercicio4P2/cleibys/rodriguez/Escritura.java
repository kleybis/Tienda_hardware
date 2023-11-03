package ejercicio4P2.cleibys.rodriguez;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Escritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		if (args.length<1)
			System.out.println("error tiene que recibir un numero");
		
	
		
		else {

			int cantidadNumeros= Integer.parseInt(args[0]);

			List<Integer> contenido= new ArrayList<Integer>();

			for(int i=1;i<cantidadNumeros;i++) {

				double numeroAleatorio = (Math.random()*cantidadNumeros)+1;

				//System.out.println((int)numeroAleatorio);

				contenido.add((int)numeroAleatorio);

			}

			Collections.sort(contenido);

	           for (int numero : contenido) {

	               System.out.println(numero);

	           }

		

		}
		
		
	}
		
		
		
	}


