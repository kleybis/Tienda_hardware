package lamdas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EjemploStringLamdaMpa {
	public static void main(String[] args) {

		
		Map<Integer, Persona> personasMap=new HashMap<Integer, Persona>();
		personasMap.put(1, new Persona("adrian" , 19));
		personasMap.put(2, new Persona("jpse" , 60));
		personasMap.put(3, new Persona("matuidi" , 33));
		
		personasMap.forEach((x,y)->System.out.println("clave"+x+"-valor"+y));
		
		
		// ordenar con una condicion
		personasMap.forEach((k,v) -> {
			if (v.getEdad()<=20) System.out.println("-2clave" +k+ "-Valor" + v);
		});
		
		// crea una una lista apartir de pasar el mapa a listi filtrando con la condicion y se vuleve a convertir a lista 
		
		List<Persona> persList=personasMap.values().stream().filter(x->x.getEdad()>20).collect(Collectors.toList());
		
		System.out.println(persList);
		List<Integer>clavesList=personasMap.keySet().stream().filter(x-> x<3).collect(Collectors.toList());
		
		System.out.println(clavesList);
		
		List<Persona>personasList=new ArrayList<Persona>();
		personasList.add(new Persona("mario",19));
		personasList.add(new Persona("pepe",40));

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
		
		// Disticnt eliminar duplicados
		
		Persona p1 = new Persona("ana",21);
		personasList.add(p1);
		personasList.add(p1);
		System.out.println(personasList.stream().distinct().collect(Collectors.toList()));
		
		
		
		// mapeo nos quedamos con una parte de la estructura 
		List<Integer>edadeslist=personasList.stream().map(x->x.getEdad()).collect(Collectors.toList());
		
		
		//sumas
		
		
		
		
	}
}
