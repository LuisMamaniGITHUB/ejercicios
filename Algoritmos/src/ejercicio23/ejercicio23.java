package ejercicio23;

import java.util.Scanner;

public class ejercicio23 {
	
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int numero,num1,num2,suma,contador=0;
		
		
		
		do {
			System.out.println("\nIngrese el primer numero: ");
			num1 = datos.nextInt();
			
			System.out.println("\nIngrese el segundo numero: ");
			num2 = datos.nextInt();
			
			suma = num1+num2;
			
			System.out.println("\nEl resultado de la suma es: "+suma);
			
			System.out.println("\nSi desea salir del programa debe tocar el 0: ");
			numero = datos.nextInt();
			
			contador ++;
			}while(numero != 0);
		
		if (numero == 0) {
			System.out.println("\nSaliste del programa.");
			
		}
			
			
		
	}

}
