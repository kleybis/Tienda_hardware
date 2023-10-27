package practica3.rodriguez.cleibys;

import java.io.IOException;
import java.util.ArrayList;

public class Ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		if(args.length<=0)
			System.out.println("eroor debe introducir un programa");
		else {
			ProcessBuilder pb;
			Process p;
			int retorno = 0;
			
			pb= new ProcessBuilder(args);
			try {
				p= pb.start();
				try {
					retorno= p.waitFor();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("la ejecucuin de " + args[0] + "devuelve" + retorno);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
