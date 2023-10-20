package EjemplosProcesos;

public class SumadorBucle {

	
	public static int suma(int n1, int n2) {
		int suma=0;
		for (int i=n1; i<=n2; i++)
			suma+=i;
		return suma;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		
		System.out.println(suma(Integer.parseInt(args[0]),Integer.parseInt(args[1])));  
		}
		catch(java.lang.NumberFormatException e) {
			System.out.println("parametro incorrecto");
			System.exit(-1);
		}
		catch(Exception e) {
		System.out.println(" el program a terminado mal");
		System.exit(-1);
	}
	}
	

}
