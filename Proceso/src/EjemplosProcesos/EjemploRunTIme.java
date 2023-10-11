package EjemplosProcesos;

import java.io.IOException;

public class EjemploRunTIme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Runtime se encarga de lanzar los procesos 
		 */
		Runtime run= Runtime.getRuntime();// lanza el programa
		
		String parametros[]= {"notepad","hola.txt"};
		
		//run.exec("notepad");
		try {
		Runtime.getRuntime().exec(parametros);
			//run.exec(parametros);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(run.freeMemory());// devuleve la memoria
		System.out.println(run.version());// devulve la version
		
	}

}
