package curso_java.A2_ejercicios.A1_condicionales;

import java.util.Scanner;

//Crea una adivinanza que salga por consola pidientdo la respuesta como imput al usuario
//si la adivina, que devuelva: enhorabuena y si no que devuelva: lo siento, es incorrecto.

public class Ejercicio3_IF_conEquals {
	public static void main (String [] Args) {
		
		
		System.out.println("Adivinanza!!\nEn el mundo hay 10 tipos de personas, las que conocen binario y las que no.\n"
				+ "¿Cuantos tipos de personas hay en el mundo?");
		
		Scanner scan = new Scanner(System.in);
		String respuesta = scan.nextLine();
		String resultado = "tu respuesta es ";
		
		
		if (respuesta.equals("2") || respuesta.equalsIgnoreCase("dos")) {
			resultado = resultado + "correcta.\nEnhorabuena!!";
		
		}else {
			resultado += "errónea.\nVuelve a intentarlo!!";
			
		}
		
		System.out.print("-----------------------------------------------------------------------------\n" + resultado);
		
	}

}
