package aleatorios;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FicherosAleatorioEscritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		RandomAccessFile fichero;
		
		
		byte[] datos = new byte[20];// se establece el tamañoo del array en base a lo que se necesite
		int numByteLeidos=0;
		String cadena="Nuevo texto incorporado";
		
		try {
			fichero=new RandomAccessFile("Ficheros/PrimeroFuera.txt","rw");
			fichero.read(datos);
			System.out.println(new String(datos));
			System.out.println("=============");
			
			fichero.write(cadena.getBytes());
			fichero.seek(fichero.length());
			fichero.write(cadena.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
