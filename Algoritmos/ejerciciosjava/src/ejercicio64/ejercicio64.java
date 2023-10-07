package ejercicio64;

import java.util.Scanner;

public class ejercicio64 {
	
	static String nombre;
	static String apellido;
	static String nombre_min;
	static String apellido_min;
	static char primera_letra_nom;
	static char primera_letra_ape;
	
	public static void Ingreso() {
		Scanner datos = new Scanner(System.in);
		
		System.out.println("\nIngrese su nombre: ");
		nombre = datos.next();
		
		System.out.println("\nIngrese su apellido: ");
		apellido = datos.next();		
		
	}
	
	
	
	
	public static void palabras() {

		 nombre_min = nombre.toLowerCase();

		 apellido_min = apellido.toLowerCase(); 
		

		
		

	}
	
	
	public static void cadenas() {

		
		primera_letra_nom = (char) nombre.indexOf(nombre);
			
		
		System.out.println(""+primera_letra_nom);
	}
	
	
	public static void main(String[] args) {
		
		Ingreso();
		palabras();
		cadenas();
		
	}

}
