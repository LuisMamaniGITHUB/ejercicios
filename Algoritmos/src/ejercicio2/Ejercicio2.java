package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {


	public static void main (String args []) {
		
		Scanner entrada = new Scanner (System.in);
		

		char nombre,apellido,genero;
		int edad;
		
		System.out.println("Ingrese su nombre: ");
		nombre = entrada.next().charAt(0);
		
		System.out.println("Escribí tu apellido: ");
		apellido = entrada.next().charAt(0);
		
		System.out.println("Ingresá tu genero: ");
		genero = entrada.next().charAt(0);
		
		System.out.println("Ingresá tu edad: ");
		edad = entrada.nextInt();
		
		
		
		
		 System.out.println("Su nombre es: "+nombre);
		System.out.println("Su apellido es: "+apellido);
		System.out.println("Su genero es: "+genero);
		System.out.println("Su edad es: "+edad);
		
		
		
		
		
		
		
	}
}
