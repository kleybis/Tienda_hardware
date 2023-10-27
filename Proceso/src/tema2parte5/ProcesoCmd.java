package tema2parte5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProcesoCmd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String parametros[]= {"cmd", "/c", "dir"};
		
		Runtime run = Runtime.getRuntime();
		try {
			Process p=run.exec(parametros);
			BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream()));
			// para que devuelva el resultatado
			int cont=1;
			
			String linea =br.readLine();
			

			while(br.readLine()!=null) {
				System.out.println("linea 1:" + linea);
				linea=br.readLine();
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
