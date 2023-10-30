package curso_java.A2_ejercicios.A6_POO.A8_Interfaces_Guerra;

import javax.swing.JInternalFrame;

import curso_java.A2_ejercicios.A6_POO.A8_Interfaces_2.A00_Excepciones.MaxEstadisticasException;
import curso_java.A2_ejercicios.A6_POO.A8_Interfaces_2.A00_Excepciones.MaxUnirseException;

public class Santuario {
	
	
	public static void batalla () {
		
		System.out.println("\n---COMIENZA LA BATALLA---");
		System.out.println("=========================================================================================\n\n");
		Caballeria jinetesDeTristan = null;
		MaquinaAsedio carroCarnicero = null;
		Guerrero chandra = null;
		Guerrero terry = null;
		Guerrero rathma = null;
		Guerrero zombie = null;
		Guerrero vampiro = null;;
		Guerrero sucubo = null;
		
		
		try {
			jinetesDeTristan = new Caballeria(6, 4, "Jinetes de Howezar");
			chandra = new Guerrero("Chandra", "Maga", 8, 2);
			terry = new Guerrero("Terry", "Druida", 6, 4);
			rathma = new Guerrero("Rathma", "Nigromante", 4, 6);
			jinetesDeTristan.unirse(terry);
			jinetesDeTristan.unirse(chandra);
			jinetesDeTristan.unirse(rathma);
		}catch (MaxEstadisticasException | MaxUnirseException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			carroCarnicero = new MaquinaAsedio(3, 7, "Carro del Carnicero");
			zombie = new Guerrero("Brad", "Zombie", 4, 6);
			vampiro = new Guerrero("Nosferatu", "Vampiro", 6, 4);
			sucubo= new Guerrero("Andariel", "Demonio", 7, 3);
			carroCarnicero.unirse(terry);
			carroCarnicero.unirse(zombie);
			carroCarnicero.unirse(vampiro);
			carroCarnicero.unirse(sucubo);
		}catch(MaxEstadisticasException | MaxUnirseException e) {
			System.out.println(e.getMessage());
		}

do {
	
	System.out.println("\n\n\n\n---UNA NUEVA ESCARAMUZA---");
	System.out.println("=============================================\n\n");
	carroCarnicero.setVitalidad(carroCarnicero.getVitalidad()- carroCarnicero.defender(jinetesDeTristan.atacar()));
		System.out.println("La VIT total del carroCarnicero ahora es: " + carroCarnicero.getVitalidad() + "\n\n");
		if(carroCarnicero.getVitalidad()<=0) {
			System.out.println("\nLA NAVE " + carroCarnicero.getNombre() + " HA CAIDO EN COMBATE.\n EL SABLE DE RABOCOP HA TRIUNFADO");
			System.out.println("---------------------------------------");
			break;
		}
		jinetesDeTristan.setVitalidad(jinetesDeTristan.getVitalidad() - jinetesDeTristan.defender((carroCarnicero.atacar())));
		System.out.println("La VIT total de jinetesDeTristan es: " + jinetesDeTristan.getVitalidad() + "\n\n");
		if(jinetesDeTristan.getVitalidad()<=0) {
			System.out.println("\n" + jinetesDeTristan.getNombre() + " HA SIDO DERROTADO.");
			
		break;
				
		}
}while(jinetesDeTristan.getVitalidad()>0 || carroCarnicero.getVitalidad()>0);



	
}
	
	
//	public static void batallaProfe(Peloton naveProfe) {
//		
//		//PARA LUCHAR CONTRA EL PROFE
//				Caballeria rabocop = null;
//				Guerrero rabocop1 = null;
//				Guerrero rabocop2 = null;
//				Guerrero rabocop3 = null;
//				Guerrero rabocop4 = null;
//				Guerrero rabocop5 = null;
//				Guerrero rabocop6 = null;
//				Guerrero rabocop7 = null;
//				Guerrero rabocop8 = null;
//				Guerrero rabocop9 = null;
//				Guerrero rabocop10 = null;
//				try {
//					rabocop = new Caballeria(6, 4, "RABOCOP");
//					rabocop1 = new Guerrero("1", "a", 1, 9);
//					rabocop2 = new Guerrero("1", "a", 1, 9);
//					rabocop3 = new Guerrero("1", "a", 1, 9);
//					rabocop4 = new Guerrero("1", "a", 1, 9);
//					rabocop5 = new Guerrero("1", "a", 1, 9);
//					rabocop6 = new Guerrero("1", "a", 1, 9);
//					rabocop7 = new Guerrero("1", "a", 1, 9);
//					rabocop8 = new Guerrero("1", "a", 1, 9);
//					rabocop9 = new Guerrero("1", "a", 1, 9);
//					rabocop10 = new Guerrero("1", "a", 1, 9);
//					rabocop.unirse(rabocop1);
//					rabocop.unirse(rabocop2);
//					rabocop.unirse(rabocop3);
//					rabocop.unirse(rabocop4);
//					rabocop.unirse(rabocop5);
//					rabocop.unirse(rabocop6);
//					rabocop.unirse(rabocop7);
//					rabocop.unirse(rabocop8);
//					rabocop.unirse(rabocop9);
//					rabocop.unirse(rabocop10);
//
//				}catch (MaxEstadisticasException | MaxUnirseException e) {
//					System.out.println(e.getMessage());
//				}
//						
//
//			do {
//				
//				System.out.println("\n\n\n\n---UNA NUEVA ESCARAMUZA---");
//				System.out.println("=============================================\n\n");
//					naveProfe.setVitalidad(naveProfe.getVitalidad()- naveProfe.defender(rabocop.atacar()));
//					System.out.println("La VIT total del ENTERPRISE ahora es: " + naveProfe.getVitalidad() + "\n\n");
//					if(naveProfe.getVitalidad()<=0) {
//						System.out.println("\nLA NAVE " + naveProfe.getNombre() + " HA CAIDO EN COMBATE.\n EL SABLE DE RABOCOP HA TRIUNFADO");
//						System.out.println("---------------------------------------");
//						break;
//					}
//					rabocop.setVitalidad(rabocop.getVitalidad() - rabocop.defender((naveProfe.atacar()-naveProfe.atacar())+1));
//					System.out.println("La VIT total de RABOCOP es: " + rabocop.getVitalidad() + "\n\n");
//					if(rabocop.getVitalidad()<=0) {
//						System.out.println("\n" + rabocop.getNombre() + " HA SIDO DERROTADO.");
//						
//					break;
//							
//					}
//			}while(rabocop.getVitalidad()>0 || naveProfe.getVitalidad()>0);
//		
//	}
	


	public static void main(String[] args) {
	
	
		Santuario tristan = new Santuario();
		tristan.batalla();

	}

}
