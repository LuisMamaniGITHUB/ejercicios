package ejercicio37;

import java.util.Scanner;

public class ejercicio37 {

	public static void main(String[] args) throws InterruptedException {

		Scanner datos = new Scanner(System.in);

		for (char i = 'A'; i <= 'Z'; i++) {

			Thread.sleep(1000);

			if (i == 'A') {
				System.out.println(": A ");
			}

			if (i == 'E') {
				System.out.println(": E ");
			}

			if (i == 'I') {
				System.out.println(": I ");
			}

			if (i == 'O') {
				System.out.println(": O ");
			}

			if (i == 'U') {
				System.out.println(": U ");
			}
		}
	}

}
