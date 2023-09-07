package ejercicio45;

import java.util.Scanner;

public class ejercicio45 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int num;
		
		int[] socios = new int [8];
		
		for (int i=1; i<8; i++) {
		socios[1]=  1011;
		socios[2]=  2367;
		socios[3]=  8748;
		socios[4]=  9121;
		socios[5]=  817;
		socios[6]=  6423;
		socios[6]=  2034;
		}
		
		System.out.println("\nSi quiere encontrar a un socio ingrese su numero: ");
		num = datos.nextInt();
		
		if (num == socios[1]) {
			System.out.println("\nr");
		}
	}

}
