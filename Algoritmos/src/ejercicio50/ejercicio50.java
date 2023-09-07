package ejercicio50;

import java.util.Scanner;

public class ejercicio50 {
	
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int max = -100000000, min = 100000000;
		
		
		System.out.println("\nCuantas personas van a apostar? : ");
		int personas = datos.nextInt();
		
		
		int[] apuesta = new int[personas];
		
		
		for (int i = 0; i < apuesta.length; i++) {
			
		System.out.println("\nCuanto dinero desea apostar por un producto? : ");
		apuesta[i] = datos.nextInt();
		
		
		
		if (apuesta[i] > max) {
			max = apuesta[i];
		}

		if (apuesta[i] < min) {

			min = apuesta[i];
		}
		
		
		
		}
		
		System.out.println("\nLa apuesta maxima es: " + max);
		System.out.println("\nLa apuesta minima es: " + min);
		
		
		
		for (int i = 0; i < (apuesta.length - 1) ; i++) {
			 
			for (int j = 0; j < (apuesta.length - i - 1) ; j++) {
			
			
				
				if (apuesta[j] > apuesta[j + 1]) {
					
					int temporal = apuesta[j];
					
					apuesta[j] = apuesta[j + 1];
					
					apuesta[j + 1] = temporal;
					
				}
			}
			
			
		}

		for (int i = 0; i < apuesta.length; i++) {
			
			
		if (apuesta[i] < 500) {
			
			continue;
			
		}
		
		}
		
		System.out.println("\nArreglo ordenado:");
		for (int areglo : apuesta) {
			System.out.print(areglo + " ");
			
			
		}
		
		
		
		
		
	}

}
