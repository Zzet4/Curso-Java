package curso_java.ejercicios.A2_bucles;

import java.util.Scanner;

public class A10_bucle_apuesta {
	public static void main (String [] args) {
		
//Partimos de un saldo de 1000€
	//Pedir por pantalla cuanto queers apostar
	//Si la apuesta es mayor que el saldo tiene que devolver importe insuficiente y volver a preguntar
	//Si tiene suficiente saldo preguntamos por el numero al que quiere apostar entre el 1 y el 6
		// si dice otro número devuelve numero invalido y vuelve a preguntar
	//Si dice un número válido y el dado sale el numero al que hemos apostado
		//la cantidad apostada se multiplica x 3 y se suma al saldo
	//Si el dado sale otro número diferente al apostado se perdera el importe.
		
	// Despues de cada tirada nos va a preguntar si queremos seguir jugando,
	// si decimos que si y tiene saldo repetiremos el proceso
	// si decimos que no saldremos.
		
//---------------------------------------------------------------------------------------------------------------------------------	
		
		int saldo = 1000;
		String mensaje = "";
		int numero;
		int apuesta;
		String seguimosOno="";
		do {
				System.out.println("\nSeleccione la cantidad que desea apostar.\n");
				Scanner scan = new Scanner(System.in);
				apuesta = scan.nextInt();
				
				if (apuesta>saldo) {
					mensaje = "\nLo siento, no tiene saldo suficiente\n";
					System.out.println(mensaje);
				}else if(apuesta<=saldo) {
					mensaje = "\nIntroduzca el número al que desea apostar entre el 1 y el 6:\n";
					System.out.println(mensaje);
					Scanner scan2 = new Scanner(System.in);
					numero = scan2.nextInt();
					System.out.println("\nLa suerte esta echada, veamos que dicen los dados!!\n"
							 + "------------------------------------------------------------------\n"
							 + "------------------------------------------------------------------\n"
							 + "------------------------------------------------------------------\n");
					int tirada = ((int)(Math.random()*6)+1);
					System.out.println("El resultado de la tirada ha sido: " + tirada + "\n"
							 + "------------------------------------------------------------------\n");
					if (tirada==numero) {
						saldo = apuesta*3+saldo;
						System.out.println("Enhorabuena, apostaste al " + numero + " y ha salido " + tirada + "\nSu saldo actual"
								+ "es: " + saldo );
					}else {
						saldo-=apuesta;
						System.out.println("Lo siento, apostaste al " + numero + " y ha salido " + tirada + "\nSu saldo actual"
								+ "es: " + saldo );
						}
				}
				
				if (saldo==0) {
					System.out.println("Lo siento, se ha quedado sin saldo.\nAcerquese al banco y vuelva con las pilas cargadas.");
				}
				
				System.out.println("¿Deseas seguir jugando?");
				Scanner scan3 = new Scanner(System.in);
				seguimosOno = scan3.nextLine();
				
				do {	
						if (seguimosOno.equalsIgnoreCase("si")) {
							System.out.println("\n\"Genial!!\n");
						}else if (seguimosOno.equalsIgnoreCase("no"))
							System.out.println("\n\"Vuelva pronto!!!\n");
						else {
							System.out.println("opción inválida, ");
							continue;
						}
				   }while(!seguimosOno.equalsIgnoreCase("si") && !seguimosOno.equalsIgnoreCase("no"));
		}while(saldo!=0 && !seguimosOno.equalsIgnoreCase("no"));	
				
		
		
		
//---------------------------------------------------------------------------------------------------------------------------------		
//Resolucion profe
		
	
//				double importe = 1000;
//				String respuesta = "";
//				
//				do {
//				
//					System.out.println("Cuanto quieres apostar de los " +importe+ " €");
//					Scanner scan = new Scanner(System.in); 
//					double importeApostado = scan.nextDouble();
//					
//					System.out.println("Por qué número quieres apostar??");
//					scan = new Scanner(System.in);
//					int numeroApostado = scan.nextInt();
//					
//					//GEnero la tirada del dado
//					int tirada = (int)(Math.random()*6)+1;
//					System.out.println("El dado ha sacado un "+tirada);
//					importe-=importeApostado;
//					if(numeroApostado==tirada) {
//						System.out.println("Enhorabuena has acertado!!!");
//						importe+=importeApostado*3;
//					}
//					
//					if (importe>0) {
//						System.out.println("Te quedan "+ importe + " euros");
//						System.out.println("Quieres seguir jugando??");
//						scan = new Scanner(System.in); 
//						respuesta = scan.nextLine();
//					}
////					if (respuesta.equals("No")) {
////						break;
////					}
//					
//				}while(importe>0 && !respuesta.equalsIgnoreCase("no"));
//				
//				System.out.println("Te has quedado con "+ importe);
//			}

		

	
		
	
		
		
		
		
	}

}
