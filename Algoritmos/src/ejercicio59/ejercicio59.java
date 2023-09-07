package ejercicio59;

import java.util.Scanner;

public class ejercicio59 {

	public static int[] numeros = new int[3];
	public static int max = -100000, min = 100000;
	
	
	
	
	public static void ingresarNumeros() {
	    Scanner entrada = new Scanner(System.in);
	    
	    for (int i = 0 ; i<3; i++) {
	    	
	    System.out.println("\nIngresa un numero: ");
	    numeros[i] = entrada.nextInt();
	    
	    
	    if (numeros[i] > max) {
			max = numeros[i];
		}

		if (numeros[i] < min) {
			min = numeros[i];
		}
	   
	    }
	    
	    
	    System.out.println("");
	    
	    
	    System.out.println("El numero mayor es: " + max);
		System.out.println("El numero menor es: " + min);
	    
	}
	
	
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
	   
	    ingresarNumeros();
	   
	    
	}
	
	
}
