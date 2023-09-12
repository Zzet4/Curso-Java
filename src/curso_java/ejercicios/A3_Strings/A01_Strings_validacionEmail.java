package curso_java.ejercicios.A3_Strings;

import java.util.Scanner;

public class A01_Strings_validacionEmail {
	public static void main(String [] args) {

		/*
		 * DEBEMOS VALIDAR UN E-MAIL PRIMERO SOLICITAMOS EL EMAIL POR CONSOLA Y SOLO
		 * INDICAMOS QUE EL MAIL ES CORRECTO SI CUMPLE LAS SIGUIENTES VALIDACIONES. EN
		 * CASO CONTRARIO, INDICAR LOS FALLOS QUE TIENE.
		 * 
		 * - No contiene espacios en blanco despues de quitar los espacios en blanco a
		 * izquierda y derecha.
		 * - Tiene una @ 
		 * - Despues de "@" tiene que haber almenos
		 * un punto. 
		 * - Despues de la @ tiene que haber almenos 2 caracteres que no sean
		 * punto 
		 * - Después del ultimo punto tiene que haber entre 2 y 6 caracteres, (.es
		 * .com .io)
		 * 
		 * PEDIR EL EMAIL TANTAS VECES COMO SEA NECESARIO HASTA QUE LO PONGA CUMPLIENDO
		 * LOS REQUISITOS
		 * 
		 */
		String solicitudEmail = "\nIntroduzca el e-mail:";
		String mensajeDeError = "";
		
	 do {
		mensajeDeError = "";
		System.out.println(solicitudEmail);
		Scanner scan01 = new Scanner(System.in);
		String email = scan01.nextLine().trim();
		// También podemos hacer el trim por separado --> email = email.trim();
		int longitudEmail = email.length();

		if (email.contains(" ")) {
			mensajeDeError = "- No puede haber espacios en blanco.\n";
		}

		if (email.indexOf("@")==email.lastIndexOf("@") && email.indexOf("@")!=-1) {
			int posicionArroba = email.indexOf("@");
			String despuesArroba = email.substring(posicionArroba);
			if (despuesArroba.contains(".")) {
				if (despuesArroba.indexOf(".") <= 2) {
					mensajeDeError = mensajeDeError + "- Despues de la @ tiene que haber almenos 2 caracteres que no sean punto.\n";
					
				}
				int posicionPuntoDominio = email.lastIndexOf(".");
				if (longitudEmail - posicionPuntoDominio <=2 || longitudEmail - posicionPuntoDominio >=7) {
					mensajeDeError = mensajeDeError + "- El dominio debe contener entre 2 y 6 caracteres.\n";
				}

			} else {
				mensajeDeError = mensajeDeError + "- Después del simbolo @ y hasta el final del email debe haber almenos un punto.\n";
			}
		} else {
			mensajeDeError = mensajeDeError + "- El e-mail debe contener un símbolo @.\n";
		}
		
		if (mensajeDeError.isEmpty()){
		System.out.println("\nEmail correctamente validado!");
		}else{
			solicitudEmail = "\nIntroduzca de nuevo el e-mail:";
			System.out.println("Lo siento, el email" + email + " no es correcto, incumple los siguientes requisitos de validación:\n" 
		+ mensajeDeError)
;			}
		
	}while(!mensajeDeError.isEmpty());
	 
	}
}
