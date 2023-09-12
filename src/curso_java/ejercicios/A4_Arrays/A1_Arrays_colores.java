package curso_java.ejercicios.A4_Arrays;

import java.util.Scanner;

public class A1_Arrays_colores {
	public static void main (String [] args) {
		

	/*
	 * 
	 * Preguntar cuantos colores se quieren guardar.
	 * Preguntar uno a uno los colores hasta llegar al número de colores seleccionados.
	 * Guardamos todos los colores
	 * Mostramos todos los colores
	 * Mostramos todos los coleres que contengan "o" y empiecen por "a"
	 * 
	 * 
	 * 	 */
	
	System.out.println("\nSeleccione cuantos colores quiere guardar en memoria:\n");
	Scanner scan00 = new Scanner(System.in);
	int numTotCol = scan00.nextInt();
	
	//Creamos un array vacío con el tamáño máximo = al número de colores obtenidos por consola en la variable numTotCol
	String [] colores = new String[numTotCol];
	
	//Creamos un bucle que nos vaya rellenando el array vacío anteriormente creado
	for ( int i = 0  ; i<=numTotCol-1  ; i++  ) {
		System.out.println("\nIntroduzca el color Nº: " + i );
		Scanner scan01 = new Scanner(System.in);
		colores[i] = scan01.nextLine().trim();
		
	}
	
	//Mostramos por pantalla en orden los colores que se han guardado en el array primero con un bucle for y luego con un nuevo bucle, el FOR EACH
	
	
		//BUCLE FOR
			System.out.println("\nLos colores seleccionados son los siguientes: (con bucle for)\n");
			for ( int i = 0  ; i<=colores.length-1 ; i++  ) {
				System.out.println(colores[i] + "\n");
			}
			 
		
		//BUCLE FOR EACH
			System.out.println("\nLos colores seleccionados son los siguientes: (con bucle for each)\n");
			for (String color : colores) {
				System.out.println(color);
			}
			
			//En los bucles FOR-EACH solo declaramos la variable que usaremos temporalmente para imprimir, en este caso color
			//seguida de : y por último el nombre del array que queramos que recorra.
			//finalmente, dentro del for haremos lo que necesitemos en cada momento, en este caso imprimir por pantalla la variable color
			//que tendrá un valor distinto en cada vuelta del bucle desde el primer dato del array hasta el último.
	
	
	//Mostramos por pantalla solo los colores que contengan "o" y empiecen por "a" con el bucle, FOR EACH
	System.out.println("\nA continuación mostraremos en pantalla solo los colores que empiecen por 'a' y contengan una 'o' (bucle for each) \n");
	
	
		//BUCLE FOR
		System.out.println("\nA continuación mostraremos en pantalla solo los colores que empiecen por 'a' y contengan una 'o' (bucle for)\n");
			for ( int i = 0  ; i<=colores.length-1 ; i++  ) {
				if (colores[i].contains("o") && colores[i].charAt(0)==('a'));
				System.out.println(colores[i] + "\n");
			}
	
			
		//BUCLE FOR EACH
			for (String color : colores ) {
				if (color.contains("o") && color.charAt(0)==('a'));
				System.out.println(color + "\n");
			}
	
	
	}

}































