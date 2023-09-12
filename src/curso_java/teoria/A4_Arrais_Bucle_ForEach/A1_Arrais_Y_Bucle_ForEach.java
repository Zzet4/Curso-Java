package curso_java.teoria.A4_Arrais_Bucle_ForEach;

public class A1_Arrais_Y_Bucle_ForEach {
	public static void main (String [] args) {
		
		
//	Los arrays, también llamados matrices o arreglos, son "PAQUETES DE DATOS" en los que podemos guardar varios datos DEL MISMO TIPO:
		//-Si declaramos un array de Strings no podemos guardar en ella información de tipo numérico o booleano
		//-El tamaño del array se define al crearla y no se puede modificar a posteriori
		
		
//Para declarar un array el proceso es parecido a cuando declaramos una variable, solo hay que introducir unos corchetes [] despues del tipo:
		
		//String [] nombres = 
		
		
		
//Para "llenar" el array con los valores tenemos varias maneras de hacerlo:
		
	//1- Si ya conocemos los valores, podemos incluirlos en la declaración, y lo hacemos con corchetes:
		String [] nombres = {"n1","n2","n3","n4"};
		
	//2- Si no conocemos los valores, solo podemos crear el array vacío con su tamaño máximo:
		int [] numeros = new int[3];//en este caso el tamaño máximo del array es 3		
			//para llenar este array habra que utilizar la sintaxis de "modificación de datos del array explicada a continuación
		
		
		
//Operaciones sobre los arrays	
		
		//Modificación de datos dentro del array:
			nombres[2]="n10"; //de esta forma modificamos un dato dentro del array
		
		//Acceso y pintado de datos del array:
		
			//para acceder a un dato dentro de la arrai ejecutamos lo siguiente: (Recuerda que siempre se empieza por la posición 0)
					System.out.println(nombres[1]); //este comando nos devolverá "n2"
		
			//Utilizamos un bucle FOR para sacar todos los nombres de la arrai por orden
					for( int nombreLista = 0  ; nombreLista<=nombres.length -1 ; nombreLista++  ) {
						System.out.println(nombres[nombreLista]);
						//Ponemos el -1 en la condicion del bucle for para que no intente acceder a una posición de la array que no existe, 
						//recordemos que siempre empieza por 0
						
//-------------------------------------------------------------------------						
						
			//OJO -  Utilizaremos preferentemente un nuevo bucle para mostrar todos los datos del array. El bucle FOR-EACH.
						//BUCLE FOR EACH
							//Pongamos como ejemplo el array "colores"
						
						String [] colores = {"rojo", "amarillo", "azul", "verde"};
						
						System.out.println("\nLos colores seleccionados son los siguientes: (con bucle for each)\n");
						for (String color : colores) {
							System.out.println(color);
						}
						
						//En los bucles FOR-EACH solo declaramos la variable que usaremos temporalmente para imprimir, en este caso color
						//seguida de : y por último el nombre del array que queramos que recorra.
						//finalmente, dentro del for haremos lo que necesitemos en cada momento, en este caso imprimir por pantalla la variable color
						//que tendrá un valor distinto en cada vuelta del bucle desde el primer dato del array hasta el último.
						
//---------------------------------------------------------------------------
						
						
						
		//Consulta del tamaño del array:
			System.out.println(nombres.length); 
			
			
			
			
		}
		
	}

}






