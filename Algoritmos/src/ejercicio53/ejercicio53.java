	package ejercicio53;

import java.util.Scanner;

public class ejercicio53 {
	
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		
		String[][] matriz = new String[2][2];
		  
	    matriz[0][0] = "mamani";
        matriz[0][1] = "ayllon";
        
        
        matriz[1][0] = "hernandez";
        matriz[1][1] = "lopez";
        
        
        
       
		
        
        System.out.println("\nIngrese el apellido a buscar: ");
        String apellido_buscado = datos.next();
		
        
        
        
        boolean busqueda = false;
        
        
        
        for (int i = 0; i < matriz.length; i++) {
        	
        	
            for (int j = 0; j < matriz[i].length; j++) {
        
        
            	
            	if (matriz[i][j].equalsIgnoreCase(apellido_buscado)) {
            		
            		busqueda = true;
            		
            		System.out.println("\nApellido encontrado.");
            		
            		
            	}
            	
            
            }
        }
        
        
       
		if (busqueda == false) {
    	
    		
    		System.out.println("\nEl apellido no fue encontrado.");
    		
    	}
		
		
	}

}
