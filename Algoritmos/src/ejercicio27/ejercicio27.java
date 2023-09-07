package ejercicio27;

import java.util.Scanner;

public class ejercicio27 {
	
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);

		int contador=0,contraseña;
		boolean intentos = false;
		
		
		do {
		System.out.println("\nIngrese una contraseña: ");
		contraseña = datos.nextInt();
		
		contador ++;
		System.out.println("\nLa cantidad de intentos es:"+contador);
		
		if ( contador  > 2) {
			intentos = true;
			}
		
		if (contraseña == 392006 && intentos == false && contador < 3 ) {
			System.out.println("\nContraseña correcta.");
		}
		
		if (contraseña != 392006 && intentos == false && contador < 3 ) {
			System.out.println("\nContraseña incorrecta.");
		}
		
		if (contraseña != 392006 && intentos == true && contador == 3 ) {
			System.out.println("\nUsuario bloqueado.");
		}
			
			
		}while (contraseña != 392006 && intentos == false && contador < 3);
		
		
		
		
		
		
		
		
		
	}

}
