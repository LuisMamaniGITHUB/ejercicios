package ejercicio63;

import java.util.Scanner;

public class ejercicio63 {
	
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		
		String correo;
		char posicion;
		int n1;
		
		
		System.out.println("\nIngrese su correo electronico: ");
		correo = datos.next();
		
		System.out.println("cuantos caracteres tiene su correo: ");
		n1 = datos.nextInt(); 
		
		posicion = correo.charAt(n1 - 1);
		
		while () ) {
			
			System.out.println();
		}
		
		
		System.out.println(": "+posicion);
	}

}
