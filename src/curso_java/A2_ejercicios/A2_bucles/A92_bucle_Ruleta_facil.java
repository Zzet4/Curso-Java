package curso_java.A2_ejercicios.A2_bucles;

import java.util.Scanner;

public class A92_bucle_Ruleta_facil {
	public static void main(String[] args) {

		// EJERCICIO DEL JUEGO DE LA RULETA
		// --Versión muy complcicada
//				Indicar nombre del jugador,
//				Indicar el saldo inicial del jugador,

//				--Mmostrar al jugador las opciones por pantalla:
		//
//				Juego de la ruleta
//				=========================
//				1. Apostar por un número (0-36)					x36
//				2. Apostar por docenas (0-12/13-24/25-36)		X3
//				3. Apostar por par/impar						x2
//				4. Apostar por rojo/negro						x2
//				5. Dejar de jugar (mostrar el importe del usuario)
		//
//				Colores:
//				0-verde
//				1-18 negros
//				19-36 rojos
		//
//				+Elegir por la opción que se quiere Jugar
//				+Elegir por qué se apuesta
//				+Elegir cantidad a apostar
		//
//				Tirar la bolita, que salga número. 
//				A partir de ahí ver si se ha ganado o perdido y se deberá indicar el saldo de cada jugador
//			===============================================================================================================================================	

		// VARIABLES

		System.out.println("\nIndique el Nick del jugador: ");
		Scanner scan01 = new Scanner(System.in);
		String nombre = scan01.nextLine();

		System.out.println("\nIndique el Importe con el que desea comenzar a jugar: ");
		Scanner scan02 = new Scanner(System.in);
		int saldo = scan02.nextInt();

		int opcionmenu = 0;
		String importeApuesta = "\n¿Cual es el importe de la apuesta: ?";
		String enhorabuena = "\nEnhorabuena!! has ganado ";

		do {

			System.out.println("\n---MENÚ DE INICIO--\nBienvenido a la ruleta, por favor, elija su tipo de juego:\n\n"
					+ "1. Apostar por un número (0-36)					\n"
					+ "2. Apostar por docenas (0-12/13-24/25-36)		\n"
					+ "3. Apostar por par/impar							\n"
					+ "4. Apostar por rojo/negro						\n" + "5. Dejar de jugar");
			Scanner scan03 = new Scanner(System.in);
			opcionmenu = scan03.nextInt();

			switch (opcionmenu) {

			case 1:
				// Pedimos el número
				System.out.println("\nSelecciones el número al que desea apostar: ");
				Scanner scan0311 = new Scanner(System.in);
				int opcion1 = scan0311.nextInt();

				System.out.println(importeApuesta);
				Scanner scan0312 = new Scanner(System.in);
				int opcion1Apuesta = scan0312.nextInt();

				// giramos la ruleta y guardamos en variable resultado

				int resultado1 = ((int) (Math.random() * 37));
				
				int ganancia1 = opcion1Apuesta*36;

				if (resultado1 == opcion1) {
					saldo = (saldo - opcion1Apuesta + ganancia1);
					System.out.println(enhorabuena + ganancia1 + "€");
				} else {
					saldo = (saldo - opcion1Apuesta);
					System.out.println("Lo siento, has perdido");
					
				}
				break;
			case 2:	
				// Pedimos la docena
				System.out.println("\nSelecciones una docena: \ndocena 1 (0-12), docena 2 (13-24), docena 3 (25-36) ");
				Scanner scan0321 = new Scanner(System.in);
				int opcion2 = scan0321.nextInt();
				
				System.out.println(importeApuesta);
				Scanner scan0322 = new Scanner(System.in);
				int opcion2Apuesta = scan0322.nextInt();
				int ganancia2 = saldo*3;
				int resultado2 = ((int) (Math.random() * 37));
				
				if(resultado2>=0 && resultado2<=12 && opcion2Apuesta==1 ||
				resultado2>=13 && resultado2<=24 && opcion2Apuesta==2 ||
				resultado2>=25 && resultado2<=36 && opcion2Apuesta==3) {
					saldo = (saldo - opcion2Apuesta + ganancia2);
					System.out.println(enhorabuena + ganancia2 + "€");
						
					}else {
					saldo = (saldo - opcion2Apuesta);
					System.out.println("Lo siento, has perdido");
					}
				break;
			case 3:	
				
				
				}
				

		} while (opcionmenu <= 0 || opcionmenu > 5 && saldo!=0);

	}
}
