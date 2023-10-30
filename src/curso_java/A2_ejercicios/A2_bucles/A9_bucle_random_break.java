package curso_java.A2_ejercicios.A2_bucles;

import java.util.Scanner;

public class A9_bucle_random_break {
	public static void main (String [] args) {
		
		
	//1. Tenemos que simular la tirada de un dado random
		//cuando salga el número 6 tenemos que terminar el juego
		
		
	//2. Despues hacer una variante del dado que termina el juego cuando 
		//se saquen 3 veces consecutivas el número 6.
		//Devolver cuantas tiradas se han necesitado para cumplirse la condición.
		
		
		
		//1.
//		int resultado;
//				do {
//				resultado = ((int)(Math.random()*6)+1);
//				System.out.println(resultado);
//				}while(resultado!=6);
//		System.out.println("Fin");
		
		
		//1. forma alternativa con Continue y con breaks
		//si ponemos como condicion en el do while "true" el bucle se repetirá infinitamente
			//la forma de parar este bucle es poniendo un break dentro del bucle.
		
		
				do {
					int resultado = ((int)(Math.random()*6)+1);
					System.out.println(resultado);
					if (resultado==6) {
						break;
					}
				}while(true);
		
		
		
		//2.
		
//		int resultado2 = ((int)(Math.random()*6)+1);
//		int tres6 = 0;
//		int contador = 0;
//		
//		for ( ; tres6<3 ; contador++ ) {
//			resultado2 = ((int)(Math.random()*6)+1);
//			System.out.println(resultado2);
//			if (resultado2==6) {
//				tres6 += 1;
//			}else if (resultado2!=6) {
//				tres6=0;
//			}
//		}
//	
//		System.out.println("Has necesitado " + contador + " tiradas para sacar 6 tres veces consecutivas");
//		
		
		
		//2 (forma alternativa)
		
		
		
		
		
		
		
		
		
	}

}
