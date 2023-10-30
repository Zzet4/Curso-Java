package curso_java.A1_Teoria.A4_Arrais_Bucle_ForEach;

public class A2_Arrays_Bidimensionales {
	public static void main (String [] args) {
		
		//Si un Array no es más que una fila de datos ordenados en posiciones comenzando desde la 0, y siguiendo por la 1,2,3...
		
		//Un Array bidimensional es un Array con filas y columnas de datos, 
			//es decir una cuadrícula donde cada posición viene determinada por dos coordenadas, 00, 01, 02, 10, 11, 12...
		
		
		//La sintaxis de su declaración es la siguiente:
			String [][] arrayBidimensional = new String[4][5]; // Se declaran igual que las simples pero con dobles corchetes
		
		
		//Veamos un ejemplo práctico de creacion de array bidimensional
			String [][] animales = new String [3][5]; //Creación de Array bidimensional con 3 filas y 4 columnas
		
		//Consulta del tamaño del Array bidimensional
			System.out.println(animales.length); //consultamos el número de filas
			System.out.println(animales[0].length); //consultamos el numero de columnas de la fila 0
			
			
		//rellenado y acceso a los datos del Array
			System.out.println(animales[2][1]); //Acceso y visualización en pantalla de la posicion 2,1
			animales [0][0]="Gato"; //metemos en la posición 0,0 el Gato
			
			
			
			
			
			
			
		//rellenado completo con bucle for del array bidimensional (se utiliza un bucle for anidado).
			
			for ( int i=0  ; i<animales.length  ; i++  ) {	
				System.out.println("Fila: " + i);
				for (int e=0 ; e<animales[i].length  ; e++  ) {
					animales [i][e]="*";
					System.out.println("\tColumna: " + e );
				}
			}
			
			
		//Visualización del array completo. (tambien con un bucle for)
			for ( int i=0  ; i<animales.length  ; i++  ) {	
				for (int e=0 ; e<animales[i].length  ; e++  ) {
					System.out.print(animales[i][e] ); //print 1
				}
				System.out.println(); //print 2
			}
			//OJO, el print 1 te va a pintar todos los "*" seguidos hacia abajo por lo que utilizamos print y no println
			//de esta forma nos los pinta todos seguidos de izquierda a derecha
			//para conseguir mostrar la matriz debemos meter un salto de linea en el print 2 (con un println)
			//por cada vuelta del bucle de las columnas
			
			
System.out.println();			
			
			
		//Visualizacion del array completo (con bucle for-each)
			for ( String [] filas :  animales) {
				for ( String dato : filas ) {
					System.out.print(dato);
				}
				System.out.println();
			}
			//en la declaración de la "variable" filas, no se trata de una variable si no de un array unidimensional 
			//que representa la fila completa
			//dentro de ese bucle que recorre la fila queremos que mire cada columna
			// array unidimensional = au   ,   array bidimensional ab
			// para cada fila (que es una "au") del array bidimensional quiero que hagas:
			// recorre los datos de la fila y metelos en la variable dato.
			// luego muestra dato en cada iteracion del bucle.
			
			
			
			
			
//------------------------------------------------------------------------------------------------------------
//						VAMOS A VER UN EJEMPLO DE RELLENADO Y MUESTRA DE ARRAY BIDIMENSIONAL
			
			
	//Declaramos Array bidimensional con dos filas y tres columnas.
			int [][] tabla = new int [2][3];
			
	//rellenamos el array.
		//La primera fila con los numeros 1, 2 y 3
		//La segunda fila con los numeros 2, 3 y 4.
			
			
			//Forma facil sabiendo los datos declaramos y rellenamos una tablaPrueba
			int [][] tablaPrueba = { {1,2,3} , {4,5,6} }; //como tiene dos filas, metemos en dos corchetes los datos de las dos filas sin " "
															// y todo ello dentro de un corchete general. dentro de corchetes también.
			
					
			
//---------------------------------------------------------------------------------------------------------------
			
			
			
			
			
	}
}
