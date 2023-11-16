package Tercer_Desafio_integrador_4to_Bimestre;

import java.util.InputMismatchException;
import java.util.Scanner;

public class libro {
	
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);

		 String busqueda;

		String[] Titulo = { "Harry Potter", "El Señor de los Anillos", "Cien años de soledad", "Orgullo y prejuicio"};
		datos.nextLine();
		String[] autor = { "J.K. Rowling", "J.R.R. Tolkien", "Gabriel García Márquez", "Jane Austen"};
		int[] numero_de_paginas = {223, 1178, 417, 432};
		
		try {
		System.out.println("\nIngrese el titulo del libro a buscar:");
		busqueda = datos.nextLine();
		
		
		for (int i = 0; i <4; i++) {

			if (busqueda.equalsIgnoreCase(Titulo[i])) {
			    System.out.println("\nEl titulo del libro es: " + Titulo[i] + "\nEl autor del libro es: " + autor[i] +"\nEl numero de paginas del libro es: "+ numero_de_paginas[i]);
			}
			
			if (numero_de_paginas[i]< 0) {
				
				System.out.println("error: el numero es negativo.");
	            throw new ArithmeticException();
			}
		}
		
		System.out.println("\n¿Desea buscar otro libro?");
		char desicion = datos.next().charAt(0);
		datos.nextLine(); 
		
		boolean desicion2 = false;
		
		if (desicion == 's') {
			
			desicion2 = true;
			
		}
		
		while (desicion2 == true) {
			
			
			System.out.println("\nIngrese el titulo del libro a buscar:");
			busqueda = datos.nextLine();
			
			for (int i = 0; i <4; i++) {

				if (busqueda.equalsIgnoreCase(Titulo[i])) {
				    System.out.println("\nEl titulo del libro es: " + Titulo[i] + "\nEl autor del libro es: " + autor[i] +"\nEl numero de paginas del libro es: "+ numero_de_paginas[i]);
				}
			}
			
			System.out.println("\n¿Desea buscar otro libro?");
			 desicion = datos.next().charAt(0);
			datos.nextLine(); 
			
			if (desicion == 'n') {
				desicion2 = false;
				System.out.println("\nPrograma finalizado.");
			}
		}
		
		
		
		} catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un dato válido.");
        } 
		
	}
	
	
}
