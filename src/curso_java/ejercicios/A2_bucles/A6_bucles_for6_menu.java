package curso_java.ejercicios.A2_bucles;

import java.util.Scanner;

public class A6_bucles_for6_menu {
	public static void main(String[] args) {

// GENERA EL SIGUIENTE MENÚ

//		1. Pedir un numeros --> Indicar cuantos son multiplos de 3 y cuantos multiplos de 5
//
//		2. Numero tenistas en el top 10  --> Pedir por teclado la cantidad de tenistas que se apuntan a un torneo,
		// por cada uno de ellos preguntar en que puesto de la ATP se encuentran.
		// Indicar cuantos tenistas estarían entre los diez primeros.
//
//		3. Tabla de multiplicar --> Pedir numero y que muestre la tabla de multiplicar de ese numero
//
//		4. Pintar cuadrado --> Tamaño de cada lado
//		* * * * 
//		*     *
//		*     *
//		* * * *
//
//		5. Pintar triangulo --> Preguntar tamaño base 
//		    *
//		   * *
//		  *   *
//		 *     *
//		* * * * *
//
//		6. Pintar Hashtag
//		    *     *
//		    *     *
//		* * * * * * * * 
//		    *	  *
//		* * * * * * * * 
//		    *     *
//		    *    
//
//		7. Salir
//		
//-------------------------------------------------------------------------------------------------------------------------

		System.out.println(
				"\n     --MENÚ PRINCIPAL--\n" + "--> Seleccione una opción <--\n" + "-----------------------------\n\n"
						+ "1. Multiplos de 3 y 5.\n" + "2. Torneo de tenis.\n" + "3. Tabla de multiplicar.\n"
						+ "4. Pintar cuadrado.\n" + "5. Pintar triángulo.\n" + "6. Pintar hashtag.\n" + "7. Salir\n");

		Scanner scan0 = new Scanner(System.in);
		int opcMP = scan0.nextInt();

		switch (opcMP) {
		case 1:
			System.out.print(
					"\n--Seleccione una cifra--\nSe devolveran cuantos números son multiplos de 3 y cuantos son multiplos de 5:\n\n");
			Scanner scan1 = new Scanner(System.in);
			int opcM1 = scan1.nextInt();

			String mult3 = " Es múltiplo de 3.";
			String mult5 = " Es múltiplo de 5.";

			for (int i = 0; opcM1 > 0; opcM1--) {
				if (opcM1 % 3 == 0) {
					System.out.println("[" + (opcM1) + "]" + mult3);
				} else if (opcM1 % 5 == 0) {
					System.out.println("[" + (opcM1) + "]" + mult5);
				}
			}
			
			;break;
		case 2:
			System.out.print("\n--Veamos cual es el nivel del tornéo--\n"
					+ "------------------------------------------------------\n"
					+ "Seleccione la cantidad de tenistas inscritos al torneo:\n\n");
			Scanner scan2 = new Scanner(System.in);
			int opcM2 = scan2.nextInt();

			String msg = "Indique el puesto en la ATP que ocupa el tenista número: ";
			int top = 10;
			int totTop10 = 0;

			System.out.println("\nAhora deberá indicar el puesto que ocupa en la ATP cada tenista inscrito al torneo\n"
					+ "----------------------------------------------------------------------------------------------");

			for (int i = 0; opcM2 > 0; opcM2--) {
				System.out.println(msg + opcM2 + "\n");
				Scanner scan2_1 = new Scanner(System.in);
				int opcM2_1 = scan2_1.nextInt();
				if (opcM2_1 <= 10) {
					totTop10++;
				}
			}
			System.out.println("Hay un total de " + totTop10 + " tenistas inscitos al torneo\nque se encuentran entre"
					+ " el top10 de la ATP!!!")
			
			;break;
		case 3:
			System.out.print("\n--Veamos las tablas de multiplicar--\n"
					+ "-----------------------------------------\n"
					+ "Seleccione un número y aparecera su tabla de multiplicar por pantalla:\n\n");
			Scanner scan3 = new Scanner(System.in);
			int opcM3 = scan3.nextInt();
			
			for ( int i=0  ; i<=10  ; i++  ) {
				System.out.println( opcM3 + " X " + i + " = " + (opcM3 * i));
			}
			

			;break;
		case 4:
			System.out.print("\nSeleccione cuanto mide un lado del cuadrado que desea visualizar:\n\n");
			Scanner scan4 = new Scanner(System.in);
			int opcM4 = scan4.nextInt();
			
//			for ( int i=0  ; i<opcM4  ; i++ ){
//				System.out.println("* * * *");
//				for ( int j=0  ; j<opcM4  ; i++ ) {
//					
//					
//				}
//				
//				
//			}

			;break;
		case 5:
			System.out.print("\nSeleccione cuanto mide la base del triángulo que desea visualizar:\n\n");
			Scanner scan5 = new Scanner(System.in);
			int opcM5 = scan5.nextInt();
			
			

			;break;
		case 6:

			;break;
		case 7:
			System.out.println("\nHasta luego!!!\n\n");

			;break;
		default:
			System.out.println("\nError, seleccione una opción correcta.\n\n");
		}

		System.out.println("\nFIN.");
	}
}
