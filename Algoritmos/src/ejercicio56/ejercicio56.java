package ejercicio56;

import java.util.Scanner;

public class ejercicio56 {

static String nombre,apellido;
	
	static float num1,num2;
	
	public static void ingresarNombres() {
	    Scanner entrada = new Scanner(System.in);
	    System.out.println("Ingresa tu nombre: ");
	    nombre = entrada.next();
	    System.out.println("Ingresa tu apellido: ");
	    apellido = entrada.next();
	    
	   
	
	}
	
	
	public static void ingresarAsistencias() {
	    Scanner entrada = new Scanner(System.in);
	    
	    
	    System.out.println("Ingresa la cantidad asistencias: ");
	    num1 = entrada.nextFloat();
	    
	    System.out.println("Ingresa la cantidad de clases totales: ");
	    num2 = entrada.nextFloat();
	   
	}
	
	
	public static float porcentajeAsistencias () { 
		
		
		float div = num1 / num2 * 100 ;
		

	    return div;
	    
	}
	
	
	public static void main(String[] args) {
		
		
		ingresarNombres();
		ingresarAsistencias();
		porcentajeAsistencias ();
		
		System.out.println("\nEl porcentaje de asistencias es: "+porcentajeAsistencias ());
		
	}
}
