package ejercicio24;

import java.util.Scanner;

public class ejercicio24 {
	
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		
		int contador =1;
		char decision = 'N';
		boolean puedo_salir = false;
		
		do  {
			System.out.println("\n¿Puedo salir? ");
			decision = datos.next().charAt(0);
			
		 contador++;
		}while(decision == 'N' && puedo_salir == false );
		
		
		if (decision == 'S') {
			puedo_salir = true;
		}
		
	}

}
