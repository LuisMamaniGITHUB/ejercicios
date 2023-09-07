package ejercicio9;

import java.util.Scanner;

public class ejercicio9 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String nombre,apellido;
		float numero;
		int bingo;
		
		System.out.println("\tVamos a jugar al bingo");
		
		System.out.println("Ingrese su nombre: ");
		nombre = entrada.next();
		
		
		System.out.println("Ingrese su apellido: ");
		apellido = entrada.next();
		
		
		System.out.println("Su nombre es: "+nombre);
		System.out.println("Su apellido es: "+apellido);
		
		
		numero = (float) Math.random()*100;
		bingo = (int )numero;
		
		
		System.out.println("El numero del bingo es: "+bingo);
		
		
		
		
		
		
		
		
		
	}

}
