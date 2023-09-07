package ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		float num1,num2,suma,resta,multip,div;
		int numRedondeado;
		
		System.out.println("Ingrese el primer numero: ");
		num1 = entrada.nextFloat();
		
		System.out.println("Ingrese el segundo numero: ");
		num2 = entrada.nextFloat();
		
		suma = num1 + num2;
		resta = num1 - num2;
		multip = num1*num2;
		div = num1/num2;
		
		System.out.println("\nLos resultados son: ");
		
		System.out.println("\nResultado de la suma: "+suma);
		System.out.println("\nResultado de la resta: "+resta);
		System.out.println("\nResultado de la multiplicacion: "+multip);
		System.out.println("\nResultado de la division: "+div);
		
		int numRedondeado1 = (int) Math.round(suma);
		int numRedondeado2 = (int) Math.round(resta);
		int numRedondeado3 = (int) Math.round(multip);
		int numRedondeado4 = (int) Math.round(div);
		
		System.out.println("\nResultado de la suma en entero es : "+numRedondeado1);
		System.out.println("\nResultado de la resta en entero es : "+numRedondeado2);
		System.out.println("\nResultado de la multiplicacion en entero es : "+numRedondeado3);
		System.out.println("\nResultado de la division en entero es : "+numRedondeado4);
		
		
		
		
		
		
		
	}
	
	
}
