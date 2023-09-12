package curso_java.ejercicios.A4_Arrays;

import java.util.Scanner;

public class A3_Array_Bidimensional {
	public static void main (String [] args) {
		
		
		
/*
 * 
 * 
 * Creamos una matriz cuadrada pidiendo los datos por consola
 * +Pedir numero de filas que va a tener
 * +Pedir todos los numeros para rellenar la matriz indicando la posicion solicitada en cada pregunta
 * 
 * +Pintar los datos de la matriz
 * 
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * 
 * + Crear un Array unidimensional con los datos de la diagonal de izquierda a derecha y de arriba a abajo de esa matriz
 * + mostrarla por pantalla.
 * 
 * 1 5 9
 * 
 * 
 * + Crear un Array que invierta la otra diagonal, el 7 donde el 3 y viceversa.
 * 
 * 1 2 7
 * 4 5 6
 * 3 8 9
 * 
 * */
		
//--------------------------------------------------------------------------------------------------------------------------------------------
		
		
	System.out.print("\n\tVAMOS A CREAR UNA TABLA DE DATOS\n\nPrimero seleccione el numero de filas de la tabla: ");
	Scanner scan00 = new Scanner (System.in);
	int numFilas = scan00.nextInt();
		
		
		
	System.out.print("Ahora seleccione el numero de columnas de la tabla: ");	
	Scanner scan01 = new Scanner (System.in);
	int numColumnas = scan01.nextInt();
	
	System.out.println("\nPerfecto, ha seleccionado una tabla con " + numFilas + " filas y " + numColumnas + " columnas" + 
	"\nAhora vamos a ir rellenando los datos. ");
	
	//Generamos el array con los datos obtenidos
	int [][] tabla = new int [numFilas][numColumnas];
	int numInicio = 1;
	
	for ( int i=0  ; i<tabla.length  ; i++ ) {
	
		for ( int j=0  ; j<tabla[i].length  ; j++ ) {	
			System.out.println("\nselecciones el dato de la posicion " + i + "," + j);
			Scanner scan03 = new Scanner (System.in);
			int dato = scan03.nextInt();
			tabla[i][j] = dato;
			numInicio+=1;
		}			
	}
	
	//Mostramos el array en pantalla
	System.out.println("\nA continuación se muestra la tabla seleccionada:");
	
	for ( int i=0  ; i<tabla.length  ; i++  ) {
		
		for ( int j=0  ; j<tabla[i].length  ; j++  ) {
			System.out.print(tabla[i][j]);
		}
		System.out.println();
	}
	
	
	//Creamos un array unidimensional con la diagonal de la tabla creada.(la longitud máxima será = al número de columnas de la tabla
	
		int [] diagonal = new int [tabla[0].length];
	
		//Ahora sacamos los datos de la diagonal necesarios: (coinciden en las posiciones 00 , 11 , 22 , 33) y rellenamos la matriz
		System.out.println("\nla diagonal de la tabla es: ");
		
		int cuentaDiagonal = 0;
		for ( int i=0  ; i<tabla.length  ; i++  ) {
			
			for ( int j=0  ; j<tabla[i].length  ; j++  ) {
				if(i==j) {
					diagonal[cuentaDiagonal]=tabla[i][j];
					cuentaDiagonal+=1;
					
				}
			}
		}
		
		//Ahora mostramos el array de la diagonal
		for (int datoDiagonal : diagonal) {
			System.out.print(datoDiagonal);
		}
	
	//Por último guardamos un nuevo array bidimensional con la otra diagonal a la inversa
		System.out.println("\n\nEste es el array con la otra diagonal a la inversa es:");
		
		
	
		for ( int i=0, j=tabla.length-1 ; i<tabla.length/2  ; i++, j--  ) {
			int aux = tabla[i][j]; //Sacamos el dato de la esquina inferior izquierda en la variable aux para no perderlo
			tabla[i][j] = tabla[j][i]; //Igualamos la esquina inferior izquierda a la superior derecha, (hemos pisado el dato que había antes).
			tabla[j][i] = aux; //sustituímos esquina superior derecha por la variable aux que teníamos guardada
			
		}
		
		
		
			//imprimimos de nuevo el array con la 
		for ( int i=0  ; i<tabla.length  ; i++  ) {
			
			for ( int j=0  ; j<tabla[0].length  ; j++  ) {
				System.out.print(tabla[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
