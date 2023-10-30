package curso_java.A2_ejercicios.A2_bucles;

import java.util.Scanner;

public class A2_bucle_for2 {
	public static void main (String [] args) {
		
// Solicitar al usuario el numero de alumnos de un aula y pedir para cada alumno su nota.
// Indicar la nota media de todos los alumnos.
				
		
		
		System.out.println("¿Cuantos alumnos hay en el aula?");
		Scanner scan = new Scanner(System.in);
		int totalAlumnos = scan.nextInt();
		double notaTotal = 0;

		System.out.println("\nAhora introduzca la nota para cada uno de los "  + totalAlumnos + " alumnos.\n"
				+ "-----------------------------------------------------------");

		
		for (int contadorAlumnos = 1  ; contadorAlumnos<=totalAlumnos ; contadorAlumnos++  ) {
			System.out.println("Introduzca la nota del almuno Nº" + contadorAlumnos + ":");
			Scanner scan2 = new Scanner(System.in);
			double notaIntroducida = scan2.nextDouble();
	
			notaTotal = notaTotal + notaIntroducida;
		}
		System.out.println("-----------------------------------------------------------\nLa nota media de la clase es: " + (notaTotal / totalAlumnos) + ".");

		
		
	}

}
