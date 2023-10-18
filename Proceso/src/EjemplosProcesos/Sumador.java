package EjemplosProcesos;

public class Sumador {

	
	public static int suma(int n1, int n2) {
		int suma=0;
		for (int i=n1; i<=n2; i++)
			suma+=i;
		return suma;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		suma(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		
	}

}
