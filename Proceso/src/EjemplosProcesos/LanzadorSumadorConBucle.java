package EjemplosProcesos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LanzadorSumadorConBucle {
	public static void main(String[] args) {
ProcessBuilder pb = new ProcessBuilder();
		
		String classpathSRC="C:\\Users\\alumno.DESKTOP-H121FO5\\git\\repository\\Proceso\\src\\";
		String classpathBin="C:\\Users\\alumno.DESKTOP-H121FO5\\git\\repository\\Proceso\\bin\\";
		Process proceso;// se declara para capturara el error
		
		int retorno;
		boolean continuar=true;
		char car;
		
		
		String op1,op2;
		Scanner t=new Scanner(System.in);
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
			
			while(continuar) {
			
			
			
				System.out.println("introduce el operador1");
				op1=t.next();
				
				System.out.println(" introduce el operador 2");
				op2=t.next();
				
				
				pb.command("java.exe","-cp",classpathBin, "EjemplosProcesos.Sumador", op1, op2);//AQUI BUSCA EL PROGRAMA Y LUEGO LO EJECUTA
				proceso=pb.start();
				
			try {
				retorno=proceso.waitFor();
				if (retorno==0) {
					System.out.println(" ha ternimado correctamente");
				}
				else
					System.out.println(" no se ha terminado correctamente");
				
				do {
				System.out.println(" quires volver a lanzar el programa?[S-N]");
				car=t.next().charAt(0);
				if(car=='N')
					continuar=false;
				}while(car!='S' && car!='N');
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
 