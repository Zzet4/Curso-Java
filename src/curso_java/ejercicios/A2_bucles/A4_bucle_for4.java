package curso_java.ejercicios.A2_bucles;

import java.util.Scanner;

public class A4_bucle_for4 {
	public static void main (String [] args) {
		
//Para analizar los datos de una carrera pedimos al usuario una serie de datos:
//Introduce un numero total de coches participantes en una carrera
//Introduce la velocidad maxima que ha alcanzado cada coche
//Devuelve por pantalla el numero de coche más lento de la carrera con la velocidad que alcanzó
	

		System.out.println("introduzca en número total de coches participantes en la carrera:");
		Scanner scan = new Scanner(System.in);
		int totalCoches = scan.nextInt();
		int velocidadMinima = 400;
		
		for ( int contador = 1 ; totalCoches>=contador  ; contador++ ) {
			System.out.println("Introduzca la velocidad máxima que alcanzó el coche Nº" + contador + ":");
			Scanner scan2 = new Scanner(System.in);
			int velocidadIntroducida = scan.nextInt();
			
//En esta parte la variable "velocidadMinima" va a ir modificandose en función de si la velocidadIntroducida cumple la condicion del if.
			if (velocidadIntroducida<velocidadMinima) {
				velocidadMinima = velocidadIntroducida;
			}
			
		}

		System.out.println("La velocidad mínima ha sido " + velocidadMinima + " Km/h");
	
	}
}
