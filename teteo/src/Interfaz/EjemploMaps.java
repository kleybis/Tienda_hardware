package Interfaz;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EjemploMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<Integer, String> mapFrutas= new HashMap<Integer ,String>();
		// AÑADIR ELEMENTO AL MAP
		mapFrutas.put(1, "kiwi");
		mapFrutas.put(2,"naranja");
		mapFrutas.put(3, "pera");
		// MOSTRAR POR PANTALLA
		System.out.println(mapFrutas);
		// SUSTITUIR UN ELEMENTO DEL MAPA
		mapFrutas.put(2, "LIMON");
		
		Collection<String> valoresMap=new HashSet<String>();
		valoresMap=mapFrutas.values();
		
		Set<Integer> claves=mapFrutas.keySet();
			for(Integer i:claves) {
				System.out.println(i + ":" + mapFrutas.get(claves));
			}
		
		mapFrutas.forEach((k,v) ->System.out.println(k+ "-" + v));
		
		
		Map<Integer, Persona> personaMap= new HashMap<Integer, Persona>();
		personaMap.put(1,new Persona("Nombre","Apellido", 20));
		
		
		
	}

}
