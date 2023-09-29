package curso_java.teoria.A7_Excepciones;

public class ControlExcepciones {

	private static String[] colores; // Declaramos la variable colores que apunta a un array de strings.

	public static void main(String[] args) {

		colores = new String[5]; // Inicializamos la variable colores dando tamaño al array al que apunta.

//		colores[5]="azul";  // esta linea por si sola no da error pero la posición 5 no existe en este array ya que sus huecos van del 0 al 4
		// pero cuando ejecute dara el error por lo tanto debemos "capturar" ese error.

//Para explicar el bloque de código con el que capturamos los errores vamos a poner otro ejemplo de fuera de rango de array

		try {

			colores[6] = "verde";

		} catch (Exception e) {
			System.out.println("ha ocurrido un error" + e.getMessage());
			e.printStackTrace();
		}finally{
			System.out.println("Esto se va a imprimir siempre, capture o no capture errores."); //El Finaly se usa para ejecutar alguna acción
		}																						// que quieras asegurarte que se lleva a cabo.
		System.out.println("Termina");
		

		// Usamos el bloque try catch metiendo en el interior la linea o lineas que puedan ser problemáticas.
		// de esta forma evitamos que el programa se pare y como se puede observar, finalmente imprime en la linea 24 el termina, es decir,
		// el programa recoge el error, muestra las trazas con e.printStackTrace y continua.

		
		//En este caso si se genera un error, este es recogido en la clase Exception y crea el objeto e para poder usarlo luego con la llamada
		//al printStackTrace.
		//OJO, si declaramos el objeto de la clase Escetpion recogerá todos los tipos de errror pero podemos declarar las clases concretas de cada
				//error
	}
}
