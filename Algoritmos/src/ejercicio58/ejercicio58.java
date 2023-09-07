package ejercicio58;

import java.util.Scanner;

public class ejercicio58 {
	
public static int n1;
	
	public static void ingresarNumero() {
	    Scanner entrada = new Scanner(System.in);
	    System.out.println("Ingresa un numero: ");
	    n1 = entrada.nextInt();
	}

	public static boolean Verdadero_Falso() {
		
		boolean numero = false;
	    
		if (n1 < 0  ) {
			
			System.out.println("es negativo");
			
		numero = true;
			
		}
		
		else  {
			
			numero = false;
			
			System.out.println("es positivo");
		}
		
		return numero;
	}
	
	
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
	    
	    ingresarNumero();
	    Verdadero_Falso(); 
	 
	    
	}

}
