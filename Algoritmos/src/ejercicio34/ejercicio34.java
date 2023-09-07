package ejercicio34;

import java.util.Scanner;

public class ejercicio34 {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		int suma;
		int[] ingresos = new int[13];

		for (int i = 1; i < 13; i++) {
			System.out.println("\n¿Cuales fueron los ingresos del ultimo año?: ");
			ingresos[i] = datos.nextInt();

			if (ingresos[i] < 100000) {
				System.out.println("\nEn este mes hubo un ingreso menor a 100000.");

			}
		}

		suma = ingresos[1] + ingresos[2] + ingresos[3] + ingresos[4] + ingresos[5] + ingresos[6] + ingresos[7]
				+ ingresos[8] + ingresos[9] + ingresos[10] + ingresos[11] + ingresos[12];

		System.out.println("\nEl ingreso total del ultimo año es: " + suma);

	}
}
