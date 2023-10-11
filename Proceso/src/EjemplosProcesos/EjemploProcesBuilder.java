package EjemplosProcesos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EjemploProcesBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ProcessBuilder pb= new ProcessBuilder("nope.exe", "hola.txt");
		
		
		List<String> lista=new ArrayList<String>();
		lista.add("C:\\Program Files\\Mozilla Firefox\\firefox.exe");//rutan entera del firefox con el punto exe
		lista.add("https://www.youtube.com/shorts/oKdcF76cSg0");
		ProcessBuilder pb1= new ProcessBuilder(lista);
		
		try {
			
			//pb.start();
			pb1.start();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
