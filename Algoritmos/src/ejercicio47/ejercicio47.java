package ejercicio47;

import java.util.Arrays;

import java.util.Scanner;

public class ejercicio47 {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		String[] apellido = new String[1];

		int[] arraynotas = new int[4];

		for (int i = 0; i < arraynotas.length; i++) {

			System.out.println("Ingresa una nota: ");
			arraynotas[i] = datos.nextInt();

		}

		for (int i = 0; i < apellido.length; i++) {

			System.out.println("Ingresa un apellido: ");
			apellido[i] = datos.next();

		}

		int[] arrayCopia = arraynotas.clone();

		Arrays.sort(arraynotas);

		System.out.println("Array de notas desordenados: ");
		for (int nota : arrayCopia) {
			System.out.println(nota);
		}

		System.out.println("Array de notas ordenados: ");
		for (int nota : arraynotas) {
			System.out.println(nota);
		}

	}

}
