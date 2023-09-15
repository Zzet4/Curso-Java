package curso_java.teoria.A1_introduccion;

public class A1_ComentariosYVariables {
	public static void main (String [] arg) {
	
		
		//TIPOS DE COMENTARIOS
		
			
			/*
			 *
			 * Comentario de bloque, abre con ( /* y cierra con la inversa
			 * 
			 *  */
		
		
	
			//Comentario de linea, utilizado con la doble barra //
			//OJO IMPORTANTE: Si seleccionas varias lineas y pulsas Ctrl + Shift + c puedes comentarlas todas a la vez.
			
		
		
			//Comentarios sobre métodos, es como el comentario de bloque pero se abre con doble asterisco
			//Se escribe justo encima del metodo para que luego pueda mostrarse la descripción cuando invoques al método
			/**
			 * 
			 * Comentas un poco que es lo que hace el método para luego poder consultarlo en sus respectivas llamadas
			 * @author Pablo
			 * @since versión 1.0
			 * @param Al método hay que pasarle x parámetros
			 * @return El método devuelve x
			 * 
			 */
		
		
		
		
		//Declaración e inicialización de variables.
			int num; //Declaración de variable
			num = 7; //Inicialización de variable
		//Habitualmente Declaramos e inicializamos las variables en la misma linea.
			int num2 = 8;
			
		
		//Tipos de variables
		 	//Variables de tipo primitivos(ojo, la primera en minúscula): 
			 		//para caracteres (solo uno)
			 			char caracter = '@';
			 		//para números enteros
			 			int numero1 = 32767;
						byte numero2 = 127;
						short numero3 = 9;
						long numero4 = 10;
			 		//para números decimales
			 			double decimalDoble = 9.6;
			 			float decimalSimple = 8.7f;
			 		//Boolean
			 			boolean esPar = true;
			 			boolean esMayorDeEdad = true;
		 	//Variable de tipo objeto (ojo, la primera en mayúscula):
			 			String nombre1 = "Juan";
			 			
		/*
		 * Tipos de variables segun su localización.
		 
		  Las variables podemos encontrárnosla DENTRO DE UN METODO y se denomina VARIABLES LOCALES,
		  pudiéndose utilizar solo dentro de ese metodo, (deben ser declaradas e inicializadas).
		  
		  Las variables que se encuentran FUERA DE LOS METODOS se llaman VARIABLES DE INSTANCIA O CLASE 
		  y pueden ser accedidas desde cualquier metodo dentro de la clase en la que se declaró. Estas 
		  variables pueden no ser inicializadas en el momento de su declaración, de esta forma adoptarán
		  el valor por defecto: 0, False, ""...
		*/		

			 			String nombre = "Pablo";
			 			int edad = 34;
			 			
			 			System.out.println("Hola Mundo!!");
			 			System.out.println("Hola, mi nombre es " + nombre + " y mi edad es " + edad + " años");
			 			
			 			
	}

}
