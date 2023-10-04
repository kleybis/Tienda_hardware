package lamdas;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EjemploCapitales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Inicializamos laa lista de capitales
		//Lista por pantalla de los paises
		//Lista capitales
		// barajar los elemntos
		// ordenarlos por paises
		/// ordenarlos por capitales
		// devuelva la capital de un pais
		// devuleva la capital de in pais y 3 capitales mas
		// devuelva la capital de un 
		
		Map<Integer, Capital> capitalList= new HashMap<Integer,Capital>();
		capitalList.put(1,new Capital ("España", "Madrid"));
		capitalList.put(2,new Capital(" Francia", "Paris"));
		capitalList.put(3,new Capital("Portugal","lisboa"));
		
		
		capitalList.forEach((x,y)->System.out.println("el pais es:" + y.getPais()));
		System.out.println("____________________________");
		capitalList.forEach((x,y)->System.out.println(" las capitales listadas"+ y.getCapital()));
		System.out.println("=================================");
		//capitalList.forEach((x,y)->System.out.println(y.getPais().compareTo(y.getPais())));
		List<Capital>CapitalLIST=capitalList.values().stream().collect(Collectors.toList());
		CapitalLIST.sort((x,y)->x.getPais().compareTo(x.getPais()));
		System.out.println(CapitalLIST);
		
		
		
		//System.out.println(capitalList);
	}

	
}
