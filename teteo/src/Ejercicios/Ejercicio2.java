package Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner T= new Scanner(System.in);
		Scanner C= new Scanner(System.in);
		
		String linea;// donde el usuario introducira el contenido del fichero
		String NombreFichero="";// el nombre que introducira el usuario al fichero
		
		String NficheroCopia;
		String P=null;
		
		BufferedWriter bw=null;// necesario para escribir el fichero
		BufferedReader br=null;
		
		System.out.println(" el nombre del fichero");
		NombreFichero=T.nextLine();
		
		File ficheroEntrada = new File(NombreFichero);
		
		
		try {
			bw= new BufferedWriter(new FileWriter(ficheroEntrada));
			// ahora se pregunta al usuario la linea que quiere introducir
			System.out.println(" Introduce una linea");
			linea=T.nextLine();		
			
			// LA CONDICION PARA QUE CUNDO INTRODUZCA UN 0 PARA DE INTRODUCIR CONTENIDO
			
			while(!linea.equals("0")) {
				bw.write(linea);
				bw.newLine();
				System.out.println("introduce una linea y pulsa 0 para terminar");
				linea=T.nextLine();
				
				bw.close();
				br.close();
			}
			
		}catch(IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(" quireres hacer una copia del fichero? S para si o N para no");
		P=C.nextLine();		
		if(P.equals("S")) {
			System.out.println(" INTRODUCE EL NOMBRE DEL FICHERO");
			NficheroCopia=C.nextLine();
			
			File FicheroCoPIA = new File(NficheroCopia);
			try {
				FileInputStream entrada= new FileInputStream(NombreFichero);
				FileOutputStream salida= new FileOutputStream(NficheroCopia);
				
				int c;
				try {
					while((c=entrada.read() )!=-1)
						salida.write(c);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		
		
		else
			System.out.println(" se se realizara la copia");
		
	
		
		
		
	}

}
