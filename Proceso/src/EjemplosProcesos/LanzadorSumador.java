package EjemplosProcesos;

import java.io.File;
import java.io.IOException;

public class LanzadorSumador {
	public static void main(String[] args) {
ProcessBuilder pb = new ProcessBuilder();
		
		String classpathSRC="C:\\Users\\alumno.DESKTOP-H121FO5\\git\\repository\\Proceso\\src\\";
		String classpathBin="C:\\Users\\alumno.DESKTOP-H121FO5\\git\\repository\\Proceso\\bin\\";
		
		//Redirecciona los errores a la salida de error estandar del proceso que lo lanza
		pb.redirectErrorStream(true);
				
		//Redirecciona la salida a la salida estandar del proceso que lo lanza
		pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
		
		try {
			pb.directory(new File(classpathSRC));//AQUI ES DONDE BUSCA EL JAVA C Y EL .JAVA
			pb.command("javac", "EjemplosProcesos\\Sumador.java","-d",classpathBin); // AQUI ES DONDE LO GUARDA Y SE COLOVA -d PARA GUARDA LA COMBILACION EN EL BIN
			pb.start();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			pb.command("java.exe","-cp",classpathBin, "EjemplosProcesos.Sumador", "1", "5");//AQUI BUSCA EL PROGRAMA Y LUEGO LO EJECUTA
			pb.start();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
 