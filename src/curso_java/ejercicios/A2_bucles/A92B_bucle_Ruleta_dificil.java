package curso_java.ejercicios.A2_bucles;

import java.util.Scanner;

public class A92B_bucle_Ruleta_dificil {
	public static void main (String [] args) {
		
//EJERCICIO DEL JUEGO DE LA RULETA		
//--Versión muy complcicada
//		Indicar numero de jugadores,
//		preguntar por cada jugador cuanto dinero tiene (maximo de 3 jugadores)
//
//		--Por cada jugador mostrar:
//
//		Juego de la ruleta
//		=========================
//		1. Apostar por un número (0-36)					x36
//		2. Apostar por docenas (0-12/13-24/25-36)		X5
//		3. Apostar por par/impar						x2
//		4. Apostar por rojo/negro						x2
//		5. Dejar de jugar (mostrar el importe del usuario)
//
//		Colores:
//		0-verde
//		1-18 negros
//		19-36 rojos
//
//		+Elegir por la opción que se quiere Jugar
//		+Elegir por qué se apuesta
//		+Elegir cantidad a apostar
//
//		Tirar la bolita, que salga número. 
//		A partir de ahí ver si se ha ganado o perdido y se deberá indicar el saldo de cada jugador
//	===============================================================================================================================================	
		
		//VARIABLES
		int numjugadores = 0;
		double saldo1 = 0;
		double saldo2 = 0;
		double saldo3 = 0;
		
		
		System.out.println("\n¡¡Bienvenidos al casino\n--- 'LA SACA ROTA'!! ---\n");
		
		//NUMERO Y SALDO DE LOS JUGADORES
do {	
		System.out.println("\n¿Cuantos jugadores van a jugar?: (Máximo 3)\n");
		Scanner scan0 = new Scanner(System.in);
		numjugadores = scan0.nextInt();
		
		
		if (numjugadores==1) {
			System.out.println("\nCual es el saldo de juego?\n");
			Scanner scan1 = new Scanner(System.in);
			saldo1 = scan1.nextDouble();
			System.out.println("\nPerfecto.\nUsted entra con un saldo de: " + saldo1);
		}else if (numjugadores==2) {
			System.out.println("\nCual es el saldo de juego para el jugador Nº1?\n");
			Scanner scan21 = new Scanner(System.in);
			saldo1 = scan21.nextDouble();
		
					
			
			System.out.println("\nCual es el saldo de juego para el jugador Nº2?\n");
			Scanner scan22 = new Scanner(System.in);
			saldo2 = scan22.nextDouble();
			System.out.println("\nPerfecto.\nEl jugador Nº1 entra con un saldo de: " + saldo1 + "€\n" +
					"y el jugador Nº2 entra con un saldo de: " + saldo2
					+ saldo3 + "€");
		}else if (numjugadores==3) {
			System.out.println("\nCual es el saldo de juego para el jugador Nº1?\n");
			Scanner scan31 = new Scanner(System.in);
			saldo1 = scan31.nextDouble();
			
			System.out.println("\nCual es el saldo de juego para el jugador Nº2?\n");
			Scanner scan32 = new Scanner(System.in);
			saldo2 = scan32.nextDouble();
			
			System.out.println("\nCual es el saldo de juego para el jugador Nº3?\n");
			Scanner scan33 = new Scanner(System.in);
			saldo3 = scan33.nextDouble();
			System.out.println("\nPerfecto.\nEl jugador Nº1 entra con un saldo de: " + saldo1 + "€\n" +
					"el jugador Nº 2 entra con un saldo de: " + saldo2 +"€\n" + "y el jugador Nº3 entra con un saldo de: "
					+ saldo3 + "€");
		}else {System.out.println("\nEl número introducido no es correcto, pueden participar de 1 a 3 jugadores.\n");}
		

}while(numjugadores<0 || numjugadores>3);
		
		System.out.println("\n¡¡¡Mucha suerte!!!\n");
		
		
		
		
		
		
		//MENÚ.
		
			//CASO UN JUGADOR
if (numjugadores==1){
					
			//CASO 2 JUGADORES		
}else if (numjugadores==2) {
				
	
	
	
	
			//CASO 3 JUGADORES	
}else if (numjugadores==3) {
	
	int opmp1 = 0;
	int opmp2 = 0;
	int opmp3 = 0;
	int num1a36j1 = 0;
	int num1a36j2 = 0;
	int num1a36j3 = 0;
	int docenaj1 = 0;
	int docenaj2 = 0;
	int docenaj3 = 0;
	int parimparj1 = 0;
	int parimparj2 = 0;
	int parimparj3 = 0;
	int rojonegroj1 = 0;
	int rojonegroj2 = 0;
	int rojonegroj3 = 0;
			do {		
				
				for ( int i=1  ; i<=3  ; i++  ){
				System.out.println("\n=======================================\n"
						+ "\t--> JUEGO DE LA RULETA <--\n"
						+ "=======================================\n\n"
						+ "   ¿A que desea jugar el jugador Nº:" + i + "?\n"
						+"1. Apostar por un número (0-36).\n"
						+"2. Apostar por docenas.\n"
						+"3. Apostar por par/impar.\n"
						+"4. Apostar por rojo/negro.\n"
						+"5. Dejar de jugar.\n\n");
				
				if(i==1) {
					Scanner scan3 = new Scanner(System.in);
					opmp1 = scan3.nextInt();
				}else if(i==2) {
					Scanner scan4 = new Scanner(System.in);
					opmp2 = scan4.nextInt();
				}else if(i==3) {
					Scanner scan5 = new Scanner(System.in);
					opmp3 = scan5.nextInt();	
				}else {System.out.println("Lo siento, la opción introducida no es correcta");
				}
				}
			
				
				//JUGADOR 1
				if (opmp1==1) {
					System.out.println("\n¿A que número desea hacer la apuesta el jugador 1? (del 0 al 36).\n");
					Scanner scan100 = new Scanner(System.in);
					num1a36j1 = scan100.nextInt();
					
				}else if (opmp1==2) {
					System.out.println("\nElija la docena por la que desea apostarel jugador 1:\n"
							+ "---------------------------------------------------\n"
							+ "1. (0-12)\n" + "2. (13-24)\n" + "3. (25-36)\n");
					Scanner scan106 = new Scanner(System.in);
					docenaj1 = scan106.nextInt();
					
					
				}else if (opmp1==3) {
					System.out.println("\n¿Elija a que grupo desea apostar el jugador 1?"
							+ "\n-----------------------------------------------\n"
						    + "1. (Par).\n2. (Impar).\n");
					Scanner scan109 = new Scanner(System.in);
					parimparj1 = scan109.nextInt();
					
					
				}else if (opmp1==4) {
					System.out.println("\n¿Elija a que color desea apostar el jugador 1?"
							+ "\n-----------------------------------------------\n"
						    + "1. (Rojo).\n2. (Negro).\n");
					Scanner scan112 = new Scanner(System.in);
					rojonegroj1 = scan112.nextInt();
					
				}else if (opmp1==5) {
					System.out.println("\n¡¡Gracias por jugar, esperamos volver a verle pronto!!\n");
					System.out.println("\nSu saldo es de " + saldo1 + "€.");
				}
				
				
				//JUGADOR 2
				if (opmp2==1) {
					System.out.println("\n¿A que número desea hacer la apuesta el jugador 2? (del 0 al 36).\n");
					Scanner scan101 = new Scanner(System.in);
					num1a36j2 = scan101.nextInt();
					
				}else if (opmp2==2) {
					System.out.println("\nElija la docena por la que desea apostarel jugador 2:\n"
							+ "---------------------------------------------------\n"
							+ "1. (0-12)\n" + "2. (13-24)\n" + "3. (25-36)\n");
					Scanner scan105 = new Scanner(System.in);
					docenaj2 = scan105.nextInt();
					
				}else if (opmp2==3) {
					System.out.println("\n¿Elija a que grupo desea apostar el jugador 2?"
							+ "\n-----------------------------------------------\n"
						    + "1. (Par).\n2. (Impar).\n");
					Scanner scan108 = new Scanner(System.in);
					parimparj2 = scan108.nextInt();
					
				}else if (opmp2==4) {
					System.out.println("\n¿Elija a que color desea apostar el jugador 2?"
							+ "\n-----------------------------------------------\n"
						    + "1. (Rojo).\n2. (Negro).\n");
					Scanner scan111 = new Scanner(System.in);
					rojonegroj2 = scan111.nextInt();
					
				}else if (opmp2==5) {
					System.out.println("\n¡¡Gracias por jugar, esperamos volver a verle pronto!!\n");
					System.out.println("\nSu saldo es de " + saldo2 + "€.");
				}
				
				
				//JUGADOR 3
				
				if (opmp3==1) {
					System.out.println("\n¿A que número desea hacer la apuesta el jugador 3? (del 0 al 36).\n");
					Scanner scan102 = new Scanner(System.in);
					num1a36j3 = scan102.nextInt();
					
				}else if (opmp3==2) {
					System.out.println("\nElija la docena por la que desea apostar el jugador 3:\n"
							+ "---------------------------------------------------\n"
							+ "1. (0-12)\n" + "2. (13-24)\n" + "3. (25-36)\n");
					Scanner scan104 = new Scanner(System.in);
					docenaj3 = scan104.nextInt();
					
				}else if (opmp3==3) {
					System.out.println("\n¿Elija a que grupo desea apostar el jugador 3?"
							+ "\n-----------------------------------------------\n"
						    + "1. (Par).\n2. (Impar).\n");
					Scanner scan107 = new Scanner(System.in);
					parimparj3 = scan107.nextInt();
					
					
				}else if (opmp3==4) {
					System.out.println("\n¿Elija a que color desea apostar el jugador 3?"
							+ "\n-----------------------------------------------\n"
						    + "1. (Rojo).\n2. (Negro).\n");
					Scanner scan110 = new Scanner(System.in);
					rojonegroj3 = scan110.nextInt();
					
					
				}else if (opmp3==5) {
					System.out.println("\n¡¡Gracias por jugar, esperamos volver a verle pronto!!\n");
					System.out.println("\nSu saldo es de " + saldo3 + "€.");
				}
				
				
				
				int tirada = ((int)(Math.random()*36));
				
				
				
				
				
				
		}while(opmp1<1 || opmp1>5 || opmp2<1 || opmp2>5 || opmp3<1 || opmp3>5);	
	
	
	
	
	
	
	
	
	
}
		
		
		
		
		
		
		
		
		
	
		
	}

}
