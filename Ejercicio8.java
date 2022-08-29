import java.*;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		System.out.println("Ejercicio 8");
		System.out.println("Condicionales");
		System.out.println("Introduce 3 numeros a continuación: \n");
		System.out.println("A: ? \t");
		Scanner sa = new Scanner(System.in);
		Integer A = sa.nextInt();
		System.out.println("A=" + A);
		
		System.out.println("B: ? \t");
		Scanner sb = new Scanner(System.in);
		Integer B = sb.nextInt();
		System.out.println("B=" + B);
		
		System.out.println("C: ? \t");
		Scanner sc = new Scanner(System.in);
		Integer C = sb.nextInt();
		System.out.println("C=" + C);
		
		if ( A > B &&  B > C) {
			System.out.println("El orden es: " + A+"\t"+ B +"\t"+ C);
		}else {
			if ( A > C && C > B ) { 
				System.out.println("El orden es: " + A+"\t"+ C +"\t"+ B);
			} else {
				if ( B > A && A > C ) { 
					System.out.println("El orden es: " + B+"\t"+ A +"\t"+ C); 
				} else {
					if ( B > C && C > A ) { 
						System.out.println("El orden es: " + B+"\t"+ C +"\t"+ A); 
					} else {
						if ( C > A && A > B ) { 
							System.out.println("El orden es: " + C+"\t"+ A +"\t"+ B); 
						}  else {
							if ( C > B && B > A ) { 
								System.out.println("El orden es: " + C+"\t"+ B +"\t"+ A); 
							} 
						}
					}
				}
			}
		}

	}

}
