package ejercicio46;

import java.util.Scanner;

public class ejercicio46 {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		int busqueda, div;

		int[] numeros = { 1011, 2367, 8748, 9121, 817, 6423, 2034 };

		String[] nombres = { "Enrique", "Liliana", "Lucas", "Juan", "Fiorella", "ariel", "daiana" };

		System.out.println("\nIngrese el numero del socio:");
		busqueda = datos.nextInt();

		
		
		for (int i = 0; i < 1; i++) {

			div = busqueda % 2;

			if (div == 1) {
				System.out.println("\nEl numero es impar ");
			} 
			
			else if (div == 0) {
				continue;
			}
		}

		
		for (int i = 0; i <= 7; i++) {

			if (busqueda == numeros[i]) {
			System.out.println("\nEl nombre del socio es: " + nombres[i] + "\nEl numero del socio es:" + numeros[i]);
			}
		}

	}

}
