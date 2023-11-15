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
		 
		 
		 System.out.println("\nSu nombre es: "+nombre_min);
		 System.out.println("\nSu apellido es: "+apellido_min);
		

		
		

	}
	
	
	public static void cadenas() {

		
		System.out.println("");
		
		  char primerCaracter1 = nombre_min.charAt(0);
		  char primerCaracter2 = apellido_min.charAt(0);
		  
		  System.out.println("El primer carácter del nombre es: " + primerCaracter1);
		  System.out.println("El primer carácter del apellido es: " + primerCaracter2);
			
		
		
	}
	
	
	
	public static void nombres_sinLaPrimerLetra() {
		
		 String palabraSinPrimerCaracter1 = nombre_min .substring(1); 
         System.out.println("\nNombre sin el primer carácter: " + palabraSinPrimerCaracter1);
         
         String palabraSinPrimerCaracter2 = apellido_min .substring(1); 
         System.out.println("\nApellido sin el primer carácter: " + palabraSinPrimerCaracter2);
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		Ingreso();
		palabras();
		cadenas();
		nombres_sinLaPrimerLetra();
		
	}

	
	
	
}
