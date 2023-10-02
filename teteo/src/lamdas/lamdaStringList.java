package lamdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lamdaStringList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//combierte la lista en string y luego en lista en base a la condicion
		List<Integer> enterosList= Arrays.asList(34,23,64,23);
		System.out.println(enterosList.stream().filter(x-> x>50).collect(Collectors.toList()));
	}

}
