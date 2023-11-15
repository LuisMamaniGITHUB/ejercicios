package ejercicio63;

import java.util.Scanner;

public class ejercicio63 {
	
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		
	
        String correo;
        boolean correoValido = false;
        while (correoValido == false) {
            System.out.print("Ingresa tu correo electrónico: ");
            correo = datos.nextLine();

            if ( correo.indexOf("@") < correo.lastIndexOf(".") && correo.indexOf("@") > correo.lastIndexOf(".")) {
                correoValido = true;
            } else {
                System.out.println("Correo electrónico no válido. Debe contener '@' y '.' ");
            }
        }

   
        String contraseña;
        boolean contrasenaValida = false;
        while (contrasenaValida == false) {
            System.out.print("Ingresa tu contraseña: ");
            contraseña = datos.nextLine();

            if (contraseña.length() >= 6 && contraseña.length() <= 12) {
                contrasenaValida = true;
            } else {
                System.out.println("Contraseña no válida. Debe tener entre 6 y 12 caracteres.");
            }
        }

		
		
		
		
	}

}
