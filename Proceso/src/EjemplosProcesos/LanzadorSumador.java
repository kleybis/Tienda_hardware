package EjemplosProcesos;

public class LanzadorSumador {
	public static void main(String[] args) {
		ProcessBuilder pb=new ProcessBuilder();
		String classpath="C:\\Users\\alumno.DESKTOP-H121FO5\\git\\repository\\Proceso\\src";
		
		pb.command("javac.exe","-cp", classpath,"Sumador", "1","4");
		
	}
}
 