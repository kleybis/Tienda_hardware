package lamdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		List<Integer> enterosList= Arrays.asList(34,23,64,23);
		enterosList.sort(null);
		System.out.println(enterosList);
		
		
		List<Persona>personasList=new ArrayList<Persona>();
		personasList.add(1,new Persona("mario",19));
		personasList.add(2,new Persona("pepe",40));
		personasList.add(3,new Persona("juan",56));
		
		//ordenar por nombre
		personasList.sort((x,y) -> x.getNombre().compareTo(y.getNombre()));
		System.out.println(personasList);
		// ordenar por edad
		personasList.sort((x,y)-> x.getEdad()-(y.getEdad()));
		System.out.println(personasList);
		
		
		
		/// ejemplo de any macht devuelve un boolean
		if (personasList.stream().anyMatch(x-> x.getNombre().length()>5)) {
			System.out.println(" hay nombres largos");
		}else System.out.println(" son nmbres maximos son de 5 letras");
		
		
		// allmatch: todos los elementos cumplen con la condicion
		
		if (personasList.stream().allMatch(x-> x.getNombre().length()>3)) {
			System.out.println(" todos los nombres son mas largos de 3 letras");
		}else System.out.println(" algun nombre tiene 3 letras o menos");
		
		
		// ejemplo de count()
		System.out.println(personasList.stream().filter(x->x.getEdad()>19).count());
		
		
		
		
		
		
		
		
	}

}
