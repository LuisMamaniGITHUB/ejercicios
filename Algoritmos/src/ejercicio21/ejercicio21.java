package ejercicio21;

import java.util.Scanner;

public class ejercicio21 {
	
public static void main(String[] args) throws InterruptedException {
		
		int temperatura = 34;
		
		while (temperatura <=100) {
			System.out.println("\nLa temperatura del prcesador es:"+temperatura);
			Thread.sleep(20);
			
			
			if (temperatura == 85) {
				System.out.println("\n�CUIDADO!, TEMPERATURA PELIGROSA.");
			}
			Thread.sleep(1000);

			if (temperatura == 100) {
				System.out.println("\nVALOR EXTREMO, APAGANDO PC.");
			}
			
			temperatura+=2;
	}
	
	

}

}
