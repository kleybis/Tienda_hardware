package lecturas;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;




public class LecturaConBuffer {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<String>	contenido =lecturaConBuffer(null);
	escribir(contenido);
		
		Path miFichero = Paths.get("Fichero/PrimeroFuera.txt");
		
		BufferedReader bReader;
		List <String> lineasList= new ArrayList<String>();
		
		try {
			bReader=Files.newBufferedReader(miFichero);
			String linea;
			while((linea=bReader.readLine())!=null) {
				lineasList.add(linea);
			}
			
			System.out.println(lineasList);
				int cont=1;
				for(String l: lineasList) {
					System.out.println("linea . " + cont++ + ":");
				}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	private static void escribir(List<String> contenido) {
		// TODO Auto-generated method stub
	int cont=1;
	for(String l : contenido) {
		System.out.println("linea . " + cont++ + ":");
	}
	}

	private static List<String> lecturaConBuffer(String fichero) {
		
		Path miFichero = Paths.get(fichero);
		
		BufferedReader bReader;
		List <String> lineasList= new ArrayList<String>();
		
		try {
			bReader=Files.newBufferedReader(miFichero);
			String linea;
			while((linea=bReader.readLine())!=null) {
				lineasList.add(linea);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lineasList;
		
		
	
	}

}
