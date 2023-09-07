package ejercicio44;

import java.util.Scanner;

public class ejercicio44 {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		int[] dni = new int[5];
		int div;

		for (int i = 1; i < 5; i++) {

			System.out.println("\nIngrese un DNI: ");
			dni[i] = datos.nextInt();

		}
		for (int i = 1; i < 5; i++) {
			
			div = dni[i] % 2;
			
			if (div == 0) {
				System.out.println("el numero par es: " + dni[i]);
			}
		}
	}

}
