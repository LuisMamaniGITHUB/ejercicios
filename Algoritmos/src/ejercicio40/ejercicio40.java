package ejercicio40;

import java.util.Scanner;

public class ejercicio40 {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		int suma, div;
		int[] temp = new int[6];

		for (int i = 1; i < 6; i++) {

			System.out.println("\nIngrese una temperatura: ");
			temp[i] = datos.nextInt();

		}

		suma = temp[1] + temp[2] + temp[3] + temp[4] + temp[5];
		div = suma / 5;

		System.out.println("\nEl promedio de las 5 temperaturas es: " + div);

	}

}
