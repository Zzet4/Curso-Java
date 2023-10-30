package curso_java.A2_ejercicios.A4_Arrays;

import java.util.Scanner;

public class A2_Array_Bucle_ForEach_Notas {
	public static void main (String [] args) {
		

/*
 * Listado de alumnos y notas:
 * 
 * 
 * Indicar numero de alumnos a almacenar
 * Preguntar y guardar los nombres y las notas
 * -Sacar la nota media de todas las notas
 * -La nota máxima
 * -La nota mínima
 * 
 * -Sacar un nuevo array con las notas ordenadas de mayor a menor
 * 
 * 
 * */
		
		
//preguntamos cuantos alumnos vamos a almacenar y sacamos, por ende, el numero total de notas que va a haber
		System.out.println("\n¿Cuantas alumnos hay en la clase?: \n");
		Scanner scan01 = new Scanner(System.in);
		int numTotAl = scan01.nextInt();
		int numTotNot = numTotAl;
		
		
		
		
//preguntamos cada nombre y cada nota para almacenarlas (primero creamos los arrays vacíos de nombres y notas)
		String [] nombres = new String[numTotAl];
		int [] notas = new int[numTotNot];
		
		for ( int i=0  ;i<=numTotAl-1   ; i++  ) {
			System.out.println("Introduzca el nombre del alumno Nº: " + (i+1));
			Scanner scanX = new Scanner(System.in);
			nombres[i]= scanX.nextLine();		
			
			System.out.println("introduzca la nota que ha obtenido " + nombres[i]);
			Scanner scanY = new Scanner(System.in);
			notas[i]= scanY.nextInt();
			
			
		}
//Mostramos la lista de alumnos con su nota correspondiente
		System.out.println("\nA continuación se mostrará la lista de los alumnos con su nota");
		
		int contador = 0;
		for ( String nombreAl : nombres) {
			System.out.println(" - " + nombreAl + "\t- " + notas[contador]);
			contador++;
		}
	
		
		
//Mostramos la nota media, la nota máxima y la nota mínima
		
		System.out.println("\nHay un total de " + numTotAl + " alumnos.");
		
			int sumaNotas = 0;
			int notaRef = notas[0];
			int notaMed = 0;
			int notaMax = 0;
			int notaMin = 0;
			for( int nota : notas) {
				sumaNotas = sumaNotas + nota;
				if (nota>notaRef) {
					notaMax = nota;
				}else if (nota<notaRef) {
					notaMin = nota;
				}
				notaRef = nota;
			}
		notaMed = sumaNotas / numTotAl;
		System.out.println("la nota media es: " + notaMed + "\nla nota MAX es: " + notaMax + "\nLa nota MIN es " + notaMin + "\n");
		
		
		
//Mostramos las notas de menor a mayor (primero creamos un nuevo array llamado notasOrdenAsc
		//Pasos
		//Debemos comparar todas las posiciones del array de las notas, la posición 0 con la 1, la 2, la 3... luego la posición 1 con la 0, la 1...
		
		int [] notasOrdenAsc = new int [numTotAl];
		int notaRef2 = notas[0];
		
		
		for(int x=0 ; x<=notasOrdenAsc.length-1  ; x++  ) {
			for (int i = 0 ; i<=numTotAl-1 ; i++) {
				for ( int nota : notas)
					if(notas[i]>nota) {
						notasOrdenAsc[x] = nota;
					}
			} 
		}
	
		System.out.println("A continuación las calificaciones ordenadas de mayor a menor:");	
		for( int notaOrden : notasOrdenAsc) {
			System.out.println(notaOrden);
		}
		
	}
		
}
