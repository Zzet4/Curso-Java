package curso_java.utilidades;

import java.util.Scanner;

public class Utils {
	public static void main (String [] args) {
		
		
		//======================================INVOCACIÓN DE MÉTODOS==================================
		
		//A) Prueba solicitud String para capturar		
		String stringQuery = "introduce una palabra";
		String capturaString = scanString(stringQuery);
		System.out.println(capturaString);
		
		
		
		
		//B) Prueba solicitud int para capturar
		String intQuery = "¿Introduzca un número?";
		int capturaInt = scanInt (intQuery);
		System.out.println(capturaInt);
			//en caso de solo querer imprimir el return, lo más lógico sería introducir el print dentro del método
			//aunque si lo quisieras imprimir fuera, no haría falta guardarlo en una variable y después imprimirlo.
			//directamente puedes imprimir la ejecución del metodo pasandole los parametros adecuados
			//System.out.println(scanInt(intQuery));
			
			
		
			
		//C1) Prueba pintaMenu con texto
			String cuerpoMenu = "\nopcion1 \nopcion2 \nopcion3 \nopcion4 \nopcion5";
			pintaMenu(cuerpoMenu, "Seleccione una opción");
//			String resultadoMenu = pintaMenu(cuerpoMenu);
//			System.out.println(resultadoMenu);
			
		//C2) Prueba pintaMenu con array.
			String [] cuerpoMenuArray = {"opcionA1", "opcionA2", "opcionA3", "opcionA4", "opcionA5"};
			pintaMenu(cuerpoMenuArray, "Seleccione una de las opciones");
			
	}
	
		
	
	//======================DECLARACIÓN DE MÉTODOS=======================================================
	
	
	
	//A) Declaramos un metodo de tipo String con el parametro String stringQuery
	//	Esto quiere decir que nos dara un return de tipo String y que necesita el parametro dato.
	
	public static String scanString (String stringQuery) {
		System.out.println( stringQuery);
		Scanner scan = new Scanner(System.in);
		String capturaString = scan.nextLine();
		return capturaString;
	}
	
	//B) Declaramos un metodo de tipo int con el parametro String intQuery
	public static int scanInt (String intQuery) {
		System.out.println(intQuery);
		Scanner scan = new Scanner (System.in);
		int capturaInt = scan.nextInt();
		return capturaInt;
	}
	
	
	
	//C) AÑADIMOS EL CONCEPTO DE METODOS SOBRECARGADOS.
	
	//Cuando tengamos dos métodos que comparten gran parte del código podemos sobrecargarlo de tal forma que podamos llamarlo igual
	//pero sus "apellidos" o parámetros sean diferentes.
	//Estos dos métodos deberán ser iguales con la excepción de que uno necesita como parametro un String y otro necesita un Int.
	
	//Si sobrecargamos el método, conseguimos llamar a un solo método y Java podrá reconocer cual de las variantes utilizar
	//en función del tipo de parámetro que introduzcamos.
	
	//para ello debemos hacer que el return del primero, redirija al segundo.
	//Veamos un ejemplo práctico.
	//Necesitamos pintar un menú cuyo cuerpo le puede ser proporcionado al parametro mediante un texto o mediante un array de Strings.
	//En ambos casos debe pintar el texto.
		
	
	//Declaramos un metodo para pintar un menú le vamos a pasar como argumento un texto o un array de Strings que sean el cuerpo del menú
	// y ambos van a pintar el menú. dentro de ese mismo método nos va a 
	//preguntar por la opción deseada y luego me devuelve la misma opción que se ha seleccionado
	
	
	//C1)
	public static int pintaMenu (String cuerpoMenu, String pregunta) {
		System.out.println(cuerpoMenu); 
		int out = scanInt(pregunta);
		
		return out;
	}
	
	
	
	//C2)
	public static int pintaMenu (String [] cuerpoMenuArray, String pregunta) {
		int opcion=0;
		
//		for ( int i=0  ; i<cuerpoMenuArray.length  ; i++  ) {
//			System.out.println(cuerpoMenuArray[i]);
//		}
		
		for (String dato : cuerpoMenuArray ) {
			System.out.println(dato);
		}
		int out = scanInt(pregunta);
	
		return out;
		
	}
	
	
	//METODO PARA EL CUERPO DE UN SWITCH
	public static void cuerpoSwitch (int opcionMP) {
		switch (opcionMP) {
		case 1:// xxxxxxxxx
	
			break;
		case 2:// xxxxxxxxx
			
			break;
		case 3:// xxxxxxxxx
			
			break;
		case 4:// xxxxxxxxx
			
			break;
		case 5:// xxxxxxxxx
		
			break;
		case 6:// xxxxxxxxx
			
			break;
		case 7:// xxxxxxxxx
			
			break;
		case 8:// xxxxxxxxx
			
			break;
		case 9:// xxxxxxxxx
			
			break;
		case 10:// xxxxxxxxx
			
			break;
		}
		
		
	}
	
	
	
	
	
}


	

