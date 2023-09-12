package curso_java.ejercicios.A2_bucles;

import java.util.Scanner;

public class A5_bucle_for5_Fibonacci {
	public static void main (String [] args) {
		
		
//Pedir por consola el número total de números que se desean mostrar de la serie de Fibonacci. 
//Serie de Fibonacci: 0,1,1,2,3,5,8,13,21,34,55,... 
		
		System.out.println("La serie de Fibonacci es una serie de numeros cuyo último valor es el resultado de la suma\n"
				+ "de los dos anteriores. El ejemplo es el siguiente 0,1,1,2,3,5,8,13,21,34,55,...\n\n"
				+ "Elije cuantos números dentro de la serie de Fibonacci deseas visualizar en pantalla:");
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		int NumFib1 = 0;
		int NumFib2 = 1;
		int suma = 1;
		
		System.out.println(NumFib1);
		System.out.println(NumFib2);
		
		for ( int contador = 1, sigSuma = 0 ; contador<=numero   ; contador++ ) {
			if ((NumFib1 + NumFib2)<9999){
				System.out.println( NumFib1 + NumFib2);
				suma = NumFib1 + NumFib2;
				NumFib1 = NumFib2;
				NumFib2 = suma;
				
			}			
			
			
		}
	}

}
