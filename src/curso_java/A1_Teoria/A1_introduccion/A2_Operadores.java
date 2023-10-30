package curso_java.A1_Teoria.A1_introduccion;

public class A2_Operadores {
	public static void main (String [] args) {
		
	//Tipos de operadores.
		
		//Aritméticos (los básicos son + - * /)
			int num = 0;
			// ++ -- -> este operador puede escribirse de varias formas pero siempre suma o resta 1 a la 
				// variable num.
					num++;
			
				//Sysout num++; primero pinta la variable num, 0, y luego le cambia el valor para sumarle 1, a 
								//partir de ahora num = 1
					System.out.println(num++);
					
				//Sysout ++num; // primero le cambia el valor a num, 0+1=1 y luego pinta el valor actua, es decir 1
					System.out.println(++num);
					
				//num = num+5; le sumaría 5 al valor actual de num
				//num+=5; es una forma mas corta de escribir num = num+5;
					System.out.println(num+=5);
					
				//Operador mod % devuelve el resto de una división, recordemos que si el resto de una 
					//división es "0" quiere decir que el número del dividendo es par.
					System.out.println(num%2); //nos devolverá el resto resultante de dividir el valor
											   //actual de la variable num entre 2.
					
	
		//Condicionales (los básicos son > >= <= < ==), mayor, mayor o igual, menor o igual, menor, ¿igual?
	
					//== compara dos valores y te devuelve un booleano
					System.out.println(8==2); // en este caso devolverá false
					System.out.println(8==8); // en este caso devolverá true
					
					//podemos guardar una variable booleana llamada "esPar" utilizando el resto(%) para que
					//nos devuelva true o false de la siguiente manera:
					boolean esPar = num%2==0;
					
					//el operador != lo utilizamos para representar el "es estrictamente distinto de..."
					
					boolean negacion = 1!=5;
					
			//OJO IMPORTANTE:
					//Los operadores de comparación == y != solo sirven para comparar datos numéricos en Java.
					//En caso de querer comparar dos datos de tipo String los operadores cambian:
					//Ejemplo:
					
						String nombre = "pablo";
						//nombre.equals("pablo")   ----  para preguntar si nombre == pablo
						//!nombre.equals("pablo")  ----  para preguntar si nombre != pablo
					//Si queremos que se ignoren las mayúsculas la sintaxis es la siguiente
						nombre.equalsIgnoreCase("pablo");  //----  para preguntar si nombre == pablo
							
					
		//Lógicos, (los básicos son &&=and y ||=or )
					int num2 = 8;
					System.out.println(num2<10 && num2>5); // el && quiere decir que evalúa las dos 
														   // condiciones lógicas y deben cumplirse ambas
														   // para que devuelva true, de lo contrario false
					
					System.out.println(num2<=8 || num2>5); // en este caso || quiere decir que las 
														   // condiciones deben cumplirse una o la otra
														   // para que devuelva true.
														   // si la primera ya devuelve true, no evalua mas
					
					
		
		
		
		
		
		
		
	System.out.println ("Hola Caracola");

	
	}
}
