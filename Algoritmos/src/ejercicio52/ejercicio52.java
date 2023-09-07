package ejercicio52;

import java.util.Scanner;

public class ejercicio52 {
	
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		  int[][] matriz = new int[2][2];
		  
		    matriz[0][0] = 5;
	        matriz[0][1] = -4;
	        
	        
	        matriz[1][0] = 6;
	        matriz[1][1] = 1;
	        

	        
	        
	        for (int i = 0; i < matriz.length; i++) {
	        	
	        	
	            for (int j = 0; j < matriz[i].length; j++) {
	            	
	           
	                System.out.print(matriz[i][j] + " ");
	                
	                
	               
	                
	            }
	            System.out.println();
	        }
	        
	        
	        for (int i = 0; i < 1; i++) {
	        	
	        	 for (int j = 0; i < 1; i++) {
	        	
	        	if (matriz[i][i] < 0 ) {
	        		
	        		continue;
	        	
	        	}
	        	
	        	System.out.println("\nIngrese un nuevo numero: ");
	        	int num = datos.nextInt();
	        	
	        	matriz[0][1] = num;
	        	
	        }
	        
	}
	        
	        	for (int i = 0; i < matriz.length; i++) {
	        	
	        	
	            for (int j = 0; j < matriz[i].length; j++) {
	            	
	           
	                System.out.print(matriz[i][j] + " ");
	                
	                
	               
	                
	            }
	            System.out.println();
	        }
		  
		  
		
	}

}
