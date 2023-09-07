package ejercicio12;

import java.util.Scanner;

public class ejercicio12 {
	
			public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int nota;
		
		System.out.println("\tIngrese una calificacion entre el 1 al 10: ");
		nota = entrada.nextInt();
		
		if (nota<1 || nota>10) {
			
			System.out.println("\nIngreso un valor incorrecto");
		}
		
		if (nota>=1 && nota<=3) {
			System.out.println("insuficiente");
		}
		
		else if (nota>3 && nota<6) {
			System.out.println("no logrado");
		}
		
		if (nota>=6 && nota<=7) {
			System.out.println("suficiente");
		}
		
		else if (nota>=8 && nota<=9) {
			System.out.println("notable");
		}
		
		if (nota == 10) {
			System.out.println("sobresaliente");
		}
		
			}
}
