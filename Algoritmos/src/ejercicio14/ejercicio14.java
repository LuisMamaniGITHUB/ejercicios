package ejercicio14;

import java.util.Scanner;

public class ejercicio14 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int num;
		
		System.out.println("\nIngrese un numero: ");
		num = entrada.nextInt();
		
		if (num!= 0) {
			System.out.println("\nSi se puede realizar la division");
		}
		
		 if (num<1 && num>-1) {
			System.out.println("\nNo se puede realizar la division");
		}
		
		
		
	}


}
