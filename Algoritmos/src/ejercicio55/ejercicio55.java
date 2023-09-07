package ejercicio55;

import java.util.Scanner;

public class ejercicio55 {
	
static float num1;
	
	
	public static void ingresarNumero() {
	    Scanner entrada = new Scanner(System.in);
	    System.out.println("Ingrese un numero: ");
	    num1 = entrada.nextFloat();
	    
	   
	}
	
	public static float alCuadrado(float a) {
		
	    float potencia = a*a;
	    
	    return potencia;
	    
	    
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		ingresarNumero();
		alCuadrado(num1);
		 System.out.println("\nEl resultado de la potencia: "+alCuadrado(num1));
	}

}
