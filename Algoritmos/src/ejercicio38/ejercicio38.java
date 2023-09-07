package ejercicio38;

import java.util.Scanner;

public class ejercicio38 {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		int clientes, max = -100000, min = 100000;

		for (int i = 9; i < 20; i +=2) {
			System.out.println("\nLa cantidad de clientes en la " + i + " hs es:");
			clientes = datos.nextInt();
			
			if (clientes>max) {

				max=clientes;			
			}		
			if (clientes>min) {

				min=clientes;			
			}
		}
		
		System.out.println("La mayor cantidad de clientes en el dia es: " +max);
		System.out.println("La menor cantidad de clientes en el dia es: " +min);
		
	}
	
}
