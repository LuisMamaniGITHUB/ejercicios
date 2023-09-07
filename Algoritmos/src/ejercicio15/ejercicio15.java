package ejercicio15;

import java.util.Scanner;

public class ejercicio15 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int costo,resto;
		
		System.out.println("\nIngresar el costo total de la compra: ");
		costo = entrada.nextInt();
		
		
		 
		if (costo>15000){
			resto = (int) (costo*0.10F);
			System.out.println("\nEl costo total con el descuento del 10% es: "+resto);
		}
	 	
		else if(costo<15000) {
			System.out.println("\nEl costo total es: "+costo);
		}
		
	
}

}
