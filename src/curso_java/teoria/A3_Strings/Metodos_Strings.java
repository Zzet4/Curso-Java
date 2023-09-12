package curso_java.teoria.A3_Strings;

public class Metodos_Strings {
	public static void main (String [] args) {
	
	
	// Los Strings son INMUTABLES, si yo intento cambiar a mayusculas un String no
			// me deja;

			// String nombre1 = "Pablo";
			// nombre1.toUpperCase();
			// System.out.println(nombre1);

			// Esta instrucción no me cabmiaría la variable nombre1 si no que crearía una
			// nueva
			// La instrucción correcta sería
	
			String nombre1 = "Pablo";
			nombre1 = nombre1.toUpperCase();
			System.out.println(nombre1);
			
			
			

			// para sacar el primer caracter de un string usamos lo siguiente, (recordemos
			// que siempre se empieza a contar desde el 0
			System.out.println(nombre1.charAt(0));
			
			
			

			// para saber si un string contiene o no contiene una letra o una cadena de letras en concreto
			System.out.println(nombre1.contains("A"));
			System.out.println(nombre1.contains("PA"));
			System.out.println(!nombre1.contains("E"));
			
			
			

			// para saber si un string empieza o termina con una letra o cadena de letras en concreto
			System.out.println(nombre1.startsWith("PA"));
			System.out.println(nombre1.endsWith("BLO"));
			
			
			

			// para saber en que posicion se encuentra un caracter en concreto, (Devuelve el primero que encuentra al leer)
			System.out.println(nombre1.indexOf("A"));
			
			
			

			// para saber en que posicion se encuentra caracter en concreto empezando desde el final, (devuelve el ultimo)
			System.out.println(nombre1.lastIndexOf("A"));
			
			
			
			
			// para saber si un string está vacío
					String variableVacia = "";
			System.out.println(variableVacia.isEmpty());
			
			
			
					
			// para saber si un string está en blanco		
					String variableEnBlanco = "         ";
			System.out.println(variableEnBlanco.isBlank());
			
			
			
			
			
					
			//para reemplazar una letra dentro de un string
			System.out.println(nombre1.replace("O", "ete"));
			
			
			
			
			
			//Para saber la lingitud de un string
			System.out.println(nombre1.length());
			
			
			
					
			//para que nos muestre en pantalla el string a partir de la posición que le indicamos
			String prueba = "0123456789";
			System.out.println(prueba.substring(3));
			String prueba2 = "pablo";
			System.out.println(prueba2.substring(3));
				//también podemos darle un rango de posiciones de caracteres entre los que queremos visualizar	
				String prueba3 = "ordenador";
				System.out.println(prueba2.substring(0,5));	
				
				
				
				
			//para quitar los espacios que pueda haber en en blanco a derecha e izquierda
				String nombreConEspacios = "       pablo      ";
				System.out.println(nombreConEspacios.trim());
				
				
			//para pasar un string a int
				String notaStr = "10";
				int notNum = Integer.parseInt(notaStr);
				
			//para pasar un char a un int
				
				
				
			//dividir un String en diferentes partes si hay un sibolo como patrón
				String texto = "hola,me,llamo,fulanito";
				String [] textoSeparado = texto.split(",");
				
				
				System.out.println(textoSeparado.length);
				for (String palabra : textoSeparado) {
					System.out.println(palabra);
				}
				
				
				
				
			
				
				
				
				
	}
}
