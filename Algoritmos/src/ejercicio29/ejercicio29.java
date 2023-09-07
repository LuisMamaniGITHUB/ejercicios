package ejercicio29;

import java.util.Scanner;

public class ejercicio29 {

	public static void main(String[] args) throws InterruptedException {
		
		/* Tiene menos lineas de codigos el ejercicio 29 */

		for (int i = 100; i >= 0; i--) {
			System.out.println(":" + i);
			Thread.sleep(20);

			if (i == 20) {
				System.out.println("BATERIA BAJA.");
				Thread.sleep(1000);
			}

			if (i == 0) {
				System.out.println("BATERIA AGOTADA.");

			}

		}

	}
}
