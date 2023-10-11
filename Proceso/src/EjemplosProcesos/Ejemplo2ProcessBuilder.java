package EjemplosProcesos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejemplo2ProcessBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>lista=new ArrayList<String>();
		
		Collections.addAll(lista, args);
		
		ProcessBuilder pb1 =new ProcessBuilder(args);
		
		try {
			Process proc = pb1.start();
			System.out.println(proc.pid());
			int estado=proc.waitFor();
			System.out.println("estado" + estado);
			
			pb1.start();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	

}
