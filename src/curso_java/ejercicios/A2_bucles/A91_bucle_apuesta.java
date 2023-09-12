package curso_java.ejercicios.A2_bucles;

import java.util.Scanner;

public class A91_bucle_apuesta {
	public static void main (String [] args) {
		
		//Partimos de un importe de 1000€
		//Pedir por pantalla cuanto quieres apostar
		//Si la apuesta es mayor que el saldo tiene que devolver importe insuficiente
		//Si tiene suficiente saldo preguntamos por el numero al que quiere apostar
		//Si el dado sale el numero al que hemos apostado
			//la cantidad apostada se multiplica x 3 y se suma al saldo
		//Si el dado sale otro número diferente al apostado se perdera el importe.
			
		//Despues de cada tirada nos va a preguntar si queremos seguir jugando,
		// si decimos que si y tiene saldo repetiremos el proceso
		// si decimos que no o nos quedamos sin saldo saldremos.
			
	//---------------------------------------------------------------------------------------------------------------------------------	
			
		
		double saldo = 1000;
		String eleccion;
		double apuesta;
		int numero;
		int tirada;
		String seguimos="";
		System.out.println("\nBienvenido al casino 'LA SACA ROTA'\n");
		
		do {
			System.out.println("\n¿Cuanto dinero quiere apostar?\n");
			Scanner scan = new Scanner(System.in);
			apuesta = scan.nextDouble();
			
			if (apuesta>saldo) {
				System.out.print("Lo siento, no tiene suficiente saldo para esa apuesta");
				continue;
			}else if (apuesta<=saldo) {
				do {
					System.out.println("Ahora seleccione a que numero quiere apostar entre el 1 y el 6");
					Scanner scan2 = new Scanner(System.in);
					numero = scan2.nextInt();
					
					if (numero>0 && numero<6) {
						tirada = ((int)(Math.random()*6)+1);
						System.out.println("\n¡Has elegido el número " + numero + " vamos a tirar el dado!!!\n"
								+ "-------------------------------------------\n"
								+ "-------------------------------------------\n"
								+ "-------------------------------------------\n"
								+ "¡¡Ha salido " + tirada + " !!" );
						
						if(numero==tirada) {
							saldo = saldo+(apuesta*3);
							System.out.println("\nEnhorabuena, acertó con su apuesta!!\nSus saldo actual es " + saldo + "€");
						}else {
							saldo-=apuesta;
							System.out.println("\nLo siento, su apuesta falló\nSu saldo actrual es " + saldo + "€");
						}
						if (saldo<=0) {
							System.out.println("Actualmente no dispone de saldo suficiente para seguir apostando|n"
									+ "Esperamos volve a verle pronto!!");
							break;
						}
						
					}else {System.out.println("El número elegido no es correcto.\n");
					}
					}while(numero<=0 || numero>6);
			}
				do {
					 System.out.println("\n\n¿Desea seguir jugando?...");
					 Scanner scan4 = new Scanner(System.in);
					 seguimos = scan4.nextLine();
					 
					 if (seguimos.equalsIgnoreCase("si")) {
						 System.out.println("\n¡¡Genial, probemos suerte de nuevo!!\n\n");
						 break;
					 }else if (seguimos.equalsIgnoreCase("no")) {
						 System.out.println("\nGracias por jugar, esperamos volver a verle pronto\n");
					 }else {
						 System.out.println("Lo siento, la respuesta introducida no es correcta.");
						 continue;
					}
					}while(seguimos.equalsIgnoreCase("si"));
					 
			
		}while(saldo>0 && seguimos.equalsIgnoreCase("si"));
			
		System.out.println("FIN");
		
			}
		}
	

