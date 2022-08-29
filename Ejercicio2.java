import java.*;
import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Stream;

public class Ejercicio2 {

	public static void main(String[] args) {
		System.out.println("Ejercicio 2");
		System.out.println("Crear una lista de tipo String");

		List<String> a = new ArrayList<String>();
		a.add("juan");
		a.add("pedro");
		a.add("jose");
		a.add("maria");
		a.add("sofia");
	
		Stream.of(a.toString()).forEach(System.out::println);

	}

}
