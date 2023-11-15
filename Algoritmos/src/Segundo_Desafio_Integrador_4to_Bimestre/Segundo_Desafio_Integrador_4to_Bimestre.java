package Segundo_Desafio_Integrador_4to_Bimestre;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Segundo_Desafio_Integrador_4to_Bimestre {
	
	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);
		
		
		int num1,num2,suma,resta,multip,div;
		String operacion;
		
		
		try {
		System.out.println("\nDigite que operacion desea realizar: ");
		operacion = datos.next();
		
		
		System.out.println("\nIngrese un primer numero: ");
		num1 = datos.nextInt();
		
		System.out.println("\nIngrese un segundo numero: ");
		num2 = datos.nextInt();
	
		if (num1 < 0 || num2 < 0 ) {
			System.out.println("error: el numero es negativo.");
            throw new ArithmeticException();
        }
		
		switch (operacion) {
		
		case "suma":
			
			suma = num1+num2;
			System.out.println("\nLa suma es: "+suma);
			
			break;
			
			
		case "resta":
			
			resta = num1-num2;
			System.out.println("\nLa resta es: "+resta);
			
			break;
		
		
		case "multiplicacion":
			
			multip = num1*num2;
			System.out.println("\nLa multiplicacion es: "+multip);
			
			break;
			
			
		case "division":
			
			div = num1/num2;
			System.out.println("\nLa division es: "+div);
			
			break;
		  
		
		
		
		
		
	}
		
		System.out.println("\n¿Desea realizar otra operacion?");
		char desicion1 = datos.next().charAt(0);
		
		boolean desicion2 = false;
		
		if (desicion1 == 's') {
			
			desicion2 = true;
			
			
		}
		
		if (desicion1 == 'n') {
			
			System.out.println("programa finalizado.");
		}
		
		
		while(desicion2 == true) {
			
			System.out.println("\nDigite que operacion desea realizar: ");
			operacion = datos.next();
			
			
			System.out.println("\nIngrese un primer numero: ");
			num1 = datos.nextInt();
			
			System.out.println("\nIngrese un segundo numero: ");
			num2 = datos.nextInt();
		
			
			
			switch (operacion) {
			
			case "suma":
				
				suma = num1+num2;
				System.out.println("\nLa suma es: "+suma);
				
				break;
				
				
			case "resta":
				
				resta = num1-num2;
				System.out.println("\nLa resta es: "+resta);
				
				break;
			
			
			case "multiplicacion":
				
				multip = num1*num2;
				System.out.println("\nLa multiplicacion es: "+multip);
				
				break;
				
				
			case "division":
				
				div = num1/num2;
				System.out.println("\nLa division es: "+div);
				
				break;
		
		}
			
			System.out.println("\n¿Desea realizar otra operacion?");
			desicion1 = datos.next().charAt(0);
			
		
			
			if (desicion1 == 'n') {
				
				System.out.println("programa finalizado.");
				
				desicion2 = false;
			}
			
			
		}
		
		
		
	 } catch (ArithmeticException e) { 
         System.out.println("Error: Division por cero.");
	 } catch (InputMismatchException e) {
         System.out.println("Error: Debes ingresar un dato valido.");
     }
	
		
		
		
		

}
}
