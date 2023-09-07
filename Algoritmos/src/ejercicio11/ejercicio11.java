package ejercicio11;

import java.util.Scanner;

public class ejercicio11 {
	
			public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int numero;
		
		System.out.println("\nIngrese un numero: ");
		numero = entrada.nextInt();
		
		if (numero>0) {
			
			System.out.println("\nEl numero es positivo");
			
		}
		
		if (numero==0) {
			
			System.out.println("\nEl numero es cero");
			
			
		}
		
		if (numero<0) {
			
			System.out.println("\nEl numero es negativo");
			
		}
		
		
	}


}
