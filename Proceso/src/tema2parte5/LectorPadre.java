package tema2parte5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LectorPadre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProcessBuilder pb= new ProcessBuilder();
		
		Process p;
		BufferedReader br;
		pb.command("java","-cp", "C:\\Users\\alumno.DESKTOP-H121FO5\\git\\repository\\Proceso\\src\\","tema2parte5.EscrituraHijo","4");
		
		try {
			p=pb.start();
			
			br=new BufferedReader(new InputStreamReader(p.getInputStream()));
			
			String linea=br.readLine();
			
			while(br.readLine()!=null) {
				System.out.print("linea 1:" + linea);
				linea=br.readLine();
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

}
