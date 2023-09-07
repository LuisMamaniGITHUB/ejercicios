package ejercicio18;

import java.util.Scanner;

public class ejercicio18 {
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		
		char talle;
		
		System.out.println("\nIngrese un talle entre S, M y L: ");
		talle = entrada.next().charAt(0);
		
		
		switch (talle) {
		
		case 'S' :
			System.out.println("\nQuedan 5 remeras");
		break;
			
		case 'M' :
			System.out.println("\nQuedan 2 remeras");
		break;
		
		case 'L' :
			System.out.println("\nNo quedan remeras");
		break;
		}
		
		
		
		
}
	
}
