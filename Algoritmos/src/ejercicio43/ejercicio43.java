package ejercicio43;

import java.util.Scanner;

public class ejercicio43 {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		int num_bingo, num_ganador;
		int[] numero = new int[4];

		num_bingo = (int) (Math.random() * 50);
		num_ganador = (int) num_bingo;

		for (int i = 1; i < 4; i++) {
			System.out.println("\nIngrese un numero: ");
			numero[i] = datos.nextInt();

		}

		if (num_ganador == numero[1] || num_ganador == numero[2] || num_ganador == numero[3]) {
			System.out.println("\nFelicidades ganaste.");
		}

		else if (num_ganador != numero[1] || num_ganador != numero[2] || num_ganador != numero[3]) {
			System.out.println("\nPerdiste.");
		}

	}

}
