package ejercicio25;

import java.util.Scanner;

public class ejercicio25 {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		int numero, num_bingo, num_ganador, contador = 0;
		boolean intentos = false;
		
		num_bingo = (int) (Math.random() * 99);
		num_ganador = (int) num_bingo;
		System.out.println(":"+num_ganador);
		

		do {
		System.out.println("\nIngresa un numero entre 0 y 99: ");
		numero = datos.nextInt();
		
		contador ++;
		System.out.println("\nIntento numero:"+contador);
		
		if ( contador  > 4) {
			intentos = true;
			}
		
		if (numero != num_ganador && intentos == true && contador == 5) {
			System.out.println("\nPerdiste.");
			System.out.println("\nLa cantidad de intentos es:"+contador);
		}
		
		if (intentos == false && numero == num_ganador && contador  < 5 ) {
			System.out.println("\nFelicidades adivinaste.");
			System.out.println("\nLa cantidad de intentos es:"+contador);
		}
		
		}while (numero != num_ganador && intentos == false);
		
		
		
		
		
	}
}
