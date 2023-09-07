package ejercicio57;

import java.util.Scanner;

public class ejercicio57 {

	static float n1;
	static int n2;

	public static void ingresarNumeros() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un numero con la parte fraccionaria: ");
		n1 = entrada.nextFloat();

		System.out.println("ingrese nuevamente el numero en entero: ");
		n2 = entrada.nextInt();

	}

	public static float restar(float a, int b) {
		float resta = a - b;
		return resta;
	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		ingresarNumeros();
		restar(n1, n2);
		System.out.println("El numero es: " + restar(n1, n2));

	}

}
