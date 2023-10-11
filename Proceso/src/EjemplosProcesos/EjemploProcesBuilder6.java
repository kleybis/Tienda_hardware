package EjemplosProcesos;

import java.io.IOException;
import java.io.File;

public class EjemploProcesBuilder6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ProcessBuilder pb= new ProcessBuilder();
			String classpath="C:\\Users\\alumno.DESKTOP-H121FO5\\eclipse-workspace\\Proceso\\bin";
			
			
			pb.command("java.exe","-cp", classpath,"prueba.HolaMundo");
			//pb.redirectOutput(new File("salida.txt"));
			pb.redirectError();
			//pb.redirectError(new File("error.txt"));
			pb.redirectError();
			
			
			try {
				pb.start();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			
	}

}
