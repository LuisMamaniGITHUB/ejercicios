package Desafío_integrador_4to_bim;

import java.util.InputMismatchException;
import java.util.Random;

import java.util.Scanner;

public class Desafío_integrador_4to_bim {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero;

		int intentos = 0;

		Random random = new Random();

		int numeroSecreto = random.nextInt(100);

		System.out.println(+numeroSecreto);

		try {

			do {

				System.out.println("\nIngrese un numero del 1 al 100: ");
				numero = entrada.nextInt();

				System.out.println("");

				intentos++;
				System.out.println("\nLa cantidad de intentos es:" + intentos);

				System.out.println("");

				if (numero < numeroSecreto) {

					System.out.println("\nEl numero ingresado es menor ");

				}

				System.out.println("");

				if (numero > numeroSecreto) {

					System.out.println("\nEl numero ingresado es mayor ");

				}

				System.out.println("");

			} while (numeroSecreto != numero && intentos < 10);

			if (intentos == 10) {

				System.out.println("Perdiste.");
			}

			if (intentos < 10 && numeroSecreto == numero) {

				System.out.println("\n¡Felicidades ganste! ");
				System.out.println("\nCantidad de intentos " + intentos);

			}

			if ((numero > 100) || (numero < 1)) {
				throw new IllegalArgumentException("Número fuera de rango.");
			}
		} catch (InputMismatchException e) {
			System.out.println("Error: Dato no Valido");
		} finally {
			System.out.println("Programa terminado.");
		}

	}

}
