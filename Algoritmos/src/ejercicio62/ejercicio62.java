package ejercicio62;

import java.util.Scanner;

public class ejercicio62 {
	
	
	public static String[] apellidos = new String[5];
	
	public static String max = " ", min = "{";
	
	
	
	
	public static void ingresarApellidos() {
		
		Scanner entrada = new Scanner(System.in);

		
		for (int i = 0; i < 5; i++) {

			System.out.println("\nIngrese un apellido: ");
			apellidos[i] = entrada.next();

		}

		for (int i = 0; i < 5; i++) {

			if (apellidos[i].compareTo(max) > 0) {

				max = apellidos[i];

			}

			if (apellidos[i].compareTo(min) < 0) {

				min = apellidos[i];
			}
		}

		System.out.println("\nEl primer apellido: " + min);
		System.out.println("\nEl ultimo apellido: " + max);

	}
	

	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
	   
	    ingresarApellidos();
	   
	    
	}
	
}