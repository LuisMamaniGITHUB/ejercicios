package ejercicio65;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio65 {
	
	static int edad;
	
	
	
	public static void ingreso() {
		
		Scanner datos = new Scanner(System.in);
		
		
		try {
		
		System.out.println("\nIngrese su edad: ");
		edad = datos.nextInt();
		
		
		
		 if (edad < 0) {
             throw new IllegalArgumentException("\nError: La edad es negativa.");
         }
		 
		 
		
		} catch (InputMismatchException e) {
			
			System.out.println("\nDato ingresado no valdo.");
			
		}catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		ingreso();
		
	}

}
