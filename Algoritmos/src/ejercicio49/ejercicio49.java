package ejercicio49;

import java.util.Scanner;

public class ejercicio49 {
		 
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);

		
			System.out.println("\nIngrese la cantidad de DNI a almacenar: ");
			int cantidad = entrada.nextInt();

			
			int[] DNI = new int[cantidad];
			
			
			System.out.println("");

		
			for (int i = 0; i < DNI.length; i++) {
				System.out.println("Ingrese un numero de DNI: ");
				DNI[i] = entrada.nextInt();
			}

		
			for (int i = 0; i < (DNI.length - 1) /* i < 4 (5-1) */; i++) {

				for (int j = 0; j < (DNI.length - i - 1); j++) {

					if (DNI[j] > DNI[j + 1]) {

						int temporal = DNI[j];

						DNI[j] = DNI[j + 1];

						DNI[j + 1] = temporal;

					}
				}
			}
		
			
			System.out.println("");

			
			for (int i = 0; i < DNI.length; i++) {
				System.out.println("El DNI " + (i + 1) + " es: " + DNI[i]);
				
			}
			
		
			System.out.println("");
		
			

			for (int i=(DNI.length-1); i>=0; i-- ) {
				
				System.out.println("El DNI es: " + DNI[i]);
				
				
				
			}
		
	}

}
