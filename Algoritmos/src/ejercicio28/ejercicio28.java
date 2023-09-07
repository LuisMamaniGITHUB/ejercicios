package ejercicio28;

import java.util.Scanner;

public class ejercicio28 {

	public static void main(String[] args) throws InterruptedException {

		Scanner datos = new Scanner(System.in);
		
		int bateria = 101;

		do {

			bateria--;

			Thread.sleep(20);
			System.out.println(":" + bateria);

			if (bateria == 20) {
				System.out.println("BATERIA BAJA.");
				Thread.sleep(1000);
			}

			if (bateria == 0) {
				System.out.println("BATERIA AGOTADA.");

			}

		} while (bateria > 0 && bateria <= 101);

	}

}
