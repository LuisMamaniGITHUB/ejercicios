package ejercicio51;

import java.util.Scanner;

public class ejercicio51 {
	
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		
		 float[][] matriz = new float[3][3];
		
	     
        matriz[0][0] = 1.321f;
        matriz[0][1] = 5.523f;
        matriz[0][2] = 8.876f;
        
        matriz[1][0] = 2.123f;
        matriz[1][1] = 7.432f;
        matriz[1][2] = 6.789f;
        
        
        matriz[2][0] = 7.211f;
        matriz[2][1] = 3.533f;
        matriz[2][2] = 1.945f;
       
        
        
        for (int i = 0; i < matriz.length; i++) {
        	
            for (int j = 0; j < matriz[i].length; j++) {
            	
                System.out.print(matriz[i][j] + " ");
                
            }
            System.out.println();
        }
		
	}

}
