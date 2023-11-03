package practica4.cleibys.rodriguez;

public class Escritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		if (args.length<1)
			System.out.println("error tiene que recibir un numero");
		
		else {
			int num=Integer.parseInt(args[0]);
			// inprimir el numero
			for(int i=1; i<=num; i++)
				System.out.println(i);
		}
	}
		
		
		
	}


