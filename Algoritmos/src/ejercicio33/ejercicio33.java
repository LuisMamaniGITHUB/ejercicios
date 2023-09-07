package ejercicio33;

import java.util.Scanner;

public class ejercicio33 {

	public static void main (String args []) {
		Scanner datos = new Scanner (System.in);
		
		
		String[] nombre = new String[12]; 
		int [] edad = new int[12]; 
		
		
		for (int i = 1; i<12 ; i++) {
		
		
		System.out.println("Cual es el nombre del jugador?:");
		nombre[i] = datos.next();
		
		
		System.out.println("\nIngrese su edad: ");
		edad[i] = datos.nextInt();
		
		}
		
		System.out.println("\n "); 
		
		
	
		for (int i = 1; i<12; i++) {
			
			System.out.println("Nombre en la posicion "+i +": ");
			System.out.println(nombre[i]);
			
			System.out.println("Edad en la posicion "+i +": ");
			System.out.println(edad[i]);
			
			System.out.println("\n ");  
		/*si, se puede mostrar todos los datos de los jugadores porque la condicion del for dice que 
		 si i que comienza en 1 es menor a 12 se va sumando y se imprime los datos del jugador en la 
		 posicion 1, si segui cumpliendo la condicion de que se menor a 12 pasa a la posicion 2 y se 
		 imprimen los datos */	
			
			}
		
	}
	

}
