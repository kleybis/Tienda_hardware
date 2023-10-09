package lamdas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EjemploCapitales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Inicializamos laa lista de capitales
		List<Capital>CapitalesList=new ArrayList<Capital>();
		CapitalesList.add(new Capital("España","Madrid"));
		CapitalesList.add(new Capital("Framcia","Paris"));
		CapitalesList.add(new Capital("Portugal","Lisboa"));
		CapitalesList.add(new Capital("RD","Santo Domingo"));
		CapitalesList.add(new Capital("Colombia","Bogota"));
		//Lista por pantalla de los paises
		System.out.println("======================");
		CapitalesList.forEach(x->System.out.println("-" + x.getPais()));
		List<String>paisesList=CapitalesList.stream().map(x->x.getPais()).toList();
		System.out.println(paisesList);
		List<String>otraFormaPais=CapitalesList.stream().map(Capital::getPais).toList();
		//Lista capitales
		System.out.println("================");
		CapitalesList.forEach(x->System.out.println("-" + x.getCapital()));
		// barajar los elemntos
		System.out.println("================");
		// ordenarlos por paises
		System.out.println(CapitalesList);
		Collections.shuffle(CapitalesList);
		System.out.println(CapitalesList);
		/// ordenarlos por capitales
		CapitalesList.sort((x,y)->x.getPais().compareTo(y.getPais()));
		
		CapitalesList.sort((x,y)->x.getCapital().compareTo(y.getCapital()));
		// devuelva la capital de un pais
		String pais="España";
		CapitalesList.stream().filter(x->x.getPais().equalsIgnoreCase(pais)).map(Capital::getCapital).forEach(System.out::println);;
		
		// devuleva la capital de in pais y 3 capitales mas
		System.out.println("***********************");
		List<String>capitales=new ArrayList<String>();
		capitales.addAll(CapitalesList.stream().filter(x->x.getPais().equalsIgnoreCase(pais)).map(Capital::getCapital).toList());
		capitales.addAll(CapitalesList.stream().filter(x->!x.getPais().equalsIgnoreCase(pais)).map(Capital::getCapital).limit(3).toList());
		System.out.println(capitales);
		
		
		// devuelva la capital de un 
		
		
	}


	
}
