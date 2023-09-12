package curso_java.ejercicios.A2_bucles;

import java.util.Scanner;

public class A3_bucle_for3 {
	public static void main(String[] args) {

//Demostrar la conjetura de Collatz
//Solicitar un número:
//Si el número es par, se divide entre 2
//Si el número es impar se multiplica por 3 y se le suma 1
//En cada paso se coge el resultado de la operación anterior.
//Estas operaciones se repiten hasta que el número sea 1

		System.out.println(
				"Vamos a hacer un truco de magia.\n\nElije cualquier número\nSi el número es par, se divide entre 2\n"
						+ "Si el número es impar se multiplica por 3 y se le suma 1\n"
						+ "En cada paso se coge el resultado de la operación anterior\n"
						+ "Estas operaciones se repiten hasta que el número sea 1\n\n¿Que número has elegido?:");
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		int contador = 0;

		for (  ; numero!=1 ; contador++) {

			if (numero % 2 == 0) {
				numero = numero / 2;
			} else {
				numero = numero * 3 + 1;
			}
		}
		System.out.println(
				"después de repetir las instrucciones un total de " + contador + " veces, el resultado final es: " + numero);

//	switch (numero){
//	case (numero%2==0):
//		numero = numero/2;
//	case (numero%2==0):
//		numero = numero * 3 + 1;
//			}

	}
}
