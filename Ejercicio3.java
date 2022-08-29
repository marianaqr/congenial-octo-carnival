import java.*;
import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Stream;


public class Ejercicio3 {
	

	public static void main(String[] args) {
		System.out.println("Ejercicio 3");
		System.out.println("Mediante ciclos o bucles genera la impresión de un triángulo recto de números");
		System.out.println("Introduce N a continuación: \n");
		System.out.println("N: ? \t");
		Scanner sa = new Scanner(System.in);
		Integer n = sa.nextInt();
		System.out.println("n=" + n);
		
		for ( int i = 0; i < n; i++ ) {
			for ( int j = 0; j < i; j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}

	}

}
