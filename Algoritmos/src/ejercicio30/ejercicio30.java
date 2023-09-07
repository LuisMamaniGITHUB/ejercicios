package ejercicio30;

import java.util.Scanner;

public class ejercicio30 {
	
	public static void main(String[] args) throws InterruptedException {

		for (int i = 1; i <= 100; i++) {
			System.out.println("\nSeguidor numero: " + i);
			Thread.sleep(20);

		}
		System.out.println("\nFelicidades lograste tu objetivo, llegaste a 100 seguidores.");

	}


}
