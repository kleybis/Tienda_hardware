package Escritura;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EscrituraSecuendical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Path FicheroEscritura = Paths.get("Ficheros/EscrituraSream.txt");
		
				String contenido= "Este es el contenido";
				
			OutputStream oStream;
			
			/**
			 * la clase stream no lee otra cosa que no sean bytes poor lo tanto tenemos que utlizar el .getsBytes para trasformalo en bytes y haci poder escribirl
			 */
				try {
					oStream= Files.newOutputStream(FicheroEscritura); // Es el puntero que apunda a donde se va a escribir
					for (int i=0 ; i<=4; i++) {
						oStream.write((contenido + i).getBytes()); // con write añadimos el contendo que necesario utlizar.getsBytes ya que solo lee de for de bytes
					}
					
							oStream.write(("ultima fila").getBytes());
						oStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		
	}

}
