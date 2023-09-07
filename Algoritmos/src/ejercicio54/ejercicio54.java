package ejercicio54;

import java.util.Scanner;

public class ejercicio54 {
	
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		
		char [][] tablero = new char[3][3];
		
		
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				
				System.out.print("\nIngrese una X u O: ");
				tablero[i][j] = datos.next().charAt(0);
			}
			
			System.out.println();
		}
		
		
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				
				System.out.print(tablero[i][j] + " ");
				
			}
			
			System.out.println();
		}
		
	}

}
