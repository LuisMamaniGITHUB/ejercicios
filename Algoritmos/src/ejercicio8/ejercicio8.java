package ejercicio8;

import java.util.Scanner;

public class ejercicio8 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		float numero;
		double base,potencia,exponente,raiz;
		int resto,num,suma,multip;
		
			System.out.println("Ingrese un numero:");
			numero = entrada.nextFloat();
			
			double base1 = numero, exponente1 = 2;
			double potencia1 = Math.pow(numero,2);
		
		    int resto1  = (int) Math.round(potencia1);
	
		
		System.out.println("\nEl resultado en entero es: "+resto1);
		
		   num =  (int) (Math.random()*1);
		   suma= num + resto1;
		   multip= suma*7;
		   
		   
		  double raiz1 = Math.sqrt(multip);
		  
		  System.out.println("\nEl resultado final es: "+raiz1);
	}



}
