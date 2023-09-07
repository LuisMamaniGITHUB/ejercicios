package ejercicio43parte2;

import java.util.Scanner;

public class ejercicio43parte2 {
	
	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		int[] num = new int[6];

		for (int i = 1; i < 6; i++) {
			System.out.println("\nIngrese un numero: ");
			num[i] = datos.nextInt();

		}

		for (int i = 1; i < 6; i++) {

			if (num[i] < 0) {
				continue;
			} 
			
			else {
				System.out.println(":" + num[i]);
			}

		}

	}

}
