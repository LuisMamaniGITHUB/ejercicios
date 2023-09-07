package ejercicio35;

import java.util.Scanner;

public class ejercicio35 {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		int notas, suma, nota_max = -100, nota_min = 100;

		for (int i = 1; i < 6; i++) {
			System.out.println("\nIngrese las notas del alumno: ");
			notas = datos.nextInt();

			if (notas > nota_max) {
				nota_max = notas;
			}

			if (notas < nota_min) {

				nota_min = notas;
			}

		}

		System.out.println("\nLa nota mas baja es: " + nota_min);
		System.out.println("\nLa nota mas alta es: " + nota_max);
		
		suma = nota_min + nota_max ;
		int div = suma / 5;
		
		System.out.println("\nEl promedio de las notas es: "+div);

	}

}
