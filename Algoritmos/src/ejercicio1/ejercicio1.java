package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in); // esta linea es para ingresar los datos
		
		String nombre,apellido;   // esta linea es donde se guardan las variables 
		
		System.out.println("\nIngrese su nombre: "); // esta linea es para mostrar en pantalla
		nombre = entrada.next(); // esta linea es para guardar lo que se ingrese en la variable nombre
		
		System.out.println("\nIngrese su apelldo: ");
		apellido = entrada.next();
		
		System.out.println("\nSu nombre es: "+nombre); // esta linea es para mostrar lo que se guardo en la variable nombre
		
		System.out.println("\nSu apellido es: "+apellido);
		
		
	}

}
