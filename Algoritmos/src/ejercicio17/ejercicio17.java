package ejercicio17;

import java.util.Scanner;

public class ejercicio17 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int num1,num2,num3;
		
		System.out.println("\nIngrese un primer numero: ");
		num1 = entrada.nextInt();
		
		System.out.println("\nIngrese un segundo numero: ");
		num2 = entrada.nextInt();
		
		System.out.println("\nIngrese un tercer numero: ");
		num3 = entrada.nextInt();
		
		
		
		
		
		if (num1>num2 && num1>num3) {
			System.out.println("\nNumero 1 es el mayor");
		}
		
		if (num1<num2 && num1<num3) {
			System.out.println("\nNumero 1 es el de menor valor");
		}
		
		else if(num1<num2 && num1>num3 || num1>num2 && num1<num3) {
			System.out.println("\nNumero 1 es el segundo mayor");
		}
		
		
		
		
		if (num2>num1 && num2>num3) {
			System.out.println("\nNumero 2 es el mayor");
		}
		
		if (num2<num1 && num2<num3) {
			System.out.println("\nNumero 2 es el de menor valor");
		}
		
		else if(num2<num1 && num2>num3 || num2>num1 && num2<num3)  {
			System.out.println("\nNumero 2 es el segundo mayor");
		}
		
		
		
		if (num3>num1 && num3>num2) {
			System.out.println("\nNumero 3 es el mayor");
		}
		
		if (num3<num1 && num3<num2) {
			 System.out.println("\nNumero 3 es el de menor valor");
		}
		else if(num3<num2 && num3>num1 || num3>num2 && num3<num1) {
			System.out.println("\nNumero 3 es el segundo mayor");
		}
		
	}
	
}
