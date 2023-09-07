package ejercicio19;

import java.util.Scanner;

public class ejercicio19 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		
		int maquina;
		 
		
		System.out.println("\tMaquina de cafe: ");
		maquina = entrada.nextInt();
		
		
		switch (maquina){
		
		case 1:
		System.out.println("\nCafe cortado");
		break;
		
		case 2:
			System.out.println("\nCafe latte");
			break;
		
		case 3:
			System.out.println("\nCafe solo");
			break;
			
		case 4:
			System.out.println("\nCafe lagrima");
			break;
			
		default:
			System.out.println("\nSalir del programa");
			break;
		}
		
		
	}

}
