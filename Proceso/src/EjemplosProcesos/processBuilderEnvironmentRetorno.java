package EjemplosProcesos;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class processBuilderEnvironmentRetorno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProcessBuilder pb=new ProcessBuilder();
		Map<String, String>env;
		pb.command("notepad.exe","Hola.txt");
		pb.directory(new File ("C:\\Users\\alumno.DESKTOP-H121FO5\\Documents"));
		
		Process proceso;
		int retorno;
		
		env=pb.environment();
		
		System.out.println(env.get("userdomain"));
		System.out.println(env.get("os"));
		
		System.out.println(env.toString());
		
		try {
			
			proceso=pb.start();
			try {
				retorno=proceso.waitFor();
				
				if (retorno==0) {
					System.out.println(" ha ternimado correctamente");
				}
				else
					System.out.println(" no se ha terminado correctamente");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
