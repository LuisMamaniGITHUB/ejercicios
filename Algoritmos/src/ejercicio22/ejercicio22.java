package ejercicio22;

import java.util.Scanner;

public class ejercicio22 {
	
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int numero,num_bingo,num_ganador,contador=0;
		
		System.out.println("\tVamos a jugar al bingo");
		
		num_bingo = (int) (Math.random()*99); 
		num_ganador = (int) num_bingo;
		
		
		do {
		
		System.out.println("\nIngresa un numero entre 0 y 99: ");
		numero = datos.nextInt();
		
		contador ++;
		}while(num_ganador != numero);
		
		if (num_ganador == numero){
		System.out.println("\nGANASTE!");
		System.out.println("\nEn el intento numero: "+contador);
		}
	
		
		
}
	
}