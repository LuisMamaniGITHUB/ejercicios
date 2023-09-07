package ejercicio60;

import java.util.Scanner;

public class ejercicio60 {
	
	public static int[] arraynotas = new int[3];
	public static int[] apellidos = new int[3];
	
	
	

	public static void ingresarNumeros() {
	    Scanner entrada = new Scanner(System.in);
	    
	    for (int i = 0 ; i<3; i++) {
	    	
	    System.out.println("\nIngresa una nota: ");
	    arraynotas[i] = entrada.nextInt();
	    
	    }
	    
	    
	    System.out.println("");
	    
	    for (int i = 0 ; i<3; i++) {
	    System.out.println("\nLas notas ingresadas: "+arraynotas[i] );
	    }
	    
	}
	
	
	public static String ingresarApellidos(String a) {
	    Scanner entrada = new Scanner(System.in);
	    
	    for (int i = 0 ; i<3; i++) {
	    	
	    System.out.println("\nIngresa un apellido: ");
	    apellidos[i] = entrada.nextInt();
	    
	    }
	    
	    return a;
	    
	    
	    
	    
	    for (int i = 0 ; i<3; i++) {
	    System.out.println("\nLos apellidos ingresados: "+apellidos[i] );
	    }
	    
	}
	
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
	   
	    ingresarNumeros();
	    ingresarApellidos();
	    
	}

}
