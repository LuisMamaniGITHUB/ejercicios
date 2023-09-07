package ejercicio32;

import java.util.Scanner;

public class ejercicio32 {
	
	
public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		int num, resul;

		System.out.println("Ingrese el numero que desea ver su tabla de multiplicar ");
		num = datos.nextInt();

		for (int i = 0; i <= 20; i++) {
			resul = num * i;
			System.out.println(num + " * " + i + " = " + resul);
		}

		
		
	}


}
