package Escritura;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class EscrituraPequeñosBytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Path ficheroEscritura = Paths.get("Ficheros/escritura1"); // VARIABEL PARA CREAR EL FICHERO DONDE SE GUARDA LO QUE VAMOS A ESCRIBIR , SI NO EXITE LO CREA
		
		
		String cadena = " esto es lo que aparecer en el fichero \n salto de linea"	;	// VARIABLE QUE USAMOS PARA INTRODUCIR EL CONTENIDO
		
		byte[] contenido = cadena.getBytes(StandardCharsets.UTF_8); 	// SE TIENE QUE PASA EL STRING A UN ARRYA DE BYTES PARA PODER INTRODUCIR EL CONTENIDO
		
		
			try {// con la clase file.write se escribe en el fichero el primer termino es el conbre del fichro de escritura , el segundo termino es el contenido introducido 
				Files.write(ficheroEscritura, contenido, StandardOpenOption.APPEND);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
