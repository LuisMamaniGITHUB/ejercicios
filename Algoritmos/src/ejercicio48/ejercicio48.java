package ejercicio48;

import java.util.Scanner;

public class ejercicio48 {
	
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		String [] apellidos = new String [4];
		
		char max=  ' ';
		char min = '{';
		
		for (int i=0; i<4; i++) {
			
			System.out.println("\nIngrese un apellido: ");
			apellidos[i] = datos.next();

		}
	
		for (int i = 0; i < apellidos.length - 1; i++) {
			for (int j = 0; j < apellidos.length - i - 1; j++) {
				if (apellidos[j].compareTo(apellidos[j + 1]) > 0) {
			
					
					String temp = apellidos[j];
					apellidos[j] = apellidos[j + 1];
					apellidos[j + 1] = temp;
				}
			}
		}

		
		System.out.println("\nPrimer apellido alfabeticamente:");
		for (String palabra : apellidos) {
			System.out.print(palabra + " ");
		}
		
			
		
		
		
		
		
		
	}

}
