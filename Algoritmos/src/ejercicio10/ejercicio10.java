package ejercicio10;

import java.util.Scanner;

public class ejercicio10 {
	
			public static void main(String[] args) {
		

		Scanner entrada = new Scanner (System.in);
		
		String nombre,apellido;
		int num,num1,num2;
		
		
		System.out.println("\tVamos a jugar al bingo");
		
		
		System.out.println("\nIngrese su nombre: ");
		nombre = entrada.next();
		
		System.out.println("\nIngrese su apellido: ");
		apellido = entrada.next();
		
		System.out.println("\nIngrese un numero del 0 al 99:");
		num = entrada.nextInt();
		
				num1 = (int) Math.random()*100;
				
				
		if (num == num1) {

			System.out.println("\nEl numero coincide ganaste");
		}
		
		else {
			
			System.out.println("\nEl numero no coincide perdiste");
		}
			

		
	}


}
