package ejercicio16;

import java.util.Scanner;

public class ejercicio16 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int hora,min,seg;
		
		System.out.println("\nIngrese una hora: ");
		hora = entrada.nextInt();
		
		System.out.println("\nIngrese un minuto: ");
		min = entrada.nextInt();
		
		System.out.println("\nIngrese un segundo: ");
		seg = entrada.nextInt();
		
		if (hora>24) {
			System.out.println("\nLa hora ingresada es incorrecta");
		}
		else if (hora<=24) {
			System.out.println("\nLa hora ingresada es correcta");
		}
	
		
		if (min>60) {
			System.out.println("\nLos minutos ingresados son incorrectos");
		}
		else if (min<=60) {
			System.out.println("\nLos minutos ingresados son correctos");
		}
		
		
		if (seg>60) {
			System.out.println("\nLos segundos ingresados son incorrectos");
		}
		else if (seg<=60) {
			System.out.println("\nLos segundos ingresados son correctos");
		}
		
		
		
		
		
	}

}
