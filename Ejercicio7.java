import java.*;
import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Stream;

public class Ejercicio7 {

	public static void main(String[] args) {
		System.out.println("Ejercicio 7");
		System.out.println("Mediante ciclos o bucles genera la impresión de un triángulo recto de números");
		
		int numAleatorio = 0; 
		int entrada = 0;
		Random rd = new Random();
		numAleatorio = rd.nextInt(101);
		int i = 0;
		System.out.println("Numero:" + numAleatorio);
		
		while ( numAleatorio != 10 &&  i < 5) {
			System.out.println("No has acertado");
			i++;
		}
		
	}

}
