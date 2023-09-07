package ejercicio13;

import java.util.Scanner;

public class ejercicio13 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		char talle;
		
		System.out.println("\nIngrese un talle entre S, M y L: ");
		talle = entrada.next().charAt(0);
		
		
		if (talle == 'S') {
			System.out.println("\nQuedan 5 remeras");
		}
		
		if (talle == 'M') {
			System.out.println("\nQuedan 2 remeras");
		}
		
		if (talle == 'L') {
			System.out.println("\nNo Quedan remeras");
		}
		
		
	}

}
