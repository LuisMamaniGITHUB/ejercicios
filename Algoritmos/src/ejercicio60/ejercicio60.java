package ejercicio60;

import java.util.Scanner;

public class ejercicio60 {
	
	static int[] arraynotas ;
	static String[] apellidos ;
	
	static int cant_notas;
	static int cant_apellidos;
	
	
	
	
	public static void ingreseCantidad() {
		
		 Scanner entrada = new Scanner(System.in);
		 
		System.out.println("\nIngrese la cantidad de notas: ");
		cant_notas = entrada.nextInt();
	}
	

	public static int[] ingresarNotas(int n) {
	    Scanner entrada = new Scanner(System.in);
	    
	    arraynotas = new int[n];
	    
	    for (int i = 0 ; i<n; i++) {
	    	
	    System.out.println("\nIngresa una nota: ");
	    arraynotas[i] = entrada.nextInt();
	
	    if (arraynotas[i]< 0 ) {
	    	
	    	 System.out.println("\nIngresa una nota mayor a 0: ");
	 	    arraynotas[i] = entrada.nextInt();
	    }
	    
	    
	    }
	    
	    return arraynotas;
	}
	
	
	
	
		public static String[] ingresarApellidos(int a) {
		
		Scanner entrada = new Scanner(System.in);

		
		 apellidos = new String[a];
		
		for (int i = 0; i < a; i++) {

			System.out.println("\nIngrese un apellido: ");
			apellidos[i] = entrada.next();

		}
		
		return apellidos;

		}
	
		
		
	public static void main (String[] args) {
	
	  ingreseCantidad();
	  
	  int arrayNumeros[] = ingresarNotas(cant_notas);	
		String apellidos[] = ingresarApellidos(cant_notas);
	  
	  
	  for (int i = 0; i < cant_notas; i++) {
	  
		  System.out.println("\nLas notas son: "+arraynotas[i]);
		  
	
	  }
	  
	  for (int i = 0; i < cant_notas; i++) {
		  
		  System.out.println("\nLos apellidos son: "+apellidos[i]);
		  
	
	  }
	 
	    
	}

}
