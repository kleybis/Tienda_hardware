package aleatorios;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Path fichero=Paths.get("Ficheros/PrimeroFuera.txt");
		ByteBuffer inputBuffer;
		try {
			FileChannel fc=(FileChannel.open(fichero, StandardOpenOption.READ));
			inputBuffer=ByteBuffer.allocate(50);
			fc.read(inputBuffer);
			System.out.println(new String(inputBuffer.array()));
			//escribir
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
