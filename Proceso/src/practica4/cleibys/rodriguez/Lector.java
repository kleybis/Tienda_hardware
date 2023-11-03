package practica4.cleibys.rodriguez;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	
		BufferedReader br;
		
		try {
			
			
			br=new BufferedReader(new InputStreamReader(System.in));
			
			String linea;
			while((linea=br.readLine())!=null) {
				System.out.println("he leido:" + linea);
				
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

}
