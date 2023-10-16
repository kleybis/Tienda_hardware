package aleatorios;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FicherosAleatorioIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomAccessFile fichero;
		
		
		byte[] datos = new byte[20];// se establece el tamañoo del array en base a lo que se necesite
		int numByteLeidos=0;
		
		
		try {
			fichero=new RandomAccessFile("Ficheros/PrimeroFuera.txt","r");
			
			// primer pasor Posicionarsee 
			fichero.seek(5);
			// leer el fichero
			fichero.read(datos);
			System.out.println(new String(datos));
			System.out.println(numByteLeidos);
			System.out.println("===============");
			
			//avanzar mas respecto a la posicion inicial
			fichero.skipBytes(10);
			fichero.read(datos);
			System.out.println(new String(datos));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
