package practica3.rodriguez.cleibys;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length<1) {
			System.out.println(" se necesita un programa a ejecutar");
			
		}else{
			
			List<String>list=new ArrayList<String>();
			list.add("notepad.exe");
			
			ProcessBuilder pb=new ProcessBuilder(list);
			
				try {
					pb.start();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					
				}
		}
	}

}
