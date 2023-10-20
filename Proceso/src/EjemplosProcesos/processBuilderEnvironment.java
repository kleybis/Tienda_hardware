package EjemplosProcesos;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class processBuilderEnvironment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProcessBuilder pb=new ProcessBuilder();
		Map<String, String>env;
		pb.command("notepad.exe","Hola.txt");
		pb.directory(new File ("C:\\Users\\alumno.DESKTOP-H121FO5\\Documents"));
		
		
		env=pb.environment();
		
		System.out.println(env.get("userdomain"));
		System.out.println(env.get("os"));
		
		System.out.println(env.toString());
		
		try {
			pb.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
